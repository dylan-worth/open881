/* Class648 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

import jaclib.ping.Ping;

public class Class648 implements Runnable
{
    Thread aThread8376;
    Object anObject8377 = new Object();
    Queue aQueue8378 = new LinkedList();
    
    public void method10693() {
	for (;;) {
	    Class641 class641;
	    synchronized (aQueue8378) {
		Object object;
		for (object = aQueue8378.poll(); null == object;
		     object = aQueue8378.poll()) {
		    try {
			aQueue8378.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (object == anObject8377)
		    break;
		class641 = (Class641) object;
	    }
	    int i;
	    try {
		byte[] is
		    = InetAddress.getByName(class641.aString8339).getAddress();
		i = Ping.method603(is[0], is[1], is[2], is[3], 1000L);
	    } catch (Throwable throwable) {
		i = 1000;
	    }
	    class641.anInt8338 = i * 1659133145;
	}
    }
    
    public void method10694(int i) {
	if (null != aThread8376) {
	    method10696(anObject8377, 2109289561);
	    try {
		aThread8376.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    aThread8376 = null;
	}
    }
    
    public Class641 method10695(String string, int i) {
	if (null == aThread8376)
	    throw new IllegalStateException("");
	if (null == string)
	    throw new IllegalArgumentException("");
	Class641 class641 = new Class641(string);
	method10696(class641, 2109289561);
	return class641;
    }
    
    void method10696(Object object, int i) {
	synchronized (aQueue8378) {
	    aQueue8378.add(object);
	    aQueue8378.notify();
	}
    }
    
    public void method10697() {
	if (null != aThread8376) {
	    method10696(anObject8377, 2109289561);
	    try {
		aThread8376.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    aThread8376 = null;
	}
    }
    
    public void run() {
	for (;;) {
	    Class641 class641;
	    synchronized (aQueue8378) {
		Object object;
		for (object = aQueue8378.poll(); null == object;
		     object = aQueue8378.poll()) {
		    try {
			aQueue8378.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (object == anObject8377)
		    break;
		class641 = (Class641) object;
	    }
	    int i;
	    try {
		byte[] is
		    = InetAddress.getByName(class641.aString8339).getAddress();
		i = Ping.method603(is[0], is[1], is[2], is[3], 1000L);
	    } catch (Throwable throwable) {
		i = 1000;
	    }
	    class641.anInt8338 = i * 1659133145;
	}
    }
    
    public void method10698() {
	for (;;) {
	    Class641 class641;
	    synchronized (aQueue8378) {
		Object object;
		for (object = aQueue8378.poll(); null == object;
		     object = aQueue8378.poll()) {
		    try {
			aQueue8378.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (object == anObject8377)
		    break;
		class641 = (Class641) object;
	    }
	    int i;
	    try {
		byte[] is
		    = InetAddress.getByName(class641.aString8339).getAddress();
		i = Ping.method603(is[0], is[1], is[2], is[3], 1000L);
	    } catch (Throwable throwable) {
		i = 1000;
	    }
	    class641.anInt8338 = i * 1659133145;
	}
    }
    
    public Class648() {
	aThread8376 = new Thread(this);
	aThread8376.setDaemon(true);
	aThread8376.start();
    }
    
    public Class641 method10699(String string) {
	if (null == aThread8376)
	    throw new IllegalStateException("");
	if (null == string)
	    throw new IllegalArgumentException("");
	Class641 class641 = new Class641(string);
	method10696(class641, 2109289561);
	return class641;
    }
    
    public Class641 method10700(String string) {
	if (null == aThread8376)
	    throw new IllegalStateException("");
	if (null == string)
	    throw new IllegalArgumentException("");
	Class641 class641 = new Class641(string);
	method10696(class641, 2109289561);
	return class641;
    }
    
    void method10701(Object object) {
	synchronized (aQueue8378) {
	    aQueue8378.add(object);
	    aQueue8378.notify();
	}
    }
    
    void method10702(Object object) {
	synchronized (aQueue8378) {
	    aQueue8378.add(object);
	    aQueue8378.notify();
	}
    }
    
    static final void method10703(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub16_10763
		  .method17030((byte) 49) == 1 ? 1 : 0;
    }
    
    static final void method10704(byte i) {
	Class520.aClass247Array7063 = null;
	Class705.method14231(client.anInt11185 * -993629849, 0, 0,
			     Class706_Sub4.anInt10994 * 1771907305,
			     Class18.anInt205 * -1091172141, 0, 0, -1,
			     -407272711);
	if (Class520.aClass247Array7063 != null) {
	    Class690_Sub37.method17194
		(Class520.aClass247Array7063, -1412584499, 0, 0,
		 1771907305 * Class706_Sub4.anInt10994,
		 -1091172141 * Class18.anInt205, Class77.anInt818 * 2120696527,
		 Class69.anInt729 * -1225002575,
		 (Class79.aClass247_830 == client.aClass247_11342 ? -1
		  : -360382511 * client.aClass247_11342.anInt2631),
		 true, -1026644914);
	    Class520.aClass247Array7063 = null;
	}
    }
}
