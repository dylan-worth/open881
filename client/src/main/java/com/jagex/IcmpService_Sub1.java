/* IcmpService_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jaclib.ping.IcmpService;

public class IcmpService_Sub1 extends IcmpService
{
    static volatile IcmpService_Sub1 anIcmpService_Sub1_10890;
    List aList10891 = new ArrayList();
    
    protected void method1789(int i) {
	Iterator iterator = aList10891.iterator();
	while (iterator.hasNext()) {
	    Interface74 interface74 = (Interface74) iterator.next();
	    interface74.method499(i == 0, -1419612297);
	}
    }
    
    protected void notify(int i) {
	Iterator iterator = aList10891.iterator();
	while (iterator.hasNext()) {
	    Interface74 interface74 = (Interface74) iterator.next();
	    interface74.method499(i == 0, -1419612297);
	}
    }
    
    protected void notify(int i, int i_0_, int i_1_) {
	Iterator iterator = aList10891.iterator();
	while (iterator.hasNext()) {
	    Interface74 interface74 = (Interface74) iterator.next();
	    interface74.method494(i, i_0_, i_1_, -2123244901);
	}
    }
    
    protected void method1790(int i) {
	Iterator iterator = aList10891.iterator();
	while (iterator.hasNext()) {
	    Interface74 interface74 = (Interface74) iterator.next();
	    interface74.method499(i == 0, -1419612297);
	}
    }
    
    public static void method17011() {
	if (null != anIcmpService_Sub1_10890) {
	    try {
		anIcmpService_Sub1_10890.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    anIcmpService_Sub1_10890 = null;
	}
    }
    
    public static void method17012() {
	if (null != anIcmpService_Sub1_10890) {
	    try {
		anIcmpService_Sub1_10890.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    anIcmpService_Sub1_10890 = null;
	}
    }
    
    public static void method17013() {
	if (null != anIcmpService_Sub1_10890) {
	    try {
		anIcmpService_Sub1_10890.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    anIcmpService_Sub1_10890 = null;
	}
    }
    
    public static void method17014(Interface74 interface74) {
	if (null == anIcmpService_Sub1_10890)
	    throw new IllegalStateException("");
	anIcmpService_Sub1_10890.aList10891.add(interface74);
    }
    
    protected void method1792(int i, int i_2_, int i_3_) {
	Iterator iterator = aList10891.iterator();
	while (iterator.hasNext()) {
	    Interface74 interface74 = (Interface74) iterator.next();
	    interface74.method494(i, i_2_, i_3_, -2080821434);
	}
    }
    
    protected void method1791(int i, int i_4_, int i_5_) {
	Iterator iterator = aList10891.iterator();
	while (iterator.hasNext()) {
	    Interface74 interface74 = (Interface74) iterator.next();
	    interface74.method494(i, i_4_, i_5_, -2136510816);
	}
    }
    
    IcmpService_Sub1() {
	/* empty */
    }
    
    static final void method17015(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aBool11218 ? 1 : 0;
    }
    
    static final void method17016(Class247 class247, Class669 class669,
				  byte i) {
	int i_6_ = 10;
	int i_7_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class568.method9569(class247, i_6_, i_7_, class669, -1603993177);
    }
}
