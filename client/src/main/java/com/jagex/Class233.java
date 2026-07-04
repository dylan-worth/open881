/* Class233 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class233 implements Interface28
{
    Class213 this$0;
    Class429 aClass429_2357;
    public static Class472 aClass472_2358;
    public static boolean aBool2359;
    
    public void method172(Class214 class214) {
	if (aClass429_2357 != null)
	    class214.method4042(1474695478).method118
		(((Class150)
		  (this$0.anInterface27_2280.method160(-1395128332).method91
		   (-608978823 * aClass429_2357.anInt4820, -459864299))),
		 aClass429_2357.anObject4819, (byte) 60);
    }
    
    public void method173(Class214 class214, int i) {
	if (aClass429_2357 != null)
	    class214.method4042(1911954542).method118
		(((Class150)
		  (this$0.anInterface27_2280.method160(-2043819010).method91
		   (-608978823 * aClass429_2357.anInt4820, 828932928))),
		 aClass429_2357.anObject4819, (byte) 37);
    }
    
    public void method174(Class214 class214) {
	if (aClass429_2357 != null)
	    class214.method4042(1692147677).method118
		(((Class150)
		  (this$0.anInterface27_2280.method160(108262217).method91
		   (-608978823 * aClass429_2357.anInt4820, 919291904))),
		 aClass429_2357.anObject4819, (byte) 25);
    }
    
    Class233(Class213 class213, Class534_Sub40 class534_sub40) {
	this$0 = class213;
	if (class534_sub40.method16529((byte) 1) != 65535) {
	    class534_sub40.anInt10811 -= 1520029430;
	    aClass429_2357 = class213.anInterface27_2280.method160
				 (1381142720)
				 .method14495(class534_sub40, (byte) -79);
	} else
	    aClass429_2357 = null;
    }
    
    static final void method4340(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_0_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_1_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_0_ & i_1_;
    }
    
    static void method4341(Class185 class185, Class602 class602, int i,
			   int i_2_, int i_3_, int i_4_) {
	Class85 class85
	    = ((Class85)
	       Class394_Sub1.aClass44_Sub18_10148
		   .method91(350336715 * class602.anInt7890, 1333349114));
	if (-1 != class85.anInt842 * 138454787) {
	    if (class602.aBool7924) {
		i += class602.anInt7925 * 1605976059;
		i &= 0x3;
	    } else
		i = 0;
	    Class163 class163
		= class85.method1672(class185, i, class602.aBool7955,
				     (short) 27529);
	    if (null != class163) {
		int i_5_ = class602.anInt7904 * -1082258489;
		int i_6_ = -1990374967 * class602.anInt7928;
		if (1 == (i & 0x1)) {
		    i_5_ = -1990374967 * class602.anInt7928;
		    i_6_ = class602.anInt7904 * -1082258489;
		}
		int i_7_ = class163.method22();
		int i_8_ = class163.method2692();
		if (class85.aBool844) {
		    i_7_ = 4 * i_5_;
		    i_8_ = 4 * i_6_;
		}
		if (2126510373 * class85.anInt841 != 0)
		    class163.method2660(i_2_, i_3_ - (i_6_ - 1) * 4, i_7_,
					i_8_, 0,
					(~0xffffff
					 | 2126510373 * class85.anInt841),
					1);
		else
		    class163.method2659(i_2_, i_3_ - 4 * (i_6_ - 1), i_7_,
					i_8_);
	    }
	}
    }
}
