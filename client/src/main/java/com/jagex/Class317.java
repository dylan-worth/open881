/* Class317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.io.InputStream;

public class Class317
{
    int anInt3382;
    static final int anInt3383 = 11;
    static final int anInt3384 = -16777216;
    static final int anInt3385 = 5;
    static final int anInt3386 = 2048;
    int anInt3387;
    InputStream anInputStream3388;
    static Class472 aClass472_3389;
    
    public final void method5726(InputStream inputstream, int i) {
	anInputStream3388 = inputstream;
    }
    
    public final int method5727(int i, int i_0_) throws IOException {
	int i_1_ = 0;
	for (int i_2_ = i; 0 != i_2_; i_2_--) {
	    anInt3382 = (1909631899 * anInt3382 >>> 1) * -810237293;
	    int i_3_ = -11123325 * anInt3387 - 1909631899 * anInt3382 >>> 31;
	    anInt3387 -= (anInt3382 * 1909631899 & i_3_ - 1) * 1812394283;
	    i_1_ = i_1_ << 1 | 1 - i_3_;
	    if ((1909631899 * anInt3382 & ~0xffffff) == 0) {
		anInt3387 = (anInt3387 * -11123325 << 8
			     | anInputStream3388.read()) * 1812394283;
		anInt3382 = -810237293 * (1909631899 * anInt3382 << 8);
	    }
	}
	return i_1_;
    }
    
    public final void method5728(int i) {
	anInputStream3388 = null;
    }
    
    public final void method5729(byte i) throws IOException {
	anInt3387 = 0;
	anInt3382 = 810237293;
	for (int i_4_ = 0; i_4_ < 5; i_4_++)
	    anInt3387 = (anInt3387 * -11123325 << 8
			 | anInputStream3388.read()) * 1812394283;
    }
    
    public final void method5730() {
	anInputStream3388 = null;
    }
    
    public final void method5731(InputStream inputstream) {
	anInputStream3388 = inputstream;
    }
    
    public final void method5732(InputStream inputstream) {
	anInputStream3388 = inputstream;
    }
    
    public final void method5733() throws IOException {
	anInt3387 = 0;
	anInt3382 = 810237293;
	for (int i = 0; i < 5; i++)
	    anInt3387 = (anInt3387 * -11123325 << 8
			 | anInputStream3388.read()) * 1812394283;
    }
    
    public final int method5734(int i) throws IOException {
	int i_5_ = 0;
	for (int i_6_ = i; 0 != i_6_; i_6_--) {
	    anInt3382 = (1909631899 * anInt3382 >>> 1) * -810237293;
	    int i_7_ = -11123325 * anInt3387 - 1909631899 * anInt3382 >>> 31;
	    anInt3387 -= (anInt3382 * 1909631899 & i_7_ - 1) * 1812394283;
	    i_5_ = i_5_ << 1 | 1 - i_7_;
	    if ((1909631899 * anInt3382 & ~0xffffff) == 0) {
		anInt3387 = (anInt3387 * -11123325 << 8
			     | anInputStream3388.read()) * 1812394283;
		anInt3382 = -810237293 * (1909631899 * anInt3382 << 8);
	    }
	}
	return i_5_;
    }
    
    public final void method5735() throws IOException {
	anInt3387 = 0;
	anInt3382 = 810237293;
	for (int i = 0; i < 5; i++)
	    anInt3387 = (anInt3387 * -11123325 << 8
			 | anInputStream3388.read()) * 1812394283;
    }
    
    public static void method5736(short[] is) {
	for (int i = 0; i < is.length; i++)
	    is[i] = (short) 1024;
    }
    
    public final int method5737(int i) throws IOException {
	int i_8_ = 0;
	for (int i_9_ = i; 0 != i_9_; i_9_--) {
	    anInt3382 = (1909631899 * anInt3382 >>> 1) * -810237293;
	    int i_10_ = -11123325 * anInt3387 - 1909631899 * anInt3382 >>> 31;
	    anInt3387 -= (anInt3382 * 1909631899 & i_10_ - 1) * 1812394283;
	    i_8_ = i_8_ << 1 | 1 - i_10_;
	    if ((1909631899 * anInt3382 & ~0xffffff) == 0) {
		anInt3387 = (anInt3387 * -11123325 << 8
			     | anInputStream3388.read()) * 1812394283;
		anInt3382 = -810237293 * (1909631899 * anInt3382 << 8);
	    }
	}
	return i_8_;
    }
    
    public int method5738(short[] is, int i) throws IOException {
	int i_11_ = is[i];
	int i_12_ = i_11_ * (anInt3382 * 1909631899 >>> 11);
	if ((-11123325 * anInt3387 ^ ~0x7fffffff) < (i_12_ ^ ~0x7fffffff)) {
	    anInt3382 = i_12_ * -810237293;
	    is[i] = (short) (i_11_ + (2048 - i_11_ >>> 5));
	    if (0 == (1909631899 * anInt3382 & ~0xffffff)) {
		anInt3387 = (-11123325 * anInt3387 << 8
			     | anInputStream3388.read()) * 1812394283;
		anInt3382 = (1909631899 * anInt3382 << 8) * -810237293;
	    }
	    return 0;
	}
	anInt3382 -= -810237293 * i_12_;
	anInt3387 -= i_12_ * 1812394283;
	is[i] = (short) (i_11_ - (i_11_ >>> 5));
	if ((1909631899 * anInt3382 & ~0xffffff) == 0) {
	    anInt3387 = (anInt3387 * -11123325 << 8
			 | anInputStream3388.read()) * 1812394283;
	    anInt3382 = -810237293 * (anInt3382 * 1909631899 << 8);
	}
	return 1;
    }
    
    public int method5739(short[] is, int i) throws IOException {
	int i_13_ = is[i];
	int i_14_ = i_13_ * (anInt3382 * 1909631899 >>> 11);
	if ((-11123325 * anInt3387 ^ ~0x7fffffff) < (i_14_ ^ ~0x7fffffff)) {
	    anInt3382 = i_14_ * -810237293;
	    is[i] = (short) (i_13_ + (2048 - i_13_ >>> 5));
	    if (0 == (1909631899 * anInt3382 & ~0xffffff)) {
		anInt3387 = (-11123325 * anInt3387 << 8
			     | anInputStream3388.read()) * 1812394283;
		anInt3382 = (1909631899 * anInt3382 << 8) * -810237293;
	    }
	    return 0;
	}
	anInt3382 -= -810237293 * i_14_;
	anInt3387 -= i_14_ * 1812394283;
	is[i] = (short) (i_13_ - (i_13_ >>> 5));
	if ((1909631899 * anInt3382 & ~0xffffff) == 0) {
	    anInt3387 = (anInt3387 * -11123325 << 8
			 | anInputStream3388.read()) * 1812394283;
	    anInt3382 = -810237293 * (anInt3382 * 1909631899 << 8);
	}
	return 1;
    }
    
    public int method5740(short[] is, int i, int i_15_) throws IOException {
	int i_16_ = is[i];
	int i_17_ = i_16_ * (anInt3382 * 1909631899 >>> 11);
	if ((-11123325 * anInt3387 ^ ~0x7fffffff) < (i_17_ ^ ~0x7fffffff)) {
	    anInt3382 = i_17_ * -810237293;
	    is[i] = (short) (i_16_ + (2048 - i_16_ >>> 5));
	    if (0 == (1909631899 * anInt3382 & ~0xffffff)) {
		anInt3387 = (-11123325 * anInt3387 << 8
			     | anInputStream3388.read()) * 1812394283;
		anInt3382 = (1909631899 * anInt3382 << 8) * -810237293;
	    }
	    return 0;
	}
	anInt3382 -= -810237293 * i_17_;
	anInt3387 -= i_17_ * 1812394283;
	is[i] = (short) (i_16_ - (i_16_ >>> 5));
	if ((1909631899 * anInt3382 & ~0xffffff) == 0) {
	    anInt3387 = (anInt3387 * -11123325 << 8
			 | anInputStream3388.read()) * 1812394283;
	    anInt3382 = -810237293 * (anInt3382 * 1909631899 << 8);
	}
	return 1;
    }
    
    public static void method5741(short[] is) {
	for (int i = 0; i < is.length; i++)
	    is[i] = (short) 1024;
    }
    
    public static void method5742(short[] is) {
	for (int i = 0; i < is.length; i++)
	    is[i] = (short) 1024;
    }
    
    static final void method5743(Class669 class669, int i) {
	if (-1850530127 * client.anInt11039 == 13) {
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4170,
				      client.aClass100_11094.aClass13_1183,
				      1341391005);
	    client.aClass100_11094.method1863(class534_sub19, (byte) 33);
	}
    }
    
    public static int method5744(byte[] is, int i, int i_18_) {
	return Class60.method1258(is, 0, i, -1094127016);
    }
    
    static final void method5745(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	if (class669.anIntArray8595[2088438307 * class669.anInt8600]
	    >= class669.anIntArray8595[2088438307 * class669.anInt8600 + 1])
	    class669.anInt8613
		+= (class669.anIntArray8591[662605117 * class669.anInt8613]
		    * -793595371);
    }
}
