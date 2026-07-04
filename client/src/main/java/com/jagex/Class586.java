/* Class586 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class Class586
{
    Class472 aClass472_7800;
    Class203 aClass203_7801 = new Class203(20);
    
    void method9848(int i) {
	synchronized (aClass203_7801) {
	    aClass203_7801.method3876(i, (byte) 0);
	}
    }
    
    void method9849() {
	synchronized (aClass203_7801) {
	    aClass203_7801.method3884((byte) -124);
	}
    }
    
    void method9850(int i, int i_0_) {
	synchronized (aClass203_7801) {
	    aClass203_7801.method3876(i, (byte) 0);
	}
    }
    
    void method9851() {
	synchronized (aClass203_7801) {
	    aClass203_7801.method3877(1396548603);
	}
    }
    
    void method9852() {
	synchronized (aClass203_7801) {
	    aClass203_7801.method3877(229974856);
	}
    }
    
    void method9853() {
	synchronized (aClass203_7801) {
	    aClass203_7801.method3877(663968240);
	}
    }
    
    void method9854(int i) {
	synchronized (aClass203_7801) {
	    aClass203_7801.method3877(2037664111);
	}
    }
    
    void method9855(short i) {
	synchronized (aClass203_7801) {
	    aClass203_7801.method3884((byte) -93);
	}
    }
    
    void method9856() {
	synchronized (aClass203_7801) {
	    aClass203_7801.method3884((byte) -122);
	}
    }
    
    void method9857() {
	synchronized (aClass203_7801) {
	    aClass203_7801.method3884((byte) -18);
	}
    }
    
    Class586(Class472 class472) {
	aClass472_7800 = class472;
    }
    
    public static void method9858(short i) {
	synchronized (Class631.aClass203_8220) {
	    Class631.aClass203_8220.method3884((byte) -80);
	}
	synchronized (Class631.aClass203_8221) {
	    Class631.aClass203_8221.method3884((byte) -101);
	}
    }
    
    static final void method9859(Class669 class669, int i) {
	int i_1_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_1_, 1713864829);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_1_ >> 16];
	Class536.method8907(class247, class243, class669, (short) -256);
    }
    
    static final void method9860(Class669 class669, int i) {
	int i_2_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_2_, 14921236);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class247.anInt2500 * -495767299;
    }
    
    public static byte[] method9861(byte[] is, int i) {
	if (is == null)
	    return null;
	byte[] is_3_ = new byte[is.length];
	System.arraycopy(is, 0, is_3_, 0, is.length);
	return is_3_;
    }
    
    public static byte[] method9862(Object object, int i, int i_4_, int i_5_) {
	if (null == object)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    return Arrays.copyOfRange(is, i, i + i_4_);
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[i_4_];
	    bytebuffer.position(i);
	    bytebuffer.get(is, 0, i_4_);
	    return is;
	}
	throw new IllegalArgumentException();
    }
}
