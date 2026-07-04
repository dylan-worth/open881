/* Class637 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

public class Class637
{
    Class637() throws Throwable {
	throw new Error();
    }
    
    static final void method10554(Class247 class247, Class243 class243,
				  Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (i_1_ >= 1 && i_1_ <= 10)
	    class247.method4524(i_1_ - 1, i_0_, (byte) 73);
    }
    
    static final void method10555(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class46.method1114(Class44_Sub6.aClass534_Sub35_10989
				     .aClass690_Sub7_10733
				     .method16935(-1807368365),
				 200, 733623626);
    }
    
    static final void method10556(Class669 class669, short i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub20_10742
		  .method17058(-1598473308);
    }
    
    static final void method10557(Class247 class247, Class243 class243,
				  Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2570
	    = Class99.method1859(string, class669, 1756872046);
	class247.aBool2561 = true;
    }
    
    static final void method10558(Class669 class669, byte i) {
	int i_2_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_2_, 1869863524);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_2_ >> 16];
	Class581.method9825(class247, class243, class669, 222411395);
    }
    
    public static int method10559(byte i) {
	Canvas canvas = new Canvas();
	canvas.setSize(100, 100);
	Class185 class185
	    = Class321.method5777(0, canvas, null, null, null, null, null,
				  null, 0, 2139003684);
	long l = Class250.method4604((byte) -120);
	for (int i_3_ = 0; i_3_ < 10000; i_3_++)
	    class185.method3299(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F,
				-65536, -65536, -65536, 1);
	int i_4_ = (int) (Class250.method4604((byte) -50) - l);
	class185.method3292(0, 0, 100, 100, -16777216, -2014778644);
	class185.method3236(-568376843);
	return i_4_;
    }
    
    static int method10560(Class534_Sub40_Sub1 class534_sub40_sub1, int i) {
	int i_5_ = class534_sub40_sub1.method18295(2, -761815447);
	int i_6_;
	if (0 == i_5_)
	    i_6_ = 0;
	else if (i_5_ == 1)
	    i_6_ = class534_sub40_sub1.method18295(5, -761815447);
	else if (i_5_ == 2)
	    i_6_ = class534_sub40_sub1.method18295(8, -761815447);
	else
	    i_6_ = class534_sub40_sub1.method18295(11, -761815447);
	return i_6_;
    }
}
