/* Class509 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.LinkedList;

public class Class509 implements Runnable
{
    volatile boolean aBool5671 = false;
    LinkedList aLinkedList5672 = new LinkedList();
    Class512 aClass512_5673 = new Class512(true);
    static String aString5674;
    public static Class472 aClass472_5675;
    static int anInt5676;
    
    public void method8371() {
	for (;;)
	    method8373((byte) 27);
    }
    
    public void method8372(Class44_Sub13 class44_sub13, int i) {
	aClass512_5673.method8435(class44_sub13, 942764271);
    }
    
    void method8373(byte i) {
	Object object = null;
	Class511 class511;
	synchronized (aLinkedList5672) {
	    try {
		aLinkedList5672.wait();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    class511 = (Class511) aLinkedList5672.pollFirst();
	}
	do {
	    try {
		try {
		    if (null != class511) {
			aBool5671 = true;
			method8377(class511, 603628617);
		    }
		} catch (Exception exception) {
		    aBool5671 = false;
		    break;
		}
		aBool5671 = false;
	    } catch (Exception object_0_) {
		aBool5671 = false;
		throw object_0_;
	    }
	} while (false);
    }
    
    public void method8374() {
	for (;;)
	    method8373((byte) 97);
    }
    
    void method8375() {
	Object object = null;
	Class511 class511;
	synchronized (aLinkedList5672) {
	    try {
		aLinkedList5672.wait();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    class511 = (Class511) aLinkedList5672.pollFirst();
	}
	do {
	    try {
		try {
		    if (null != class511) {
			aBool5671 = true;
			method8377(class511, 603628617);
		    }
		} catch (Exception exception) {
		    aBool5671 = false;
		    break;
		}
		aBool5671 = false;
	    } catch (Exception object_1_) {
		aBool5671 = false;
		throw object_1_;
	    }
	} while (false);
    }
    
    void method8376(Class512 class512, int i) {
	aClass512_5673 = class512;
    }
    
    public void run() {
	for (;;)
	    method8373((byte) 78);
    }
    
    void method8377(Class511 class511, int i) {
	if (Class499.aClass499_5600 == class511.aClass499_5680)
	    aClass512_5673.method8441(1813608060);
	else
	    aClass512_5673.method8442(class511, 52245602);
	for (boolean bool = aClass512_5673.method8569(-1253300087); !bool;
	     bool = aClass512_5673.method8569(-671886164)) {
	    /* empty */
	}
	aClass512_5673.method8532((byte) 24);
	client.aClass512_11100.method8532((byte) 50);
    }
    
    void method8378(Class512 class512) {
	aClass512_5673 = class512;
    }
    
    public boolean method8379(byte i) {
	return aBool5671;
    }
    
    public void method8380(Class44_Sub13 class44_sub13) {
	aClass512_5673.method8435(class44_sub13, 81645487);
    }
    
    public void method8381(Class511 class511) {
	synchronized (aLinkedList5672) {
	    aLinkedList5672.add(class511);
	    aLinkedList5672.notify();
	}
    }
    
    public void method8382(Class511 class511) {
	synchronized (aLinkedList5672) {
	    aLinkedList5672.add(class511);
	    aLinkedList5672.notify();
	}
    }
    
    public void method8383(Class511 class511) {
	synchronized (aLinkedList5672) {
	    aLinkedList5672.add(class511);
	    aLinkedList5672.notify();
	}
    }
    
    public boolean method8384() {
	return aBool5671;
    }
    
    public Class512 method8385() {
	return aClass512_5673;
    }
    
    void method8386() {
	Object object = null;
	Class511 class511;
	synchronized (aLinkedList5672) {
	    try {
		aLinkedList5672.wait();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    class511 = (Class511) aLinkedList5672.pollFirst();
	}
	do {
	    try {
		try {
		    if (null != class511) {
			aBool5671 = true;
			method8377(class511, 603628617);
		    }
		} catch (Exception exception) {
		    aBool5671 = false;
		    break;
		}
		aBool5671 = false;
	    } catch (Exception object_2_) {
		aBool5671 = false;
		throw object_2_;
	    }
	} while (false);
    }
    
    void method8387(Class511 class511) {
	if (Class499.aClass499_5600 == class511.aClass499_5680)
	    aClass512_5673.method8441(994187876);
	else
	    aClass512_5673.method8442(class511, -340884521);
	for (boolean bool = aClass512_5673.method8569(-1805019284); !bool;
	     bool = aClass512_5673.method8569(-1704931369)) {
	    /* empty */
	}
	aClass512_5673.method8532((byte) 32);
	client.aClass512_11100.method8532((byte) 72);
    }
    
    public void method8388(Class511 class511, int i) {
	synchronized (aLinkedList5672) {
	    aLinkedList5672.add(class511);
	    aLinkedList5672.notify();
	}
    }
    
    void method8389(Class511 class511) {
	if (Class499.aClass499_5600 == class511.aClass499_5680)
	    aClass512_5673.method8441(499358715);
	else
	    aClass512_5673.method8442(class511, 1195751668);
	for (boolean bool = aClass512_5673.method8569(485714018); !bool;
	     bool = aClass512_5673.method8569(-1285500599)) {
	    /* empty */
	}
	aClass512_5673.method8532((byte) 67);
	client.aClass512_11100.method8532((byte) 1);
    }
    
    public Class512 method8390(byte i) {
	return aClass512_5673;
    }
    
    void method8391(Class511 class511) {
	if (Class499.aClass499_5600 == class511.aClass499_5680)
	    aClass512_5673.method8441(1033667004);
	else
	    aClass512_5673.method8442(class511, -1520003776);
	for (boolean bool = aClass512_5673.method8569(-1146294265); !bool;
	     bool = aClass512_5673.method8569(511316906)) {
	    /* empty */
	}
	aClass512_5673.method8532((byte) 100);
	client.aClass512_11100.method8532((byte) 113);
    }
    
    static final void method8392(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_3_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_4_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_3_ | i_4_;
    }
    
    static final void method8393(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class247.anInt2496 = -428332182;
	class247.aClass301_2635 = null;
	class247.anInt2497
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * 931070365;
	if (1365669833 * class247.anInt2580 == -1 && !class243.aBool2413)
	    Class626.method10366(-1278450723 * class247.anInt2454, 1751242868);
    }
    
    static final void method8394(Class669 class669, int i) {
	int i_5_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class15 class15
	    = (Class15) Class531.aClass44_Sub7_7135.method91(i_5_, -776403062);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class15.anInt116 * -1988624023;
    }
    
    public static void method8395(int i, int i_6_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(13, (long) i);
	class534_sub18_sub6.method18182(-1052637456);
    }
}
