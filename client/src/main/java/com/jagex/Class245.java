/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class245
{
    static HashMap aHashMap2414 = new HashMap();
    public static final long aLong2415 = 60000L;
    public static final long aLong2416 = 1000L;
    static Map aMap2417;
    public static Class163 aClass163_2418;
    
    static TimeZone method4488(String string) {
	synchronized (aHashMap2414) {
	    TimeZone timezone = (TimeZone) aHashMap2414.get(string);
	    if (timezone == null) {
		timezone = TimeZone.getTimeZone(string);
		aHashMap2414.put(string, timezone);
	    }
	    TimeZone timezone_0_ = timezone;
	    return timezone_0_;
	}
    }
    
    static String method4489(Date date, String string, TimeZone timezone,
			     Class672 class672) {
	if (null == aMap2417) {
	    aMap2417 = new HashMap(7);
	    Class672[] class672s = Class672.method11079((byte) 39);
	    for (int i = 0; i < class672s.length; i++) {
		Class672 class672_1_ = class672s[i];
		aMap2417.put(class672_1_, new ConcurrentLinkedQueue());
	    }
	}
	ConcurrentLinkedQueue concurrentlinkedqueue
	    = (ConcurrentLinkedQueue) aMap2417.get(class672);
	SimpleDateFormat simpledateformat
	    = (SimpleDateFormat) concurrentlinkedqueue.poll();
	if (null == simpledateformat)
	    simpledateformat
		= new SimpleDateFormat(string,
				       class672.method11077((byte) 16));
	else
	    simpledateformat.applyPattern(string);
	simpledateformat.setTimeZone(timezone);
	String string_2_ = simpledateformat.format(date);
	concurrentlinkedqueue.add(simpledateformat);
	return string_2_;
    }
    
    static String method4490(Date date, String string, TimeZone timezone,
			     Class672 class672, int i) {
	if (null == aMap2417) {
	    aMap2417 = new HashMap(7);
	    Class672[] class672s = Class672.method11079((byte) 10);
	    for (int i_3_ = 0; i_3_ < class672s.length; i_3_++) {
		Class672 class672_4_ = class672s[i_3_];
		aMap2417.put(class672_4_, new ConcurrentLinkedQueue());
	    }
	}
	ConcurrentLinkedQueue concurrentlinkedqueue
	    = (ConcurrentLinkedQueue) aMap2417.get(class672);
	SimpleDateFormat simpledateformat
	    = (SimpleDateFormat) concurrentlinkedqueue.poll();
	if (null == simpledateformat)
	    simpledateformat
		= new SimpleDateFormat(string,
				       class672.method11077((byte) 16));
	else
	    simpledateformat.applyPattern(string);
	simpledateformat.setTimeZone(timezone);
	String string_5_ = simpledateformat.format(date);
	concurrentlinkedqueue.add(simpledateformat);
	return string_5_;
    }
    
    static void method4491(Class52_Sub1 class52_sub1, int i, int i_6_,
			   int i_7_) {
	class52_sub1.method16415(i, -2029946546);
	int i_8_;
	if (i_6_ > 100000) {
	    Class352.method6257(-1804552877);
	    i_8_ = 4;
	} else if (i_6_ > 50000) {
	    Class465.method7571(205746365);
	    i_8_ = 3;
	} else if (i_6_ > 10000) {
	    Class664.method10999(1711071951);
	    i_8_ = 2;
	} else {
	    Class232.method4337(true, -1645316752);
	    i_8_ = 1;
	}
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10733
		.method16935(-1807368365)
	    != i) {
	    Class44_Sub6.aClass534_Sub35_10989.method16438
		(Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764, i,
		 804673686);
	    Class527.method8778(i, false, 29042504);
	} else
	    Class44_Sub6.aClass534_Sub35_10989.method16439
		(Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10733, true,
		 (byte) 17);
	Class672.method11096((byte) 1);
	class52_sub1.method16411(i_8_, 1194504499);
    }
    
    static TimeZone method4492(String string, byte i) {
	synchronized (aHashMap2414) {
	    TimeZone timezone = (TimeZone) aHashMap2414.get(string);
	    if (timezone == null) {
		timezone = TimeZone.getTimeZone(string);
		aHashMap2414.put(string, timezone);
	    }
	    TimeZone timezone_9_ = timezone;
	    return timezone_9_;
	}
    }
    
    static {
	Calendar.getInstance(method4492("Europe/London", (byte) -85));
    }
    
    public static String method4493(Date date, String string) {
	return method4490(date, string, method4496(2118520075),
			  Class672.aClass672_8621, -522946429);
    }
    
    public static String method4494(Date date, String string, byte i) {
	return method4490(date, string, method4496(2118520075),
			  Class672.aClass672_8621, -32638625);
    }
    
    static String method4495(Date date, String string, TimeZone timezone,
			     Class672 class672) {
	if (null == aMap2417) {
	    aMap2417 = new HashMap(7);
	    Class672[] class672s = Class672.method11079((byte) 20);
	    for (int i = 0; i < class672s.length; i++) {
		Class672 class672_10_ = class672s[i];
		aMap2417.put(class672_10_, new ConcurrentLinkedQueue());
	    }
	}
	ConcurrentLinkedQueue concurrentlinkedqueue
	    = (ConcurrentLinkedQueue) aMap2417.get(class672);
	SimpleDateFormat simpledateformat
	    = (SimpleDateFormat) concurrentlinkedqueue.poll();
	if (null == simpledateformat)
	    simpledateformat
		= new SimpleDateFormat(string,
				       class672.method11077((byte) 16));
	else
	    simpledateformat.applyPattern(string);
	simpledateformat.setTimeZone(timezone);
	String string_11_ = simpledateformat.format(date);
	concurrentlinkedqueue.add(simpledateformat);
	return string_11_;
    }
    
    static TimeZone method4496(int i) {
	return method4492("Europe/London", (byte) -70);
    }
    
    static TimeZone method4497() {
	return method4492("Europe/London", (byte) -71);
    }
    
    static TimeZone method4498() {
	return method4492("Europe/London", (byte) 3);
    }
    
    static String method4499(Date date, String string, TimeZone timezone,
			     Class672 class672) {
	if (null == aMap2417) {
	    aMap2417 = new HashMap(7);
	    Class672[] class672s = Class672.method11079((byte) 17);
	    for (int i = 0; i < class672s.length; i++) {
		Class672 class672_12_ = class672s[i];
		aMap2417.put(class672_12_, new ConcurrentLinkedQueue());
	    }
	}
	ConcurrentLinkedQueue concurrentlinkedqueue
	    = (ConcurrentLinkedQueue) aMap2417.get(class672);
	SimpleDateFormat simpledateformat
	    = (SimpleDateFormat) concurrentlinkedqueue.poll();
	if (null == simpledateformat)
	    simpledateformat
		= new SimpleDateFormat(string,
				       class672.method11077((byte) 16));
	else
	    simpledateformat.applyPattern(string);
	simpledateformat.setTimeZone(timezone);
	String string_13_ = simpledateformat.format(date);
	concurrentlinkedqueue.add(simpledateformat);
	return string_13_;
    }
    
    Class245() throws Throwable {
	throw new Error();
    }
    
    static final void method4500(Class669 class669, int i) {
	int i_14_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_14_, -392897514);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_14_ >> 16];
	Class675.method11129(class247, class243, class669, 1959796272);
    }
    
    static final void method4501(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class449.method7327(class247, class669, (byte) 54);
    }
    
    static final void method4502(Class669 class669, int i) {
	int i_15_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10764
		  .method14026(i_15_, -2024064741);
    }
}
