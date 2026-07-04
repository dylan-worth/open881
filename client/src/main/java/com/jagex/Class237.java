/* Class237 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Image;
import java.util.Iterator;

class Class237 implements Iterator
{
    int anInt2374;
    Class110_Sub1_Sub1 this$0;
    static int anInt2375;
    public static Image anImage2376;
    static Class247 aClass247_2377;
    
    Class237(Class110_Sub1_Sub1 class110_sub1_sub1) {
	this$0 = class110_sub1_sub1;
    }
    
    public boolean hasNext() {
	return anInt2374 * -1170563701 < this$0.method90((byte) 51);
    }
    
    public void method4413() {
	throw new UnsupportedOperationException();
    }
    
    public void remove() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method4414() {
	return anInt2374 * -1170563701 < this$0.method90((byte) 1);
    }
    
    public boolean method4415() {
	return anInt2374 * -1170563701 < this$0.method90((byte) 18);
    }
    
    public Object next() {
	int i = (anInt2374 += -2060443101) * -1170563701 - 1;
	Class150_Sub2 class150_sub2
	    = (Class150_Sub2) this$0.aClass203_11372.method3871((long) i);
	if (null != class150_sub2)
	    return class150_sub2;
	return this$0.method17852(i, 8737185);
    }
    
    public boolean method4416() {
	return anInt2374 * -1170563701 < this$0.method90((byte) 71);
    }
    
    public Object method4417() {
	int i = (anInt2374 += -2060443101) * -1170563701 - 1;
	Class150_Sub2 class150_sub2
	    = (Class150_Sub2) this$0.aClass203_11372.method3871((long) i);
	if (null != class150_sub2)
	    return class150_sub2;
	return this$0.method17852(i, 8737185);
    }
    
    public Object method4418() {
	int i = (anInt2374 += -2060443101) * -1170563701 - 1;
	Class150_Sub2 class150_sub2
	    = (Class150_Sub2) this$0.aClass203_11372.method3871((long) i);
	if (null != class150_sub2)
	    return class150_sub2;
	return this$0.method17852(i, 8737185);
    }
    
    public boolean method4419() {
	return anInt2374 * -1170563701 < this$0.method90((byte) 105);
    }
    
    public void method4420() {
	throw new UnsupportedOperationException();
    }
    
    static final void method4421(Class669 class669, int i) {
	Class171_Sub4.aClass232_9944.method4243((class669.anIntArray8595
						 [((class669.anInt8600
						    -= 308999563)
						   * 2088438307)]),
						-1826429710);
    }
    
    static final void method4422(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub22.method17372(-1850530127 * client.anInt11039,
					-1764250546) ? 1 : 0;
    }
    
    static final void method4423(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub35_10783
		  .method17179((byte) -4);
    }
}
