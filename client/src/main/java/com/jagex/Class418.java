/* Class418 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class418
{
    public static final int anInt4686 = 15;
    public static final int anInt4687 = 32768;
    public static final int anInt4688 = 15;
    
    Class418() throws Throwable {
	throw new Error();
    }
    
    static final void method6758(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class669.aClass352_8602.aByteArray3627[i_0_];
    }
    
    static void method6759(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			   int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
			   int i_10_, int i_11_, int i_12_, int i_13_,
			   boolean bool, int i_14_, short i_15_) {
	if (0 != i_1_ && i_3_ != -1) {
	    Class654_Sub1_Sub5_Sub1 class654_sub1_sub5_sub1 = null;
	    if (i_1_ < 0) {
		int i_16_ = -i_1_ - 1;
		if (i_16_ == client.anInt11037 * -643758853)
		    class654_sub1_sub5_sub1
			= Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419;
		else
		    class654_sub1_sub5_sub1
			= (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			   [i_16_]);
	    } else {
		int i_17_ = i_1_ - 1;
		Class534_Sub6 class534_sub6
		    = ((Class534_Sub6)
		       client.aClass9_11331.method579((long) i_17_));
		if (null != class534_sub6)
		    class654_sub1_sub5_sub1 = ((Class654_Sub1_Sub5_Sub1)
					       class534_sub6.anObject10417);
	    }
	    if (class654_sub1_sub5_sub1 != null) {
		Class570 class570
		    = class654_sub1_sub5_sub1.method18531((byte) -44);
		if (null != class570.anIntArrayArray7648
		    && class570.anIntArrayArray7648[i_3_] != null)
		    i_4_ -= class570.anIntArrayArray7648[i_3_][1];
		if (null != class570.anIntArrayArray7649
		    && null != class570.anIntArrayArray7649[i_3_])
		    i_4_ -= class570.anIntArrayArray7649[i_3_][1];
	    }
	}
	Class654_Sub1_Sub5_Sub6 class654_sub1_sub5_sub6
	    = new Class654_Sub1_Sub5_Sub6(client.aClass512_11100
					      .method8424((byte) 10),
					  i, Class412.anInt4643 * -1729998935,
					  -1729998935 * Class412.anInt4643,
					  i_6_, i_7_, i_4_,
					  i_10_ + client.anInt11101,
					  i_11_ + client.anInt11101, i_12_,
					  i_13_, i_1_, i_2_, i_5_, bool, i_3_,
					  i_14_);
	class654_sub1_sub5_sub6.method18799
	    (i_8_, i_9_,
	     Class247.method4595(i_8_, i_9_, -1729998935 * Class412.anInt4643,
				 -1249601410) - i_5_,
	     client.anInt11101 + i_10_, 16711935);
	client.aClass700_11210.method14131
	    (new Class534_Sub18_Sub4(class654_sub1_sub5_sub6), (short) 789);
    }
    
    static void method6760(int i, int i_18_, int i_19_, int i_20_,
			   byte i_21_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(10, (long) i);
	class534_sub18_sub6.method18121(153187325);
	class534_sub18_sub6.anInt11666 = i_18_ * 517206857;
	class534_sub18_sub6.anInt11660 = i_19_ * -1621355885;
	class534_sub18_sub6.anInt11661 = -105177451 * i_20_;
    }
    
    static boolean method6761(int i) {
	return Class677.method11142(Class700.aClass638_8806.aClass603_8310,
				    929040617);
    }
}
