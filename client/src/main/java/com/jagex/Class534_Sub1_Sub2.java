/* Class534_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class534_Sub1_Sub2 extends Class534_Sub1
{
    byte aByte11718;
    byte aByte11719;
    static String aString11720;
    Class351 this$0;
    String aString11721;
    
    void method16012(Class534_Sub40 class534_sub40, int i) {
	aString11721 = class534_sub40.method16540(76978635);
	if (aString11721 != null) {
	    class534_sub40.method16527(982240101);
	    aByte11719 = class534_sub40.method16586((byte) 1);
	    aByte11718 = class534_sub40.method16586((byte) 1);
	}
    }
    
    void method16013(Class534_Sub26 class534_sub26) {
	class534_sub26.aString10578 = aString11721;
	if (aString11721 != null) {
	    class534_sub26.aByte10583 = aByte11719;
	    class534_sub26.aByte10582 = aByte11718;
	}
    }
    
    void method16011(Class534_Sub26 class534_sub26, int i) {
	class534_sub26.aString10578 = aString11721;
	if (aString11721 != null) {
	    class534_sub26.aByte10583 = aByte11719;
	    class534_sub26.aByte10582 = aByte11718;
	}
    }
    
    void method16015(Class534_Sub26 class534_sub26) {
	class534_sub26.aString10578 = aString11721;
	if (aString11721 != null) {
	    class534_sub26.aByte10583 = aByte11719;
	    class534_sub26.aByte10582 = aByte11718;
	}
    }
    
    Class534_Sub1_Sub2(Class351 class351) {
	this$0 = class351;
    }
    
    void method16014(Class534_Sub40 class534_sub40) {
	aString11721 = class534_sub40.method16540(76978635);
	if (aString11721 != null) {
	    class534_sub40.method16527(146856288);
	    aByte11719 = class534_sub40.method16586((byte) 1);
	    aByte11718 = class534_sub40.method16586((byte) 1);
	}
    }
    
    public static void method18229(byte i) {
	synchronized (Class642.aQueue8347) {
	    for (;;) {
		Class534_Sub42_Sub1 class534_sub42_sub1
		    = (Class534_Sub42_Sub1) Class642.aQueue8347.poll();
		if (class534_sub42_sub1 == null)
		    break;
		class534_sub42_sub1.method16803((byte) -80);
	    }
	}
    }
}
