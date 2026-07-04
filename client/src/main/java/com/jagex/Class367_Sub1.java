/* Class367_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class367_Sub1 extends Class367
{
    volatile boolean aBool10149 = false;
    HashMap aHashMap10150;
    Runnable aRunnable10151;
    Class369 aClass369_10152;
    Thread aThread10153;
    Thread aThread10154;
    List aList10155 = new ArrayList();
    Runnable aRunnable10156 = new Class555(this);
    static final float aFloat10157 = 2.0F;
    
    public Class479 method6357(Class496 class496) {
	synchronized (aHashMap10150) {
	    Class479[] class479s = (Class479[]) aHashMap10150.get(class496);
	    if (class479s == null) {
		Class479 class479 = null;
		return class479;
	    }
	    for (int i = 0; i < class479s.length; i++) {
		Class479 class479 = class479s[i];
		Class485 class485 = class479.method7853((byte) -32);
		if (Class485.aClass485_5287 == class485) {
		    class479.method7809(-1040882296);
		    Class479 class479_0_ = class479;
		    return class479_0_;
		}
	    }
	}
	return null;
    }
    
    public Class367_Sub1(Class652 class652) {
	aRunnable10151 = new Class549(this);
	aClass369_10152 = new Class369(this);
	aHashMap10150 = new HashMap();
	Iterator iterator = class652.aHashMap8482.keySet().iterator();
	while (iterator.hasNext()) {
	    Class496 class496 = (Class496) iterator.next();
	    aHashMap10150.put(class496,
			      (new Class479
			       [((Integer) class652.aHashMap8482.get(class496))
				    .intValue()]));
	}
	iterator = aHashMap10150.keySet().iterator();
	while (iterator.hasNext()) {
	    Class496 class496 = (Class496) iterator.next();
	    Class479[] class479s = (Class479[]) aHashMap10150.get(class496);
	    for (int i = 0; i < class479s.length; i++) {
		Class258 class258 = new Class258(2.0F);
		class258.method287(0, Class382.aClass382_3932,
				   Class386.aClass386_4047, 2);
		class479s[i] = new Class479(class496, 8192, 3, class258, this);
	    }
	}
	Class569 class569 = new Class569(this, 44100.0F, 32768);
	Class569 class569_1_ = new Class569(this, 22050.0F, 16384);
	aList10155.add(class569);
	aList10155.add(class569_1_);
	aThread10153 = new Thread(aRunnable10151);
	aThread10154 = new Thread(aRunnable10156);
	aThread10153.setPriority(10);
	aThread10154.setPriority(10);
	aThread10153.start();
	aThread10154.start();
    }
    
    public void method6341(int i) {
	if (null != aClass369_10152)
	    aClass369_10152.method6372((byte) 85);
	Iterator iterator = aHashMap10150.keySet().iterator();
	while (iterator.hasNext()) {
	    Class496 class496 = (Class496) iterator.next();
	    Class479[] class479s = (Class479[]) aHashMap10150.get(class496);
	    if (!class496.aBool5547) {
		boolean bool = false;
		for (int i_2_ = 0; i_2_ < class479s.length; i_2_++) {
		    class479s[i_2_].method7822((byte) 21);
		    bool |= class479s[i_2_].method7805((short) -17566);
		}
		if (bool)
		    Arrays.sort(class479s, new Class551(this));
	    }
	    int i_3_ = 6;
	    boolean bool = false;
	    int i_4_ = class479s.length - 1;
	    while (false == bool) {
		float f = class479s[i_4_].method7819(1481117193);
		Class485 class485 = class479s[i_4_].method7853((byte) 22);
		if (f < 0.0F) {
		    if (class485 == Class485.aClass485_5282
			|| class485 == Class485.aClass485_5284
			|| class485 == Class485.aClass485_5285)
			class479s[i_4_].method7862((byte) 32);
		} else
		    bool = true;
		if (--i_4_ < 0)
		    bool = true;
	    }
	    if (i_4_ >= class479s.length - i_3_) {
		for (/**/; i_4_ >= class479s.length - i_3_; i_4_--) {
		    Class485 class485 = class479s[i_4_].method7853((byte) 27);
		    if (class485 == Class485.aClass485_5282)
			class479s[i_4_].method7862((byte) -11);
		}
	    }
	}
    }
    
    public void method6353(Object object, byte[] is, int i, int i_5_) {
	if (object != null && object instanceof Class565) {
	    Class565 class565 = (Class565) object;
	    synchronized (class565.aClass569_7574) {
		class565.method9522(is, i, i_5_, 1949538776);
	    }
	}
    }
    
    Class569 method15776(float f, byte i) {
	float f_6_ = -1.0F;
	float f_7_ = 3.4028235E38F;
	Class569 class569 = null;
	Iterator iterator = aList10155.iterator();
	while (iterator.hasNext()) {
	    Class569 class569_8_ = (Class569) iterator.next();
	    float f_9_ = class569_8_.aFloat7615;
	    float f_10_ = Math.abs(f_9_ - f);
	    if (f_6_ < 0.0F || f_10_ < f_7_) {
		f_6_ = f_9_;
		f_7_ = f_10_;
		class569 = class569_8_;
	    }
	}
	return class569;
    }
    
    HashMap method15777() {
	return aHashMap10150;
    }
    
    public void method6346(Object object, int i) {
	if (object != null && object instanceof Class565) {
	    Class565 class565 = (Class565) object;
	    synchronized (class565.aClass569_7574) {
		class565.aClass569_7574.method9587(class565, (short) 10087);
	    }
	}
    }
    
    public void method6338(Object object, byte[] is, int i, int i_11_,
			   byte i_12_) {
	if (object != null && object instanceof Class565) {
	    Class565 class565 = (Class565) object;
	    synchronized (class565.aClass569_7574) {
		class565.method9522(is, i, i_11_, 899962965);
	    }
	}
    }
    
    public Class479 method6340(Class496 class496, int i) {
	synchronized (aHashMap10150) {
	    Class479[] class479s = (Class479[]) aHashMap10150.get(class496);
	    if (class479s == null) {
		Class479 class479 = null;
		return class479;
	    }
	    for (int i_13_ = 0; i_13_ < class479s.length; i_13_++) {
		Class479 class479 = class479s[i_13_];
		Class485 class485 = class479.method7853((byte) -80);
		if (Class485.aClass485_5287 == class485) {
		    class479.method7809(-2049365386);
		    Class479 class479_14_ = class479;
		    return class479_14_;
		}
	    }
	}
	return null;
    }
    
    public int method6339(Object object, int i) {
	if (object != null && object instanceof Class565) {
	    Class565 class565 = (Class565) object;
	    synchronized (class565.aClass569_7574) {
		int i_15_ = class565.method9521(491377997);
		return i_15_;
	    }
	}
	return 0;
    }
    
    public Class369 method6342(byte i) {
	return aClass369_10152;
    }
    
    public void method6343(int i) {
	HashMap hashmap = method15778(-650296415);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class496 class496 = (Class496) iterator.next();
		Class479[] class479s = (Class479[]) hashmap.get(class496);
		for (int i_16_ = 0; i_16_ < class479s.length; i_16_++) {
		    if (class479s[i_16_].method7853((byte) 32)
			!= Class485.aClass485_5287) {
			class479s[i_16_].method7862((byte) -74);
			class479s[i_16_].method7810(-885544683);
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
		    for (int i_17_ = 0; i_17_ < class479s.length; i_17_++) {
			if (class479s[i_17_].method7853((byte) 13)
			    != Class485.aClass485_5287) {
			    class479s[i_17_].method7822((byte) 50);
			    bool = false;
			}
		    }
		}
	    }
	    Class251.method4622(10L);
	}
	aBool10149 = true;
	try {
	    aThread10153.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10154.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public void method6347() {
	if (null != aClass369_10152)
	    aClass369_10152.method6372((byte) 21);
	Iterator iterator = aHashMap10150.keySet().iterator();
	while (iterator.hasNext()) {
	    Class496 class496 = (Class496) iterator.next();
	    Class479[] class479s = (Class479[]) aHashMap10150.get(class496);
	    if (!class496.aBool5547) {
		boolean bool = false;
		for (int i = 0; i < class479s.length; i++) {
		    class479s[i].method7822((byte) 20);
		    bool |= class479s[i].method7805((short) -1217);
		}
		if (bool)
		    Arrays.sort(class479s, new Class551(this));
	    }
	    int i = 6;
	    boolean bool = false;
	    int i_18_ = class479s.length - 1;
	    while (false == bool) {
		float f = class479s[i_18_].method7819(562989280);
		Class485 class485 = class479s[i_18_].method7853((byte) 70);
		if (f < 0.0F) {
		    if (class485 == Class485.aClass485_5282
			|| class485 == Class485.aClass485_5284
			|| class485 == Class485.aClass485_5285)
			class479s[i_18_].method7862((byte) -1);
		} else
		    bool = true;
		if (--i_18_ < 0)
		    bool = true;
	    }
	    if (i_18_ >= class479s.length - i) {
		for (/**/; i_18_ >= class479s.length - i; i_18_--) {
		    Class485 class485 = class479s[i_18_].method7853((byte) 3);
		    if (class485 == Class485.aClass485_5282)
			class479s[i_18_].method7862((byte) -11);
		}
	    }
	}
    }
    
    Object method6337(Class388 class388, int i) {
	return null;
    }
    
    public int method6356(Object object) {
	if (object != null && object instanceof Class565) {
	    Class565 class565 = (Class565) object;
	    synchronized (class565.aClass569_7574) {
		int i = class565.method9521(-1689329978);
		return i;
	    }
	}
	return 0;
    }
    
    public int method6358(Object object) {
	if (object != null && object instanceof Class565) {
	    Class565 class565 = (Class565) object;
	    synchronized (class565.aClass569_7574) {
		int i = class565.method9521(-101303993);
		return i;
	    }
	}
	return 0;
    }
    
    public int method6335(Object object) {
	if (object != null && object instanceof Class565) {
	    Class565 class565 = (Class565) object;
	    synchronized (class565.aClass569_7574) {
		int i = class565.method9521(1952576064);
		return i;
	    }
	}
	return 0;
    }
    
    public Class479 method6349(Class496 class496) {
	synchronized (aHashMap10150) {
	    Class479[] class479s = (Class479[]) aHashMap10150.get(class496);
	    if (class479s == null) {
		Class479 class479 = null;
		return class479;
	    }
	    for (int i = 0; i < class479s.length; i++) {
		Class479 class479 = class479s[i];
		Class485 class485 = class479.method7853((byte) 45);
		if (Class485.aClass485_5287 == class485) {
		    class479.method7809(-1697063577);
		    Class479 class479_19_ = class479;
		    return class479_19_;
		}
	    }
	}
	return null;
    }
    
    public Object method6344(int i, int i_20_, Class382 class382,
			     Class386 class386, int i_21_, float f) {
	Class569 class569 = method15776(f * (float) i_20_, (byte) -21);
	Class565 class565
	    = new Class565(this, class569, i_21_, (float) i_20_ * f,
			   class382.anInt3929 * -1204190425, i < 2 ? 2 : i,
			   (Class382.aClass382_3932 == class382
			    || class382 == Class382.aClass382_3933),
			   Class386.aClass386_4046 == class386);
	synchronized (class565.aClass569_7574) {
	    class565.aClass569_7574.method9578(class565, (byte) 1);
	}
	return class565;
    }
    
    public Object method6350(int i, int i_22_, Class382 class382,
			     Class386 class386, int i_23_, float f) {
	Class569 class569 = method15776(f * (float) i_22_, (byte) 2);
	Class565 class565
	    = new Class565(this, class569, i_23_, (float) i_22_ * f,
			   class382.anInt3929 * -1204190425, i < 2 ? 2 : i,
			   (Class382.aClass382_3932 == class382
			    || class382 == Class382.aClass382_3933),
			   Class386.aClass386_4046 == class386);
	synchronized (class565.aClass569_7574) {
	    class565.aClass569_7574.method9578(class565, (byte) 1);
	}
	return class565;
    }
    
    public void method6351(Object object) {
	if (object != null && object instanceof Class565) {
	    Class565 class565 = (Class565) object;
	    synchronized (class565.aClass569_7574) {
		class565.aClass569_7574.method9587(class565, (short) 6725);
	    }
	}
    }
    
    public Object method6348(int i, int i_24_, Class382 class382,
			     Class386 class386, int i_25_, float f) {
	Class569 class569 = method15776(f * (float) i_24_, (byte) 82);
	Class565 class565
	    = new Class565(this, class569, i_25_, (float) i_24_ * f,
			   class382.anInt3929 * -1204190425, i < 2 ? 2 : i,
			   (Class382.aClass382_3932 == class382
			    || class382 == Class382.aClass382_3933),
			   Class386.aClass386_4046 == class386);
	synchronized (class565.aClass569_7574) {
	    class565.aClass569_7574.method9578(class565, (byte) 1);
	}
	return class565;
    }
    
    public Class369 method6336() {
	return aClass369_10152;
    }
    
    public Class479 method6354(Class496 class496) {
	synchronized (aHashMap10150) {
	    Class479[] class479s = (Class479[]) aHashMap10150.get(class496);
	    if (class479s == null) {
		Class479 class479 = null;
		return class479;
	    }
	    for (int i = 0; i < class479s.length; i++) {
		Class479 class479 = class479s[i];
		Class485 class485 = class479.method7853((byte) -66);
		if (Class485.aClass485_5287 == class485) {
		    class479.method7809(-1666002369);
		    Class479 class479_26_ = class479;
		    return class479_26_;
		}
	    }
	}
	return null;
    }
    
    HashMap method15778(int i) {
	return aHashMap10150;
    }
    
    public void method6364() {
	if (null != aClass369_10152)
	    aClass369_10152.method6372((byte) -11);
	Iterator iterator = aHashMap10150.keySet().iterator();
	while (iterator.hasNext()) {
	    Class496 class496 = (Class496) iterator.next();
	    Class479[] class479s = (Class479[]) aHashMap10150.get(class496);
	    if (!class496.aBool5547) {
		boolean bool = false;
		for (int i = 0; i < class479s.length; i++) {
		    class479s[i].method7822((byte) 18);
		    bool |= class479s[i].method7805((short) -2215);
		}
		if (bool)
		    Arrays.sort(class479s, new Class551(this));
	    }
	    int i = 6;
	    boolean bool = false;
	    int i_27_ = class479s.length - 1;
	    while (false == bool) {
		float f = class479s[i_27_].method7819(756929303);
		Class485 class485 = class479s[i_27_].method7853((byte) 24);
		if (f < 0.0F) {
		    if (class485 == Class485.aClass485_5282
			|| class485 == Class485.aClass485_5284
			|| class485 == Class485.aClass485_5285)
			class479s[i_27_].method7862((byte) 69);
		} else
		    bool = true;
		if (--i_27_ < 0)
		    bool = true;
	    }
	    if (i_27_ >= class479s.length - i) {
		for (/**/; i_27_ >= class479s.length - i; i_27_--) {
		    Class485 class485 = class479s[i_27_].method7853((byte) 39);
		    if (class485 == Class485.aClass485_5282)
			class479s[i_27_].method7862((byte) -46);
		}
	    }
	}
    }
    
    public Object method6334(int i, int i_28_, Class382 class382,
			     Class386 class386, int i_29_, float f,
			     int i_30_) {
	Class569 class569 = method15776(f * (float) i_28_, (byte) -19);
	Class565 class565
	    = new Class565(this, class569, i_29_, (float) i_28_ * f,
			   class382.anInt3929 * -1204190425, i < 2 ? 2 : i,
			   (Class382.aClass382_3932 == class382
			    || class382 == Class382.aClass382_3933),
			   Class386.aClass386_4046 == class386);
	synchronized (class565.aClass569_7574) {
	    class565.aClass569_7574.method9578(class565, (byte) 1);
	}
	return class565;
    }
    
    Object method6345(Class388 class388) {
	return null;
    }
    
    Object method6359(Class388 class388) {
	return null;
    }
    
    public void method6360() {
	HashMap hashmap = method15778(-650296415);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class496 class496 = (Class496) iterator.next();
		Class479[] class479s = (Class479[]) hashmap.get(class496);
		for (int i = 0; i < class479s.length; i++) {
		    if (class479s[i].method7853((byte) 0)
			!= Class485.aClass485_5287) {
			class479s[i].method7862((byte) -6);
			class479s[i].method7810(-1409383763);
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
			if (class479s[i].method7853((byte) 7)
			    != Class485.aClass485_5287) {
			    class479s[i].method7822((byte) 64);
			    bool = false;
			}
		    }
		}
	    }
	    Class251.method4622(10L);
	}
	aBool10149 = true;
	try {
	    aThread10153.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10154.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public void method6361() {
	HashMap hashmap = method15778(-650296415);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class496 class496 = (Class496) iterator.next();
		Class479[] class479s = (Class479[]) hashmap.get(class496);
		for (int i = 0; i < class479s.length; i++) {
		    if (class479s[i].method7853((byte) -25)
			!= Class485.aClass485_5287) {
			class479s[i].method7862((byte) -65);
			class479s[i].method7810(483430231);
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
			if (class479s[i].method7853((byte) 5)
			    != Class485.aClass485_5287) {
			    class479s[i].method7822((byte) 77);
			    bool = false;
			}
		    }
		}
	    }
	    Class251.method4622(10L);
	}
	aBool10149 = true;
	try {
	    aThread10153.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10154.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public void method6362() {
	HashMap hashmap = method15778(-650296415);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class496 class496 = (Class496) iterator.next();
		Class479[] class479s = (Class479[]) hashmap.get(class496);
		for (int i = 0; i < class479s.length; i++) {
		    if (class479s[i].method7853((byte) -21)
			!= Class485.aClass485_5287) {
			class479s[i].method7862((byte) 69);
			class479s[i].method7810(-548848429);
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
			if (class479s[i].method7853((byte) -49)
			    != Class485.aClass485_5287) {
			    class479s[i].method7822((byte) 98);
			    bool = false;
			}
		    }
		}
	    }
	    Class251.method4622(10L);
	}
	aBool10149 = true;
	try {
	    aThread10153.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10154.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public void method6363() {
	HashMap hashmap = method15778(-650296415);
	synchronized (hashmap) {
	    Iterator iterator = hashmap.keySet().iterator();
	    while (iterator.hasNext()) {
		Class496 class496 = (Class496) iterator.next();
		Class479[] class479s = (Class479[]) hashmap.get(class496);
		for (int i = 0; i < class479s.length; i++) {
		    if (class479s[i].method7853((byte) -21)
			!= Class485.aClass485_5287) {
			class479s[i].method7862((byte) -64);
			class479s[i].method7810(-1354891545);
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
			if (class479s[i].method7853((byte) 49)
			    != Class485.aClass485_5287) {
			    class479s[i].method7822((byte) 120);
			    bool = false;
			}
		    }
		}
	    }
	    Class251.method4622(10L);
	}
	aBool10149 = true;
	try {
	    aThread10153.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
	try {
	    aThread10154.join();
	} catch (InterruptedException interruptedexception) {
	    interruptedexception.printStackTrace();
	}
    }
    
    public Class479 method6355(Class496 class496) {
	synchronized (aHashMap10150) {
	    Class479[] class479s = (Class479[]) aHashMap10150.get(class496);
	    if (class479s == null) {
		Class479 class479 = null;
		return class479;
	    }
	    for (int i = 0; i < class479s.length; i++) {
		Class479 class479 = class479s[i];
		Class485 class485 = class479.method7853((byte) -27);
		if (Class485.aClass485_5287 == class485) {
		    class479.method7809(-1541883777);
		    Class479 class479_31_ = class479;
		    return class479_31_;
		}
	    }
	}
	return null;
    }
    
    Class569 method15779(float f) {
	float f_32_ = -1.0F;
	float f_33_ = 3.4028235E38F;
	Class569 class569 = null;
	Iterator iterator = aList10155.iterator();
	while (iterator.hasNext()) {
	    Class569 class569_34_ = (Class569) iterator.next();
	    float f_35_ = class569_34_.aFloat7615;
	    float f_36_ = Math.abs(f_35_ - f);
	    if (f_32_ < 0.0F || f_36_ < f_33_) {
		f_32_ = f_35_;
		f_33_ = f_36_;
		class569 = class569_34_;
	    }
	}
	return class569;
    }
    
    public void method6352(Object object, byte[] is, int i, int i_37_) {
	if (object != null && object instanceof Class565) {
	    Class565 class565 = (Class565) object;
	    synchronized (class565.aClass569_7574) {
		class565.method9522(is, i, i_37_, 1341811552);
	    }
	}
    }
    
    static final void method15780(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub31_10785
		  .method17145((short) -10821);
    }
}
