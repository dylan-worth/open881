/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class Class63 implements Runnable
{
    Thread aThread651;
    volatile boolean aBool652;
    Queue aQueue653 = new LinkedList();
    public static Class472 aClass472_654;
    
    public void run() {
	while (!aBool652) {
	    try {
		Class111 class111;
		synchronized (this) {
		    class111 = (Class111) aQueue653.poll();
		    if (null == class111) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
			continue;
		    }
		}
		try {
		    URLConnection urlconnection
			= class111.anURL1350.openConnection();
		    urlconnection.setConnectTimeout(30000);
		    int i = urlconnection.getContentLength();
		    if (i >= 0) {
			byte[] is = new byte[i];
			new DataInputStream(urlconnection.getInputStream())
			    .readFully(is);
			class111.aByteArray1348 = is;
		    }
		    class111.aBool1349 = true;
		} catch (IOException ioexception) {
		    class111.aBool1349 = true;
		}
	    } catch (Exception exception) {
		Class262.method4824(null, exception, (byte) -26);
	    }
	}
    }
    
    public void method1266() {
	while (!aBool652) {
	    try {
		Class111 class111;
		synchronized (this) {
		    class111 = (Class111) aQueue653.poll();
		    if (null == class111) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
			continue;
		    }
		}
		try {
		    URLConnection urlconnection
			= class111.anURL1350.openConnection();
		    urlconnection.setConnectTimeout(30000);
		    int i = urlconnection.getContentLength();
		    if (i >= 0) {
			byte[] is = new byte[i];
			new DataInputStream(urlconnection.getInputStream())
			    .readFully(is);
			class111.aByteArray1348 = is;
		    }
		    class111.aBool1349 = true;
		} catch (IOException ioexception) {
		    class111.aBool1349 = true;
		}
	    } catch (Exception exception) {
		Class262.method4824(null, exception, (byte) 13);
	    }
	}
    }
    
    public void method1267() {
	while (!aBool652) {
	    try {
		Class111 class111;
		synchronized (this) {
		    class111 = (Class111) aQueue653.poll();
		    if (null == class111) {
			try {
			    this.wait();
			} catch (InterruptedException interruptedexception) {
			    /* empty */
			}
			continue;
		    }
		}
		try {
		    URLConnection urlconnection
			= class111.anURL1350.openConnection();
		    urlconnection.setConnectTimeout(30000);
		    int i = urlconnection.getContentLength();
		    if (i >= 0) {
			byte[] is = new byte[i];
			new DataInputStream(urlconnection.getInputStream())
			    .readFully(is);
			class111.aByteArray1348 = is;
		    }
		    class111.aBool1349 = true;
		} catch (IOException ioexception) {
		    class111.aBool1349 = true;
		}
	    } catch (Exception exception) {
		Class262.method4824(null, exception, (byte) -57);
	    }
	}
    }
    
    void method1268(int i) {
	aBool652 = true;
	try {
	    synchronized (this) {
		this.notify();
	    }
	    aThread651.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    Class111 method1269(URL url) {
	Class111 class111 = new Class111(url);
	synchronized (this) {
	    aQueue653.add(class111);
	    this.notify();
	}
	return class111;
    }
    
    Class111 method1270(URL url, int i) {
	Class111 class111 = new Class111(url);
	synchronized (this) {
	    aQueue653.add(class111);
	    this.notify();
	}
	return class111;
    }
    
    Class111 method1271(URL url) {
	Class111 class111 = new Class111(url);
	synchronized (this) {
	    aQueue653.add(class111);
	    this.notify();
	}
	return class111;
    }
    
    Class63() {
	aThread651 = new Thread(this);
	aThread651.setPriority(1);
	aThread651.start();
    }
    
    Class111 method1272(URL url) {
	Class111 class111 = new Class111(url);
	synchronized (this) {
	    aQueue653.add(class111);
	    this.notify();
	}
	return class111;
    }
    
    void method1273() {
	aBool652 = true;
	try {
	    synchronized (this) {
		this.notify();
	    }
	    aThread651.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method1274() {
	aBool652 = true;
	try {
	    synchronized (this) {
		this.notify();
	    }
	    aThread651.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method1275() {
	aBool652 = true;
	try {
	    synchronized (this) {
		this.notify();
	    }
	    aThread651.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    static final void method1276(Class669 class669, int i) {
	Class247 class247
	    = Class112.method2017(class669.anIntArray8595[((class669.anInt8600
							    -= 308999563)
							   * 2088438307)],
				  21839927);
	if (class247.anInt2606 * 403396513 != -1)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class247.anInt2602 * -148110895;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static final void method1277(Class669 class669, int i) {
	Class403.aClass403_4141.method6601(421734097);
    }
    
    static final void method1278(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_1_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	Class273.method5102(2, i_0_, i_1_, "", (byte) -2);
    }
    
    static final void method1279(Class669 class669, int i) {
	class669.anInt8600 -= 926998689;
	int i_2_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_3_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	int i_4_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 2];
	int i_5_ = Class474.method7762(i_3_, -2012046588);
	int i_6_ = Class497.method8140(i_3_, (byte) -26);
	Class21 class21
	    = ((Class21)
	       Class150_Sub1.aClass44_8902.method91(i_2_, -1235549211));
	Class74 class74
	    = (Class74) Class706.aClass44_8845.method91(i_5_, -298850397);
	Class493[] class493s = class74.aClass493ArrayArray798[i_6_];
	Object[] objects = class21.method806(i_6_, -764474062);
	if (null == objects && class74.anObjectArrayArray799 != null)
	    objects = class74.anObjectArrayArray799[i_6_];
	if (null == objects) {
	    for (int i_7_ = 0; i_7_ < class493s.length; i_7_++) {
		Class493 class493 = class493s[i_7_];
		if (Class493.aClass493_5496 == class493)
		    class669.anObjectArray8593
			[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
			= "";
		else if (Class493.aClass493_5451 == class493
			 || Class493.aClass493_5345 == class493)
		    class669.anIntArray8595
			[(class669.anInt8600 += 308999563) * 2088438307 - 1]
			= 0;
		else
		    class669.anIntArray8595
			[(class669.anInt8600 += 308999563) * 2088438307 - 1]
			= -1;
	    }
	} else {
	    int i_8_ = objects.length / class493s.length;
	    if (i_4_ < 0 || i_4_ >= i_8_)
		throw new RuntimeException();
	    for (int i_9_ = 0; i_9_ < class493s.length; i_9_++) {
		int i_10_ = i_9_ + class493s.length * i_4_;
		if (Class493.aClass493_5496 == class493s[i_9_])
		    class669.anObjectArray8593
			[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
			= objects[i_10_];
		else
		    class669.anIntArray8595
			[(class669.anInt8600 += 308999563) * 2088438307 - 1]
			= ((Integer) objects[i_10_]).intValue();
	    }
	}
    }
    
    public static int method1280(int i) {
	if (Class713.aBool8884 && Class29.aFrame266 != null)
	    return 3;
	return client.aBool11183 ? 2 : 1;
    }
    
    static final void method1281(Class247 class247, int i, Class669 class669,
				 int i_11_) {
	if (null == class247.aByteArrayArray2585)
	    throw new RuntimeException();
	if (class247.anIntArray2633 == null)
	    class247.anIntArray2633
		= new int[class247.aByteArrayArray2585.length];
	class247.anIntArray2633[i] = 2147483647;
    }
}
