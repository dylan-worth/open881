/* Class463 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class463 implements Runnable
{
    boolean aBool5095;
    int anInt5096;
    Class696 aClass696_5097 = new Class696();
    Thread aThread5098;
    
    public void method7518() {
	aBool5095 = true;
	synchronized (aClass696_5097) {
	    aClass696_5097.notifyAll();
	}
	try {
	    aThread5098.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	aThread5098 = null;
    }
    
    Class534_Sub18_Sub18_Sub3 method7519(int i, Class567 class567, int i_0_) {
	Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3
	    = new Class534_Sub18_Sub18_Sub3();
	class534_sub18_sub18_sub3.anInt12165 = 8740441;
	synchronized (aClass696_5097) {
	    for (Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3_1_
		     = ((Class534_Sub18_Sub18_Sub3)
			aClass696_5097.method14078(1221951837));
		 class534_sub18_sub18_sub3_1_ != null;
		 class534_sub18_sub18_sub3_1_
		     = ((Class534_Sub18_Sub18_Sub3)
			aClass696_5097.method14080((byte) 102))) {
		if ((long) i == (-753566336061658369L
				 * class534_sub18_sub18_sub3_1_.aLong10509)
		    && class534_sub18_sub18_sub3_1_.aClass567_12166 == class567
		    && 2 == (class534_sub18_sub18_sub3_1_.anInt12165
			     * -1221850647)) {
		    class534_sub18_sub18_sub3.aByteArray12162
			= class534_sub18_sub18_sub3_1_.aByteArray12162;
		    class534_sub18_sub18_sub3.aBool11888 = false;
		    Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3_2_
			= class534_sub18_sub18_sub3;
		    return class534_sub18_sub18_sub3_2_;
		}
	    }
	}
	class534_sub18_sub18_sub3.aByteArray12162
	    = class567.method9547(i, 1084208275);
	class534_sub18_sub18_sub3.aBool11888 = false;
	class534_sub18_sub18_sub3.aBool11886 = true;
	return class534_sub18_sub18_sub3;
    }
    
    Class534_Sub18_Sub18_Sub3 method7520(int i, byte[] is, Class567 class567,
					 byte i_3_) {
	Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3
	    = new Class534_Sub18_Sub18_Sub3();
	class534_sub18_sub18_sub3.anInt12165 = 17480882;
	class534_sub18_sub18_sub3.aLong10509 = 84410810002887935L * (long) i;
	class534_sub18_sub18_sub3.aByteArray12162 = is;
	class534_sub18_sub18_sub3.aClass567_12166 = class567;
	class534_sub18_sub18_sub3.aBool11886 = false;
	method7522(class534_sub18_sub18_sub3, (byte) 1);
	return class534_sub18_sub18_sub3;
    }
    
    Class534_Sub18_Sub18_Sub3 method7521(int i, Class567 class567, int i_4_) {
	Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3
	    = new Class534_Sub18_Sub18_Sub3();
	class534_sub18_sub18_sub3.anInt12165 = 26221323;
	class534_sub18_sub18_sub3.aLong10509 = 84410810002887935L * (long) i;
	class534_sub18_sub18_sub3.aClass567_12166 = class567;
	class534_sub18_sub18_sub3.aBool11886 = false;
	method7522(class534_sub18_sub18_sub3, (byte) 1);
	return class534_sub18_sub18_sub3;
    }
    
    void method7522(Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3,
		    byte i) {
	synchronized (aClass696_5097) {
	    aClass696_5097.method14076(class534_sub18_sub18_sub3, (byte) 104);
	    anInt5096 += -506550007;
	    aClass696_5097.notifyAll();
	}
    }
    
    public void run() {
	while (!aBool5095) {
	    Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3;
	    synchronized (aClass696_5097) {
		class534_sub18_sub18_sub3
		    = ((Class534_Sub18_Sub18_Sub3)
		       aClass696_5097.method14077((byte) -116));
		if (null != class534_sub18_sub18_sub3)
		    anInt5096 -= -506550007;
		else {
		    try {
			aClass696_5097.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if (class534_sub18_sub18_sub3.anInt12165 * -1221850647 == 2)
		    class534_sub18_sub18_sub3.aClass567_12166.method9553
			((int) (class534_sub18_sub18_sub3.aLong10509
				* -753566336061658369L),
			 class534_sub18_sub18_sub3.aByteArray12162,
			 class534_sub18_sub18_sub3.aByteArray12162.length,
			 -667683868);
		else if (3
			 == -1221850647 * class534_sub18_sub18_sub3.anInt12165)
		    class534_sub18_sub18_sub3.aByteArray12162
			= (class534_sub18_sub18_sub3.aClass567_12166.method9547
			   ((int) (class534_sub18_sub18_sub3.aLong10509
				   * -753566336061658369L),
			    -301265755));
	    } catch (Exception exception) {
		Class262.method4824(null, exception, (byte) -29);
	    }
	    class534_sub18_sub18_sub3.aBool11888 = false;
	}
    }
    
    public int method7523(int i) {
	synchronized (aClass696_5097) {
	    int i_5_ = anInt5096 * 720483641;
	    return i_5_;
	}
    }
    
    void method7524(Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3) {
	synchronized (aClass696_5097) {
	    aClass696_5097.method14076(class534_sub18_sub18_sub3, (byte) 35);
	    anInt5096 += -506550007;
	    aClass696_5097.notifyAll();
	}
    }
    
    public void method7525() {
	while (!aBool5095) {
	    Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3;
	    synchronized (aClass696_5097) {
		class534_sub18_sub18_sub3
		    = ((Class534_Sub18_Sub18_Sub3)
		       aClass696_5097.method14077((byte) -62));
		if (null != class534_sub18_sub18_sub3)
		    anInt5096 -= -506550007;
		else {
		    try {
			aClass696_5097.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if (class534_sub18_sub18_sub3.anInt12165 * -1221850647 == 2)
		    class534_sub18_sub18_sub3.aClass567_12166.method9553
			((int) (class534_sub18_sub18_sub3.aLong10509
				* -753566336061658369L),
			 class534_sub18_sub18_sub3.aByteArray12162,
			 class534_sub18_sub18_sub3.aByteArray12162.length,
			 1528050285);
		else if (3
			 == -1221850647 * class534_sub18_sub18_sub3.anInt12165)
		    class534_sub18_sub18_sub3.aByteArray12162
			= (class534_sub18_sub18_sub3.aClass567_12166.method9547
			   ((int) (class534_sub18_sub18_sub3.aLong10509
				   * -753566336061658369L),
			    1807519132));
	    } catch (Exception exception) {
		Class262.method4824(null, exception, (byte) 23);
	    }
	    class534_sub18_sub18_sub3.aBool11888 = false;
	}
    }
    
    void method7526(Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3) {
	synchronized (aClass696_5097) {
	    aClass696_5097.method14076(class534_sub18_sub18_sub3, (byte) 75);
	    anInt5096 += -506550007;
	    aClass696_5097.notifyAll();
	}
    }
    
    Class534_Sub18_Sub18_Sub3 method7527(int i, Class567 class567) {
	Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3
	    = new Class534_Sub18_Sub18_Sub3();
	class534_sub18_sub18_sub3.anInt12165 = 8740441;
	synchronized (aClass696_5097) {
	    for (Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3_6_
		     = ((Class534_Sub18_Sub18_Sub3)
			aClass696_5097.method14078(1221951837));
		 class534_sub18_sub18_sub3_6_ != null;
		 class534_sub18_sub18_sub3_6_
		     = ((Class534_Sub18_Sub18_Sub3)
			aClass696_5097.method14080((byte) 88))) {
		if ((long) i == (-753566336061658369L
				 * class534_sub18_sub18_sub3_6_.aLong10509)
		    && class534_sub18_sub18_sub3_6_.aClass567_12166 == class567
		    && 2 == (class534_sub18_sub18_sub3_6_.anInt12165
			     * -1221850647)) {
		    class534_sub18_sub18_sub3.aByteArray12162
			= class534_sub18_sub18_sub3_6_.aByteArray12162;
		    class534_sub18_sub18_sub3.aBool11888 = false;
		    Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3_7_
			= class534_sub18_sub18_sub3;
		    return class534_sub18_sub18_sub3_7_;
		}
	    }
	}
	class534_sub18_sub18_sub3.aByteArray12162
	    = class567.method9547(i, 1335884194);
	class534_sub18_sub18_sub3.aBool11888 = false;
	class534_sub18_sub18_sub3.aBool11886 = true;
	return class534_sub18_sub18_sub3;
    }
    
    Class534_Sub18_Sub18_Sub3 method7528(int i, Class567 class567) {
	Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3
	    = new Class534_Sub18_Sub18_Sub3();
	class534_sub18_sub18_sub3.anInt12165 = 8740441;
	synchronized (aClass696_5097) {
	    for (Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3_8_
		     = ((Class534_Sub18_Sub18_Sub3)
			aClass696_5097.method14078(1221951837));
		 class534_sub18_sub18_sub3_8_ != null;
		 class534_sub18_sub18_sub3_8_
		     = ((Class534_Sub18_Sub18_Sub3)
			aClass696_5097.method14080((byte) 83))) {
		if ((long) i == (-753566336061658369L
				 * class534_sub18_sub18_sub3_8_.aLong10509)
		    && class534_sub18_sub18_sub3_8_.aClass567_12166 == class567
		    && 2 == (class534_sub18_sub18_sub3_8_.anInt12165
			     * -1221850647)) {
		    class534_sub18_sub18_sub3.aByteArray12162
			= class534_sub18_sub18_sub3_8_.aByteArray12162;
		    class534_sub18_sub18_sub3.aBool11888 = false;
		    Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3_9_
			= class534_sub18_sub18_sub3;
		    return class534_sub18_sub18_sub3_9_;
		}
	    }
	}
	class534_sub18_sub18_sub3.aByteArray12162
	    = class567.method9547(i, 1450066986);
	class534_sub18_sub18_sub3.aBool11888 = false;
	class534_sub18_sub18_sub3.aBool11886 = true;
	return class534_sub18_sub18_sub3;
    }
    
    Class534_Sub18_Sub18_Sub3 method7529(int i, Class567 class567) {
	Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3
	    = new Class534_Sub18_Sub18_Sub3();
	class534_sub18_sub18_sub3.anInt12165 = 8740441;
	synchronized (aClass696_5097) {
	    for (Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3_10_
		     = ((Class534_Sub18_Sub18_Sub3)
			aClass696_5097.method14078(1221951837));
		 class534_sub18_sub18_sub3_10_ != null;
		 class534_sub18_sub18_sub3_10_
		     = ((Class534_Sub18_Sub18_Sub3)
			aClass696_5097.method14080((byte) 57))) {
		if ((long) i == (-753566336061658369L
				 * class534_sub18_sub18_sub3_10_.aLong10509)
		    && (class534_sub18_sub18_sub3_10_.aClass567_12166
			== class567)
		    && 2 == (class534_sub18_sub18_sub3_10_.anInt12165
			     * -1221850647)) {
		    class534_sub18_sub18_sub3.aByteArray12162
			= class534_sub18_sub18_sub3_10_.aByteArray12162;
		    class534_sub18_sub18_sub3.aBool11888 = false;
		    Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3_11_
			= class534_sub18_sub18_sub3;
		    return class534_sub18_sub18_sub3_11_;
		}
	    }
	}
	class534_sub18_sub18_sub3.aByteArray12162
	    = class567.method9547(i, -1889327818);
	class534_sub18_sub18_sub3.aBool11888 = false;
	class534_sub18_sub18_sub3.aBool11886 = true;
	return class534_sub18_sub18_sub3;
    }
    
    Class534_Sub18_Sub18_Sub3 method7530(int i, byte[] is, Class567 class567) {
	Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3
	    = new Class534_Sub18_Sub18_Sub3();
	class534_sub18_sub18_sub3.anInt12165 = 17480882;
	class534_sub18_sub18_sub3.aLong10509 = 84410810002887935L * (long) i;
	class534_sub18_sub18_sub3.aByteArray12162 = is;
	class534_sub18_sub18_sub3.aClass567_12166 = class567;
	class534_sub18_sub18_sub3.aBool11886 = false;
	method7522(class534_sub18_sub18_sub3, (byte) 1);
	return class534_sub18_sub18_sub3;
    }
    
    void method7531(Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3) {
	synchronized (aClass696_5097) {
	    aClass696_5097.method14076(class534_sub18_sub18_sub3, (byte) 69);
	    anInt5096 += -506550007;
	    aClass696_5097.notifyAll();
	}
    }
    
    public void method7532() {
	while (!aBool5095) {
	    Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3;
	    synchronized (aClass696_5097) {
		class534_sub18_sub18_sub3
		    = ((Class534_Sub18_Sub18_Sub3)
		       aClass696_5097.method14077((byte) -20));
		if (null != class534_sub18_sub18_sub3)
		    anInt5096 -= -506550007;
		else {
		    try {
			aClass696_5097.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		    continue;
		}
	    }
	    try {
		if (class534_sub18_sub18_sub3.anInt12165 * -1221850647 == 2)
		    class534_sub18_sub18_sub3.aClass567_12166.method9553
			((int) (class534_sub18_sub18_sub3.aLong10509
				* -753566336061658369L),
			 class534_sub18_sub18_sub3.aByteArray12162,
			 class534_sub18_sub18_sub3.aByteArray12162.length,
			 1686812352);
		else if (3
			 == -1221850647 * class534_sub18_sub18_sub3.anInt12165)
		    class534_sub18_sub18_sub3.aByteArray12162
			= (class534_sub18_sub18_sub3.aClass567_12166.method9547
			   ((int) (class534_sub18_sub18_sub3.aLong10509
				   * -753566336061658369L),
			    -390395102));
	    } catch (Exception exception) {
		Class262.method4824(null, exception, (byte) -41);
	    }
	    class534_sub18_sub18_sub3.aBool11888 = false;
	}
    }
    
    public void method7533() {
	aBool5095 = true;
	synchronized (aClass696_5097) {
	    aClass696_5097.notifyAll();
	}
	try {
	    aThread5098.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	aThread5098 = null;
    }
    
    public int method7534() {
	synchronized (aClass696_5097) {
	    int i = anInt5096 * 720483641;
	    return i;
	}
    }
    
    void method7535(Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3) {
	synchronized (aClass696_5097) {
	    aClass696_5097.method14076(class534_sub18_sub18_sub3, (byte) 51);
	    anInt5096 += -506550007;
	    aClass696_5097.notifyAll();
	}
    }
    
    void method7536(Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3) {
	synchronized (aClass696_5097) {
	    aClass696_5097.method14076(class534_sub18_sub18_sub3, (byte) 52);
	    anInt5096 += -506550007;
	    aClass696_5097.notifyAll();
	}
    }
    
    Class534_Sub18_Sub18_Sub3 method7537(int i, byte[] is, Class567 class567) {
	Class534_Sub18_Sub18_Sub3 class534_sub18_sub18_sub3
	    = new Class534_Sub18_Sub18_Sub3();
	class534_sub18_sub18_sub3.anInt12165 = 17480882;
	class534_sub18_sub18_sub3.aLong10509 = 84410810002887935L * (long) i;
	class534_sub18_sub18_sub3.aByteArray12162 = is;
	class534_sub18_sub18_sub3.aClass567_12166 = class567;
	class534_sub18_sub18_sub3.aBool11886 = false;
	method7522(class534_sub18_sub18_sub3, (byte) 1);
	return class534_sub18_sub18_sub3;
    }
    
    public int method7538() {
	synchronized (aClass696_5097) {
	    int i = anInt5096 * 720483641;
	    return i;
	}
    }
    
    public int method7539() {
	synchronized (aClass696_5097) {
	    int i = anInt5096 * 720483641;
	    return i;
	}
    }
    
    public void method7540() {
	aBool5095 = true;
	synchronized (aClass696_5097) {
	    aClass696_5097.notifyAll();
	}
	try {
	    aThread5098.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	aThread5098 = null;
    }
    
    public void method7541(int i) {
	aBool5095 = true;
	synchronized (aClass696_5097) {
	    aClass696_5097.notifyAll();
	}
	try {
	    aThread5098.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	aThread5098 = null;
    }
    
    public void method7542() {
	aBool5095 = true;
	synchronized (aClass696_5097) {
	    aClass696_5097.notifyAll();
	}
	try {
	    aThread5098.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	aThread5098 = null;
    }
    
    public Class463() {
	anInt5096 = 0;
	aBool5095 = false;
	aThread5098 = new Thread(this);
	aThread5098.setDaemon(true);
	aThread5098.start();
	aThread5098.setPriority(1);
    }
    
    static final void method7543(Class669 class669, byte i) {
	class669.anInt8594 -= 85613153;
	String string
	    = ((String)
	       class669.anObjectArray8593[1485266147 * class669.anInt8594]);
	String string_12_ = (String) (class669.anObjectArray8593
				      [1 + 1485266147 * class669.anInt8594]);
	String string_13_ = (String) (class669.anObjectArray8593
				      [2 + class669.anInt8594 * 1485266147]);
	boolean bool = ((class669.anIntArray8595
			 [(class669.anInt8600 -= 308999563) * 2088438307])
			== 1);
	Class200_Sub8.method15581(string, string_12_, string_13_, bool,
				  -1145020330);
    }
    
    public static void method7544(int i, int[] is, int i_14_) {
	if (-1 != i && Class180.method2978(i, is, 1367385399)) {
	    Class247[] class247s
		= Class44_Sub11.aClass243Array11006[i].aClass247Array2412;
	    Class658.method10911(class247s, (byte) -112);
	}
    }
}
