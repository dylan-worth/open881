/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class281 implements Interface6
{
    Class203 aClass203_3060;
    Class472 aClass472_3061;
    static int anInt3062;
    
    Class281(Class472 class472, int i) {
	aClass472_3061 = class472;
	aClass203_3060 = new Class203(i);
    }
    
    public static String method5235(long l, int i, boolean bool,
				    Class672 class672, int i_0_) {
	char c = ',';
	char c_1_ = '.';
	if (class672 == Class672.aClass672_8621) {
	    c = '.';
	    c_1_ = ',';
	}
	if (class672 == Class672.aClass672_8631)
	    c_1_ = '\u00a0';
	boolean bool_2_ = false;
	if (l < 0L) {
	    bool_2_ = true;
	    l = -l;
	}
	StringBuilder stringbuilder = new StringBuilder(26);
	if (i > 0) {
	    for (int i_3_ = 0; i_3_ < i; i_3_++) {
		int i_4_ = (int) l;
		l /= 10L;
		stringbuilder.append((char) (i_4_ + 48 - (int) l * 10));
	    }
	    stringbuilder.append(c);
	}
	int i_5_ = 0;
	for (;;) {
	    int i_6_ = (int) l;
	    l /= 10L;
	    stringbuilder.append((char) (i_6_ + 48 - 10 * (int) l));
	    if (l == 0L)
		break;
	    if (bool) {
		i_5_++;
		if (0 == i_5_ % 3)
		    stringbuilder.append(c_1_);
	    }
	}
	if (bool_2_)
	    stringbuilder.append('-');
	return stringbuilder.reverse().toString();
    }
    
    static int method5236(Class534_Sub18_Sub7 class534_sub18_sub7,
			  Class16 class16, int i) {
	String string = Class21.method813(class534_sub18_sub7, (byte) 84);
	int[] is = Class10.method607(class534_sub18_sub7, (short) 4000);
	if (null != is)
	    string
		= new StringBuilder().append(string).append
		      (Class44_Sub21.method17371(is, -531190651)).toString();
	int i_7_ = class16.method748(string, Class658.aClass163Array8541,
				     (byte) -93);
	if (class534_sub18_sub7.aBool11701)
	    i_7_ += Class657.aClass163_8538.method2647() + 4;
	return i_7_;
    }
    
    static boolean method5237(short i) {
	boolean bool;
	try {
	    Class80 class80 = new Class80();
	    byte[] is = class80.method1624(Class291.aByteArray3114, 691420745);
	    Class672.method11076(is, -675589603);
	    bool = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool;
    }
    
    public static Class609[] method5238(int i) {
	return (new Class609[]
		{ Class609.aClass609_8006, Class609.aClass609_8004,
		  Class609.aClass609_8005 });
    }
    
    static final void method5239(Class669 class669, byte i) {
	boolean bool = ((class669.anIntArray8595
			 [(class669.anInt8600 -= 308999563) * 2088438307])
			== 1);
	if (bool)
	    Class235.method4408(3, (byte) 5);
	else
	    Class235.method4408(2, (byte) 87);
    }
}
