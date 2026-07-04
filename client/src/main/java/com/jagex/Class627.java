/* Class627 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class627 implements Iterator
{
    Class633[] aClass633Array8173;
    int anInt8174;
    static int anInt8175;
    
    public boolean method10368() {
	return anInt8174 * -298092353 < aClass633Array8173.length;
    }
    
    public boolean hasNext() {
	return anInt8174 * -298092353 < aClass633Array8173.length;
    }
    
    public Object next() {
	return aClass633Array8173[(anInt8174 += -1268517057) * -298092353 - 1];
    }
    
    public Object method10369() {
	return aClass633Array8173[(anInt8174 += -1268517057) * -298092353 - 1];
    }
    
    public void remove() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method10370() {
	return anInt8174 * -298092353 < aClass633Array8173.length;
    }
    
    public boolean method10371() {
	return anInt8174 * -298092353 < aClass633Array8173.length;
    }
    
    public boolean method10372() {
	return anInt8174 * -298092353 < aClass633Array8173.length;
    }
    
    Class627(Class633[] class633s) {
	aClass633Array8173 = class633s;
    }
    
    public Object method10373() {
	return aClass633Array8173[(anInt8174 += -1268517057) * -298092353 - 1];
    }
    
    public void method10374() {
	throw new UnsupportedOperationException();
    }
    
    public void method10375() {
	throw new UnsupportedOperationException();
    }
    
    static final void method10376(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_0_ ^ 0xffffffff;
    }
    
    public static String method10377(long l, int i, int i_1_) {
	Class699.method14128(l);
	int i_2_ = Class84.aCalendar838.get(5);
	int i_3_ = Class84.aCalendar838.get(2);
	int i_4_ = Class84.aCalendar838.get(1);
	if (i == 3)
	    return Class85.method1682(l, i, (short) 5838);
	return new StringBuilder().append(Integer.toString(i_2_ / 10)).append
		   (i_2_ % 10).append
		   ("-").append
		   (Class84.aStringArrayArray839[i][i_3_]).append
		   ("-").append
		   (i_4_).toString();
    }
}
