/* Class311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class311
{
    String aString3360;
    String aString3361;
    String aString3362;
    static Class610[] aClass610Array3363;
    public static Class472 aClass472_3364;
    
    Class311(String string, String string_0_, String string_1_) {
	aString3362 = string;
	aString3360 = string_0_;
	aString3361 = string_1_;
    }
    
    static String method5666(String string, int i) {
	String string_2_ = null;
	int i_3_ = string.indexOf("--> ");
	if (i_3_ >= 0) {
	    string_2_ = string.substring(0, 4 + i_3_);
	    string = string.substring(4 + i_3_);
	}
	int i_4_ = -1;
	if (string.startsWith("directlogin "))
	    i_4_ = string.indexOf(" ", "directlogin ".length());
	if (i_4_ >= 0) {
	    int i_5_ = string.length();
	    string
		= new StringBuilder().append(string.substring(0, i_4_)).append
		      (" ").toString();
	    for (int i_6_ = i_4_ + 1; i_6_ < i_5_; i_6_++)
		string = new StringBuilder().append(string).append("*")
			     .toString();
	}
	if (string_2_ != null)
	    return new StringBuilder().append(string_2_).append(string)
		       .toString();
	return string;
    }
    
    static final void method5667(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class202.method3865((byte) 0) ? 1 : 0;
    }
    
    static int method5668(Iterable iterable, byte i) {
	int i_7_ = -1;
	Iterator iterator = iterable.iterator();
	while (iterator.hasNext()) {
	    Interface76 interface76 = (Interface76) iterator.next();
	    if (interface76.method93() > i_7_)
		i_7_ = interface76.method93();
	}
	return (8 + i_7_) / 8;
    }
    
    static final void method5669(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class536.method8907(class247, class243, class669, (short) -256);
    }
    
    static final void method5670(Class669 class669, short i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub8_10775
		  .method16947(1407125173);
    }
}
