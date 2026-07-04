/* Exception_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Exception_Sub1 extends Exception
{
    public static boolean aBool11394;
    public int anInt11395;
    public String aString11396;
    
    Exception_Sub1(int i, String string) {
	this(i, string, null);
    }
    
    Exception_Sub1(int i, String string, Throwable throwable) {
	super(throwable);
	aString11396 = string;
	anInt11395 = 308403261 * i;
    }
    
    static final void method17925(Class669 class669, int i) {
	Class614.method10127(1365669833);
    }
    
    public static void method17926(int i, byte i_0_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(15, (long) i);
	class534_sub18_sub6.method18182(-1052637456);
    }
    
    public static void method17927(int i, short i_1_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(22, (long) i);
	class534_sub18_sub6.method18182(-1052637456);
    }
}
