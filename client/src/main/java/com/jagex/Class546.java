/* Class546 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.net.Socket;

public abstract class Class546
{
    public abstract int method8968(byte[] is, int i, int i_0_)
	throws IOException;
    
    public abstract int method8969(byte[] is, int i, int i_1_, byte i_2_)
	throws IOException;
    
    public abstract int method8970(int i) throws IOException;
    
    Class546() {
	/* empty */
    }
    
    public abstract void method8971(byte[] is, int i, int i_3_, int i_4_)
	throws IOException;
    
    public abstract void method8972();
    
    public abstract void method8973(byte i);
    
    public abstract void method8974();
    
    public abstract void method8975(int i);
    
    public abstract int method8976(byte[] is, int i, int i_5_)
	throws IOException;
    
    public abstract boolean method8977(int i, byte i_6_) throws IOException;
    
    public abstract void method8978(byte[] is, int i, int i_7_)
	throws IOException;
    
    public abstract void method8979();
    
    public abstract void method8980();
    
    public abstract void method8981();
    
    public abstract void method8982();
    
    public abstract void method8983();
    
    public abstract int method8984(byte[] is, int i, int i_8_)
	throws IOException;
    
    public abstract boolean method8985(int i) throws IOException;
    
    public static Class546 method8986(Socket socket, int i)
	throws IOException {
	return new Class546_Sub1(socket, i);
    }
    
    public static Class546 method8987(Socket socket, int i)
	throws IOException {
	return new Class546_Sub1(socket, i);
    }
    
    public abstract int method8988() throws IOException;
    
    static final int[] method8989(String string, Class669 class669, int i) {
	int[] is = null;
	if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
	    int i_9_ = (class669.anIntArray8595
			[(class669.anInt8600 -= 308999563) * 2088438307]);
	    if (i_9_ > 0) {
		is = new int[i_9_];
		while (i_9_-- > 0)
		    is[i_9_]
			= (class669.anIntArray8595
			   [(class669.anInt8600 -= 308999563) * 2088438307]);
	    }
	}
	return is;
    }
    
    static final void method8990(Class669 class669, int i) {
	Class44_Sub6.aClass534_Sub35_10989.method16438
	    (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub24_10756,
	     (class669.anIntArray8595
	      [(class669.anInt8600 -= 308999563) * 2088438307]),
	     960583359);
	Class672.method11096((byte) 1);
	client.aBool11048 = false;
    }
    
    static final void method8991(Class185 class185, int i, int i_10_,
				 int i_11_, int i_12_, int i_13_) {
	class185.method3373(i, i_10_, i_11_ + i, i_12_ + i_10_);
	class185.method3292(i, i_10_, i_11_, i_12_, -16777216, -2058421719);
	if (Class554_Sub1.anInt10671 * -1857977261 >= 100) {
	    float f = ((float) Class554_Sub1.anInt7371
		       / (float) Class554_Sub1.anInt7370);
	    int i_14_ = i_11_;
	    int i_15_ = i_12_;
	    if (f < 1.0F)
		i_15_ = (int) (f * (float) i_11_);
	    else
		i_14_ = (int) ((float) i_12_ / f);
	    i += (i_11_ - i_14_) / 2;
	    i_10_ += (i_12_ - i_15_) / 2;
	    if (Class204.aClass163_2205 == null
		|| Class204.aClass163_2205.method2647() != i_14_
		|| Class204.aClass163_2205.method2649() != i_15_) {
		Class554_Sub1.aClass203_7375 = Class554_Sub1.aClass203_7393;
		Class554_Sub1.method9124(Class554_Sub1.anInt7368,
					 (Class554_Sub1.anInt7369
					  + Class554_Sub1.anInt7371),
					 (Class554_Sub1.anInt7370
					  + Class554_Sub1.anInt7368),
					 Class554_Sub1.anInt7369, i, i_10_,
					 i_14_ + i, i_15_ + i_10_);
		Class554_Sub1.method9179(class185, false, false,
					 client.aBool11157, true);
		class185.method3581();
		Class204.aClass163_2205
		    = class185.method3319(i, i_10_, i_14_, i_15_, true);
	    }
	    Class204.aClass163_2205.method2656(i, i_10_);
	    int i_16_ = (Class550.anInt7307 * -87431073 * i_14_
			 / Class554_Sub1.anInt7370);
	    int i_17_ = (114918783 * Class567.anInt7595 * i_15_
			 / Class554_Sub1.anInt7371);
	    int i_18_ = i + (i_14_ * (Class662.anInt8553 * 313632999)
			     / Class554_Sub1.anInt7370);
	    int i_19_
		= i_15_ + i_10_ - (i_15_ * (-1356415839 * Class347.anInt3590)
				   / Class554_Sub1.anInt7371) - i_17_;
	    int i_20_ = -1996554240;
	    if (client.aClass675_11016 == Class675.aClass675_8635)
		i_20_ = -1996488705;
	    class185.method3298(i_18_, i_19_, i_16_, i_17_, i_20_, 1);
	    class185.method3297(i_18_, i_19_, i_16_, i_17_, i_20_, 0);
	    for (Class534_Sub29 class534_sub29
		     = ((Class534_Sub29)
			Class554_Sub1.aClass700_7413.method14135((byte) -1));
		 class534_sub29 != null;
		 class534_sub29
		     = (Class534_Sub29) Class554_Sub1.aClass700_7413
					    .method14139(1789999459)) {
		Class272 class272
		    = (Class272) (Class554_Sub1.aClass44_Sub9_7349.method91
				  (class534_sub29.anInt10652 * 1592054281,
				   -1303537818));
		if (Class231.method4211(class272, -1488345619)) {
		    Class25 class25
			= ((Class25)
			   (Class554_Sub1.aHashMap10682.get
			    (Integer.valueOf(1592054281
					     * class534_sub29.anInt10652))));
		    if (class25 == null)
			class25
			    = (Class25) (Class554_Sub1.aHashMap10681.get
					 (Integer.valueOf(class272.anInt2977
							  * -15128681)));
		    if (null != class25) {
			int i_21_;
			if (class25.anInt231 * -959968621
			    > 2135626771 * Class554_Sub1.anInt10691 / 2)
			    i_21_
				= ((Class554_Sub1.anInt10691 * -876019987
				    - 21137517 * class25.anInt231)
				   / (Class554_Sub1.anInt10691 * 2135626771));
			else
			    i_21_
				= (21137517 * class25.anInt231
				   / (2135626771 * Class554_Sub1.anInt10691));
			int i_22_
			    = i + (i_14_
				   * (class534_sub29.anInt10655 * 1412374331)
				   / Class554_Sub1.anInt7370);
			int i_23_
			    = ((i_15_
				* (Class554_Sub1.anInt7371
				   - -958626707 * class534_sub29.anInt10653)
				/ Class554_Sub1.anInt7371)
			       + i_10_);
			class185.method3292(i_22_ - 2, i_23_ - 2, 4, 4,
					    i_21_ << 24 | 0xffff00,
					    -1909446612);
		    }
		}
	    }
	    Class554_Sub1.aClass203_7393.method3876(5, (byte) 0);
	}
    }
    
    static final void method8992(Class669 class669, int i) {
	int i_24_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (!Class254.aClass185_2683.method3534())
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 3;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub19_10741
		      .method14026(i_24_, -2024064741);
    }
    
    static final void method8993(Class669 class669, int i) {
	Class606_Sub1 class606_sub1 = Class498.method8261(-878774185);
	if (class606_sub1 != null) {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class606_sub1.anInt10861 * 539448607;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class606_sub1.anInt7985 * -1395637313;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= class606_sub1.aString10858;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class606_sub1.method16908((byte) 102);
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= class606_sub1.method16906(-413701170);
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 2098404975 * class606_sub1.anInt7981;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -663639827 * class606_sub1.anInt10856;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= class606_sub1.aString10857;
	} else {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	}
    }
}
