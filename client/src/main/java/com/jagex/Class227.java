/* Class227 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class227 implements Interface28
{
    Class213 this$0;
    int anInt2319;
    
    public void method172(Class214 class214) {
	class214.method4025(-1774629367 * anInt2319, 1474643013);
	class214.method4044(-1774629367 * anInt2319, 1481307617);
    }
    
    Class227(Class213 class213, Class534_Sub40 class534_sub40) {
	this$0 = class213;
	anInt2319 = class534_sub40.method16529((byte) 1) * -155672519;
    }
    
    public void method174(Class214 class214) {
	class214.method4025(-1774629367 * anInt2319, 1319343498);
	class214.method4044(-1774629367 * anInt2319, 1481307617);
    }
    
    public void method173(Class214 class214, int i) {
	class214.method4025(-1774629367 * anInt2319, 1819512792);
	class214.method4044(-1774629367 * anInt2319, 1481307617);
    }
    
    static final void method4179(Class669 class669, int i)
	throws Exception_Sub2 {
	class669.anInt8600 -= 1235998252;
	int i_0_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_1_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	int i_2_
	    = class669.anIntArray8595[2 + class669.anInt8600 * 2088438307];
	Class438 class438
	    = Class438.method6996((float) i_0_, (float) i_1_, (float) i_2_);
	Class599.aClass298_Sub1_7871.method5364(class438, 1296172486);
	class438.method7074();
    }
    
    static final void method4180(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class65.anInt677 * -701003095;
    }
    
    static final void method4181
	(Class669 class669, Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1,
	 byte i) {
	class669.anInt8600 -= -2131970355;
	int i_3_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_4_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	int i_5_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2];
	int i_6_
	    = class669.anIntArray8595[3 + class669.anInt8600 * 2088438307];
	int i_7_
	    = class669.anIntArray8595[4 + class669.anInt8600 * 2088438307];
	boolean bool = 1 == (class669.anIntArray8595
			     [class669.anInt8600 * 2088438307 + 5]);
	int i_8_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 6];
	if (Class599.aClass298_Sub1_7871.method5388((byte) 27)
	    != Class305.aClass305_3265)
	    throw new RuntimeException();
	Class347_Sub1 class347_sub1
	    = ((Class347_Sub1)
	       Class599.aClass298_Sub1_7871.method5380((byte) -90));
	Class443 class443 = new Class443();
	Class443 class443_9_ = new Class443();
	class443.method7147(0.0F, 1.0F, 0.0F,
			    (float) (3.141592653589793 * (double) i_7_ * 2.0
				     / 16384.0));
	Class438 class438 = new Class438(1.0F, 0.0F, 0.0F);
	class438.method7021(class443);
	class438.method7088();
	class443_9_.method7146(class438,
			       (float) (2.0
					* (3.141592653589793 * (double) i_6_)
					/ 16384.0));
	class443.method7158(class443_9_);
	Class597 class597 = client.aClass512_11100.method8416((byte) 115);
	int i_10_ = -424199969 * class597.anInt7859 << 9;
	int i_11_ = -1166289421 * class597.anInt7861 << 9;
	if (null != class654_sub1_sub5_sub1)
	    class347_sub1.method15753(class654_sub1_sub5_sub1,
				      new Class438((float) i_3_, (float) i_4_,
						   (float) i_5_),
				      class443, bool, i_8_,
				      (client.aClass512_11100.method8493
				       (1257727054).anIntArrayArrayArray4995),
				      client.aClass512_11100
					  .method8552((byte) 0),
				      i_10_, i_11_, -1082899460);
	client.aBool11147 = true;
    }
    
    public static Interface70 method4182(Class472 class472, int i,
					 Interface69 interface69, boolean bool,
					 Class203 class203, int i_12_) {
	if (Class639.aClass367_8316 != null) {
	    if (bool)
		return new Class600(class472, i, Class639.aClass367_8316,
				    interface69);
	    return new Class614(class472, i, Class639.aClass367_8316,
				interface69, class203);
	}
	return null;
    }
    
    static void method4183(byte i) {
	/* empty */
    }
    
    static Class534_Sub18_Sub6 method4184(int i) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = ((Class534_Sub18_Sub6)
	       Class534_Sub18_Sub6.aClass696_11659.method14078(1221951837));
	if (null != class534_sub18_sub6) {
	    class534_sub18_sub6.method8892((byte) 1);
	    class534_sub18_sub6.method16180(-421776830);
	    return class534_sub18_sub6;
	}
	for (;;) {
	    class534_sub18_sub6
		= (Class534_Sub18_Sub6) Class534_Sub18_Sub6.aClass696_11669
					    .method14078(1221951837);
	    if (class534_sub18_sub6 == null)
		return null;
	    if (class534_sub18_sub6.method18159(-134804279)
		> Class250.method4604((byte) -9))
		return null;
	    class534_sub18_sub6.method8892((byte) 1);
	    class534_sub18_sub6.method16180(-421776830);
	    if (0L != (class534_sub18_sub6.aLong10509 * -753566336061658369L
		       & ~0x7fffffffffffffffL))
		return class534_sub18_sub6;
	}
    }
    
    public static void method4185(Iterable iterable,
				  Class534_Sub40 class534_sub40, byte i) {
	int i_13_ = Class311.method5668(iterable, (byte) -113);
	class534_sub40.method16542(i_13_, -512461177);
	if (i_13_ != 0) {
	    for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
		class534_sub40.aByteArray10810
		    [i_14_ + class534_sub40.anInt10811 * 31645619]
		    = (byte) 0;
	    Iterator iterator = iterable.iterator();
	    while (iterator.hasNext()) {
		Interface76 interface76 = (Interface76) iterator.next();
		int i_15_ = interface76.method93();
		int i_16_ = i_15_ / 8;
		class534_sub40.aByteArray10810
		    [class534_sub40.anInt10811 * 31645619 + i_16_]
		    |= 1 << (i_15_ & 0x7);
	    }
	    class534_sub40.anInt10811 += -1387468933 * i_13_;
	}
    }
    
    static final void method4186(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class200_Sub16.method15615((byte) -119);
    }
    
    static final void method4187(Class669 class669, int i) {
	int i_17_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class272 class272
	    = ((Class272)
	       Class222.aClass44_Sub9_2313.method91(i_17_, -640916445));
	if (class272.aString2969 == null)
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	else
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= class272.aString2969;
    }
}
