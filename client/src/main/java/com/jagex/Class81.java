/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class81
{
    Class483 aClass483_832;
    Map aMap833;
    public static Class563 aClass563_834;
    
    void method1631(Class534_Sub40 class534_sub40) {
	aClass483_832
	    = ((Class483)
	       Class448.method7319(Class483.method7942(-88965010),
				   class534_sub40.method16527(-1073888640),
				   2088438307));
	int i = class534_sub40.method16588((short) 20131);
	aMap833 = new HashMap(i);
	while (i-- > 0) {
	    Object object
		= aClass483_832.method7947(class534_sub40, 638621098);
	    int i_0_ = class534_sub40.method16588((short) 22011);
	    LinkedList linkedlist = new LinkedList();
	    while (i_0_-- > 0) {
		int i_1_ = class534_sub40.method16588((short) 25923);
		linkedlist.add(Integer.valueOf(i_1_));
	    }
	    aMap833.put(object, linkedlist);
	}
    }
    
    void method1632(Class534_Sub40 class534_sub40, int i) {
	aClass483_832
	    = ((Class483)
	       Class448.method7319(Class483.method7942(-88965010),
				   class534_sub40.method16527(-474231007),
				   2088438307));
	int i_2_ = class534_sub40.method16588((short) 30736);
	aMap833 = new HashMap(i_2_);
	while (i_2_-- > 0) {
	    Object object
		= aClass483_832.method7947(class534_sub40, 136576093);
	    int i_3_ = class534_sub40.method16588((short) 26457);
	    LinkedList linkedlist = new LinkedList();
	    while (i_3_-- > 0) {
		int i_4_ = class534_sub40.method16588((short) 29057);
		linkedlist.add(Integer.valueOf(i_4_));
	    }
	    aMap833.put(object, linkedlist);
	}
    }
    
    public Class81(Class472 class472, int i, int i_5_) {
	byte[] is = class472.method7743(i, i_5_, -1620212784);
	method1632(new Class534_Sub40(is), -918583439);
    }
    
    void method1633(Class534_Sub40 class534_sub40) {
	aClass483_832
	    = ((Class483)
	       Class448.method7319(Class483.method7942(-88965010),
				   class534_sub40.method16527(2074355307),
				   2088438307));
	int i = class534_sub40.method16588((short) 24626);
	aMap833 = new HashMap(i);
	while (i-- > 0) {
	    Object object
		= aClass483_832.method7947(class534_sub40, 1529889627);
	    int i_6_ = class534_sub40.method16588((short) 32470);
	    LinkedList linkedlist = new LinkedList();
	    while (i_6_-- > 0) {
		int i_7_ = class534_sub40.method16588((short) 9220);
		linkedlist.add(Integer.valueOf(i_7_));
	    }
	    aMap833.put(object, linkedlist);
	}
    }
    
    public List method1634(Object object, byte i) {
	return (List) aMap833.get(object);
    }
    
    public List method1635(Object object) {
	return (List) aMap833.get(object);
    }
    
    public List method1636(Object object) {
	return (List) aMap833.get(object);
    }
    
    public static Class247 method1637(int i, int i_8_, int i_9_) {
	Class247 class247 = Class112.method2017(i, 104255580);
	if (i_8_ == -1)
	    return class247;
	if (null == class247 || null == class247.aClass247Array2620
	    || i_8_ >= class247.aClass247Array2620.length)
	    return null;
	return class247.aClass247Array2620[i_8_];
    }
    
    static final void method1638(Class669 class669, int i) {
	if (null != client.aString11300)
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= Class105.method1940(client.aString11300, (byte) 67);
	else
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
    }
}
