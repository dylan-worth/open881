/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public class Class212
{
    static final int anInt2261 = 2;
    Class8 aClass8_2262;
    long aLong2263;
    Class626[] aClass626Array2264;
    Class260 aClass260_2265;
    Class8 aClass8_2266;
    String aString2267;
    int anInt2268;
    boolean aBool2269;
    boolean aBool2270;
    int anInt2271;
    int anInt2272;
    static final int anInt2273 = 1;
    public static long aLong2274;
    
    public Class260 method3960() {
	return aClass260_2265;
    }
    
    public boolean method3961(short i) {
	return aBool2269;
    }
    
    public int method3962(byte i) {
	return -1696518197 * anInt2271;
    }
    
    void method3963(int i, int i_0_) {
	anInt2271 = 1768291811 * i;
    }
    
    public int method3964(int i) {
	return anInt2268 * 288706099;
    }
    
    void method3965(int i, int i_1_) {
	anInt2268 = -19505925 * i;
    }
    
    public int method3966() {
	return -1696518197 * anInt2271;
    }
    
    public int method3967() {
	return anInt2272 * 65224079;
    }
    
    public Class260 method3968(int i) {
	return aClass260_2265;
    }
    
    void method3969(int i) {
	anInt2271 = 1768291811 * i;
    }
    
    public int method3970(byte i) {
	return anInt2272 * 65224079;
    }
    
    void method3971(int i, short i_2_) {
	anInt2272 = i * 121192815;
    }
    
    void method3972(Class260 class260, int i) {
	aClass260_2265 = class260;
    }
    
    public int method3973() {
	return anInt2268 * 288706099;
    }
    
    public Class626 method3974(int i, int i_3_) {
	return aClass626Array2264[i];
    }
    
    void method3975(Class212 class212_4_, int i) {
	for (int i_5_ = 0; i_5_ < aClass626Array2264.length; i_5_++) {
	    aClass626Array2264[i_5_].method10343(class212_4_
						     .aClass626Array2264[i_5_]
						     .method10333(-866374347),
						 294921962);
	    aClass626Array2264[i_5_].method10338(aClass626Array2264[i_5_]
						     .method10336(1634321263),
						 -1095140607);
	}
	aClass8_2266.method33(-2102654646);
	Iterator iterator = class212_4_.aClass8_2266.iterator();
	while (iterator.hasNext()) {
	    Class429 class429 = (Class429) iterator.next();
	    aClass8_2266.method29(class429.anInt4820 * -608978823,
				  class429.anObject4819, (short) -31390);
	}
	aBool2270 = class212_4_.aBool2270;
    }
    
    public void method3976(Interface27 interface27, int i) {
	if (null == aClass8_2262)
	    aClass8_2262 = new Class8(interface27.method171(351121260));
	else
	    aClass8_2262.method33(-707459379);
    }
    
    public Class8 method3977(int i) {
	return aClass8_2262;
    }
    
    public int method3978() {
	return -1696518197 * anInt2271;
    }
    
    public String method3979(int i) {
	return aString2267;
    }
    
    void method3980(boolean bool) {
	aBool2269 = bool;
    }
    
    public int method3981() {
	return -1696518197 * anInt2271;
    }
    
    void method3982(int i) {
	anInt2271 = 1768291811 * i;
    }
    
    void method3983(int i) {
	anInt2271 = 1768291811 * i;
    }
    
    void method3984(boolean bool) {
	aBool2269 = bool;
    }
    
    public int method3985() {
	return anInt2268 * 288706099;
    }
    
    Class212(Class534_Sub40 class534_sub40, boolean bool, boolean bool_6_,
	     Interface27 interface27) {
	if (bool)
	    aLong2263 = (class534_sub40.method16537(1359621443)
			 * -4189926422283937747L);
	else
	    aLong2263 = 4189926422283937747L;
	if (bool_6_)
	    aString2267 = class534_sub40.method16540(76978635);
	int i = class534_sub40.method16527(-996414489);
	aBool2270 = 0 != (i & 0x1);
	aBool2269 = 0 != (i & 0x2);
	aClass626Array2264 = new Class626[interface27.method161
					      (-2142377368)
					      .method10296(-233438630)];
	int i_7_ = class534_sub40.method16527(-2080633939);
	if (i_7_ > aClass626Array2264.length)
	    throw new IllegalStateException("");
	for (int i_8_ = 0; i_8_ < aClass626Array2264.length; i_8_++) {
	    Class626 class626
		= (aClass626Array2264[i_8_]
		   = new Class626(interface27.method161(-2129210717)
				      .method10297(i_8_, -1475330168),
				  true));
	    if (i_8_ < i_7_)
		class626.method10343(class534_sub40.method16533(-258848859),
				     616494639);
	    else
		class626.method10343(0, -1649136527);
	    class626.method10338(class626.method10336(109132245), -1095140607);
	}
	int i_9_ = class534_sub40.method16529((byte) 1);
	aClass8_2266 = new Class8(interface27.method171(292859579));
	for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
	    Class429 class429
		= interface27.method171(-621973743).method14495(class534_sub40,
								(byte) -121);
	    aClass8_2266.method29(-608978823 * class429.anInt4820,
				  class429.anObject4819, (short) -20820);
	}
	anInt2268 = class534_sub40.method16529((byte) 1) * -19505925;
	if (65535 == 288706099 * anInt2268)
	    anInt2268 = 19505925;
	anInt2271 = class534_sub40.method16527(413152154) * 1768291811;
	aClass260_2265
	    = ((Class260)
	       Class448.method7319(Class260.method4802(427511577),
				   class534_sub40.method16527(838775186),
				   2088438307));
	anInt2272 = class534_sub40.method16527(-504288616) * 121192815;
    }
    
    void method3986(int i) {
	anInt2268 = -19505925 * i;
    }
    
    public boolean method3987() {
	return aBool2269;
    }
    
    public boolean method3988() {
	return aBool2269;
    }
    
    void method3989(boolean bool, byte i) {
	aBool2269 = bool;
    }
    
    void method3990(boolean bool) {
	aBool2269 = bool;
    }
    
    public int method3991() {
	return anInt2272 * 65224079;
    }
    
    public Class260 method3992() {
	return aClass260_2265;
    }
    
    void method3993(boolean bool) {
	aBool2269 = bool;
    }
    
    public Class260 method3994() {
	return aClass260_2265;
    }
    
    public boolean method3995(short i) {
	return aBool2270;
    }
    
    long method3996() {
	return aLong2263 * -4405588379553237083L;
    }
    
    void method3997(boolean bool) {
	aBool2269 = bool;
    }
    
    long method3998(byte i) {
	return aLong2263 * -4405588379553237083L;
    }
    
    void method3999(int i) {
	anInt2272 = i * 121192815;
    }
    
    void method4000(int i) {
	anInt2272 = i * 121192815;
    }
    
    void method4001(int i) {
	anInt2272 = i * 121192815;
    }
    
    public Class8 method4002() {
	return aClass8_2262;
    }
    
    public boolean method4003() {
	return aBool2270;
    }
    
    public Class626 method4004(int i) {
	return aClass626Array2264[i];
    }
    
    void method4005(Class212 class212_11_) {
	for (int i = 0; i < aClass626Array2264.length; i++) {
	    aClass626Array2264[i].method10343(class212_11_
						  .aClass626Array2264[i]
						  .method10333(553472724),
					      -1709112558);
	    aClass626Array2264[i].method10338(aClass626Array2264[i]
						  .method10336(1534507539),
					      -1095140607);
	}
	aClass8_2266.method33(-2130984261);
	Iterator iterator = class212_11_.aClass8_2266.iterator();
	while (iterator.hasNext()) {
	    Class429 class429 = (Class429) iterator.next();
	    aClass8_2266.method29(class429.anInt4820 * -608978823,
				  class429.anObject4819, (short) -18584);
	}
	aBool2270 = class212_11_.aBool2270;
    }
    
    void method4006(Class212 class212_12_) {
	for (int i = 0; i < aClass626Array2264.length; i++) {
	    aClass626Array2264[i].method10343(class212_12_
						  .aClass626Array2264[i]
						  .method10333(225759872),
					      -407001299);
	    aClass626Array2264[i].method10338(aClass626Array2264[i]
						  .method10336(1629720912),
					      -1095140607);
	}
	aClass8_2266.method33(-572454739);
	Iterator iterator = class212_12_.aClass8_2266.iterator();
	while (iterator.hasNext()) {
	    Class429 class429 = (Class429) iterator.next();
	    aClass8_2266.method29(class429.anInt4820 * -608978823,
				  class429.anObject4819, (short) -18317);
	}
	aBool2270 = class212_12_.aBool2270;
    }
    
    public void method4007(Interface27 interface27) {
	if (null == aClass8_2262)
	    aClass8_2262 = new Class8(interface27.method171(-292894503));
	else
	    aClass8_2262.method33(-1776798712);
    }
    
    public void method4008(Interface27 interface27) {
	if (null == aClass8_2262)
	    aClass8_2262 = new Class8(interface27.method171(-1815620670));
	else
	    aClass8_2262.method33(-529176097);
    }
    
    public int method4009() {
	return -1696518197 * anInt2271;
    }
    
    public Class8 method4010() {
	return aClass8_2262;
    }
    
    public static final void method4011(int i) {
	Class237.anImage2376 = null;
	Class464.aFont5112 = null;
    }
    
    static final void method4012(Class669 class669, byte i) {
	int i_13_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	int i_14_ = Class44_Sub6.aClass534_Sub35_10989
			.aClass690_Sub28_10787.method17131(328866435);
	if (i_14_ != i_13_) {
	    Class44_Sub6.aClass534_Sub35_10989.method16438
		(Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub28_10787,
		 i_13_, -295047285);
	    Class672.method11096((byte) 1);
	    client.aBool11048 = false;
	}
    }
    
    static boolean method4013(int i) {
	if (Class534_Sub18_Sub2.method17848(-1850530127 * client.anInt11039,
					    -2029074827))
	    return false;
	return true;
    }
    
    public static int method4014(int i, int i_15_, int i_16_, int i_17_,
				 int i_18_, int i_19_, int i_20_) {
	if (1 == (i_19_ & 0x1)) {
	    int i_21_ = i_17_;
	    i_17_ = i_18_;
	    i_18_ = i_21_;
	}
	i_16_ &= 0x3;
	if (0 == i_16_)
	    return i_15_;
	if (i_16_ == 1)
	    return 7 - i - (i_17_ - 1);
	if (i_16_ == 2)
	    return 7 - i_15_ - (i_18_ - 1);
	return i;
    }
    
    static void method4015(int i, String string, int i_22_) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(3, (long) i);
	class534_sub18_sub6.method18121(-669980248);
	class534_sub18_sub6.aString11677 = string;
    }
}
