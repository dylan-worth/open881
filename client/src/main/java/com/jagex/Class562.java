/* Class562 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class562 implements Runnable
{
    InputStream anInputStream7553;
    Thread aThread7554;
    int anInt7555;
    byte[] aByteArray7556;
    int anInt7557 = 0;
    int anInt7558 = 0;
    IOException anIOException7559;
    public static Class110_Sub1_Sub1 aClass110_Sub1_Sub1_7560;
    
    public void method9450() {
	for (;;) {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (anIOException7559 != null)
			return;
		    if (-1709640747 * anInt7557 == 0)
			i = (-2015374557 * anInt7555 - -175092243 * anInt7558
			     - 1);
		    else if (-1709640747 * anInt7557 <= anInt7558 * -175092243)
			i = anInt7555 * -2015374557 - anInt7558 * -175092243;
		    else
			i = (-1709640747 * anInt7557 - anInt7558 * -175092243
			     - 1);
		    if (i > 0)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    int i_0_;
	    try {
		i_0_ = anInputStream7553.read(aByteArray7556,
					      anInt7558 * -175092243, i);
		if (i_0_ == -1)
		    throw new EOFException();
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7559 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7558 = ((i_0_ + -175092243 * anInt7558)
			     % (anInt7555 * -2015374557) * -313387035);
	    }
	}
    }
    
    int method9451(byte[] is, int i, int i_1_) throws IOException {
	if (i_1_ < 0 || i < 0 || i + i_1_ > is.length)
	    throw new IOException();
	synchronized (this) {
	    int i_2_;
	    if (-1709640747 * anInt7557 <= anInt7558 * -175092243)
		i_2_ = anInt7558 * -175092243 - anInt7557 * -1709640747;
	    else
		i_2_ = -175092243 * anInt7558 + (anInt7555 * -2015374557
						 - -1709640747 * anInt7557);
	    if (i_1_ > i_2_)
		i_1_ = i_2_;
	    if (0 == i_1_ && anIOException7559 != null)
		throw new IOException(anIOException7559.toString());
	    if (-1709640747 * anInt7557 + i_1_ <= anInt7555 * -2015374557)
		System.arraycopy(aByteArray7556, anInt7557 * -1709640747, is,
				 i, i_1_);
	    else {
		int i_3_ = anInt7555 * -2015374557 - -1709640747 * anInt7557;
		System.arraycopy(aByteArray7556, anInt7557 * -1709640747, is,
				 i, i_3_);
		System.arraycopy(aByteArray7556, 0, is, i_3_ + i, i_1_ - i_3_);
	    }
	    anInt7557 = -1746752131 * ((-1709640747 * anInt7557 + i_1_)
				       % (-2015374557 * anInt7555));
	    this.notifyAll();
	    int i_4_ = i_1_;
	    return i_4_;
	}
    }
    
    boolean method9452(int i, int i_5_) throws IOException {
	if (i <= 0 || i >= anInt7555 * -2015374557)
	    throw new IOException();
	synchronized (this) {
	    int i_6_;
	    if (-1709640747 * anInt7557 <= -175092243 * anInt7558)
		i_6_ = -175092243 * anInt7558 - -1709640747 * anInt7557;
	    else
		i_6_ = -175092243 * anInt7558 + (-2015374557 * anInt7555
						 - -1709640747 * anInt7557);
	    if (i_6_ < i) {
		if (anIOException7559 != null)
		    throw new IOException(anIOException7559.toString());
		this.notifyAll();
		boolean bool = false;
		return bool;
	    }
	    boolean bool = true;
	    return bool;
	}
    }
    
    int method9453(byte i) throws IOException {
	synchronized (this) {
	    int i_7_;
	    if (-1709640747 * anInt7557 <= -175092243 * anInt7558)
		i_7_ = -175092243 * anInt7558 - anInt7557 * -1709640747;
	    else
		i_7_ = anInt7558 * -175092243 + (-2015374557 * anInt7555
						 - anInt7557 * -1709640747);
	    if (anIOException7559 != null)
		throw new IOException(anIOException7559.toString());
	    this.notifyAll();
	    int i_8_ = i_7_;
	    return i_8_;
	}
    }
    
    int method9454(byte[] is, int i, int i_9_, short i_10_)
	throws IOException {
	if (i_9_ < 0 || i < 0 || i + i_9_ > is.length)
	    throw new IOException();
	synchronized (this) {
	    int i_11_;
	    if (-1709640747 * anInt7557 <= anInt7558 * -175092243)
		i_11_ = anInt7558 * -175092243 - anInt7557 * -1709640747;
	    else
		i_11_ = -175092243 * anInt7558 + (anInt7555 * -2015374557
						  - -1709640747 * anInt7557);
	    if (i_9_ > i_11_)
		i_9_ = i_11_;
	    if (0 == i_9_ && anIOException7559 != null)
		throw new IOException(anIOException7559.toString());
	    if (-1709640747 * anInt7557 + i_9_ <= anInt7555 * -2015374557)
		System.arraycopy(aByteArray7556, anInt7557 * -1709640747, is,
				 i, i_9_);
	    else {
		int i_12_ = anInt7555 * -2015374557 - -1709640747 * anInt7557;
		System.arraycopy(aByteArray7556, anInt7557 * -1709640747, is,
				 i, i_12_);
		System.arraycopy(aByteArray7556, 0, is, i_12_ + i,
				 i_9_ - i_12_);
	    }
	    anInt7557 = -1746752131 * ((-1709640747 * anInt7557 + i_9_)
				       % (-2015374557 * anInt7555));
	    this.notifyAll();
	    int i_13_ = i_9_;
	    return i_13_;
	}
    }
    
    void method9455(int i) {
	synchronized (this) {
	    if (null == anIOException7559)
		anIOException7559 = new IOException("");
	    this.notifyAll();
	}
	try {
	    aThread7554.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method9456(byte i) {
	anInputStream7553 = new InputStream_Sub1();
    }
    
    public void method9457() {
	for (;;) {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (anIOException7559 != null)
			return;
		    if (-1709640747 * anInt7557 == 0)
			i = (-2015374557 * anInt7555 - -175092243 * anInt7558
			     - 1);
		    else if (-1709640747 * anInt7557 <= anInt7558 * -175092243)
			i = anInt7555 * -2015374557 - anInt7558 * -175092243;
		    else
			i = (-1709640747 * anInt7557 - anInt7558 * -175092243
			     - 1);
		    if (i > 0)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    int i_14_;
	    try {
		i_14_ = anInputStream7553.read(aByteArray7556,
					       anInt7558 * -175092243, i);
		if (i_14_ == -1)
		    throw new EOFException();
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7559 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7558 = ((i_14_ + -175092243 * anInt7558)
			     % (anInt7555 * -2015374557) * -313387035);
	    }
	}
    }
    
    void method9458() {
	anInputStream7553 = new InputStream_Sub1();
    }
    
    int method9459() throws IOException {
	synchronized (this) {
	    int i;
	    if (-1709640747 * anInt7557 <= -175092243 * anInt7558)
		i = -175092243 * anInt7558 - anInt7557 * -1709640747;
	    else
		i = anInt7558 * -175092243 + (-2015374557 * anInt7555
					      - anInt7557 * -1709640747);
	    if (anIOException7559 != null)
		throw new IOException(anIOException7559.toString());
	    this.notifyAll();
	    int i_15_ = i;
	    return i_15_;
	}
    }
    
    int method9460(byte[] is, int i, int i_16_) throws IOException {
	if (i_16_ < 0 || i < 0 || i + i_16_ > is.length)
	    throw new IOException();
	synchronized (this) {
	    int i_17_;
	    if (-1709640747 * anInt7557 <= anInt7558 * -175092243)
		i_17_ = anInt7558 * -175092243 - anInt7557 * -1709640747;
	    else
		i_17_ = -175092243 * anInt7558 + (anInt7555 * -2015374557
						  - -1709640747 * anInt7557);
	    if (i_16_ > i_17_)
		i_16_ = i_17_;
	    if (0 == i_16_ && anIOException7559 != null)
		throw new IOException(anIOException7559.toString());
	    if (-1709640747 * anInt7557 + i_16_ <= anInt7555 * -2015374557)
		System.arraycopy(aByteArray7556, anInt7557 * -1709640747, is,
				 i, i_16_);
	    else {
		int i_18_ = anInt7555 * -2015374557 - -1709640747 * anInt7557;
		System.arraycopy(aByteArray7556, anInt7557 * -1709640747, is,
				 i, i_18_);
		System.arraycopy(aByteArray7556, 0, is, i_18_ + i,
				 i_16_ - i_18_);
	    }
	    anInt7557 = -1746752131 * ((-1709640747 * anInt7557 + i_16_)
				       % (-2015374557 * anInt7555));
	    this.notifyAll();
	    int i_19_ = i_16_;
	    return i_19_;
	}
    }
    
    int method9461(byte[] is, int i, int i_20_) throws IOException {
	if (i_20_ < 0 || i < 0 || i + i_20_ > is.length)
	    throw new IOException();
	synchronized (this) {
	    int i_21_;
	    if (-1709640747 * anInt7557 <= anInt7558 * -175092243)
		i_21_ = anInt7558 * -175092243 - anInt7557 * -1709640747;
	    else
		i_21_ = -175092243 * anInt7558 + (anInt7555 * -2015374557
						  - -1709640747 * anInt7557);
	    if (i_20_ > i_21_)
		i_20_ = i_21_;
	    if (0 == i_20_ && anIOException7559 != null)
		throw new IOException(anIOException7559.toString());
	    if (-1709640747 * anInt7557 + i_20_ <= anInt7555 * -2015374557)
		System.arraycopy(aByteArray7556, anInt7557 * -1709640747, is,
				 i, i_20_);
	    else {
		int i_22_ = anInt7555 * -2015374557 - -1709640747 * anInt7557;
		System.arraycopy(aByteArray7556, anInt7557 * -1709640747, is,
				 i, i_22_);
		System.arraycopy(aByteArray7556, 0, is, i_22_ + i,
				 i_20_ - i_22_);
	    }
	    anInt7557 = -1746752131 * ((-1709640747 * anInt7557 + i_20_)
				       % (-2015374557 * anInt7555));
	    this.notifyAll();
	    int i_23_ = i_20_;
	    return i_23_;
	}
    }
    
    int method9462(byte[] is, int i, int i_24_) throws IOException {
	if (i_24_ < 0 || i < 0 || i + i_24_ > is.length)
	    throw new IOException();
	synchronized (this) {
	    int i_25_;
	    if (-1709640747 * anInt7557 <= anInt7558 * -175092243)
		i_25_ = anInt7558 * -175092243 - anInt7557 * -1709640747;
	    else
		i_25_ = -175092243 * anInt7558 + (anInt7555 * -2015374557
						  - -1709640747 * anInt7557);
	    if (i_24_ > i_25_)
		i_24_ = i_25_;
	    if (0 == i_24_ && anIOException7559 != null)
		throw new IOException(anIOException7559.toString());
	    if (-1709640747 * anInt7557 + i_24_ <= anInt7555 * -2015374557)
		System.arraycopy(aByteArray7556, anInt7557 * -1709640747, is,
				 i, i_24_);
	    else {
		int i_26_ = anInt7555 * -2015374557 - -1709640747 * anInt7557;
		System.arraycopy(aByteArray7556, anInt7557 * -1709640747, is,
				 i, i_26_);
		System.arraycopy(aByteArray7556, 0, is, i_26_ + i,
				 i_24_ - i_26_);
	    }
	    anInt7557 = -1746752131 * ((-1709640747 * anInt7557 + i_24_)
				       % (-2015374557 * anInt7555));
	    this.notifyAll();
	    int i_27_ = i_24_;
	    return i_27_;
	}
    }
    
    Class562(InputStream inputstream, int i) {
	anInputStream7553 = inputstream;
	anInt7555 = 671741067 * (i + 1);
	aByteArray7556 = new byte[anInt7555 * -2015374557];
	aThread7554 = new Thread(this);
	aThread7554.setDaemon(true);
	aThread7554.start();
    }
    
    public void run() {
	for (;;) {
	    int i;
	    synchronized (this) {
		for (;;) {
		    if (anIOException7559 != null)
			return;
		    if (-1709640747 * anInt7557 == 0)
			i = (-2015374557 * anInt7555 - -175092243 * anInt7558
			     - 1);
		    else if (-1709640747 * anInt7557 <= anInt7558 * -175092243)
			i = anInt7555 * -2015374557 - anInt7558 * -175092243;
		    else
			i = (-1709640747 * anInt7557 - anInt7558 * -175092243
			     - 1);
		    if (i > 0)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    int i_28_;
	    try {
		i_28_ = anInputStream7553.read(aByteArray7556,
					       anInt7558 * -175092243, i);
		if (i_28_ == -1)
		    throw new EOFException();
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException7559 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt7558 = ((i_28_ + -175092243 * anInt7558)
			     % (anInt7555 * -2015374557) * -313387035);
	    }
	}
    }
    
    void method9463() {
	synchronized (this) {
	    if (null == anIOException7559)
		anIOException7559 = new IOException("");
	    this.notifyAll();
	}
	try {
	    aThread7554.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method9464() {
	synchronized (this) {
	    if (null == anIOException7559)
		anIOException7559 = new IOException("");
	    this.notifyAll();
	}
	try {
	    aThread7554.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    void method9465() {
	synchronized (this) {
	    if (null == anIOException7559)
		anIOException7559 = new IOException("");
	    this.notifyAll();
	}
	try {
	    aThread7554.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    static final void method9466(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	int i_29_ = -1;
	int i_30_ = -1;
	Class246 class246
	    = class247.method4525(Class254.aClass185_2683, 447549967);
	if (null != class246) {
	    i_29_ = class246.anInt2420 * -760407609;
	    i_30_ = class246.anInt2419 * -976807825;
	}
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_29_;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_30_;
    }
    
    public static boolean method9467(int i, int i_31_) {
	return i == (i & -i);
    }
    
    public static TwitchWebcamDevice method9468(int i, int i_32_) {
	if (Class574.aTwitchWebcamDeviceArray7704 == null)
	    return null;
	for (int i_33_ = 0;
	     i_33_ < Class574.aTwitchWebcamDeviceArray7704.length; i_33_++) {
	    if (i == -1989490985 * (Class574.aTwitchWebcamDeviceArray7704
				    [i_33_].anInt1141))
		return Class574.aTwitchWebcamDeviceArray7704[i_33_];
	}
	return null;
    }
    
    static final void method9469(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2593
	    = Class99.method1859(string, class669, -1107989432);
	class247.aBool2561 = true;
    }
}
