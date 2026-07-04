/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;
import java.util.LinkedList;

public class Class213
{
    LinkedList aLinkedList2277;
    long aLong2278;
    int anInt2279 = 2144460233;
    Interface27 anInterface27_2280;
    
    public void method4016(Class214 class214, int i) {
	if ((aLong2278 * 2968070032055265101L
	     != -7721770475843032135L * class214.aLong2285)
	    || class214.method4028((byte) -71) != -1904397433 * anInt2279)
	    throw new IllegalStateException("");
	Iterator iterator = aLinkedList2277.iterator();
	while (iterator.hasNext()) {
	    Interface28 interface28 = (Interface28) iterator.next();
	    interface28.method173(class214, 983627176);
	}
	class214.method4034((byte) 19);
    }
    
    public void method4017(Class214 class214) {
	if ((aLong2278 * 2968070032055265101L
	     != -7721770475843032135L * class214.aLong2285)
	    || class214.method4028((byte) -97) != -1904397433 * anInt2279)
	    throw new IllegalStateException("");
	Iterator iterator = aLinkedList2277.iterator();
	while (iterator.hasNext()) {
	    Interface28 interface28 = (Interface28) iterator.next();
	    interface28.method173(class214, 321436320);
	}
	class214.method4034((byte) 61);
    }
    
    public void method4018(Class214 class214) {
	if ((aLong2278 * 2968070032055265101L
	     != -7721770475843032135L * class214.aLong2285)
	    || class214.method4028((byte) -40) != -1904397433 * anInt2279)
	    throw new IllegalStateException("");
	Iterator iterator = aLinkedList2277.iterator();
	while (iterator.hasNext()) {
	    Interface28 interface28 = (Interface28) iterator.next();
	    interface28.method173(class214, 446170753);
	}
	class214.method4034((byte) 127);
    }
    
    public Class213(Class534_Sub40 class534_sub40, Interface27 interface27) {
	aLinkedList2277 = new LinkedList();
	anInterface27_2280 = interface27;
	aLong2278
	    = class534_sub40.method16537(1359621443) * 6924331327065729413L;
	anInt2279 = class534_sub40.method16533(-258848859) * -2144460233;
	for (int i = class534_sub40.method16527(-1520941132); i != 0;
	     i = class534_sub40.method16527(-832358758)) {
	    Class254 class254
		= ((Class254)
		   Class448.method7319(Class254.method4638((byte) 11), i,
				       2088438307));
	    Interface28 interface28;
	    switch (class254.anInt2667 * -598801081) {
	    case 11:
		interface28 = new Class244(this);
		break;
	    case 2:
		interface28 = new Class238(this, class534_sub40);
		break;
	    case 3:
		interface28 = new Class233(this, class534_sub40);
		break;
	    case 6:
		interface28 = new Class227(this, class534_sub40);
		break;
	    case 13:
		interface28 = new Class236(this, class534_sub40);
		break;
	    case 4:
		interface28 = new Class218(this, class534_sub40);
		break;
	    case 10:
		interface28 = new Class224(this);
		break;
	    default:
		throw new IllegalStateException("");
	    case 8:
		interface28 = new Class259(this, class534_sub40);
		break;
	    case 9:
		interface28 = new Class228(this, class534_sub40);
		break;
	    case 12:
		interface28 = new Class220(this, class534_sub40);
		break;
	    case 7:
		interface28 = new Class216(this, class534_sub40);
		break;
	    case 5:
		interface28 = new Class234(this, class534_sub40);
		break;
	    case 0:
		interface28 = new Class230(this, class534_sub40);
		break;
	    case 1:
		interface28 = new Class217(this, class534_sub40);
	    }
	    aLinkedList2277.add(interface28);
	}
    }
    
    static final void method4019(Class669 class669, byte i) {
	Class534_Sub18_Sub7 class534_sub18_sub7
	    = Class641.method10603((byte) 108);
	if (Class505.method8358(class534_sub18_sub7, (byte) 23) == 4) {
	    Class534_Sub6 class534_sub6
		= ((Class534_Sub6)
		   client.aClass9_11331
		       .method579(class534_sub18_sub7.method18226((byte) 51)));
	    if (null != class534_sub6) {
		class669.aClass654_Sub1_Sub5_Sub1_8604
		    = (Class654_Sub1_Sub5_Sub1) class534_sub6.anObject10417;
		class669.anIntArray8595
		    [(class669.anInt8600 += 308999563) * 2088438307 - 1]
		    = 1;
		return;
	    }
	}
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    public static final void method4020(String string, int i, int i_0_) {
	Class100 class100 = Class201.method3864(2095398292);
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4227,
				  class100.aClass13_1183, 1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16506
	    (1 + Class668.method11029(string, (byte) 0), 1926634524);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16713(string,
							      1937918318);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16560(i, 86208297);
	class100.method1863(class534_sub19, (byte) 111);
    }
    
    public static Class703 method4021(int i) {
	if (null == Class262.aClass703_2800)
	    return Class703.aClass703_8822;
	return Class262.aClass703_2800;
    }
    
    static void method4022(Class669 class669, int i) {
	class669.anIntArray8595[class669.anInt8600 * 2088438307 - 2]
	    = (((Class273)
		Class223.aClass53_Sub2_2316.method91((class669.anIntArray8595
						      [((2088438307
							 * class669.anInt8600)
							- 2)]),
						     -1957567134))
	       .anIntArrayArray3023
	       [class669.anIntArray8595[class669.anInt8600 * 2088438307 - 1]]
	       [0]);
	class669.anInt8600 -= 308999563;
    }
    
    public static void method4023(int i) {
	if (Class639.aClass367_8316 != null)
	    Class639.aClass367_8316.method6341(-2115540059);
    }
    
    static void method4024(Class247 class247, int i, int i_1_, int i_2_) {
	Class72.aClass247_774 = class247;
	Class72.anInt759 = i * 1370224745;
	Class72.anInt776 = -590395525 * i_1_;
    }
}
