/* Class566 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.io.OutputStream;

public class Class566 implements Runnable
{
    IOException anIOException7581;
    OutputStream anOutputStream7582;
    int anInt7583;
    byte[] aByteArray7584;
    int anInt7585 = 0;
    int anInt7586 = 0;
    Thread aThread7587;
    boolean aBool7588;
    static int anInt7589;
    
    boolean method9530(int i) {
	if (aBool7588) {
	    try {
		anOutputStream7582.close();
		if (null == anIOException7581)
		    anIOException7581 = new IOException("");
	    } catch (IOException ioexception) {
		if (null == anIOException7581)
		    anIOException7581 = new IOException(ioexception);
	    }
	    return true;
	}
	return false;
    }
    
    void method9531() {
	synchronized (this) {
	    aBool7588 = true;
	    this.notifyAll();
	}
	try {
	    aThread7587.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    public void run() {
	do {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (anIOException7581 != null)
			return;
		    if (anInt7585 * -1912667095 <= anInt7586 * 790570033)
			i = 790570033 * anInt7586 - anInt7585 * -1912667095;
		    else
			i = (790570033 * anInt7586
			     + (anInt7583 * 1827520209
				- -1912667095 * anInt7585));
		    if (i > 0)
			break;
		    try {
			anOutputStream7582.flush();
		    } catch (IOException ioexception) {
			anIOException7581 = ioexception;
			return;
		    }
		    if (method9530(444223263))
			return;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (anInt7585 * -1912667095 + i <= anInt7583 * 1827520209)
		    anOutputStream7582.write(aByteArray7584,
					     anInt7585 * -1912667095, i);
		else {
		    int i_0_
			= anInt7583 * 1827520209 - anInt7585 * -1912667095;
		    anOutputStream7582.write(aByteArray7584,
					     anInt7585 * -1912667095, i_0_);
		    anOutputStream7582.write(aByteArray7584, 0, i - i_0_);
		}
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7581 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7585 = ((i + anInt7585 * -1912667095)
			     % (1827520209 * anInt7583) * -1532569575);
	    }
	} while (!method9530(-1717173675));
    }
    
    void method9532(byte[] is, int i, int i_1_, int i_2_) throws IOException {
	if (i_1_ < 0 || i < 0 || i_1_ + i > is.length)
	    throw new IOException();
	synchronized (this) {
	    if (anIOException7581 != null)
		throw new IOException(anIOException7581.toString());
	    int i_3_;
	    if (anInt7585 * -1912667095 <= 790570033 * anInt7586)
		i_3_ = (1827520209 * anInt7583 - 790570033 * anInt7586
			+ -1912667095 * anInt7585 - 1);
	    else
		i_3_ = anInt7585 * -1912667095 - 790570033 * anInt7586 - 1;
	    if (i_3_ < i_1_)
		throw new IOException("");
	    if (790570033 * anInt7586 + i_1_ <= anInt7583 * 1827520209)
		System.arraycopy(is, i, aByteArray7584, 790570033 * anInt7586,
				 i_1_);
	    else {
		int i_4_ = 1827520209 * anInt7583 - anInt7586 * 790570033;
		System.arraycopy(is, i, aByteArray7584, anInt7586 * 790570033,
				 i_4_);
		System.arraycopy(is, i_4_ + i, aByteArray7584, 0, i_1_ - i_4_);
	    }
	    anInt7586 = -1863207727 * ((790570033 * anInt7586 + i_1_)
				       % (anInt7583 * 1827520209));
	    this.notifyAll();
	}
    }
    
    void method9533(byte i) {
	anOutputStream7582 = new OutputStream_Sub1();
    }
    
    boolean method9534() {
	if (aBool7588) {
	    try {
		anOutputStream7582.close();
		if (null == anIOException7581)
		    anIOException7581 = new IOException("");
	    } catch (IOException ioexception) {
		if (null == anIOException7581)
		    anIOException7581 = new IOException(ioexception);
	    }
	    return true;
	}
	return false;
    }
    
    public void method9535() {
	do {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (anIOException7581 != null)
			return;
		    if (anInt7585 * -1912667095 <= anInt7586 * 790570033)
			i = 790570033 * anInt7586 - anInt7585 * -1912667095;
		    else
			i = (790570033 * anInt7586
			     + (anInt7583 * 1827520209
				- -1912667095 * anInt7585));
		    if (i > 0)
			break;
		    try {
			anOutputStream7582.flush();
		    } catch (IOException ioexception) {
			anIOException7581 = ioexception;
			return;
		    }
		    if (method9530(-502543623))
			return;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (anInt7585 * -1912667095 + i <= anInt7583 * 1827520209)
		    anOutputStream7582.write(aByteArray7584,
					     anInt7585 * -1912667095, i);
		else {
		    int i_5_
			= anInt7583 * 1827520209 - anInt7585 * -1912667095;
		    anOutputStream7582.write(aByteArray7584,
					     anInt7585 * -1912667095, i_5_);
		    anOutputStream7582.write(aByteArray7584, 0, i - i_5_);
		}
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7581 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7585 = ((i + anInt7585 * -1912667095)
			     % (1827520209 * anInt7583) * -1532569575);
	    }
	} while (!method9530(-2109249811));
    }
    
    public void method9536() {
	do {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (anIOException7581 != null)
			return;
		    if (anInt7585 * -1912667095 <= anInt7586 * 790570033)
			i = 790570033 * anInt7586 - anInt7585 * -1912667095;
		    else
			i = (790570033 * anInt7586
			     + (anInt7583 * 1827520209
				- -1912667095 * anInt7585));
		    if (i > 0)
			break;
		    try {
			anOutputStream7582.flush();
		    } catch (IOException ioexception) {
			anIOException7581 = ioexception;
			return;
		    }
		    if (method9530(-1949160403))
			return;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    try {
		if (anInt7585 * -1912667095 + i <= anInt7583 * 1827520209)
		    anOutputStream7582.write(aByteArray7584,
					     anInt7585 * -1912667095, i);
		else {
		    int i_6_
			= anInt7583 * 1827520209 - anInt7585 * -1912667095;
		    anOutputStream7582.write(aByteArray7584,
					     anInt7585 * -1912667095, i_6_);
		    anOutputStream7582.write(aByteArray7584, 0, i - i_6_);
		}
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7581 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7585 = ((i + anInt7585 * -1912667095)
			     % (1827520209 * anInt7583) * -1532569575);
	    }
	} while (!method9530(-645005257));
    }
    
    boolean method9537() {
	if (aBool7588) {
	    try {
		anOutputStream7582.close();
		if (null == anIOException7581)
		    anIOException7581 = new IOException("");
	    } catch (IOException ioexception) {
		if (null == anIOException7581)
		    anIOException7581 = new IOException(ioexception);
	    }
	    return true;
	}
	return false;
    }
    
    void method9538(int i) {
	synchronized (this) {
	    aBool7588 = true;
	    this.notifyAll();
	}
	try {
	    aThread7587.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method9539(byte[] is, int i, int i_7_) throws IOException {
	if (i_7_ < 0 || i < 0 || i_7_ + i > is.length)
	    throw new IOException();
	synchronized (this) {
	    if (anIOException7581 != null)
		throw new IOException(anIOException7581.toString());
	    int i_8_;
	    if (anInt7585 * -1912667095 <= 790570033 * anInt7586)
		i_8_ = (1827520209 * anInt7583 - 790570033 * anInt7586
			+ -1912667095 * anInt7585 - 1);
	    else
		i_8_ = anInt7585 * -1912667095 - 790570033 * anInt7586 - 1;
	    if (i_8_ < i_7_)
		throw new IOException("");
	    if (790570033 * anInt7586 + i_7_ <= anInt7583 * 1827520209)
		System.arraycopy(is, i, aByteArray7584, 790570033 * anInt7586,
				 i_7_);
	    else {
		int i_9_ = 1827520209 * anInt7583 - anInt7586 * 790570033;
		System.arraycopy(is, i, aByteArray7584, anInt7586 * 790570033,
				 i_9_);
		System.arraycopy(is, i_9_ + i, aByteArray7584, 0, i_7_ - i_9_);
	    }
	    anInt7586 = -1863207727 * ((790570033 * anInt7586 + i_7_)
				       % (anInt7583 * 1827520209));
	    this.notifyAll();
	}
    }
    
    void method9540(byte[] is, int i, int i_10_) throws IOException {
	if (i_10_ < 0 || i < 0 || i_10_ + i > is.length)
	    throw new IOException();
	synchronized (this) {
	    if (anIOException7581 != null)
		throw new IOException(anIOException7581.toString());
	    int i_11_;
	    if (anInt7585 * -1912667095 <= 790570033 * anInt7586)
		i_11_ = (1827520209 * anInt7583 - 790570033 * anInt7586
			 + -1912667095 * anInt7585 - 1);
	    else
		i_11_ = anInt7585 * -1912667095 - 790570033 * anInt7586 - 1;
	    if (i_11_ < i_10_)
		throw new IOException("");
	    if (790570033 * anInt7586 + i_10_ <= anInt7583 * 1827520209)
		System.arraycopy(is, i, aByteArray7584, 790570033 * anInt7586,
				 i_10_);
	    else {
		int i_12_ = 1827520209 * anInt7583 - anInt7586 * 790570033;
		System.arraycopy(is, i, aByteArray7584, anInt7586 * 790570033,
				 i_12_);
		System.arraycopy(is, i_12_ + i, aByteArray7584, 0,
				 i_10_ - i_12_);
	    }
	    anInt7586 = -1863207727 * ((790570033 * anInt7586 + i_10_)
				       % (anInt7583 * 1827520209));
	    this.notifyAll();
	}
    }
    
    Class566(OutputStream outputstream, int i) {
	anOutputStream7582 = outputstream;
	anInt7583 = -1088857551 * (i + 1);
	aByteArray7584 = new byte[anInt7583 * 1827520209];
	aThread7587 = new Thread(this);
	aThread7587.setDaemon(true);
	aThread7587.start();
    }
    
    void method9541() {
	anOutputStream7582 = new OutputStream_Sub1();
    }
    
    static final void method9542(Class669 class669, short i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	RSSocket.method826(class247, class243, class669, (byte) -47);
    }
    
    static final void method9543(Class669 class669, int i) {
	if (client.anInt11195 * 136304939 >= 5
	    && 136304939 * client.anInt11195 <= 9)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static final void method9544(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    static final void method9545(Class247[] class247s, int i, int i_13_) {
	for (int i_14_ = 0; i_14_ < class247s.length; i_14_++) {
	    Class247 class247 = class247s[i_14_];
	    if (null != class247) {
		if (-1960530827 * class247.anInt2438 == 0) {
		    if (null != class247.aClass247Array2621)
			method9545(class247.aClass247Array2621, i, 1234424009);
		    Class534_Sub37 class534_sub37
			= ((Class534_Sub37)
			   (client.aClass9_11224.method579
			    ((long) (class247.anInt2454 * -1278450723))));
		    if (null != class534_sub37)
			Class67.method1385((class534_sub37.anInt10803
					    * 1225863589),
					   i, 743051080);
		}
		if (i == 0 && null != class247.anObjectArray2553) {
		    Class534_Sub41 class534_sub41 = new Class534_Sub41();
		    class534_sub41.aClass247_10818 = class247;
		    class534_sub41.anObjectArray10819
			= class247.anObjectArray2553;
		    Class94.method1764(class534_sub41, -707727631);
		}
		if (i == 1 && class247.anObjectArray2461 != null) {
		    if (1365669833 * class247.anInt2580 >= 0) {
			Class247 class247_15_
			    = Class112.method2017((-1278450723
						   * class247.anInt2454),
						  1457113194);
			if (class247_15_ == null
			    || class247_15_.aClass247Array2620 == null
			    || (class247.anInt2580 * 1365669833
				>= class247_15_.aClass247Array2620.length)
			    || (class247_15_.aClass247Array2620
				[class247.anInt2580 * 1365669833]) != class247)
			    continue;
		    }
		    Class534_Sub41 class534_sub41 = new Class534_Sub41();
		    class534_sub41.aClass247_10818 = class247;
		    class534_sub41.anObjectArray10819
			= class247.anObjectArray2461;
		    Class94.method1764(class534_sub41, 675421810);
		}
	    }
	}
    }
}
