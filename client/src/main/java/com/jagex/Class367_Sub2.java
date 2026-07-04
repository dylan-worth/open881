/* Class367_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Class367_Sub2 extends Class367
{
    Runnable aRunnable10277;
    HashMap aHashMap10278;
    Class369 aClass369_10279;
    Runnable aRunnable10280;
    Thread aThread10281;
    volatile boolean aBool10282 = false;
    long aLong10283 = Class250.method4604((byte) -33) * 3905997843429494375L;
    Thread aThread10284;
    static final float aFloat10285 = 2.0F;
    
    public Class369 method6336() {
	return aClass369_10279;
    }
    
    HashMap method15873(byte i) {
	return aHashMap10278;
    }
    
    public void method6346(Object object, int i) {
	/* empty */
    }
    
    public int method6339(Object object, int i) {
	long l = Class250.method4604((byte) -23);
	int i_0_ = (int) (180000.0F
			  / ((float) (l - aLong10283 * 6440050160333401431L)
			     / 1000.0F));
	aLong10283 = l * 3905997843429494375L;
	return i_0_;
    }
    
    public Object method6334(int i, int i_1_, Class382 class382,
			     Class386 class386, int i_2_, float f, int i_3_) {
	return new Object();
    }
    
    public Class479 method6354(Class496 class496) {
	synchronized (aHashMap10278) {
	    Class479[] class479s = (Class479[]) aHashMap10278.get(class496);
	    if (null == class479s) {
		Class479 class479 = null;
		return class479;
	    }
	    for (int i = 0; i < class479s.length; i++) {
		Class479 class479 = class479s[i];
		Class485 class485 = class479.method7853((byte) 35);
		if (class485 == Class485.aClass485_5287) {
		    class479.method7809(-1264019376);
		    Class479 class479_4_ = class479;
		    return class479_4_;
		}
	    }
	}
	return null;
    }
    
    public int method6356(Object object) {
	long l = Class250.method4604((byte) -69);
	int i = (int) (180000.0F
		       / ((float) (l - aLong10283 * 6440050160333401431L)
			  / 1000.0F));
	aLong10283 = l * 3905997843429494375L;
	return i;
    }
    
    public void method6352(Object object, byte[] is, int i, int i_5_) {
	/* empty */
    }
    
    Object method6337(Class388 class388, int i) {
	return null;
    }
    
    public Class369 method6342(byte i) {
	return aClass369_10279;
    }
    
    public void method6343(int i) {
	HashMap hashmap = method15873((byte) 48);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class496 class496 = (Class496) iterator.next();
		Class479[] class479s = (Class479[]) hashmap.get(class496);
		for (int i_6_ = 0; i_6_ < class479s.length; i_6_++) {
		    if (class479s[i_6_].method7853((byte) 91)
			!= Class485.aClass485_5287) {
			class479s[i_6_].method7862((byte) -5);
			class479s[i_6_].method7810(-508347933);
		    }
		}
	    }
	}
	boolean bool = false;
	while (!bool) {
	    bool = true;
	    synchronized (hashmap) {
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class496 class496 = (Class496) iterator.next();
		    Class479[] class479s = (Class479[]) hashmap.get(class496);
		    for (int i_7_ = 0; i_7_ < class479s.length; i_7_++) {
			if (class479s[i_7_].method7853((byte) -100)
			    != Class485.aClass485_5287) {
			    class479s[i_7_].method7822((byte) 124);
			    bool = false;
			}
		    }
		}
	    }
	    Class251.method4622(10L);
	}
	aBool10282 = true;
	try {
	    aThread10281.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10284.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    HashMap method15874() {
	return aHashMap10278;
    }
    
    HashMap method15875() {
	return aHashMap10278;
    }
    
    public void method6347() {
	if (aClass369_10279 != null)
	    aClass369_10279.method6372((byte) 100);
	Iterator iterator = aHashMap10278.keySet().iterator();
	while (iterator.hasNext()) {
	    Class496 class496 = (Class496) iterator.next();
	    Class479[] class479s = (Class479[]) aHashMap10278.get(class496);
	    if (!class496.aBool5547) {
		boolean bool = false;
		for (int i = 0; i < class479s.length; i++) {
		    class479s[i].method7822((byte) 36);
		    bool |= class479s[i].method7805((short) -16822);
		}
		if (bool)
		    Arrays.sort(class479s, new Class159(this));
	    }
	    int i = 3;
	    boolean bool = false;
	    int i_8_ = class479s.length - 1;
	    while (!bool) {
		float f = class479s[i_8_].method7819(961813194);
		Class485 class485 = class479s[i_8_].method7853((byte) -89);
		if (f < 0.0F) {
		    if (class485 == Class485.aClass485_5282
			|| Class485.aClass485_5284 == class485
			|| Class485.aClass485_5285 == class485)
			class479s[i_8_].method7862((byte) -18);
		} else
		    bool = true;
		if (--i_8_ < 0)
		    bool = true;
	    }
	    if (i_8_ >= class479s.length - i) {
		for (/**/; i_8_ >= class479s.length - i; i_8_--) {
		    Class485 class485 = class479s[i_8_].method7853((byte) 97);
		    if (Class485.aClass485_5282 == class485)
			class479s[i_8_].method7862((byte) 67);
		}
	    }
	}
    }
    
    public void method6364() {
	if (aClass369_10279 != null)
	    aClass369_10279.method6372((byte) -35);
	Iterator iterator = aHashMap10278.keySet().iterator();
	while (iterator.hasNext()) {
	    Class496 class496 = (Class496) iterator.next();
	    Class479[] class479s = (Class479[]) aHashMap10278.get(class496);
	    if (!class496.aBool5547) {
		boolean bool = false;
		for (int i = 0; i < class479s.length; i++) {
		    class479s[i].method7822((byte) 58);
		    bool |= class479s[i].method7805((short) 4532);
		}
		if (bool)
		    Arrays.sort(class479s, new Class159(this));
	    }
	    int i = 3;
	    boolean bool = false;
	    int i_9_ = class479s.length - 1;
	    while (!bool) {
		float f = class479s[i_9_].method7819(179273963);
		Class485 class485 = class479s[i_9_].method7853((byte) 92);
		if (f < 0.0F) {
		    if (class485 == Class485.aClass485_5282
			|| Class485.aClass485_5284 == class485
			|| Class485.aClass485_5285 == class485)
			class479s[i_9_].method7862((byte) -28);
		} else
		    bool = true;
		if (--i_9_ < 0)
		    bool = true;
	    }
	    if (i_9_ >= class479s.length - i) {
		for (/**/; i_9_ >= class479s.length - i; i_9_--) {
		    Class485 class485 = class479s[i_9_].method7853((byte) -33);
		    if (Class485.aClass485_5282 == class485)
			class479s[i_9_].method7862((byte) -23);
		}
	    }
	}
    }
    
    public Class367_Sub2(Class652 class652) {
	aRunnable10280 = new Class160(this);
	aRunnable10277 = new Class162(this);
	aClass369_10279 = new Class369(this);
	aHashMap10278 = new HashMap();
	Iterator iterator = class652.aHashMap8482.keySet().iterator();
	while (iterator.hasNext()) {
	    Class496 class496 = (Class496) iterator.next();
	    aHashMap10278.put(class496,
			      (new Class479
			       [((Integer) class652.aHashMap8482.get(class496))
				    .intValue()]));
	}
	iterator = aHashMap10278.keySet().iterator();
	while (iterator.hasNext()) {
	    Class496 class496 = (Class496) iterator.next();
	    Class479[] class479s = (Class479[]) aHashMap10278.get(class496);
	    for (int i = 0; i < class479s.length; i++) {
		Class258 class258 = new Class258(2.0F);
		class258.method287(0, Class382.aClass382_3932,
				   Class386.aClass386_4047, 2);
		class479s[i]
		    = new Class479(class496, 32768, 3, class258, this);
	    }
	}
	aThread10281 = new Thread(aRunnable10277);
	aThread10284 = new Thread(aRunnable10280);
	aThread10281.setPriority(1);
	aThread10284.setPriority(1);
	aThread10281.start();
	aThread10284.start();
    }
    
    public int method6358(Object object) {
	long l = Class250.method4604((byte) -2);
	int i = (int) (180000.0F
		       / ((float) (l - aLong10283 * 6440050160333401431L)
			  / 1000.0F));
	aLong10283 = l * 3905997843429494375L;
	return i;
    }
    
    public int method6335(Object object) {
	long l = Class250.method4604((byte) -77);
	int i = (int) (180000.0F
		       / ((float) (l - aLong10283 * 6440050160333401431L)
			  / 1000.0F));
	aLong10283 = l * 3905997843429494375L;
	return i;
    }
    
    public void method6360() {
	HashMap hashmap = method15873((byte) 38);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class496 class496 = (Class496) iterator.next();
		Class479[] class479s = (Class479[]) hashmap.get(class496);
		for (int i = 0; i < class479s.length; i++) {
		    if (class479s[i].method7853((byte) -67)
			!= Class485.aClass485_5287) {
			class479s[i].method7862((byte) -73);
			class479s[i].method7810(-52073490);
		    }
		}
	    }
	}
	boolean bool = false;
	while (!bool) {
	    bool = true;
	    synchronized (hashmap) {
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class496 class496 = (Class496) iterator.next();
		    Class479[] class479s = (Class479[]) hashmap.get(class496);
		    for (int i = 0; i < class479s.length; i++) {
			if (class479s[i].method7853((byte) -13)
			    != Class485.aClass485_5287) {
			    class479s[i].method7822((byte) 78);
			    bool = false;
			}
		    }
		}
	    }
	    Class251.method4622(10L);
	}
	aBool10282 = true;
	try {
	    aThread10281.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10284.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public Object method6344(int i, int i_10_, Class382 class382,
			     Class386 class386, int i_11_, float f) {
	return new Object();
    }
    
    public Class479 method6355(Class496 class496) {
	synchronized (aHashMap10278) {
	    Class479[] class479s = (Class479[]) aHashMap10278.get(class496);
	    if (null == class479s) {
		Class479 class479 = null;
		return class479;
	    }
	    for (int i = 0; i < class479s.length; i++) {
		Class479 class479 = class479s[i];
		Class485 class485 = class479.method7853((byte) 7);
		if (class485 == Class485.aClass485_5287) {
		    class479.method7809(-1654339955);
		    Class479 class479_12_ = class479;
		    return class479_12_;
		}
	    }
	}
	return null;
    }
    
    public void method6351(Object object) {
	/* empty */
    }
    
    public void method6353(Object object, byte[] is, int i, int i_13_) {
	/* empty */
    }
    
    public void method6338(Object object, byte[] is, int i, int i_14_,
			   byte i_15_) {
	/* empty */
    }
    
    public void method6341(int i) {
	if (aClass369_10279 != null)
	    aClass369_10279.method6372((byte) -63);
	Iterator iterator = aHashMap10278.keySet().iterator();
	while (iterator.hasNext()) {
	    Class496 class496 = (Class496) iterator.next();
	    Class479[] class479s = (Class479[]) aHashMap10278.get(class496);
	    if (!class496.aBool5547) {
		boolean bool = false;
		for (int i_16_ = 0; i_16_ < class479s.length; i_16_++) {
		    class479s[i_16_].method7822((byte) 94);
		    bool |= class479s[i_16_].method7805((short) -6671);
		}
		if (bool)
		    Arrays.sort(class479s, new Class159(this));
	    }
	    int i_17_ = 3;
	    boolean bool = false;
	    int i_18_ = class479s.length - 1;
	    while (!bool) {
		float f = class479s[i_18_].method7819(419590606);
		Class485 class485 = class479s[i_18_].method7853((byte) -11);
		if (f < 0.0F) {
		    if (class485 == Class485.aClass485_5282
			|| Class485.aClass485_5284 == class485
			|| Class485.aClass485_5285 == class485)
			class479s[i_18_].method7862((byte) -55);
		} else
		    bool = true;
		if (--i_18_ < 0)
		    bool = true;
	    }
	    if (i_18_ >= class479s.length - i_17_) {
		for (/**/; i_18_ >= class479s.length - i_17_; i_18_--) {
		    Class485 class485 = class479s[i_18_].method7853((byte) 2);
		    if (Class485.aClass485_5282 == class485)
			class479s[i_18_].method7862((byte) -22);
		}
	    }
	}
    }
    
    public Class479 method6340(Class496 class496, int i) {
	synchronized (aHashMap10278) {
	    Class479[] class479s = (Class479[]) aHashMap10278.get(class496);
	    if (null == class479s) {
		Class479 class479 = null;
		return class479;
	    }
	    for (int i_19_ = 0; i_19_ < class479s.length; i_19_++) {
		Class479 class479 = class479s[i_19_];
		Class485 class485 = class479.method7853((byte) 43);
		if (class485 == Class485.aClass485_5287) {
		    class479.method7809(-1068732316);
		    Class479 class479_20_ = class479;
		    return class479_20_;
		}
	    }
	}
	return null;
    }
    
    public Class479 method6349(Class496 class496) {
	synchronized (aHashMap10278) {
	    Class479[] class479s = (Class479[]) aHashMap10278.get(class496);
	    if (null == class479s) {
		Class479 class479 = null;
		return class479;
	    }
	    for (int i = 0; i < class479s.length; i++) {
		Class479 class479 = class479s[i];
		Class485 class485 = class479.method7853((byte) 43);
		if (class485 == Class485.aClass485_5287) {
		    class479.method7809(-1295682998);
		    Class479 class479_21_ = class479;
		    return class479_21_;
		}
	    }
	}
	return null;
    }
    
    public Class479 method6357(Class496 class496) {
	synchronized (aHashMap10278) {
	    Class479[] class479s = (Class479[]) aHashMap10278.get(class496);
	    if (null == class479s) {
		Class479 class479 = null;
		return class479;
	    }
	    for (int i = 0; i < class479s.length; i++) {
		Class479 class479 = class479s[i];
		Class485 class485 = class479.method7853((byte) -109);
		if (class485 == Class485.aClass485_5287) {
		    class479.method7809(-1279142451);
		    Class479 class479_22_ = class479;
		    return class479_22_;
		}
	    }
	}
	return null;
    }
    
    public Object method6348(int i, int i_23_, Class382 class382,
			     Class386 class386, int i_24_, float f) {
	return new Object();
    }
    
    Object method6359(Class388 class388) {
	return null;
    }
    
    public Object method6350(int i, int i_25_, Class382 class382,
			     Class386 class386, int i_26_, float f) {
	return new Object();
    }
    
    public void method6361() {
	HashMap hashmap = method15873((byte) 36);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class496 class496 = (Class496) iterator.next();
		Class479[] class479s = (Class479[]) hashmap.get(class496);
		for (int i = 0; i < class479s.length; i++) {
		    if (class479s[i].method7853((byte) 17)
			!= Class485.aClass485_5287) {
			class479s[i].method7862((byte) 6);
			class479s[i].method7810(-855042165);
		    }
		}
	    }
	}
	boolean bool = false;
	while (!bool) {
	    bool = true;
	    synchronized (hashmap) {
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class496 class496 = (Class496) iterator.next();
		    Class479[] class479s = (Class479[]) hashmap.get(class496);
		    for (int i = 0; i < class479s.length; i++) {
			if (class479s[i].method7853((byte) 91)
			    != Class485.aClass485_5287) {
			    class479s[i].method7822((byte) 25);
			    bool = false;
			}
		    }
		}
	    }
	    Class251.method4622(10L);
	}
	aBool10282 = true;
	try {
	    aThread10281.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10284.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public void method6362() {
	HashMap hashmap = method15873((byte) 24);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class496 class496 = (Class496) iterator.next();
		Class479[] class479s = (Class479[]) hashmap.get(class496);
		for (int i = 0; i < class479s.length; i++) {
		    if (class479s[i].method7853((byte) 49)
			!= Class485.aClass485_5287) {
			class479s[i].method7862((byte) 23);
			class479s[i].method7810(100362721);
		    }
		}
	    }
	}
	boolean bool = false;
	while (!bool) {
	    bool = true;
	    synchronized (hashmap) {
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class496 class496 = (Class496) iterator.next();
		    Class479[] class479s = (Class479[]) hashmap.get(class496);
		    for (int i = 0; i < class479s.length; i++) {
			if (class479s[i].method7853((byte) -28)
			    != Class485.aClass485_5287) {
			    class479s[i].method7822((byte) 28);
			    bool = false;
			}
		    }
		}
	    }
	    Class251.method4622(10L);
	}
	aBool10282 = true;
	try {
	    aThread10281.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10284.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public void method6363() {
	HashMap hashmap = method15873((byte) 7);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class496 class496 = (Class496) iterator.next();
		Class479[] class479s = (Class479[]) hashmap.get(class496);
		for (int i = 0; i < class479s.length; i++) {
		    if (class479s[i].method7853((byte) -72)
			!= Class485.aClass485_5287) {
			class479s[i].method7862((byte) 56);
			class479s[i].method7810(-1876553136);
		    }
		}
	    }
	}
	boolean bool = false;
	while (!bool) {
	    bool = true;
	    synchronized (hashmap) {
		Iterator iterator = hashmap.keySet().iterator();
		while (iterator.hasNext()) {
		    Class496 class496 = (Class496) iterator.next();
		    Class479[] class479s = (Class479[]) hashmap.get(class496);
		    for (int i = 0; i < class479s.length; i++) {
			if (class479s[i].method7853((byte) -38)
			    != Class485.aClass485_5287) {
			    class479s[i].method7822((byte) 91);
			    bool = false;
			}
		    }
		}
	    }
	    Class251.method4622(10L);
	}
	aBool10282 = true;
	try {
	    aThread10281.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10284.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    Object method6345(Class388 class388) {
	return null;
    }
}
