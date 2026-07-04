/* Class642 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Class642
{
    static Class656_Sub2 aClass656_Sub2_8342;
    static int anInt8343;
    static boolean aBool8344;
    static long aLong8345 = 2887650411480147785L;
    static Class656_Sub1 aClass656_Sub1_8346;
    static Queue aQueue8347;
    
    static void method10604() {
	synchronized (aQueue8347) {
	    Point point;
	    if (Class464.aCanvas5111.isShowing())
		point = Class464.aCanvas5111.getLocationOnScreen();
	    else
		point = null;
	    for (;;) {
		Class534_Sub42_Sub1 class534_sub42_sub1
		    = (Class534_Sub42_Sub1) aQueue8347.poll();
		if (null == class534_sub42_sub1)
		    break;
		if (null == point || !Class464.aCanvas5111.isShowing()
		    || !Class534_Sub36.aBool10800)
		    class534_sub42_sub1.method16803((byte) -69);
		else {
		    class534_sub42_sub1.method18409(point, 1214569944);
		    if (!class534_sub42_sub1.method18413(106757791)
			&& (class534_sub42_sub1.method16799((byte) 76)
			    < Class706_Sub4.anInt10994 * 1771907305)
			&& (class534_sub42_sub1.method16800(-727112719)
			    < -1091172141 * Class18.anInt205)
			&& class534_sub42_sub1.method16799((byte) 53) >= 0
			&& class534_sub42_sub1.method16800(-1716531460) >= 0) {
			int i = class534_sub42_sub1.method16798((byte) -46);
			if (class534_sub42_sub1.method16798((byte) -37) == -1)
			    aClass656_Sub1_8346
				.method10869(class534_sub42_sub1, -1607607997);
			else if (Class49.method1153(i, 126499202))
			    aClass656_Sub1_8346
				.method17040(class534_sub42_sub1, (byte) 1);
		    }
		}
	    }
	}
    }
    
    static {
	anInt8343 = 0;
	aBool8344 = true;
	aClass656_Sub2_8342 = new Class656_Sub2();
	aClass656_Sub1_8346 = new Class656_Sub1();
	aQueue8347 = new LinkedList();
    }
    
    public static void method10605() {
	Class70.method1412(-2066524318);
    }
    
    public static void method10606() {
	if (Class393.method6554(683293173))
	    Class584.method9841(new Class646(), (byte) 26);
    }
    
    public static void method10607() {
	if (Class393.method6554(683293173))
	    Class584.method9841(new Class646(), (byte) 106);
    }
    
    public static void method10608() {
	synchronized (aQueue8347) {
	    for (;;) {
		Class534_Sub42_Sub1 class534_sub42_sub1
		    = (Class534_Sub42_Sub1) aQueue8347.poll();
		if (class534_sub42_sub1 == null)
		    break;
		class534_sub42_sub1.method16803((byte) -15);
	    }
	}
    }
    
    Class642() throws Throwable {
	throw new Error();
    }
    
    public static void method10609() {
	aClass656_Sub2_8342.method10860(55262348);
	aClass656_Sub1_8346.method10860(-1090781644);
	aLong8345 = 2887650411480147785L;
	aBool8344 = true;
    }
    
    public static void method10610() {
	Class468.method7623((byte) 30);
	aClass656_Sub2_8342.method10859(8388608);
	aClass656_Sub1_8346.method10859(8388608);
	if (client.anInt11199 * -2064179505 > 0) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4230,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16507(333216572 * client.anInt11199, 2084690128);
	    for (int i = 0; i < client.anInt11199 * -2064179505; i++) {
		Interface63 interface63 = client.anInterface63Array11070[i];
		long l = (interface63.method425(-881668872)
			  - 3448347234370012423L * aLong8345);
		if (l > 16777215L)
		    l = 16777215L;
		aLong8345 = (interface63.method425(-881668872)
			     * -2887650411480147785L);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(interface63.method431((byte) -8), 1050720068);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16509((int) l, -1113117591);
	    }
	    client.aClass100_11264.method1863(class534_sub19, (byte) 47);
	}
	if (anInt8343 * -152420315 > 0)
	    anInt8343 -= 1972886445;
	if (client.aBool11147 && anInt8343 * -152420315 <= 0) {
	    anInt8343 = 803023236;
	    client.aBool11147 = false;
	    int i;
	    int i_0_;
	    if (3 == Class10.anInt75 * -891094135) {
		if (Class599.aClass298_Sub1_7871.method5388((byte) 3)
		    == Class305.aClass305_3265) {
		    Class347_Sub1 class347_sub1
			= (Class347_Sub1) Class599.aClass298_Sub1_7871
					      .method5380((byte) -56);
		    i = Class545.method8967(class347_sub1.aClass443_10134,
					    1541845855) >> 3;
		    int i_1_ = 1024;
		    i_0_ = (i_1_ * 3 - (Class579.method9811((class347_sub1
							     .aClass443_10134),
							    -1004200418)
					>> 3)) % (i_1_ * 2);
		} else {
		    i = 0;
		    i_0_ = 0;
		}
	    } else {
		i = (int) client.aFloat11302 >> 3;
		i_0_ = (int) client.aFloat11140 >> 3;
	    }
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4187,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16569(i,
								  266687242);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16507(i_0_,
								  1984311532);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 60);
	}
	if (Class534_Sub36.aBool10800 != aBool8344) {
	    aBool8344 = Class534_Sub36.aBool10800;
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4182,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16506(Class534_Sub36.aBool10800 ? 1 : 0, 1458147326);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 67);
	}
	if (!client.aBool11048) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4265,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16506(0,
								  1114408012);
	    int i = (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		     * 31645619);
	    Class534_Sub40 class534_sub40
		= Class44_Sub6.aClass534_Sub35_10989.method16436(1950062518);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16519
		(class534_sub40.aByteArray10810, 0,
		 class534_sub40.anInt10811 * 31645619, 442496428);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16528
		((31645619
		  * class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811) - i,
		 1954089719);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 31);
	    client.aBool11048 = true;
	}
	if (!client.aBool11049
	    && Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
		   .method16935(-1807368365) == 1) {
	    int[] is = Class254.aClass185_2683.method3251();
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4225,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16507(0,
								  1574847770);
	    int i = (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		     * 31645619);
	    if (is != null && 0 != is.length) {
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(1, 1862320813);
		Class131[] class131s = Class131.method2307(1192123446);
		HashSet hashset = new HashSet();
		ArrayList arraylist = new ArrayList();
		for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
		    boolean bool = false;
		    for (int i_3_ = 0; i_3_ < class131s.length; i_3_++) {
			if (class131s[i_3_].anInt1576 == is[i_2_]) {
			    hashset.add(class131s[i_3_]);
			    bool = true;
			    break;
			}
		    }
		    if (!bool)
			arraylist.add(Integer.valueOf(is[i_2_]));
		}
		Class227.method4185(hashset,
				    class534_sub19.aClass534_Sub40_Sub1_10513,
				    (byte) 0);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16642(arraylist.size(), -237713687);
		if (arraylist.size() > 0) {
		    int i_4_ = 2147483647;
		    Iterator iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() < i_4_)
			    i_4_ = integer.intValue();
		    }
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16712(i_4_, (byte) 0);
		    iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() != i_4_)
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16712
				(integer.intValue() - i_4_, (byte) 0);
		    }
		}
	    } else
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(0, 184787785);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16733
		((31645619
		  * class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811) - i,
		 -266943394);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 10);
	    client.aBool11049 = true;
	}
    }
    
    static void method10611() {
	synchronized (aQueue8347) {
	    Point point;
	    if (Class464.aCanvas5111.isShowing())
		point = Class464.aCanvas5111.getLocationOnScreen();
	    else
		point = null;
	    for (;;) {
		Class534_Sub42_Sub1 class534_sub42_sub1
		    = (Class534_Sub42_Sub1) aQueue8347.poll();
		if (null == class534_sub42_sub1)
		    break;
		if (null == point || !Class464.aCanvas5111.isShowing()
		    || !Class534_Sub36.aBool10800)
		    class534_sub42_sub1.method16803((byte) -41);
		else {
		    class534_sub42_sub1.method18409(point, 1684602097);
		    if (!class534_sub42_sub1.method18413(154575656)
			&& (class534_sub42_sub1.method16799((byte) 87)
			    < Class706_Sub4.anInt10994 * 1771907305)
			&& (class534_sub42_sub1.method16800(-1001207532)
			    < -1091172141 * Class18.anInt205)
			&& class534_sub42_sub1.method16799((byte) 76) >= 0
			&& class534_sub42_sub1.method16800(-330839839) >= 0) {
			int i = class534_sub42_sub1.method16798((byte) 86);
			if (class534_sub42_sub1.method16798((byte) -39) == -1)
			    aClass656_Sub1_8346
				.method10869(class534_sub42_sub1, -1607607997);
			else if (Class49.method1153(i, 74423395))
			    aClass656_Sub1_8346
				.method17040(class534_sub42_sub1, (byte) 1);
		    }
		}
	    }
	}
    }
    
    static void method10612() {
	synchronized (aQueue8347) {
	    Point point;
	    if (Class464.aCanvas5111.isShowing())
		point = Class464.aCanvas5111.getLocationOnScreen();
	    else
		point = null;
	    for (;;) {
		Class534_Sub42_Sub1 class534_sub42_sub1
		    = (Class534_Sub42_Sub1) aQueue8347.poll();
		if (null == class534_sub42_sub1)
		    break;
		if (null == point || !Class464.aCanvas5111.isShowing()
		    || !Class534_Sub36.aBool10800)
		    class534_sub42_sub1.method16803((byte) -101);
		else {
		    class534_sub42_sub1.method18409(point, 1945555422);
		    if (!class534_sub42_sub1.method18413(763307299)
			&& (class534_sub42_sub1.method16799((byte) 107)
			    < Class706_Sub4.anInt10994 * 1771907305)
			&& (class534_sub42_sub1.method16800(-1337233652)
			    < -1091172141 * Class18.anInt205)
			&& class534_sub42_sub1.method16799((byte) 116) >= 0
			&& class534_sub42_sub1.method16800(-1816308952) >= 0) {
			int i = class534_sub42_sub1.method16798((byte) -37);
			if (class534_sub42_sub1.method16798((byte) 8) == -1)
			    aClass656_Sub1_8346
				.method10869(class534_sub42_sub1, -1607607997);
			else if (Class49.method1153(i, 1515425228))
			    aClass656_Sub1_8346
				.method17040(class534_sub42_sub1, (byte) 1);
		    }
		}
	    }
	}
    }
    
    public static void method10613() {
	synchronized (aQueue8347) {
	    for (;;) {
		Class534_Sub42_Sub1 class534_sub42_sub1
		    = (Class534_Sub42_Sub1) aQueue8347.poll();
		if (class534_sub42_sub1 == null)
		    break;
		class534_sub42_sub1.method16803((byte) -31);
	    }
	}
    }
    
    public static void method10614() {
	if (Class393.method6554(683293173))
	    Class584.method9841(new Class646(), (byte) 58);
    }
    
    public static void method10615() {
	Class468.method7623((byte) 19);
	aClass656_Sub2_8342.method10859(8388608);
	aClass656_Sub1_8346.method10859(8388608);
	if (client.anInt11199 * -2064179505 > 0) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4230,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16507(333216572 * client.anInt11199, 674633360);
	    for (int i = 0; i < client.anInt11199 * -2064179505; i++) {
		Interface63 interface63 = client.anInterface63Array11070[i];
		long l = (interface63.method425(-881668872)
			  - 3448347234370012423L * aLong8345);
		if (l > 16777215L)
		    l = 16777215L;
		aLong8345 = (interface63.method425(-881668872)
			     * -2887650411480147785L);
		class534_sub19.aClass534_Sub40_Sub1_10513.method16506
		    (interface63.method431((byte) -89), 2058124260);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16509((int) l, -837894745);
	    }
	    client.aClass100_11264.method1863(class534_sub19, (byte) 104);
	}
	if (anInt8343 * -152420315 > 0)
	    anInt8343 -= 1972886445;
	if (client.aBool11147 && anInt8343 * -152420315 <= 0) {
	    anInt8343 = 803023236;
	    client.aBool11147 = false;
	    int i;
	    int i_5_;
	    if (3 == Class10.anInt75 * -891094135) {
		if (Class599.aClass298_Sub1_7871.method5388((byte) -27)
		    == Class305.aClass305_3265) {
		    Class347_Sub1 class347_sub1
			= (Class347_Sub1) Class599.aClass298_Sub1_7871
					      .method5380((byte) -59);
		    i = Class545.method8967(class347_sub1.aClass443_10134,
					    1325104371) >> 3;
		    int i_6_ = 1024;
		    i_5_ = (i_6_ * 3 - (Class579.method9811((class347_sub1
							     .aClass443_10134),
							    1668892158)
					>> 3)) % (i_6_ * 2);
		} else {
		    i = 0;
		    i_5_ = 0;
		}
	    } else {
		i = (int) client.aFloat11302 >> 3;
		i_5_ = (int) client.aFloat11140 >> 3;
	    }
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4187,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16569(i,
								  435504240);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16507(i_5_,
								  906233771);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 59);
	}
	if (Class534_Sub36.aBool10800 != aBool8344) {
	    aBool8344 = Class534_Sub36.aBool10800;
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4182,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16506(Class534_Sub36.aBool10800 ? 1 : 0, 999817664);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 60);
	}
	if (!client.aBool11048) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4265,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16506(0,
								  1315681904);
	    int i = (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		     * 31645619);
	    Class534_Sub40 class534_sub40
		= Class44_Sub6.aClass534_Sub35_10989.method16436(1973311774);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16519
		(class534_sub40.aByteArray10810, 0,
		 class534_sub40.anInt10811 * 31645619, 778139286);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16528
		((31645619
		  * class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811) - i,
		 1967131183);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 48);
	    client.aBool11048 = true;
	}
	if (!client.aBool11049
	    && Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
		   .method16935(-1807368365) == 1) {
	    int[] is = Class254.aClass185_2683.method3251();
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4225,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16507(0,
								  965888028);
	    int i = (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		     * 31645619);
	    if (is != null && 0 != is.length) {
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(1, 833403671);
		Class131[] class131s = Class131.method2307(1192123446);
		HashSet hashset = new HashSet();
		ArrayList arraylist = new ArrayList();
		for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
		    boolean bool = false;
		    for (int i_8_ = 0; i_8_ < class131s.length; i_8_++) {
			if (class131s[i_8_].anInt1576 == is[i_7_]) {
			    hashset.add(class131s[i_8_]);
			    bool = true;
			    break;
			}
		    }
		    if (!bool)
			arraylist.add(Integer.valueOf(is[i_7_]));
		}
		Class227.method4185(hashset,
				    class534_sub19.aClass534_Sub40_Sub1_10513,
				    (byte) 0);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16642(arraylist.size(), -237713687);
		if (arraylist.size() > 0) {
		    int i_9_ = 2147483647;
		    Iterator iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() < i_9_)
			    i_9_ = integer.intValue();
		    }
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16712(i_9_, (byte) 0);
		    iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() != i_9_)
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16712
				(integer.intValue() - i_9_, (byte) 0);
		    }
		}
	    } else
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(0, 1443352966);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16733
		((31645619
		  * class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811) - i,
		 -427224367);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 44);
	    client.aBool11049 = true;
	}
    }
    
    public static void method10616() {
	Class468.method7623((byte) 121);
	aClass656_Sub2_8342.method10859(8388608);
	aClass656_Sub1_8346.method10859(8388608);
	if (client.anInt11199 * -2064179505 > 0) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4230,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16507(333216572 * client.anInt11199, 787147433);
	    for (int i = 0; i < client.anInt11199 * -2064179505; i++) {
		Interface63 interface63 = client.anInterface63Array11070[i];
		long l = (interface63.method425(-881668872)
			  - 3448347234370012423L * aLong8345);
		if (l > 16777215L)
		    l = 16777215L;
		aLong8345 = (interface63.method425(-881668872)
			     * -2887650411480147785L);
		class534_sub19.aClass534_Sub40_Sub1_10513.method16506
		    (interface63.method431((byte) -77), 1210266796);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16509((int) l, -1093415433);
	    }
	    client.aClass100_11264.method1863(class534_sub19, (byte) 117);
	}
	if (anInt8343 * -152420315 > 0)
	    anInt8343 -= 1972886445;
	if (client.aBool11147 && anInt8343 * -152420315 <= 0) {
	    anInt8343 = 803023236;
	    client.aBool11147 = false;
	    int i;
	    int i_10_;
	    if (3 == Class10.anInt75 * -891094135) {
		if (Class599.aClass298_Sub1_7871.method5388((byte) 55)
		    == Class305.aClass305_3265) {
		    Class347_Sub1 class347_sub1
			= (Class347_Sub1) Class599.aClass298_Sub1_7871
					      .method5380((byte) -90);
		    i = Class545.method8967(class347_sub1.aClass443_10134,
					    -1571169487) >> 3;
		    int i_11_ = 1024;
		    i_10_
			= (i_11_ * 3 - (Class579.method9811((class347_sub1
							     .aClass443_10134),
							    -708374071)
					>> 3)) % (i_11_ * 2);
		} else {
		    i = 0;
		    i_10_ = 0;
		}
	    } else {
		i = (int) client.aFloat11302 >> 3;
		i_10_ = (int) client.aFloat11140 >> 3;
	    }
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4187,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16569(i,
								  1254457591);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16507(i_10_,
								  1552855495);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 25);
	}
	if (Class534_Sub36.aBool10800 != aBool8344) {
	    aBool8344 = Class534_Sub36.aBool10800;
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4182,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16506(Class534_Sub36.aBool10800 ? 1 : 0, 1671091586);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 73);
	}
	if (!client.aBool11048) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4265,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16506(0,
								  1099424060);
	    int i = (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		     * 31645619);
	    Class534_Sub40 class534_sub40
		= Class44_Sub6.aClass534_Sub35_10989.method16436(1994516008);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16519
		(class534_sub40.aByteArray10810, 0,
		 class534_sub40.anInt10811 * 31645619, 505461337);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16528
		((31645619
		  * class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811) - i,
		 1918262300);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 15);
	    client.aBool11048 = true;
	}
	if (!client.aBool11049
	    && Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
		   .method16935(-1807368365) == 1) {
	    int[] is = Class254.aClass185_2683.method3251();
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4225,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16507(0,
								  1628698392);
	    int i = (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		     * 31645619);
	    if (is != null && 0 != is.length) {
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(1, 1797856176);
		Class131[] class131s = Class131.method2307(1192123446);
		HashSet hashset = new HashSet();
		ArrayList arraylist = new ArrayList();
		for (int i_12_ = 0; i_12_ < is.length; i_12_++) {
		    boolean bool = false;
		    for (int i_13_ = 0; i_13_ < class131s.length; i_13_++) {
			if (class131s[i_13_].anInt1576 == is[i_12_]) {
			    hashset.add(class131s[i_13_]);
			    bool = true;
			    break;
			}
		    }
		    if (!bool)
			arraylist.add(Integer.valueOf(is[i_12_]));
		}
		Class227.method4185(hashset,
				    class534_sub19.aClass534_Sub40_Sub1_10513,
				    (byte) 0);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16642(arraylist.size(), -237713687);
		if (arraylist.size() > 0) {
		    int i_14_ = 2147483647;
		    Iterator iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() < i_14_)
			    i_14_ = integer.intValue();
		    }
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16712(i_14_, (byte) 0);
		    iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() != i_14_)
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16712
				(integer.intValue() - i_14_, (byte) 0);
		    }
		}
	    } else
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(0, 391339455);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16733
		((31645619
		  * class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811) - i,
		 1562790780);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 72);
	    client.aBool11049 = true;
	}
    }
    
    public static void method10617() {
	Class468.method7623((byte) 105);
	aClass656_Sub2_8342.method10859(8388608);
	aClass656_Sub1_8346.method10859(8388608);
	if (client.anInt11199 * -2064179505 > 0) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4230,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16507(333216572 * client.anInt11199, 1446761846);
	    for (int i = 0; i < client.anInt11199 * -2064179505; i++) {
		Interface63 interface63 = client.anInterface63Array11070[i];
		long l = (interface63.method425(-881668872)
			  - 3448347234370012423L * aLong8345);
		if (l > 16777215L)
		    l = 16777215L;
		aLong8345 = (interface63.method425(-881668872)
			     * -2887650411480147785L);
		class534_sub19.aClass534_Sub40_Sub1_10513.method16506
		    (interface63.method431((byte) -63), 1426151645);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16509((int) l, -1722477044);
	    }
	    client.aClass100_11264.method1863(class534_sub19, (byte) 26);
	}
	if (anInt8343 * -152420315 > 0)
	    anInt8343 -= 1972886445;
	if (client.aBool11147 && anInt8343 * -152420315 <= 0) {
	    anInt8343 = 803023236;
	    client.aBool11147 = false;
	    int i;
	    int i_15_;
	    if (3 == Class10.anInt75 * -891094135) {
		if (Class599.aClass298_Sub1_7871.method5388((byte) 97)
		    == Class305.aClass305_3265) {
		    Class347_Sub1 class347_sub1
			= (Class347_Sub1) Class599.aClass298_Sub1_7871
					      .method5380((byte) -124);
		    i = Class545.method8967(class347_sub1.aClass443_10134,
					    -474860015) >> 3;
		    int i_16_ = 1024;
		    i_15_
			= (i_16_ * 3 - (Class579.method9811((class347_sub1
							     .aClass443_10134),
							    -583097078)
					>> 3)) % (i_16_ * 2);
		} else {
		    i = 0;
		    i_15_ = 0;
		}
	    } else {
		i = (int) client.aFloat11302 >> 3;
		i_15_ = (int) client.aFloat11140 >> 3;
	    }
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4187,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16569(i,
								  1194161807);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16507(i_15_,
								  2007213408);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 7);
	}
	if (Class534_Sub36.aBool10800 != aBool8344) {
	    aBool8344 = Class534_Sub36.aBool10800;
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4182,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513
		.method16506(Class534_Sub36.aBool10800 ? 1 : 0, 439317593);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 105);
	}
	if (!client.aBool11048) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4265,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16506(0,
								  1918041658);
	    int i = (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		     * 31645619);
	    Class534_Sub40 class534_sub40
		= Class44_Sub6.aClass534_Sub35_10989.method16436(2079468545);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16519
		(class534_sub40.aByteArray10810, 0,
		 class534_sub40.anInt10811 * 31645619, -707602349);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16528
		((31645619
		  * class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811) - i,
		 2061883753);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 100);
	    client.aBool11048 = true;
	}
	if (!client.aBool11049
	    && Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
		   .method16935(-1807368365) == 1) {
	    int[] is = Class254.aClass185_2683.method3251();
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4225,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16507(0,
								  1085003981);
	    int i = (class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		     * 31645619);
	    if (is != null && 0 != is.length) {
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(1, 2031407422);
		Class131[] class131s = Class131.method2307(1192123446);
		HashSet hashset = new HashSet();
		ArrayList arraylist = new ArrayList();
		for (int i_17_ = 0; i_17_ < is.length; i_17_++) {
		    boolean bool = false;
		    for (int i_18_ = 0; i_18_ < class131s.length; i_18_++) {
			if (class131s[i_18_].anInt1576 == is[i_17_]) {
			    hashset.add(class131s[i_18_]);
			    bool = true;
			    break;
			}
		    }
		    if (!bool)
			arraylist.add(Integer.valueOf(is[i_17_]));
		}
		Class227.method4185(hashset,
				    class534_sub19.aClass534_Sub40_Sub1_10513,
				    (byte) 0);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16642(arraylist.size(), -237713687);
		if (arraylist.size() > 0) {
		    int i_19_ = 2147483647;
		    Iterator iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() < i_19_)
			    i_19_ = integer.intValue();
		    }
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16712(i_19_, (byte) 0);
		    iterator = arraylist.iterator();
		    while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.intValue() != i_19_)
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16712
				(integer.intValue() - i_19_, (byte) 0);
		    }
		}
	    } else
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(0, 1812155144);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16733
		((31645619
		  * class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811) - i,
		 373434694);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 7);
	    client.aBool11049 = true;
	}
    }
    
    public static void method10618() {
	Class70.method1412(-922855734);
    }
    
    static final void method10619(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class503.aString5626.startsWith("win") ? 1 : 0;
    }
    
    static final void method10620(Class669 class669, byte i) {
	Class172.aClass268_1824.method4894((byte) 8);
    }
}
