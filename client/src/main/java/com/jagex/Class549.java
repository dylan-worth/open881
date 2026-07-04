/* Class549 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

class Class549 implements Runnable
{
    Class367_Sub1 this$0;
    
    public void run() {
	try {
	    while (!this$0.aBool10149) {
		HashMap hashmap = this$0.method15778(-650296415);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class496 class496 = (Class496) iterator.next();
		    if (!class496.aBool5547) {
			Class479[] class479s
			    = (Class479[]) hashmap.get(class496);
			for (int i = 0; i < class479s.length; i++)
			    class479s[i].method7821(-663055179);
		    }
		}
		Class251.method4622(10L);
	    }
	} catch (Exception exception) {
	    Class262.method4824(null, exception, (byte) 27);
	    exception.printStackTrace();
	}
    }
    
    Class549(Class367_Sub1 class367_sub1) {
	this$0 = class367_sub1;
    }
    
    public void method9016() {
	try {
	    while (!this$0.aBool10149) {
		HashMap hashmap = this$0.method15778(-650296415);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class496 class496 = (Class496) iterator.next();
		    if (!class496.aBool5547) {
			Class479[] class479s
			    = (Class479[]) hashmap.get(class496);
			for (int i = 0; i < class479s.length; i++)
			    class479s[i].method7821(-663055179);
		    }
		}
		Class251.method4622(10L);
	    }
	} catch (Exception exception) {
	    Class262.method4824(null, exception, (byte) 21);
	    exception.printStackTrace();
	}
    }
    
    public void method9017() {
	try {
	    while (!this$0.aBool10149) {
		HashMap hashmap = this$0.method15778(-650296415);
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class496 class496 = (Class496) iterator.next();
		    if (!class496.aBool5547) {
			Class479[] class479s
			    = (Class479[]) hashmap.get(class496);
			for (int i = 0; i < class479s.length; i++)
			    class479s[i].method7821(-663055179);
		    }
		}
		Class251.method4622(10L);
	    }
	} catch (Exception exception) {
	    Class262.method4824(null, exception, (byte) 56);
	    exception.printStackTrace();
	}
    }
    
    static final void method9018(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class188.method3755((byte) 0).method93();
    }
    
    static final void method9019(Class669 class669, int i) {
	class669.anInt8596 -= -2111195934;
	if (class669.aLongArray8587[1572578961 * class669.anInt8596]
	    <= class669.aLongArray8587[1 + class669.anInt8596 * 1572578961])
	    class669.anInt8613
		+= (-793595371
		    * class669.anIntArray8591[class669.anInt8613 * 662605117]);
    }
    
    static void method9020(int i) {
	if (Class504.aFileOutputStream5633 != null) {
	    try {
		Class504.aFileOutputStream5633.close();
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	Class504.aFileOutputStream5633 = null;
    }
}
