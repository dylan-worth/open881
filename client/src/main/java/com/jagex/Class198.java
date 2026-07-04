/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class198
{
    static Class198 aClass198_2164;
    static Class198 aClass198_2165 = new Class198(2);
    static Class198 aClass198_2166;
    static Class198 aClass198_2167 = new Class198(3);
    static Class198 aClass198_2168;
    static Class198 aClass198_2169;
    int anInt2170;
    
    Class198(int i) {
	anInt2170 = i * -2029631893;
    }
    
    int method3824(byte i) {
	if (this == aClass198_2165)
	    return -1;
	return 0x1000000 | -641518013 * anInt2170;
    }
    
    static {
	aClass198_2166 = new Class198(1);
	aClass198_2164 = new Class198(0);
	aClass198_2168 = new Class198(4);
	aClass198_2169 = new Class198(5);
    }
    
    int method3825() {
	if (this == aClass198_2165)
	    return -1;
	return 0x1000000 | -641518013 * anInt2170;
    }
    
    int method3826() {
	if (this == aClass198_2165)
	    return -1;
	return 0x1000000 | -641518013 * anInt2170;
    }
    
    int method3827() {
	if (this == aClass198_2165)
	    return -1;
	return 0x1000000 | -641518013 * anInt2170;
    }
    
    static final void method3828(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (1 == -1866862435 * class247.anInt2496
	       ? 939166901 * class247.anInt2497 : -1);
    }
    
    static final void method3829(Class669 class669, int i) {
	Class658.method10912(Class641.method10603((byte) 55), class669,
			     (short) 16383);
    }
    
    static final void method3830(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -1;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -1;
    }
    
    static final void method3831(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (i_0_ == -1)
	    throw new RuntimeException("");
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = new StringBuilder().append(string).append((char) i_0_)
		  .toString();
    }
}
