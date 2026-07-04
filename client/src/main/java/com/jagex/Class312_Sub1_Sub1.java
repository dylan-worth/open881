/* Class312_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class312_Sub1_Sub1 extends Class312_Sub1
{
    void method15644(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
	int i_4_ = aClass163_10001.method22();
	int i_5_
	    = (1408960135 * ((Class394_Sub1_Sub1) aClass394_3366).anInt11633
	       * Class255.method4646(-1980011) / 10 % i_4_);
	aClass163_10001.method2662(i_5_ + (i - i_4_), i_0_, i_1_ + i_4_ - i_5_,
				   i_2_);
    }
    
    void method15645(int i, int i_6_, int i_7_, int i_8_) {
	int i_9_ = aClass163_10001.method22();
	int i_10_
	    = (1408960135 * ((Class394_Sub1_Sub1) aClass394_3366).anInt11633
	       * Class255.method4646(-179694728) / 10 % i_9_);
	aClass163_10001.method2662(i_10_ + (i - i_9_), i_6_,
				   i_7_ + i_9_ - i_10_, i_8_);
    }
    
    Class312_Sub1_Sub1(Class472 class472, Class472 class472_11_,
		       Class394_Sub1_Sub1 class394_sub1_sub1) {
	super(class472, class472_11_, (Class394_Sub1) class394_sub1_sub1);
    }
    
    public static boolean method18102(int i, String string, int i_12_,
				      int i_13_, byte i_14_) {
	Class685.aClass23_8698 = new RSSocket();
	Class685.aClass23_8698.anInt227 = 1619197921 * i;
	Class685.aClass23_8698.aString223 = string;
	Class685.aClass23_8698.anInt222 = i_12_ * 1852523987;
	Class685.aClass23_8698.anInt225 = -102059163 * i_13_;
	return true;
    }
}
