/* Class540 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Class540
{
    static final int anInt7172 = 5;
    static Class522 aClass522_7173;
    static int[] anIntArray7174;
    
    static byte[] method8930(InputStream inputstream, int i)
	throws IOException {
	byte[] is = new byte[5];
	if (inputstream.read(is, 0, 5) != 5)
	    throw new IOException("2");
	ByteArrayOutputStream bytearrayoutputstream
	    = new ByteArrayOutputStream(i);
	synchronized (aClass522_7173) {
	    if (!aClass522_7173.method8698(is, (byte) -86))
		throw new IOException("3");
	    aClass522_7173.method8704(inputstream, bytearrayoutputstream,
				      (long) i);
	}
	bytearrayoutputstream.flush();
	return bytearrayoutputstream.toByteArray();
    }
    
    static {
	new Class544();
	aClass522_7173 = new Class522();
    }
    
    Class540() throws Throwable {
	throw new Error();
    }
    
    public static byte[] method8931(Class534_Sub40 class534_sub40, int i)
	throws IOException {
	ByteArrayInputStream bytearrayinputstream
	    = new ByteArrayInputStream(class534_sub40.aByteArray10810);
	bytearrayinputstream.skip((long) (class534_sub40.anInt10811
					  * 31645619));
	return Class100.method1884(bytearrayinputstream, i, (byte) -6);
    }
    
    public static byte[] method8932(Class534_Sub40 class534_sub40, int i)
	throws IOException {
	ByteArrayInputStream bytearrayinputstream
	    = new ByteArrayInputStream(class534_sub40.aByteArray10810);
	bytearrayinputstream.skip((long) (class534_sub40.anInt10811
					  * 31645619));
	return Class100.method1884(bytearrayinputstream, i, (byte) -1);
    }
    
    static byte[] method8933(InputStream inputstream, int i)
	throws IOException {
	byte[] is = new byte[5];
	if (inputstream.read(is, 0, 5) != 5)
	    throw new IOException("2");
	ByteArrayOutputStream bytearrayoutputstream
	    = new ByteArrayOutputStream(i);
	synchronized (aClass522_7173) {
	    if (!aClass522_7173.method8698(is, (byte) -27))
		throw new IOException("3");
	    aClass522_7173.method8704(inputstream, bytearrayoutputstream,
				      (long) i);
	}
	bytearrayoutputstream.flush();
	return bytearrayoutputstream.toByteArray();
    }
    
    public static byte[] method8934(Class534_Sub40 class534_sub40, int i)
	throws IOException {
	ByteArrayInputStream bytearrayinputstream
	    = new ByteArrayInputStream(class534_sub40.aByteArray10810);
	bytearrayinputstream.skip((long) (class534_sub40.anInt10811
					  * 31645619));
	return Class100.method1884(bytearrayinputstream, i, (byte) 64);
    }
    
    public static void method8935(byte i) {
	Class642.aClass656_Sub2_8342.method10860(-1443146346);
	Class642.aClass656_Sub1_8346.method10860(1300411826);
	Class642.aLong8345 = 2887650411480147785L;
	Class642.aBool8344 = true;
    }
    
    static final void method8936(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	class247.anInt2586
	    = (class669.anIntArray8595[class669.anInt8600 * 2088438307]
	       * 341739281);
	class247.anInt2506
	    = (class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1]
	       * 252151357);
	Class454.method7416(class247, -432558197);
    }
    
    static final void method8937(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, 1968106997);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 2142374941 * class247.anInt2479;
    }
    
    static final void method8938(Class669 class669, byte i) {
	class669.anInt8600 -= 926998689;
	Class171_Sub4.aClass232_9944.method4244
	    (class669.anIntArray8595[2088438307 * class669.anInt8600],
	     class669.anIntArray8595[1 + class669.anInt8600 * 2088438307],
	     (byte) 35);
    }
    
    static final void method8939(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_1_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	boolean bool
	    = (class669.anIntArray8595[1 + 2088438307 * class669.anInt8600]
	       == 1);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = Class580.method9817(i_1_, bool, -802105241);
    }
    
    static final void method8940(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class641.method10601(string, true, -1550945428);
    }
    
    static final void method8941(Class669 class669, short i) {
	if (3 == -891094135 * Class10.anInt75)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= (int) ((double) Class599.aClass298_Sub1_7871
				      .method5389(426735450)
			 * 2607.5945876176133) >> 3;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= (int) client.aFloat11140 >> 3;
    }
}
