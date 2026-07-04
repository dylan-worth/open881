/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class124
{
    static final int anInt1489 = 4000;
    static final int anInt1490 = 128;
    static final int anInt1491 = 128;
    static final int anInt1492 = 16;
    Class141_Sub4 aClass141_Sub4_1493;
    Class141_Sub2[] aClass141_Sub2Array1494 = null;
    Class141_Sub4 aClass141_Sub4_1495 = null;
    boolean aBool1496;
    Class141_Sub2[] aClass141_Sub2Array1497 = null;
    Class141_Sub4 aClass141_Sub4_1498;
    static Object anObject1499;
    static Object anObject1500;
    static Object anObject1501;
    
    static void method2179(Class185_Sub3 class185_sub3) {
	if (anObject1499 == null) {
	    Class405_Sub1_Sub1 class405_sub1_sub1 = new Class405_Sub1_Sub1();
	    byte[] is = class405_sub1_sub1.method17969(128, 128, 16);
	    anObject1499 = Class30.method882(is, false, 1111281270);
	}
	if (anObject1500 == null) {
	    Class405_Sub2_Sub1 class405_sub2_sub1 = new Class405_Sub2_Sub1();
	    byte[] is = class405_sub2_sub1.method17971(128, 128, 16);
	    anObject1500 = Class30.method882(is, false, 1111281270);
	}
	Class156 class156 = class185_sub3.aClass156_9571;
	if (class156.method2582() && anObject1501 == null) {
	    byte[] is = Class525.method8737(128, 128, 16, 8,
					    new Class533_Sub1(419684), 4.0F,
					    4.0F, 16.0F, 0.5F, 0.6F);
	    anObject1501 = Class30.method882(is, false, 1111281270);
	}
    }
    
    Class124(Class185_Sub3 class185_sub3) {
	aClass141_Sub4_1493 = null;
	aClass141_Sub4_1498 = null;
	aBool1496 = class185_sub3.aBool9693;
	method2183(class185_sub3);
	if (!aBool1496) {
	    aClass141_Sub2Array1494 = new Class141_Sub2[16];
	    for (int i = 0; i < 16; i++) {
		byte[] is = Class586.method9862(anObject1499, i * 32768, 32768,
						1598902738);
		aClass141_Sub2Array1494[i]
		    = new Class141_Sub2(class185_sub3, 3553,
					Class181.aClass181_1961,
					Class173.aClass173_1830, 128, 128,
					true, is, Class181.aClass181_1961,
					false);
	    }
	    aClass141_Sub2Array1497 = new Class141_Sub2[16];
	    for (int i = 0; i < 16; i++) {
		byte[] is = Class586.method9862(anObject1500, i * 32768, 32768,
						1909557254);
		aClass141_Sub2Array1497[i]
		    = new Class141_Sub2(class185_sub3, 3553,
					Class181.aClass181_1961,
					Class173.aClass173_1830, 128, 128,
					true, is, Class181.aClass181_1961,
					false);
	    }
	} else {
	    byte[] is = Class20.method803(anObject1499, false, (byte) 3);
	    aClass141_Sub4_1495
		= new Class141_Sub4(class185_sub3, Class181.aClass181_1961,
				    Class173.aClass173_1830, 128, 128, 16, is,
				    Class181.aClass181_1961);
	    is = Class20.method803(anObject1500, false, (byte) 3);
	    aClass141_Sub4_1493
		= new Class141_Sub4(class185_sub3, Class181.aClass181_1961,
				    Class173.aClass173_1830, 128, 128, 16, is,
				    Class181.aClass181_1961);
	    Class156 class156 = class185_sub3.aClass156_9571;
	    if (class156.method2582()) {
		is = Class20.method803(anObject1501, false, (byte) 3);
		aClass141_Sub4_1498
		    = new Class141_Sub4(class185_sub3, Class181.aClass181_1952,
					Class173.aClass173_1830, 128, 128, 16);
		Class141_Sub4 class141_sub4
		    = new Class141_Sub4(class185_sub3, Class181.aClass181_1954,
					Class173.aClass173_1830, 128, 128, 16,
					is, Class181.aClass181_1954);
		if (!class156.method2581(aClass141_Sub4_1498, class141_sub4,
					 2.0F)) {
		    aClass141_Sub4_1498.method2369();
		    aClass141_Sub4_1498 = null;
		} else
		    aClass141_Sub4_1498.method2366();
		class141_sub4.method2369();
	    }
	}
    }
    
    static void method2180(Class185_Sub3 class185_sub3) {
	if (anObject1499 == null) {
	    Class405_Sub1_Sub1 class405_sub1_sub1 = new Class405_Sub1_Sub1();
	    byte[] is = class405_sub1_sub1.method17969(128, 128, 16);
	    anObject1499 = Class30.method882(is, false, 1111281270);
	}
	if (anObject1500 == null) {
	    Class405_Sub2_Sub1 class405_sub2_sub1 = new Class405_Sub2_Sub1();
	    byte[] is = class405_sub2_sub1.method17971(128, 128, 16);
	    anObject1500 = Class30.method882(is, false, 1111281270);
	}
	Class156 class156 = class185_sub3.aClass156_9571;
	if (class156.method2582() && anObject1501 == null) {
	    byte[] is = Class525.method8737(128, 128, 16, 8,
					    new Class533_Sub1(419684), 4.0F,
					    4.0F, 16.0F, 0.5F, 0.6F);
	    anObject1501 = Class30.method882(is, false, 1111281270);
	}
    }
    
    static void method2181(Class185_Sub3 class185_sub3) {
	if (anObject1499 == null) {
	    Class405_Sub1_Sub1 class405_sub1_sub1 = new Class405_Sub1_Sub1();
	    byte[] is = class405_sub1_sub1.method17969(128, 128, 16);
	    anObject1499 = Class30.method882(is, false, 1111281270);
	}
	if (anObject1500 == null) {
	    Class405_Sub2_Sub1 class405_sub2_sub1 = new Class405_Sub2_Sub1();
	    byte[] is = class405_sub2_sub1.method17971(128, 128, 16);
	    anObject1500 = Class30.method882(is, false, 1111281270);
	}
	Class156 class156 = class185_sub3.aClass156_9571;
	if (class156.method2582() && anObject1501 == null) {
	    byte[] is = Class525.method8737(128, 128, 16, 8,
					    new Class533_Sub1(419684), 4.0F,
					    4.0F, 16.0F, 0.5F, 0.6F);
	    anObject1501 = Class30.method882(is, false, 1111281270);
	}
    }
    
    static void method2182(Class185_Sub3 class185_sub3) {
	if (anObject1499 == null) {
	    Class405_Sub1_Sub1 class405_sub1_sub1 = new Class405_Sub1_Sub1();
	    byte[] is = class405_sub1_sub1.method17969(128, 128, 16);
	    anObject1499 = Class30.method882(is, false, 1111281270);
	}
	if (anObject1500 == null) {
	    Class405_Sub2_Sub1 class405_sub2_sub1 = new Class405_Sub2_Sub1();
	    byte[] is = class405_sub2_sub1.method17971(128, 128, 16);
	    anObject1500 = Class30.method882(is, false, 1111281270);
	}
	Class156 class156 = class185_sub3.aClass156_9571;
	if (class156.method2582() && anObject1501 == null) {
	    byte[] is = Class525.method8737(128, 128, 16, 8,
					    new Class533_Sub1(419684), 4.0F,
					    4.0F, 16.0F, 0.5F, 0.6F);
	    anObject1501 = Class30.method882(is, false, 1111281270);
	}
    }
    
    static void method2183(Class185_Sub3 class185_sub3) {
	if (anObject1499 == null) {
	    Class405_Sub1_Sub1 class405_sub1_sub1 = new Class405_Sub1_Sub1();
	    byte[] is = class405_sub1_sub1.method17969(128, 128, 16);
	    anObject1499 = Class30.method882(is, false, 1111281270);
	}
	if (anObject1500 == null) {
	    Class405_Sub2_Sub1 class405_sub2_sub1 = new Class405_Sub2_Sub1();
	    byte[] is = class405_sub2_sub1.method17971(128, 128, 16);
	    anObject1500 = Class30.method882(is, false, 1111281270);
	}
	Class156 class156 = class185_sub3.aClass156_9571;
	if (class156.method2582() && anObject1501 == null) {
	    byte[] is = Class525.method8737(128, 128, 16, 8,
					    new Class533_Sub1(419684), 4.0F,
					    4.0F, 16.0F, 0.5F, 0.6F);
	    anObject1501 = Class30.method882(is, false, 1111281270);
	}
    }
}
