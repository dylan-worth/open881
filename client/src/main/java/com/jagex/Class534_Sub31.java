/* Class534_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.EOFException;

public class Class534_Sub31 extends Class534
{
    public long aLong10695;
    
    public Class534_Sub31(long l) {
	aLong10695 = 1934962372971061735L * l;
    }
    
    public static Class34 method16387(byte i) {
	Class24 class24 = null;
	try {
	    Class34 class34;
	    try {
		class24
		    = Class606.method10050("3",
					   client.aClass675_11016.aString8640,
					   false, 2089742105);
		byte[] is = new byte[(int) class24.method831(-958049567)];
		int i_0_;
		for (int i_1_ = 0; i_1_ < is.length; i_1_ += i_0_) {
		    i_0_ = class24.method843(is, i_1_, is.length - i_1_,
					     1609382260);
		    if (-1 == i_0_)
			throw new EOFException();
		}
		class34 = new Class34(new Class534_Sub40(is));
	    } catch (Exception exception) {
		Class34 class34_2_ = new Class34();
		try {
		    if (null != class24)
			class24.method832(206315863);
		} catch (Exception exception_3_) {
		    /* empty */
		}
		return class34_2_;
	    }
	    try {
		if (null != class24)
		    class24.method832(270221101);
	    } catch (Exception exception) {
		/* empty */
	    }
	    return class34;
	} catch (Exception object) {
	    try {
		if (null != class24)
		    class24.method832(1581537238);
	    } catch (Exception exception) {
		/* empty */
	    }
	    throw object;
	}
    }
}
