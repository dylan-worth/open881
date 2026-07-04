/* Class423 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.event.ActionEvent;

public class Class423
{
    public static final int anInt4765 = 7;
    public static final int anInt4766 = 41;
    public static final int anInt4767 = 2;
    public static final int anInt4768 = 3;
    public static final int anInt4769 = 4;
    public static final int anInt4770 = 17;
    public static final int anInt4771 = 20;
    public static final int anInt4772 = 5;
    public static final int anInt4773 = 9;
    public static final int anInt4774 = 6;
    public static final int anInt4775 = 18;
    public static final int anInt4776 = 19;
    public static final int anInt4777 = 0;
    public static final int anInt4778 = 22;
    public static final int anInt4779 = 23;
    public static final int anInt4780 = 24;
    public static final int anInt4781 = 99;
    public static final int anInt4782 = 45;
    public static final int anInt4783 = 42;
    public static final int anInt4784 = 43;
    public static final int anInt4785 = 44;
    public static final int anInt4786 = 98;
    public static final int anInt4787 = 46;
    public static final int anInt4788 = 1;
    public static final int anInt4789 = 25;
    public static int anInt4790;
    
    Class423() throws Throwable {
	throw new Error();
    }
    
    static void method6789(Object object, byte i) {
	if (Class72.anEventQueue797 != null) {
	    for (int i_0_ = 0;
		 i_0_ < 50 && Class72.anEventQueue797.peekEvent() != null;
		 i_0_++)
		Class251.method4622(1L);
	    try {
		if (object != null)
		    Class72.anEventQueue797
			.postEvent(new ActionEvent(object, 1001, "dummy"));
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
}
