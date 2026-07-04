/* Class699 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Date;

public class Class699 implements Interface76
{
    static Class699 aClass699_8792;
    public static Class699 aClass699_8793;
    int anInt8794;
    public static Class699 aClass699_8795;
    static Class699 aClass699_8796;
    public static Class699 aClass699_8797 = new Class699(-2);
    static Class699 aClass699_8798;
    static Class699 aClass699_8799;
    static Class699 aClass699_8800;
    static Class699 aClass699_8801;
    public static Class472 aClass472_8802;
    
    public static Class699[] method14125() {
	return (new Class699[]
		{ aClass699_8798, aClass699_8793, aClass699_8797,
		  aClass699_8792, aClass699_8801, aClass699_8800,
		  aClass699_8799, aClass699_8796, aClass699_8795 });
    }
    
    public int method93() {
	return anInt8794 * -1720487223;
    }
    
    static {
	aClass699_8793 = new Class699(-3);
	aClass699_8801 = new Class699(2);
	aClass699_8795 = new Class699(3);
	aClass699_8792 = new Class699(4);
	aClass699_8796 = new Class699(5);
	aClass699_8798 = new Class699(6);
	aClass699_8799 = new Class699(7);
	aClass699_8800 = new Class699(8);
    }
    
    Class699(int i) {
	anInt8794 = i * 307316601;
    }
    
    public int method22() {
	return anInt8794 * -1720487223;
    }
    
    public static Class699[] method14126() {
	return (new Class699[]
		{ aClass699_8798, aClass699_8793, aClass699_8797,
		  aClass699_8792, aClass699_8801, aClass699_8800,
		  aClass699_8799, aClass699_8796, aClass699_8795 });
    }
    
    public int method53() {
	return anInt8794 * -1720487223;
    }
    
    static final void method14127(Class669 class669, int i) {
	class669.anInt8600 -= -2131970355;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_1_
	    = (class669.anIntArray8595[1 + class669.anInt8600 * 2088438307]
	       << 1);
	int i_2_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2];
	int i_3_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 3];
	int i_4_
	    = class669.anIntArray8595[4 + 2088438307 * class669.anInt8600];
	int i_5_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 5];
	int i_6_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 6];
	if (i_0_ >= 0 && i_0_ < 2
	    && client.anIntArrayArrayArray11151[i_0_] != null && i_1_ >= 0
	    && i_1_ < client.anIntArrayArrayArray11151[i_0_].length) {
	    client.anIntArrayArrayArray11151[i_0_][i_1_]
		= new int[] { (i_2_ >> 14 & 0x3fff) << 9, i_3_ << 2,
			      (i_2_ & 0x3fff) << 9, i_6_ };
	    client.anIntArrayArrayArray11151[i_0_][i_1_ + 1]
		= new int[] { (i_4_ >> 14 & 0x3fff) << 9, i_5_ << 2,
			      (i_4_ & 0x3fff) << 9 };
	}
    }
    
    static void method14128(long l) {
	Class84.aCalendar838.setTime(new Date(l));
    }
}
