/* Class557 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Class557
{
    boolean aBool7483;
    public List aList7484 = new LinkedList();
    int anInt7485;
    int anInt7486;
    
    void method9402(Class550 class550, byte i) {
	Class654_Sub1 class654_sub1 = class550.aClass654_Sub1_7303;
	boolean bool = true;
	Class194[] class194s
	    = class550.aClass654_Sub1_7303.aClass194Array10852;
	for (int i_0_ = 0; i_0_ < class194s.length; i_0_++) {
	    if (class194s[i_0_].aBool2150) {
		bool = false;
		break;
	    }
	}
	if (!bool) {
	    class550.aClass557_7306 = this;
	    if (aBool7483) {
		Iterator iterator = aList7484.iterator();
		while (iterator.hasNext()) {
		    Class550 class550_1_ = (Class550) iterator.next();
		    if (class654_sub1 == class550_1_.aClass654_Sub1_7303) {
			iterator.remove();
			Class42.method1063(class550_1_, 1262399261);
		    }
		}
	    }
	    ListIterator listiterator = aList7484.listIterator();
	    while (listiterator.hasNext()) {
		Class550 class550_2_ = (Class550) listiterator.next();
		if (621186375 * class654_sub1.anInt10851
		    >= (class550_2_.aClass654_Sub1_7303.anInt10851
			* 621186375)) {
		    listiterator.previous();
		    listiterator.add(class550);
		    return;
		}
	    }
	    aList7484.add(class550);
	}
    }
    
    Class557(boolean bool) {
	aBool7483 = false;
	anInt7485 = 0;
	anInt7486 = 0;
	aBool7483 = bool;
    }
    
    void method9403(Class550 class550) {
	Class654_Sub1 class654_sub1 = class550.aClass654_Sub1_7303;
	boolean bool = true;
	Class194[] class194s
	    = class550.aClass654_Sub1_7303.aClass194Array10852;
	for (int i = 0; i < class194s.length; i++) {
	    if (class194s[i].aBool2150) {
		bool = false;
		break;
	    }
	}
	if (!bool) {
	    class550.aClass557_7306 = this;
	    if (aBool7483) {
		Iterator iterator = aList7484.iterator();
		while (iterator.hasNext()) {
		    Class550 class550_3_ = (Class550) iterator.next();
		    if (class654_sub1 == class550_3_.aClass654_Sub1_7303) {
			iterator.remove();
			Class42.method1063(class550_3_, 1262399261);
		    }
		}
	    }
	    ListIterator listiterator = aList7484.listIterator();
	    while (listiterator.hasNext()) {
		Class550 class550_4_ = (Class550) listiterator.next();
		if (621186375 * class654_sub1.anInt10851
		    >= (class550_4_.aClass654_Sub1_7303.anInt10851
			* 621186375)) {
		    listiterator.previous();
		    listiterator.add(class550);
		    return;
		}
	    }
	    aList7484.add(class550);
	}
    }
    
    public void method9404() {
	Iterator iterator = aList7484.iterator();
	while (iterator.hasNext()) {
	    Class550 class550 = (Class550) iterator.next();
	    iterator.remove();
	    Class42.method1063(class550, 1262399261);
	}
    }
    
    void method9405(Class550 class550) {
	Class654_Sub1 class654_sub1 = class550.aClass654_Sub1_7303;
	boolean bool = true;
	Class194[] class194s
	    = class550.aClass654_Sub1_7303.aClass194Array10852;
	for (int i = 0; i < class194s.length; i++) {
	    if (class194s[i].aBool2150) {
		bool = false;
		break;
	    }
	}
	if (!bool) {
	    class550.aClass557_7306 = this;
	    if (aBool7483) {
		Iterator iterator = aList7484.iterator();
		while (iterator.hasNext()) {
		    Class550 class550_5_ = (Class550) iterator.next();
		    if (class654_sub1 == class550_5_.aClass654_Sub1_7303) {
			iterator.remove();
			Class42.method1063(class550_5_, 1262399261);
		    }
		}
	    }
	    ListIterator listiterator = aList7484.listIterator();
	    while (listiterator.hasNext()) {
		Class550 class550_6_ = (Class550) listiterator.next();
		if (621186375 * class654_sub1.anInt10851
		    >= (class550_6_.aClass654_Sub1_7303.anInt10851
			* 621186375)) {
		    listiterator.previous();
		    listiterator.add(class550);
		    return;
		}
	    }
	    aList7484.add(class550);
	}
    }
    
    void method9406(Class550 class550) {
	Class654_Sub1 class654_sub1 = class550.aClass654_Sub1_7303;
	boolean bool = true;
	Class194[] class194s
	    = class550.aClass654_Sub1_7303.aClass194Array10852;
	for (int i = 0; i < class194s.length; i++) {
	    if (class194s[i].aBool2150) {
		bool = false;
		break;
	    }
	}
	if (!bool) {
	    class550.aClass557_7306 = this;
	    if (aBool7483) {
		Iterator iterator = aList7484.iterator();
		while (iterator.hasNext()) {
		    Class550 class550_7_ = (Class550) iterator.next();
		    if (class654_sub1 == class550_7_.aClass654_Sub1_7303) {
			iterator.remove();
			Class42.method1063(class550_7_, 1262399261);
		    }
		}
	    }
	    ListIterator listiterator = aList7484.listIterator();
	    while (listiterator.hasNext()) {
		Class550 class550_8_ = (Class550) listiterator.next();
		if (621186375 * class654_sub1.anInt10851
		    >= (class550_8_.aClass654_Sub1_7303.anInt10851
			* 621186375)) {
		    listiterator.previous();
		    listiterator.add(class550);
		    return;
		}
	    }
	    aList7484.add(class550);
	}
    }
    
    public void method9407(short i) {
	Iterator iterator = aList7484.iterator();
	while (iterator.hasNext()) {
	    Class550 class550 = (Class550) iterator.next();
	    iterator.remove();
	    Class42.method1063(class550, 1262399261);
	}
    }
    
    static final void method9408(Class669 class669, int i) {
	int i_9_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_9_, 977824014);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_9_ >> 16];
	Class419.method6765(class247, class243, class669, 1473241562);
    }
    
    static final void method9409(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub14_10755
		  .method17002(390267920) ? 1 : 0;
    }
    
    static final void method9410(Class669 class669, byte i) {
	int i_10_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_10_, 1423380069);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_10_ >> 16];
	Class97.method1829(class247, class243, class669, 2093010493);
    }
    
    static final void method9411(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub28_10784
		  .method17131(-1979307519);
    }
}
