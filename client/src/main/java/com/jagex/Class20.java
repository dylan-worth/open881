/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class20
{
    static Class20 aClass20_212 = new Class20();
    static Class20 aClass20_213;
    static Class20 aClass20_214;
    static Class20 aClass20_215 = new Class20();
    
    static {
	aClass20_214 = new Class20();
	aClass20_213 = new Class20();
    }
    
    Class20() {
	/* empty */
    }
    
    static final void method801(Class247 class247, Class243 class243,
				Class669 class669, short i) {
	class247.anInt2490
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * 13448961;
	Class454.method7416(class247, -569223697);
    }
    
    static final void method802(Class669 class669, byte i) {
	class669.anInt8600 -= 308999563;
    }
    
    public static byte[] method803(Object object, boolean bool, byte i) {
	if (null == object)
	    return null;
	if (object instanceof byte[]) {
	    byte[] is = (byte[]) object;
	    if (bool)
		return Arrays.copyOf(is, is.length);
	    return is;
	}
	if (object instanceof ByteBuffer) {
	    ByteBuffer bytebuffer = (ByteBuffer) object;
	    byte[] is = new byte[bytebuffer.capacity()];
	    bytebuffer.position(0);
	    bytebuffer.get(is);
	    return is;
	}
	throw new IllegalArgumentException();
    }
    
    public static Class16 method804(Class472 class472, int i,
				    Interface2 interface2, int i_0_) {
	byte[] is = class472.method7738(i, (byte) -120);
	if (is == null)
	    return null;
	return new Class16(is, interface2);
    }
}
