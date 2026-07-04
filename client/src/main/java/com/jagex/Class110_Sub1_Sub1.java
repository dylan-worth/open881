/* Class110_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class110_Sub1_Sub1 extends Class110_Sub1 implements Interface14
{
    Class203 aClass203_11372 = new Class203(64);
    Class472 aClass472_11373;
    
    Class150_Sub2 method17851(int i) {
	byte[] is
	    = aClass472_11373.method7743((aClass453_8978.method7394((byte) 64)
					  .anInt8385) * 1570156841,
					 i, -1315722240);
	Class150_Sub2 class150_sub2 = new Class150_Sub2(aClass453_8978, i);
	if (null != is)
	    class150_sub2.method79(new Class534_Sub40(is), (byte) 3);
	return class150_sub2;
    }
    
    public Interface13 method91(int i, int i_0_) {
	Class150_Sub2 class150_sub2;
	synchronized (aClass203_11372) {
	    class150_sub2
		= (Class150_Sub2) aClass203_11372.method3871((long) i);
	    if (class150_sub2 == null) {
		class150_sub2 = method17852(i, 8737185);
		aClass203_11372.method3893(class150_sub2, (long) i);
	    }
	}
	return class150_sub2;
    }
    
    Class150_Sub2 method17852(int i, int i_1_) {
	byte[] is
	    = aClass472_11373.method7743((aClass453_8978.method7394((byte) 64)
					  .anInt8385) * 1570156841,
					 i, -786593899);
	Class150_Sub2 class150_sub2 = new Class150_Sub2(aClass453_8978, i);
	if (null != is)
	    class150_sub2.method79(new Class534_Sub40(is), (byte) 3);
	return class150_sub2;
    }
    
    public void method17853(int i) {
	synchronized (aClass203_11372) {
	    aClass203_11372.method3877(257612939);
	}
    }
    
    public void method17854(int i, int i_2_) {
	synchronized (aClass203_11372) {
	    aClass203_11372.method3876(i, (byte) 0);
	}
    }
    
    public void method17855() {
	synchronized (aClass203_11372) {
	    aClass203_11372.method3884((byte) -103);
	}
    }
    
    public Iterator iterator() {
	return new Class237(this);
    }
    
    public int method88() {
	return super.method90((byte) 43);
    }
    
    public Interface13 method87(int i) {
	Class150_Sub2 class150_sub2;
	synchronized (aClass203_11372) {
	    class150_sub2
		= (Class150_Sub2) aClass203_11372.method3871((long) i);
	    if (class150_sub2 == null) {
		class150_sub2 = method17852(i, 8737185);
		aClass203_11372.method3893(class150_sub2, (long) i);
	    }
	}
	return class150_sub2;
    }
    
    public Interface13 method86(int i) {
	Class150_Sub2 class150_sub2;
	synchronized (aClass203_11372) {
	    class150_sub2
		= (Class150_Sub2) aClass203_11372.method3871((long) i);
	    if (class150_sub2 == null) {
		class150_sub2 = method17852(i, 8737185);
		aClass203_11372.method3893(class150_sub2, (long) i);
	    }
	}
	return class150_sub2;
    }
    
    public int method90(byte i) {
	return super.method90((byte) 79);
    }
    
    public int method85() {
	return super.method90((byte) 52);
    }
    
    public Class110_Sub1_Sub1(Class675 class675, Class453 class453,
			      Class672 class672, Class472 class472) {
	super(class675, class453, class672,
	      (class472 != null
	       ? class472.method7726((class453.method7394((byte) 64).anInt8385
				      * 1570156841),
				     (byte) 105)
	       : 0));
	aClass472_11373 = class472;
    }
    
    public void method17856(int i) {
	synchronized (aClass203_11372) {
	    aClass203_11372.method3884((byte) -42);
	}
    }
    
    Class150_Sub2 method17857(int i) {
	byte[] is
	    = aClass472_11373.method7743((aClass453_8978.method7394((byte) 64)
					  .anInt8385) * 1570156841,
					 i, -1960197732);
	Class150_Sub2 class150_sub2 = new Class150_Sub2(aClass453_8978, i);
	if (null != is)
	    class150_sub2.method79(new Class534_Sub40(is), (byte) 3);
	return class150_sub2;
    }
    
    public void method17858(int i) {
	synchronized (aClass203_11372) {
	    aClass203_11372.method3876(i, (byte) 0);
	}
    }
    
    public void method17859() {
	synchronized (aClass203_11372) {
	    aClass203_11372.method3884((byte) -31);
	}
    }
    
    public Iterator method17860() {
	return new Class237(this);
    }
    
    public void method17861() {
	synchronized (aClass203_11372) {
	    aClass203_11372.method3884((byte) -41);
	}
    }
    
    public void method17862() {
	synchronized (aClass203_11372) {
	    aClass203_11372.method3884((byte) -19);
	}
    }
    
    public Iterator method17863() {
	return new Class237(this);
    }
    
    public Interface13 method89(int i) {
	Class150_Sub2 class150_sub2;
	synchronized (aClass203_11372) {
	    class150_sub2
		= (Class150_Sub2) aClass203_11372.method3871((long) i);
	    if (class150_sub2 == null) {
		class150_sub2 = method17852(i, 8737185);
		aClass203_11372.method3893(class150_sub2, (long) i);
	    }
	}
	return class150_sub2;
    }
    
    static final void method17864(Class669 class669, int i) {
	class669.anInt8600 -= 308999563;
    }
    
    static final void method17865(Class247 class247, Class243 class243,
				  Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2450
	    = Class99.method1859(string, class669, -671915564);
	class247.aBool2561 = true;
    }
    
    static final void method17866(Class669 class669, byte i) {
	Class487.method7992(-1187455518);
    }
    
    static final void method17867(Class669 class669, int i) {
	int i_3_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (client.aString11300 != null
	    && i_3_ < -217094943 * Class455.anInt4963)
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= Class168.aClass98Array1792[i_3_].aString1165;
	else
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
    }
}
