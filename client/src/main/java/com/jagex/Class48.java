/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

public class Class48
{
    public static Class387 aClass387_363;
    
    Class48() throws Throwable {
	throw new Error();
    }
    
    static void method1131() {
	/* empty */
    }
    
    static void method1132() {
	/* empty */
    }
    
    public static int method1133() {
	Canvas canvas = new Canvas();
	canvas.setSize(100, 100);
	Class185 class185
	    = Class321.method5777(0, canvas, null, null, null, null, null,
				  null, 0, 2136884810);
	long l = Class250.method4604((byte) -95);
	for (int i = 0; i < 10000; i++)
	    class185.method3299(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F,
				-65536, -65536, -65536, 1);
	int i = (int) (Class250.method4604((byte) -117) - l);
	class185.method3292(0, 0, 100, 100, -16777216, -2120633007);
	class185.method3236(-568376843);
	return i;
    }
    
    public static int method1134() {
	Canvas canvas = new Canvas();
	canvas.setSize(100, 100);
	Class185 class185
	    = Class321.method5777(0, canvas, null, null, null, null, null,
				  null, 0, 2145961058);
	long l = Class250.method4604((byte) -9);
	for (int i = 0; i < 10000; i++)
	    class185.method3299(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F,
				-65536, -65536, -65536, 1);
	int i = (int) (Class250.method4604((byte) -39) - l);
	class185.method3292(0, 0, 100, 100, -16777216, -1735695374);
	class185.method3236(-568376843);
	return i;
    }
    
    public static int method1135() {
	Canvas canvas = new Canvas();
	canvas.setSize(100, 100);
	Class185 class185
	    = Class321.method5777(0, canvas, null, null, null, null, null,
				  null, 0, 2139089661);
	long l = Class250.method4604((byte) -115);
	for (int i = 0; i < 10000; i++)
	    class185.method3299(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F,
				-65536, -65536, -65536, 1);
	int i = (int) (Class250.method4604((byte) -11) - l);
	class185.method3292(0, 0, 100, 100, -16777216, -2131109502);
	class185.method3236(-568376843);
	return i;
    }
    
    static void method1136(Class185 class185, int i, int i_0_, int i_1_,
			   int i_2_, int i_3_, Class171 class171,
			   Class16 class16, String string, byte i_4_) {
	int i_5_ = (255 - -1558940039 * Class303.anInt3253
		    - -1927425233 * Class72.anInt785);
	if (i_5_ < 0)
	    i_5_ = 0;
	if (null == Class47.aClass163_354 || null == Class489.aClass163_5313) {
	    if (Class464.aClass472_5113
		    .method7670(Class676.anInt8651 * -118519815, (byte) -59)
		&& Class464.aClass472_5113.method7670((1950013631
						       * Class331.anInt3499),
						      (byte) -118)) {
		Class47.aClass163_354
		    = (class185.method3279
		       (Class178.method2949(Class464.aClass472_5113,
					    -118519815 * Class676.anInt8651,
					    0),
			true));
		Class169 class169
		    = Class178.method2949(Class464.aClass472_5113,
					  1950013631 * Class331.anInt3499, 0);
		Class489.aClass163_5313 = class185.method3279(class169, true);
		class169.method2806();
		Class274.aClass163_3040 = class185.method3279(class169, true);
	    } else
		class185.method3298(i, i_0_, i_1_, i_3_,
				    (i_5_ << 24
				     | Class480.anInt5262 * 400215733),
				    1);
	}
	if (null != Class47.aClass163_354 && null != Class489.aClass163_5313) {
	    int i_6_ = ((i_1_ - Class489.aClass163_5313.method2647() * 2)
			/ Class47.aClass163_354.method2647());
	    for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
		Class47.aClass163_354.method2656
		    ((i + Class489.aClass163_5313.method2647()
		      + i_7_ * Class47.aClass163_354.method2647()),
		     i_0_);
	    Class489.aClass163_5313.method2656(i, i_0_);
	    Class274.aClass163_3040.method2656(i_1_ + i - Class274
							      .aClass163_3040
							      .method2647(),
					       i_0_);
	}
	class171.method2828(string, i + 3,
			    ((20 - class16.anInt190 * 102396103) / 2
			     + (102396103 * class16.anInt190 + i_0_)),
			    Class200_Sub5.anInt9903 * 1593226795 | ~0xffffff,
			    -1, (byte) 34);
	class185.method3298(i, i_3_ + i_0_, i_1_, i_2_ - i_3_,
			    i_5_ << 24 | Class480.anInt5262 * 400215733, 1);
    }
    
    static final void method1137(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class467.method7604(class247, class243, class669, -1182450631);
    }
    
    static final void method1138(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_8_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_9_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	Class696 class696
	    = Class554.method9115(i_8_ >> 14 & 0x3fff, i_8_ & 0x3fff);
	boolean bool = false;
	for (Class534_Sub18_Sub9 class534_sub18_sub9
		 = (Class534_Sub18_Sub9) class696.method14078(1221951837);
	     null != class534_sub18_sub9;
	     class534_sub18_sub9
		 = (Class534_Sub18_Sub9) class696.method14080((byte) 40)) {
	    if (class534_sub18_sub9.anInt11766 * 848546455 == i_9_) {
		bool = true;
		break;
	    }
	}
	if (bool)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static final void method1139(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class186.method3705(class247, class243, class669, -663647264);
    }
    
    public static RuntimeException_Sub1 method1140(Throwable throwable,
						   String string) {
	RuntimeException_Sub1 runtimeexception_sub1;
	if (throwable instanceof RuntimeException_Sub1) {
	    runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
	    StringBuilder stringbuilder = new StringBuilder();
	    RuntimeException_Sub1 runtimeexception_sub1_10_
		= runtimeexception_sub1;
	    runtimeexception_sub1_10_.aString12089
		= stringbuilder.append
		      (runtimeexception_sub1_10_.aString12089).append
		      (' ').append
		      (string).toString();
	} else
	    runtimeexception_sub1
		= new RuntimeException_Sub1(throwable, string);
	return runtimeexception_sub1;
    }
    
    public static final void method1141(String string, String string_11_,
					int i) {
	Class100 class100 = Class201.method3864(2095398292);
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4259,
				  class100.aClass13_1183, 1341391005);
	if (string_11_.length() > 30)
	    string_11_ = string_11_.substring(0, 30);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16506
	    ((Class668.method11029(string, (byte) 0)
	      + Class668.method11029(string_11_, (byte) 0)),
	     1576754997);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string,
							      2019281701);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string_11_,
							      2035943418);
	class100.method1863(class534_sub19, (byte) 12);
    }
}
