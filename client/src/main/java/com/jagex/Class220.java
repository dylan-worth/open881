/* Class220 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class220 implements Interface28
{
    int anInt2308;
    Class213 this$0;
    int anInt2309;
    
    Class220(Class213 class213, Class534_Sub40 class534_sub40) {
	this$0 = class213;
	int i = class534_sub40.method16529((byte) 1);
	if (i != 65535) {
	    anInt2309 = i * -1034904937;
	    anInt2308 = class534_sub40.method16533(-258848859) * -1211180855;
	} else {
	    anInt2309 = 1034904937;
	    anInt2308 = 0;
	}
    }
    
    public void method173(Class214 class214, int i) {
	if (anInt2309 * 1524139303 != -1) {
	    try {
		class214.method4042(1185141419).method122
		    (((Class318)
		      this$0.anInterface27_2280.method166((byte) 0)
			  .method91(anInt2309 * 1524139303, 604344492)),
		     1902952825 * anInt2308, (byte) 120);
	    } catch (Exception_Sub6 exception_sub6) {
		/* empty */
	    }
	}
    }
    
    public void method172(Class214 class214) {
	if (anInt2309 * 1524139303 != -1) {
	    try {
		class214.method4042(1326325152).method122
		    (((Class318)
		      this$0.anInterface27_2280.method166((byte) 0)
			  .method91(anInt2309 * 1524139303, -1746852139)),
		     1902952825 * anInt2308, (byte) 53);
	    } catch (Exception_Sub6 exception_sub6) {
		/* empty */
	    }
	}
    }
    
    public void method174(Class214 class214) {
	if (anInt2309 * 1524139303 != -1) {
	    try {
		class214.method4042(2070436707).method122
		    (((Class318)
		      this$0.anInterface27_2280.method166((byte) 0)
			  .method91(anInt2309 * 1524139303, -454889978)),
		     1902952825 * anInt2308, (byte) 120);
	    } catch (Exception_Sub6 exception_sub6) {
		/* empty */
	    }
	}
    }
    
    static boolean method4145(Class534_Sub40_Sub1 class534_sub40_sub1, int i,
			      byte i_0_) {
	int i_1_ = class534_sub40_sub1.method18295(2, -761815447);
	if (i_1_ == 0) {
	    if (class534_sub40_sub1.method18295(1, -761815447) != 0)
		method4145(class534_sub40_sub1, i, (byte) -113);
	    int i_2_ = class534_sub40_sub1.method18295(6, -761815447);
	    int i_3_ = class534_sub40_sub1.method18295(6, -761815447);
	    boolean bool = class534_sub40_sub1.method18295(1, -761815447) == 1;
	    if (bool)
		Class108.anIntArray1327
		    [(Class108.anInt1326 += 375555833) * -1852482743 - 1]
		    = i;
	    if (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i] != null)
		throw new RuntimeException();
	    Class60 class60 = Class108.aClass60Array1320[i];
	    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		= (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279[i]
		   = (new Class654_Sub1_Sub5_Sub1_Sub2
		      (client.aClass512_11100.method8424((byte) 84))));
	    class654_sub1_sub5_sub1_sub2.anInt11922 = -2061161143 * i;
	    if (null != Class108.aClass534_Sub40Array1319[i])
		class654_sub1_sub5_sub1_sub2.method18865
		    (Class108.aClass534_Sub40Array1319[i], (byte) 53);
	    if (Class108.aClass534_Sub40Array1316[i] != null)
		class654_sub1_sub5_sub1_sub2.method18866
		    (Class108.aClass534_Sub40Array1316[i], (byte) 0);
	    class654_sub1_sub5_sub1_sub2
		.method18523(-23485487 * class60.anInt643, true, 538331630);
	    class654_sub1_sub5_sub1_sub2.anInt11944
		= -767670225 * class60.anInt644;
	    int i_4_ = 1272457665 * class60.anInt646;
	    int i_5_ = i_4_ >> 28;
	    int i_6_ = i_4_ >> 14 & 0xff;
	    int i_7_ = i_4_ & 0xff;
	    Class597 class597 = client.aClass512_11100.method8416((byte) 78);
	    int i_8_ = (i_6_ << 6) + i_2_ - class597.anInt7859 * -424199969;
	    int i_9_ = (i_7_ << 6) + i_3_ - -1166289421 * class597.anInt7861;
	    class654_sub1_sub5_sub1_sub2.aClass252_12232
		= class60.aClass252_645;
	    class654_sub1_sub5_sub1_sub2.aBool12234 = class60.aBool642;
	    class654_sub1_sub5_sub1_sub2.aByteArray11979[0]
		= Class108.aByteArray1325[i];
	    class654_sub1_sub5_sub1_sub2.aByte10854
		= class654_sub1_sub5_sub1_sub2.aByte10853 = (byte) i_5_;
	    if (client.aClass512_11100.method8552((byte) 0)
		    .method7612(i_8_, i_9_, (byte) 0))
		class654_sub1_sub5_sub1_sub2.aByte10853++;
	    class654_sub1_sub5_sub1_sub2.method18871(i_8_, i_9_, -1972012387);
	    Class108.aClass60Array1320[i] = null;
	    return true;
	}
	if (i_1_ == 1) {
	    int i_10_ = class534_sub40_sub1.method18295(2, -761815447);
	    int i_11_ = Class108.aClass60Array1320[i].anInt646 * 1272457665;
	    Class108.aClass60Array1320[i].anInt646
		= ((((i_11_ >> 28) + i_10_ & 0x3) << 28)
		   + (i_11_ & 0xfffffff)) * 186312257;
	    return false;
	}
	if (i_1_ == 2) {
	    int i_12_ = class534_sub40_sub1.method18295(5, -761815447);
	    int i_13_ = i_12_ >> 3 & 0x3;
	    int i_14_ = i_12_ & 0x7;
	    int i_15_ = Class108.aClass60Array1320[i].anInt646 * 1272457665;
	    if (!Class108.$assertionsDisabled
		&& (Class108.aByteArray1325[i] < 0
		    || Class108.aByteArray1325[i] > 3))
		throw new AssertionError();
	    int i_16_ = i_13_ + (i_15_ >> 28) & 0x3;
	    int i_17_ = i_15_ >> 14 & 0xff;
	    int i_18_ = i_15_ & 0xff;
	    if (0 == i_14_) {
		i_17_--;
		i_18_--;
	    }
	    if (1 == i_14_)
		i_18_--;
	    if (2 == i_14_) {
		i_17_++;
		i_18_--;
	    }
	    if (i_14_ == 3)
		i_17_--;
	    if (4 == i_14_)
		i_17_++;
	    if (5 == i_14_) {
		i_17_--;
		i_18_++;
	    }
	    if (6 == i_14_)
		i_18_++;
	    if (i_14_ == 7) {
		i_17_++;
		i_18_++;
	    }
	    Class448.method7319(Class676.method11130((byte) -5),
				Class108.aByteArray1325[i], 2088438307);
	    Class108.aClass60Array1320[i].anInt646
		= ((i_17_ << 14) + (i_16_ << 28) + i_18_) * 186312257;
	    return false;
	}
	int i_19_ = class534_sub40_sub1.method18295(20, -761815447);
	int i_20_ = i_19_ >> 18 & 0x3;
	int i_21_ = i_19_ >> 16 & 0x3;
	int i_22_ = i_19_ >> 8 & 0xff;
	int i_23_ = i_19_ & 0xff;
	int i_24_ = 1272457665 * Class108.aClass60Array1320[i].anInt646;
	Class108.aByteArray1325[i] = (byte) (i_20_ - 1);
	if (!Class108.$assertionsDisabled
	    && (Class108.aByteArray1325[i] < 0
		|| Class108.aByteArray1325[i] > 3))
	    throw new AssertionError();
	int i_25_ = i_21_ + (i_24_ >> 28) & 0x3;
	int i_26_ = (i_24_ >> 14) + i_22_ & 0xff;
	int i_27_ = i_24_ + i_23_ & 0xff;
	Class448.method7319(Class676.method11130((byte) -35), i_20_ - 1,
			    2088438307);
	Class108.aClass60Array1320[i].anInt646
	    = 186312257 * (i_27_ + ((i_26_ << 14) + (i_25_ << 28)));
	return false;
    }
    
    static void method4146(int i) {
	synchronized (Class49.aClass203_364) {
	    Class49.aClass203_364.method3884((byte) -121);
	}
    }
    
    static final void method4147(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10758
		  .method17035((byte) 2);
    }
}
