/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class41 implements Interface13, Interface7
{
    String aString313 = "null";
    public Class493 aClass493_314;
    Map aMap315;
    int anInt316;
    public Class493 aClass493_317;
    Object[] anObjectArray318;
    int anInt319 = 0;
    HashMap aHashMap320;
    
    void method1037() {
	HashMap hashmap = new HashMap();
	if (null != anObjectArray318) {
	    for (int i = 0; i < anObjectArray318.length; i++) {
		if (anObjectArray318[i] != null) {
		    Object object = anObjectArray318[i];
		    List list = (List) hashmap.get(object);
		    if (list == null) {
			list = new LinkedList();
			hashmap.put(object, list);
		    }
		    list.add(new Integer(i));
		}
	    }
	} else if (null != aMap315) {
	    Iterator iterator = aMap315.entrySet().iterator();
	    while (iterator.hasNext()) {
		Map.Entry entry = (Map.Entry) iterator.next();
		Object object = entry.getValue();
		List list = (List) hashmap.get(object);
		if (null == list) {
		    list = new LinkedList();
		    hashmap.put(object, list);
		}
		list.add(entry.getKey());
	    }
	} else
	    throw new IllegalStateException();
	aHashMap320 = new HashMap();
	Iterator iterator = hashmap.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    List list = (List) entry.getValue();
	    int[] is = new int[list.size()];
	    int i = 0;
	    Iterator iterator_0_ = list.iterator();
	    while (iterator_0_.hasNext()) {
		Integer integer = (Integer) iterator_0_.next();
		is[i++] = integer.intValue();
	    }
	    if (null == anObjectArray318)
		Arrays.sort(is);
	    aHashMap320.put(entry.getKey(), is);
	}
    }
    
    public void method79(Class534_Sub40 class534_sub40, byte i) {
	for (;;) {
	    int i_1_ = class534_sub40.method16527(-814593059);
	    if (i_1_ == 0)
		break;
	    method1038(class534_sub40, i_1_, (byte) -26);
	}
    }
    
    void method1038(Class534_Sub40 class534_sub40, int i, byte i_2_) {
	if (i == 1) {
	    char c = Class502_Sub2.method15983(class534_sub40
						   .method16586((byte) 1),
					       2133143299);
	    aClass493_317 = Class493.method8103(c, 1393979606);
	} else if (2 == i) {
	    char c = Class502_Sub2.method15983(class534_sub40
						   .method16586((byte) 1),
					       2038506471);
	    aClass493_314 = Class493.method8103(c, 294942350);
	} else if (3 == i)
	    aString313 = class534_sub40.method16541((byte) -104);
	else if (i == 4)
	    anInt316 = class534_sub40.method16533(-258848859) * -296170141;
	else if (i == 5 || i == 6) {
	    anInt319 = class534_sub40.method16529((byte) 1) * 1428784925;
	    aMap315 = new HashMap(anInt319 * 578384693);
	    for (int i_3_ = 0; i_3_ < anInt319 * 578384693; i_3_++) {
		int i_4_ = class534_sub40.method16533(-258848859);
		java.io.Serializable serializable;
		if (i == 5)
		    serializable = class534_sub40.method16541((byte) -93);
		else
		    serializable
			= new Integer(class534_sub40.method16533(-258848859));
		aMap315.put(new Integer(i_4_), serializable);
	    }
	} else if (i == 7 || i == 8) {
	    int i_5_ = class534_sub40.method16529((byte) 1);
	    anInt319 = class534_sub40.method16529((byte) 1) * 1428784925;
	    anObjectArray318 = new Object[i_5_];
	    for (int i_6_ = 0; i_6_ < 578384693 * anInt319; i_6_++) {
		int i_7_ = class534_sub40.method16529((byte) 1);
		if (i == 7)
		    anObjectArray318[i_7_]
			= class534_sub40.method16541((byte) -67);
		else
		    anObjectArray318[i_7_]
			= new Integer(class534_sub40.method16533(-258848859));
	    }
	} else if (101 == i)
	    aClass493_317
		= ((Class493)
		   Class448.method7319(Class493.method8108((byte) 15),
				       class534_sub40.method16546(-1706829710),
				       2088438307));
	else if (i == 102)
	    aClass493_314
		= ((Class493)
		   Class448.method7319(Class493.method8108((byte) -16),
				       class534_sub40.method16546(-1706829710),
				       2088438307));
    }
    
    public int method1039(int i, int i_8_) {
	Object object = method1041(i, 237460337);
	if (object == null)
	    return anInt316 * -101245877;
	return ((Integer) object).intValue();
    }
    
    public String method1040(int i, byte i_9_) {
	Object object = method1041(i, 237460337);
	if (object == null)
	    return aString313;
	return (String) object;
    }
    
    Object method1041(int i, int i_10_) {
	if (anObjectArray318 != null) {
	    if (i < 0 || i >= anObjectArray318.length)
		return null;
	    return anObjectArray318[i];
	}
	if (null != aMap315)
	    return aMap315.get(new Integer(i));
	return null;
    }
    
    public void method78(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-6056835);
	    if (i == 0)
		break;
	    method1038(class534_sub40, i, (byte) -119);
	}
    }
    
    public int[] method1042(Object object, short i) {
	if (0 == anInt319 * 578384693)
	    return null;
	if (null == aHashMap320)
	    method1059(335281982);
	return (int[]) aHashMap320.get(object);
    }
    
    public int method1043(int i) {
	return 578384693 * anInt319;
    }
    
    public boolean method1044(Object object) {
	if (0 == anInt319 * 578384693)
	    return false;
	if (aHashMap320 == null)
	    method1059(335281982);
	return aHashMap320.containsKey(object);
    }
    
    public void method82(int i) {
	/* empty */
    }
    
    public void method67(int i, int i_11_) {
	/* empty */
    }
    
    public void method80(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(-1782356552);
	    if (i == 0)
		break;
	    method1038(class534_sub40, i, (byte) -118);
	}
    }
    
    void method1045(Class534_Sub40 class534_sub40, int i) {
	if (i == 1) {
	    char c = Class502_Sub2.method15983(class534_sub40
						   .method16586((byte) 1),
					       2060580584);
	    aClass493_317 = Class493.method8103(c, 1177840107);
	} else if (2 == i) {
	    char c = Class502_Sub2.method15983(class534_sub40
						   .method16586((byte) 1),
					       2080627116);
	    aClass493_314 = Class493.method8103(c, 1006464144);
	} else if (3 == i)
	    aString313 = class534_sub40.method16541((byte) -47);
	else if (i == 4)
	    anInt316 = class534_sub40.method16533(-258848859) * -296170141;
	else if (i == 5 || i == 6) {
	    anInt319 = class534_sub40.method16529((byte) 1) * 1428784925;
	    aMap315 = new HashMap(anInt319 * 578384693);
	    for (int i_12_ = 0; i_12_ < anInt319 * 578384693; i_12_++) {
		int i_13_ = class534_sub40.method16533(-258848859);
		java.io.Serializable serializable;
		if (i == 5)
		    serializable = class534_sub40.method16541((byte) -23);
		else
		    serializable
			= new Integer(class534_sub40.method16533(-258848859));
		aMap315.put(new Integer(i_13_), serializable);
	    }
	} else if (i == 7 || i == 8) {
	    int i_14_ = class534_sub40.method16529((byte) 1);
	    anInt319 = class534_sub40.method16529((byte) 1) * 1428784925;
	    anObjectArray318 = new Object[i_14_];
	    for (int i_15_ = 0; i_15_ < 578384693 * anInt319; i_15_++) {
		int i_16_ = class534_sub40.method16529((byte) 1);
		if (i == 7)
		    anObjectArray318[i_16_]
			= class534_sub40.method16541((byte) -107);
		else
		    anObjectArray318[i_16_]
			= new Integer(class534_sub40.method16533(-258848859));
	    }
	} else if (101 == i)
	    aClass493_317
		= ((Class493)
		   Class448.method7319(Class493.method8108((byte) -2),
				       class534_sub40.method16546(-1706829710),
				       2088438307));
	else if (i == 102)
	    aClass493_314
		= ((Class493)
		   Class448.method7319(Class493.method8108((byte) -51),
				       class534_sub40.method16546(-1706829710),
				       2088438307));
    }
    
    public int method1046() {
	return 578384693 * anInt319;
    }
    
    public void method83() {
	/* empty */
    }
    
    public int method1047() {
	return 578384693 * anInt319;
    }
    
    public void method84() {
	/* empty */
    }
    
    public void method65(int i) {
	/* empty */
    }
    
    public int method1048(int i) {
	Object object = method1041(i, 237460337);
	if (object == null)
	    return anInt316 * -101245877;
	return ((Integer) object).intValue();
    }
    
    public void method66(int i) {
	/* empty */
    }
    
    public int method1049(int i) {
	Object object = method1041(i, 237460337);
	if (object == null)
	    return anInt316 * -101245877;
	return ((Integer) object).intValue();
    }
    
    public boolean method1050(Object object, byte i) {
	if (0 == anInt319 * 578384693)
	    return false;
	if (aHashMap320 == null)
	    method1059(335281982);
	return aHashMap320.containsKey(object);
    }
    
    public String method1051(int i) {
	Object object = method1041(i, 237460337);
	if (object == null)
	    return aString313;
	return (String) object;
    }
    
    public boolean method1052(Object object) {
	if (0 == anInt319 * 578384693)
	    return false;
	if (aHashMap320 == null)
	    method1059(335281982);
	return aHashMap320.containsKey(object);
    }
    
    public int method1053(int i) {
	Object object = method1041(i, 237460337);
	if (object == null)
	    return anInt316 * -101245877;
	return ((Integer) object).intValue();
    }
    
    public boolean method1054(Object object) {
	if (0 == anInt319 * 578384693)
	    return false;
	if (aHashMap320 == null)
	    method1059(335281982);
	return aHashMap320.containsKey(object);
    }
    
    public int[] method1055(Object object) {
	if (0 == anInt319 * 578384693)
	    return null;
	if (null == aHashMap320)
	    method1059(335281982);
	return (int[]) aHashMap320.get(object);
    }
    
    public int[] method1056(Object object) {
	if (0 == anInt319 * 578384693)
	    return null;
	if (null == aHashMap320)
	    method1059(335281982);
	return (int[]) aHashMap320.get(object);
    }
    
    public int[] method1057(Object object) {
	if (0 == anInt319 * 578384693)
	    return null;
	if (null == aHashMap320)
	    method1059(335281982);
	return (int[]) aHashMap320.get(object);
    }
    
    Class41() {
	/* empty */
    }
    
    void method1058() {
	HashMap hashmap = new HashMap();
	if (null != anObjectArray318) {
	    for (int i = 0; i < anObjectArray318.length; i++) {
		if (anObjectArray318[i] != null) {
		    Object object = anObjectArray318[i];
		    List list = (List) hashmap.get(object);
		    if (list == null) {
			list = new LinkedList();
			hashmap.put(object, list);
		    }
		    list.add(new Integer(i));
		}
	    }
	} else if (null != aMap315) {
	    Iterator iterator = aMap315.entrySet().iterator();
	    while (iterator.hasNext()) {
		Map.Entry entry = (Map.Entry) iterator.next();
		Object object = entry.getValue();
		List list = (List) hashmap.get(object);
		if (null == list) {
		    list = new LinkedList();
		    hashmap.put(object, list);
		}
		list.add(entry.getKey());
	    }
	} else
	    throw new IllegalStateException();
	aHashMap320 = new HashMap();
	Iterator iterator = hashmap.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    List list = (List) entry.getValue();
	    int[] is = new int[list.size()];
	    int i = 0;
	    Iterator iterator_17_ = list.iterator();
	    while (iterator_17_.hasNext()) {
		Integer integer = (Integer) iterator_17_.next();
		is[i++] = integer.intValue();
	    }
	    if (null == anObjectArray318)
		Arrays.sort(is);
	    aHashMap320.put(entry.getKey(), is);
	}
    }
    
    public void method81(Class534_Sub40 class534_sub40) {
	for (;;) {
	    int i = class534_sub40.method16527(1359413576);
	    if (i == 0)
		break;
	    method1038(class534_sub40, i, (byte) -40);
	}
    }
    
    void method1059(int i) {
	HashMap hashmap = new HashMap();
	if (null != anObjectArray318) {
	    for (int i_18_ = 0; i_18_ < anObjectArray318.length; i_18_++) {
		if (anObjectArray318[i_18_] != null) {
		    Object object = anObjectArray318[i_18_];
		    List list = (List) hashmap.get(object);
		    if (list == null) {
			list = new LinkedList();
			hashmap.put(object, list);
		    }
		    list.add(new Integer(i_18_));
		}
	    }
	} else if (null != aMap315) {
	    Iterator iterator = aMap315.entrySet().iterator();
	    while (iterator.hasNext()) {
		Map.Entry entry = (Map.Entry) iterator.next();
		Object object = entry.getValue();
		List list = (List) hashmap.get(object);
		if (null == list) {
		    list = new LinkedList();
		    hashmap.put(object, list);
		}
		list.add(entry.getKey());
	    }
	} else
	    throw new IllegalStateException();
	aHashMap320 = new HashMap();
	Iterator iterator = hashmap.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    List list = (List) entry.getValue();
	    int[] is = new int[list.size()];
	    int i_19_ = 0;
	    Iterator iterator_20_ = list.iterator();
	    while (iterator_20_.hasNext()) {
		Integer integer = (Integer) iterator_20_.next();
		is[i_19_++] = integer.intValue();
	    }
	    if (null == anObjectArray318)
		Arrays.sort(is);
	    aHashMap320.put(entry.getKey(), is);
	}
    }
    
    public static void method1060(int i, String string, boolean bool,
				  int i_21_) {
	if (Class535.method8895((byte) 3)) {
	    if (Class65.anInt662 * 1832109523 != i)
		Class65.aLong663 = 8972729624098644529L;
	    Class65.anInt662 = 1651628635 * i;
	    Class65.aString696 = string;
	    Class65.aBool697 = bool;
	    client.aClass100_11094.method1866((byte) -117);
	    Class673.method11110(13, -1622199415);
	}
    }
    
    static final void method1061(Class669 class669, int i) {
	int i_22_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_22_, 1477862692);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_22_ >> 16];
	Class540.method8936(class247, class243, class669, 1984765573);
    }
}
