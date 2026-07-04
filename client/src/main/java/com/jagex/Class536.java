/* Class536 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class536
{
    public Class536 aClass536_7163;
    public Class536 aClass536_7164;
    
    public void method8900(int i) {
	if (aClass536_7163 != null) {
	    aClass536_7163.aClass536_7164 = aClass536_7164;
	    aClass536_7164.aClass536_7163 = aClass536_7163;
	    aClass536_7164 = null;
	    aClass536_7163 = null;
	}
    }
    
    public void method8901() {
	if (aClass536_7163 != null) {
	    aClass536_7163.aClass536_7164 = aClass536_7164;
	    aClass536_7164.aClass536_7163 = aClass536_7163;
	    aClass536_7164 = null;
	    aClass536_7163 = null;
	}
    }
    
    public void method8902() {
	if (aClass536_7163 != null) {
	    aClass536_7163.aClass536_7164 = aClass536_7164;
	    aClass536_7164.aClass536_7163 = aClass536_7163;
	    aClass536_7164 = null;
	    aClass536_7163 = null;
	}
    }
    
    public void method8903() {
	if (aClass536_7163 != null) {
	    aClass536_7163.aClass536_7164 = aClass536_7164;
	    aClass536_7164.aClass536_7163 = aClass536_7163;
	    aClass536_7164 = null;
	    aClass536_7163 = null;
	}
    }
    
    public static int method8904(int i) {
	synchronized (Class631.aClass203_8220) {
	    int i_0_ = Class631.aClass203_8220.method3880(-1997324384);
	    return i_0_;
	}
    }
    
    public static int method8905(byte[] is, int i, CharSequence charsequence,
				 int i_1_) {
	int i_2_ = charsequence.length();
	int i_3_ = i;
	for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
	    int i_5_ = charsequence.charAt(i_4_);
	    if (i_5_ <= 127)
		is[i_3_++] = (byte) i_5_;
	    else if (i_5_ <= 2047) {
		is[i_3_++] = (byte) (0xc0 | i_5_ >> 6);
		is[i_3_++] = (byte) (0x80 | i_5_ & 0x3f);
	    } else {
		is[i_3_++] = (byte) (0xe0 | i_5_ >> 12);
		is[i_3_++] = (byte) (0x80 | i_5_ >> 6 & 0x3f);
		is[i_3_++] = (byte) (0x80 | i_5_ & 0x3f);
	    }
	}
	return i_3_ - i;
    }
    
    static final void method8906(Class669 class669, int i) {
	int i_6_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = RuntimeException_Sub4.aClass56_12127.method1218
		  (i_6_, -1581069180).method18359((short) 255);
    }
    
    static final void method8907(Class247 class247, Class243 class243,
				 Class669 class669, short i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	Class99.method1859(string, class669, 2015278084);
    }
    
    public static void method8908(int i, int i_7_, int i_8_) {
	Class534_Sub19 class534_sub19
	    = Class346.method6128(Class404.aClass404_4166,
				  client.aClass100_11264.aClass13_1183,
				  1341391005);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16507(i_7_, 614303827);
	class534_sub19.aClass534_Sub40_Sub1_10513.method16578(i, -1297824590);
	client.aClass100_11264.method1863(class534_sub19, (byte) 18);
    }
}
