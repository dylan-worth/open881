/* Class695 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class695 implements Interface76
{
    static Class695 aClass695_8774;
    public static Class695 aClass695_8775;
    public static Class695 aClass695_8776;
    static Class695 aClass695_8777 = new Class695(-1);
    public static Class695 aClass695_8778;
    public static Class695 aClass695_8779;
    static Class695 aClass695_8780;
    static Class695 aClass695_8781;
    static Class695 aClass695_8782;
    int anInt8783;
    static Class695 aClass695_8784;
    
    static {
	aClass695_8775 = new Class695(-2);
	aClass695_8776 = new Class695(-3);
	aClass695_8774 = new Class695(-4);
	aClass695_8778 = new Class695(-5);
	aClass695_8779 = new Class695(2);
	aClass695_8780 = new Class695(3);
	aClass695_8784 = new Class695(7);
	aClass695_8782 = new Class695(9);
	aClass695_8781 = new Class695(37);
    }
    
    public int method93() {
	return 1341391005 * anInt8783;
    }
    
    Class695(int i) {
	anInt8783 = i * 867337653;
    }
    
    public int method22() {
	return 1341391005 * anInt8783;
    }
    
    public int method53() {
	return 1341391005 * anInt8783;
    }
    
    public static Class695[] method14070() {
	return new Class695[] { aClass695_8776, aClass695_8777, aClass695_8775,
				aClass695_8779, aClass695_8778, aClass695_8784,
				aClass695_8782, aClass695_8780, aClass695_8781,
				aClass695_8774 };
    }
    
    public static Class695[] method14071() {
	return new Class695[] { aClass695_8776, aClass695_8777, aClass695_8775,
				aClass695_8779, aClass695_8778, aClass695_8784,
				aClass695_8782, aClass695_8780, aClass695_8781,
				aClass695_8774 };
    }
    
    public static int method14072(int i, byte i_0_) {
	int i_1_ = 0;
	if (i < 0 || i >= 65536) {
	    i >>>= 16;
	    i_1_ += 16;
	}
	if (i >= 256) {
	    i >>>= 8;
	    i_1_ += 8;
	}
	if (i >= 16) {
	    i >>>= 4;
	    i_1_ += 4;
	}
	if (i >= 4) {
	    i >>>= 2;
	    i_1_ += 2;
	}
	if (i >= 1) {
	    i >>>= 1;
	    i_1_++;
	}
	return i_1_ + i;
    }
    
    static void method14073(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class112.method2019(1072383160);
    }
}
