/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Frame;

public class Class29
{
    static String aString259;
    public static String aString260;
    static String aString261;
    static String aString262;
    static String aString263;
    public static String aString264;
    static String aString265 = "true";
    public static Frame aFrame266;
    static String aString267;
    
    public static String method871(int i) {
	return new StringBuilder().append("<img=").append(i).append(">")
		   .toString();
    }
    
    static {
	aString260 = ",";
	aString261 = " (";
	aString259 = ")";
	aString263 = "->";
	aString264 = "<br>";
	aString262 = "</col>";
    }
    
    public static String method872(int i) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    public static String method873(int i) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    public static String method874(int i) {
	return new StringBuilder().append("<col=").append
		   (Integer.toHexString(i)).append
		   (">").toString();
    }
    
    Class29() throws Throwable {
	throw new Error();
    }
    
    public static String method875(int i) {
	return new StringBuilder().append("<img=").append(i).append(">")
		   .toString();
    }
    
    static final void method876(Class669 class669, boolean bool, int i) {
	int i_0_ = class669.anIntArray8591[class669.anInt8613 * 662605117];
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_2_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	if (i_1_ < 0 || i_1_ >= class669.anIntArray8589[i_0_])
	    throw new RuntimeException();
	class669.anIntArrayArray8590[i_0_][i_1_] = i_2_;
	if (bool)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= i_2_;
    }
    
    static final void method877(Class247 class247, Class243 class243,
				Class669 class669, byte i) {
	class247.aBool2522 = false;
	Class454.method7416(class247, -2111947980);
    }
    
    public static void method878(int i, byte i_3_) {
	Class4.anInt39 = 48341337 * i;
	Class534_Sub42_Sub1.aClass534_Sub42_Sub1Array11855
	    = new Class534_Sub42_Sub1[i];
	Class534_Sub42_Sub1.anInt11856 = 0;
    }
}
