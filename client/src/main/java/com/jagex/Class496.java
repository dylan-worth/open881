/* Class496 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;

public class Class496
{
    static Class496 aClass496_5537;
    static Class496 aClass496_5538;
    static Class496 aClass496_5539 = new Class496(0, false);
    public static Class496 aClass496_5540 = new Class496(1, false);
    static Class496 aClass496_5541;
    static Class496 aClass496_5542;
    static Class496 aClass496_5543;
    static Class496 aClass496_5544 = new Class496(2, false);
    static Class496 aClass496_5545;
    int anInt5546;
    public boolean aBool5547;
    
    static {
	aClass496_5537 = new Class496(3, false);
	aClass496_5541 = new Class496(4, false);
	aClass496_5542 = new Class496(5, true);
	aClass496_5543 = new Class496(6, true);
	aClass496_5538 = new Class496(7, true);
	aClass496_5545 = new Class496(8, true);
    }
    
    Class496(int i, boolean bool) {
	anInt5546 = 1900029121 * i;
	aBool5547 = bool;
    }
    
    public static void method8131(Class401 class401, Class391 class391, int i,
				  int i_0_, int i_1_, int i_2_, int i_3_,
				  int i_4_, int i_5_, int i_6_, int i_7_,
				  int i_8_) {
	Class105.aClass401_1305 = class401;
	Class105.aClass391_1299 = class391;
	Class105.anInt1300 = 1067872339 * i;
	Class105.anInt1302 = -1578885789 * i_0_;
	Class130.anInt1523 = -482153117 * i_1_;
	Class90.anInt891 = 1739452007 * i_2_;
	Class666.anInt8576 = i_3_ * 1150809657;
	Class105.anInt1301 = i_4_ * 1061662017;
	Class105.anInt1304 = i_5_ * 1949333389;
	Class690_Sub22.aClass169_10914 = null;
	Class199.aClass169_2176 = null;
	Class90.aClass169_892 = null;
	Class351.anInt3621 = 1559431319 * i_6_;
	Class105.anInt1303 = i_7_ * -509538137;
	Class473.method7752(-1725134929);
	Class499.aBool5603 = true;
    }
    
    static void method8132(int i, int i_9_, int i_10_,
			   Class534_Sub23 class534_sub23, byte i_11_) {
	long l = (long) (i << 28 | i_10_ << 14 | i_9_);
	Class534_Sub7 class534_sub7
	    = (Class534_Sub7) client.aClass9_11209.method579(l);
	if (null == class534_sub7) {
	    class534_sub7 = new Class534_Sub7();
	    client.aClass9_11209.method581(class534_sub7, l);
	    class534_sub7.aClass700_10418.method14131(class534_sub23,
						      (short) 789);
	} else {
	    Class15 class15
		= ((Class15)
		   Class531.aClass44_Sub7_7135.method91(((class534_sub23
							  .anInt10548)
							 * -400233975),
							-1632434353));
	    int i_12_ = 1925627131 * class15.anInt131;
	    if (1 == class15.anInt174 * 1113844363)
		i_12_ *= 1 + -491988633 * class534_sub23.anInt10547;
	    for (Class534_Sub23 class534_sub23_13_
		     = ((Class534_Sub23)
			class534_sub7.aClass700_10418.method14135((byte) -1));
		 class534_sub23_13_ != null;
		 class534_sub23_13_
		     = (Class534_Sub23) class534_sub7.aClass700_10418
					    .method14139(710912551)) {
		class15
		    = (Class15) (Class531.aClass44_Sub7_7135.method91
				 (-400233975 * class534_sub23_13_.anInt10548,
				  1192052259));
		int i_14_ = class15.anInt131 * 1925627131;
		if (1 == 1113844363 * class15.anInt174)
		    i_14_ *= -491988633 * class534_sub23_13_.anInt10547 + 1;
		if (i_12_ > i_14_) {
		    Class556.method9398(class534_sub23, class534_sub23_13_,
					-216082823);
		    return;
		}
	    }
	    class534_sub7.aClass700_10418.method14131(class534_sub23,
						      (short) 789);
	}
    }
    
    static Class534_Sub35 method8133(short i) {
	Class24 class24 = null;
	Class534_Sub35 class534_sub35
	    = new Class534_Sub35(client.aClass675_11016, 0);
	try {
	    class24
		= Class606.method10050("", client.aClass675_11016.aString8640,
				       false, 2131583690);
	    byte[] is = new byte[(int) class24.method831(225247252)];
	    int i_15_;
	    for (int i_16_ = 0; i_16_ < is.length; i_16_ += i_15_) {
		i_15_ = class24.method843(is, i_16_, is.length - i_16_,
					  1858614811);
		if (i_15_ == -1)
		    throw new IOException();
	    }
	    class534_sub35 = new Class534_Sub35(new Class534_Sub40(is),
						client.aClass675_11016, 0);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (class24 != null)
		class24.method832(655034951);
	} catch (Exception exception) {
	    /* empty */
	}
	return class534_sub35;
    }
}
