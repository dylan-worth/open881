/* Class636 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

class Class636 implements Iterator
{
    Class110_Sub1_Sub2 this$0;
    int anInt8304;
    public static int anInt8305;
    
    public boolean hasNext() {
	return anInt8304 * -1905894635 < this$0.method90((byte) 9);
    }
    
    public Object method10542() {
	int i = (anInt8304 += 1921915965) * -1905894635 - 1;
	Class150_Sub1 class150_sub1
	    = (Class150_Sub1) this$0.aClass203_11376.method3871((long) i);
	if (class150_sub1 != null)
	    return class150_sub1;
	return this$0.method17881(i, -474011670);
    }
    
    public Object next() {
	int i = (anInt8304 += 1921915965) * -1905894635 - 1;
	Class150_Sub1 class150_sub1
	    = (Class150_Sub1) this$0.aClass203_11376.method3871((long) i);
	if (class150_sub1 != null)
	    return class150_sub1;
	return this$0.method17881(i, 1432268213);
    }
    
    public boolean method10543() {
	return anInt8304 * -1905894635 < this$0.method90((byte) 53);
    }
    
    Class636(Class110_Sub1_Sub2 class110_sub1_sub2) {
	this$0 = class110_sub1_sub2;
    }
    
    public void method10544() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method10545() {
	return anInt8304 * -1905894635 < this$0.method90((byte) 18);
    }
    
    public boolean method10546() {
	return anInt8304 * -1905894635 < this$0.method90((byte) 124);
    }
    
    public Object method10547() {
	int i = (anInt8304 += 1921915965) * -1905894635 - 1;
	Class150_Sub1 class150_sub1
	    = (Class150_Sub1) this$0.aClass203_11376.method3871((long) i);
	if (class150_sub1 != null)
	    return class150_sub1;
	return this$0.method17881(i, 914658061);
    }
    
    public void remove() {
	throw new UnsupportedOperationException();
    }
    
    public boolean method10548() {
	return anInt8304 * -1905894635 < this$0.method90((byte) 24);
    }
    
    public void method10549() {
	throw new UnsupportedOperationException();
    }
    
    static final void method10550(Class669 class669, int i) {
	class669.anInt8600 -= 1544997815;
	int i_0_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_1_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	int i_2_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2];
	int i_3_
	    = class669.anIntArray8595[3 + 2088438307 * class669.anInt8600];
	int i_4_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 4];
	Class171_Sub4.aClass232_9944.method4237(Class211.aClass211_2255, i_0_,
						i_1_, i_3_,
						Class190.aClass190_2134
						    .method3763(635772271),
						Class207.aClass207_2235, 0.0F,
						0.0F, null, 0, i_4_, i_2_,
						(byte) 89);
    }
    
    public static void method10551(Class556 class556, Class185 class185,
				   int i) {
	Iterator iterator = Class625.aList8154.iterator();
	while (iterator.hasNext()) {
	    Class629 class629 = (Class629) iterator.next();
	    if (class629.aBool8188)
		class629.method10397(class556, class185);
	}
    }
    
    static final void method10552(Class669 class669, int i) {
	int i_5_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_5_, 1513744160);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_5_ >> 16];
	Class114.method2108(class247, class243, class669, (byte) 8);
    }
    
    static final void method10553(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_6_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_7_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class19.method798(i_6_, i_7_, true, (byte) -18);
    }
}
