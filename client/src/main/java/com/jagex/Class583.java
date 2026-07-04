/* Class583 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class583 implements Interface67
{
    public static Class583 aClass583_7772;
    public static Class583 aClass583_7773
	= new Class583("", 10, new Class493[] { Class493.aClass493_5446 },
		       null);
    public static Class583 aClass583_7774;
    public static Class583 aClass583_7775;
    public static Class583 aClass583_7776;
    static Class583 aClass583_7777;
    public static Class583 aClass583_7778;
    public static Class583 aClass583_7779;
    static Class583 aClass583_7780;
    public static Class583 aClass583_7781;
    public static Class583 aClass583_7782;
    public static Class583 aClass583_7783
	= new Class583("", 11, new Class493[] { Class493.aClass493_5446 },
		       null);
    public static Class583 aClass583_7784;
    public static Class583 aClass583_7785;
    public static Class583 aClass583_7786;
    public static Class583 aClass583_7787;
    public static Class583 aClass583_7788;
    public static Class583 aClass583_7789;
    public static Class583 aClass583_7790;
    public static Class583 aClass583_7791;
    public static Class583 aClass583_7792;
    static Class583 aClass583_7793;
    public int anInt7794;
    
    Class583(String string, int i, boolean bool, boolean bool_0_) {
	this(string, i, bool, null, bool_0_, null);
    }
    
    Class583(String string, int i) {
	this(string, i, false, null, false, null);
    }
    
    Class583(String string, int i, Class493[] class493s,
	     Class493[] class493s_1_) {
	this(string, i, null != class493s, class493s, null != class493s_1_,
	     class493s_1_);
    }
    
    public int method93() {
	return anInt7794 * -1610379455;
    }
    
    Class583(String string, int i, boolean bool, Class493[] class493s,
	     boolean bool_2_, Class493[] class493s_3_) {
	anInt7794 = i * 1511063745;
    }
    
    static {
	aClass583_7774
	    = new Class583("", 12, new Class493[] { Class493.aClass493_5446 },
			   null);
	aClass583_7772
	    = new Class583("", 13, new Class493[] { Class493.aClass493_5446 },
			   null);
	aClass583_7792
	    = new Class583("", 14, new Class493[] { Class493.aClass493_5446 },
			   null);
	aClass583_7787
	    = new Class583("", 15,
			   new Class493[] { Class493.aClass493_5446,
					    Class493.aClass493_5451,
					    Class493.aClass493_5451 },
			   null);
	aClass583_7778
	    = new Class583("", 16,
			   new Class493[] { Class493.aClass493_5446,
					    Class493.aClass493_5451,
					    Class493.aClass493_5451 },
			   null);
	aClass583_7779
	    = new Class583("", 17,
			   new Class493[] { Class493.aClass493_5446,
					    Class493.aClass493_5451,
					    Class493.aClass493_5451 },
			   null);
	aClass583_7780 = new Class583("", 18);
	aClass583_7781 = new Class583("", 19);
	aClass583_7782
	    = new Class583("", 20,
			   new Class493[] { Class493.aClass493_5496,
					    Class493.aClass493_5451 },
			   null);
	aClass583_7775 = new Class583("", 21);
	aClass583_7784 = new Class583("", 22);
	aClass583_7785
	    = new Class583("", 23, new Class493[] { Class493.aClass493_5402 },
			   null);
	aClass583_7786 = new Class583("", 24);
	aClass583_7776 = new Class583("", 25);
	aClass583_7788 = new Class583("", 26);
	aClass583_7789 = new Class583("", 27);
	aClass583_7790 = new Class583("", 28);
	aClass583_7791 = new Class583_Sub1("", 29, true, false);
	aClass583_7777 = new Class583("", 73, true, true);
	aClass583_7793 = new Class583("", 76, true, false);
    }
    
    public int method22() {
	return anInt7794 * -1610379455;
    }
    
    public int method53() {
	return anInt7794 * -1610379455;
    }
    
    static final void method9837(Class669 class669, byte i) {
	int i_5_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_5_, -59586796);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_5_ >> 16];
	Class263.method4831(class247, class243, class669,
			    ((class669.aClass534_Sub26_8606
			      == Class574.aClass534_Sub26_7710)
			     ? Class253.aClass253_2665
			     : Class253.aClass253_2663),
			    (byte) -86);
    }
    
    static final void method9838(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
}
