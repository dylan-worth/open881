/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.ArrayList;
import java.util.List;

public class Class219
{
    List aList2304 = new ArrayList();
    static final int anInt2305 = 5;
    public static Class44_Sub19 aClass44_Sub19_2306;
    public static Class171 aClass171_2307;
    
    public int method4119(int i) {
	return aList2304.size();
    }
    
    public Class235 method4120(int i, byte i_0_) {
	return (Class235) aList2304.get(i);
    }
    
    public int method4121(int i) {
	for (int i_1_ = 0; i_1_ < aList2304.size(); i_1_++) {
	    if (((Class235) aList2304.get(i_1_)).anInt2364 * 279279007 == i)
		return i_1_;
	}
	return -1;
    }
    
    public int method4122(Class235 class235, int i) {
	return method4123(class235, -1, (byte) -59);
    }
    
    public int method4123(Class235 class235, int i, byte i_2_) {
	if (aList2304.size() == 5)
	    throw new RuntimeException("");
	if (method4134(279279007 * class235.anInt2364, (byte) -86) != -1)
	    throw new RuntimeException("");
	if (i == -1)
	    i = aList2304.size();
	aList2304.add(i, class235);
	return i;
    }
    
    public void method4124(int i, int i_3_) {
	aList2304.remove(i);
    }
    
    public void method4125(int i) {
	aList2304.clear();
    }
    
    public int method4126() {
	return aList2304.size();
    }
    
    public int method4127() {
	return aList2304.size();
    }
    
    public int method4128(Class235 class235, int i) {
	if (aList2304.size() == 5)
	    throw new RuntimeException("");
	if (method4134(279279007 * class235.anInt2364, (byte) -83) != -1)
	    throw new RuntimeException("");
	if (i == -1)
	    i = aList2304.size();
	aList2304.add(i, class235);
	return i;
    }
    
    public int method4129() {
	return aList2304.size();
    }
    
    public Class235 method4130(int i) {
	return (Class235) aList2304.get(i);
    }
    
    public int method4131(Class235 class235) {
	return method4123(class235, -1, (byte) -4);
    }
    
    public int method4132(Class235 class235) {
	return method4123(class235, -1, (byte) 44);
    }
    
    public int method4133(Class235 class235) {
	return method4123(class235, -1, (byte) 55);
    }
    
    public int method4134(int i, byte i_4_) {
	for (int i_5_ = 0; i_5_ < aList2304.size(); i_5_++) {
	    if (((Class235) aList2304.get(i_5_)).anInt2364 * 279279007 == i)
		return i_5_;
	}
	return -1;
    }
    
    public void method4135() {
	aList2304.clear();
    }
    
    public void method4136() {
	aList2304.clear();
    }
    
    public void method4137(int i) {
	aList2304.remove(i);
    }
    
    static void method4138(Class669 class669, byte i) {
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = ((Class273)
	       Class223.aClass53_Sub2_2316.method91((class669.anIntArray8595
						     [((class669.anInt8600
							-= 308999563)
						       * 2088438307)]),
						    -849423118)).aString3014;
    }
    
    static final void method4139(Class669 class669, int i) {
	Class274.method5143((byte) 0);
    }
    
    static final void method4140(Class669 class669, int i) {
	Class352.method6257(-817749047);
	Class177.method2934((short) 18199);
	client.aClass512_11100.method8441(623745507);
	Class672.method11096((byte) 1);
	client.aBool11048 = false;
    }
    
    static final void method4141(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	int i_6_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class90 class90 = (Class90) Class534_Sub11_Sub13
					.aClass44_Sub22_11730
					.method91(i_6_, -1279628051);
	if (class90.method1718(-594238469))
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= class247.method4526(i_6_, class90.aString889, (byte) -11);
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class247.method4547(i_6_, 263946597 * class90.anInt888,
				      -1604371462);
    }
    
    public static final int method4142(int i, int i_7_, int i_8_, int i_9_,
				       int i_10_, byte i_11_) {
	if (client.aClass512_11100.method8424((byte) 73) == null)
	    return 0;
	if (i_10_ < 3) {
	    Class468 class468 = client.aClass512_11100.method8552((byte) 0);
	    int i_12_ = i >> 9;
	    int i_13_ = i_7_ >> 9;
	    if (i_8_ < 0 || i_9_ < 0
		|| i_8_ > client.aClass512_11100.method8417(159463392) - 1
		|| i_9_ > client.aClass512_11100.method8418(-1533611049) - 1)
		return 0;
	    if (i_12_ < 1 || i_13_ < 1
		|| i_12_ > client.aClass512_11100.method8417(1773888159) - 1
		|| i_13_ > client.aClass512_11100.method8418(-1533611049) - 1)
		return 0;
	    boolean bool
		= ((class468.aByteArrayArrayArray5145[1][i >> 9][i_7_ >> 9]
		    & 0x2)
		   != 0);
	    if ((i & 0x1ff) == 0) {
		boolean bool_14_ = 0 != ((class468.aByteArrayArrayArray5145[1]
					  [i_12_ - 1][i_7_ >> 9])
					 & 0x2);
		boolean bool_15_
		    = ((class468.aByteArrayArrayArray5145[1][i_12_][i_7_ >> 9]
			& 0x2)
		       != 0);
		if (bool_15_ != bool_14_)
		    bool = 0 != ((class468.aByteArrayArrayArray5145[1][i_8_]
				  [i_9_])
				 & 0x2);
	    }
	    if ((i_7_ & 0x1ff) == 0) {
		boolean bool_16_
		    = ((class468.aByteArrayArrayArray5145[1][i >> 9][i_13_ - 1]
			& 0x2)
		       != 0);
		boolean bool_17_
		    = 0 != (class468.aByteArrayArrayArray5145[1][i >> 9][i_13_]
			    & 0x2);
		if (bool_16_ != bool_17_)
		    bool = 0 != ((class468.aByteArrayArrayArray5145[1][i_8_]
				  [i_9_])
				 & 0x2);
	    }
	    if (bool)
		i_10_++;
	}
	return client.aClass512_11100.method8424((byte) 103)
		   .aClass151Array7432[i_10_].method2498(i, i_7_, 1595082668);
    }
    
    public static void method4143(int i, int i_18_) {
	Class250.aBoolArray2652[i] = false;
	Class682.method13914(i, -1840947607);
    }
    
    static final void method4144(Class669 class669, int i) {
	int i_19_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_19_, 1598393613);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_19_ >> 16];
	Class29.method877(class247, class243, class669, (byte) 46);
    }
}
