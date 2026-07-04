/* Class488 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchEvent;

public class Class488
{
    static Class488 aClass488_5304;
    static Class488 aClass488_5305 = new Class488(1);
    static Class488 aClass488_5306;
    static Class488 aClass488_5307;
    static Class488 aClass488_5308 = new Class488(0);
    static Class488 aClass488_5309;
    int anInt5310;
    static Class488 aClass488_5311;
    
    static {
	aClass488_5306 = new Class488(3);
	aClass488_5307 = new Class488(6);
	aClass488_5311 = new Class488(4);
	aClass488_5304 = new Class488(5);
	aClass488_5309 = new Class488(2);
    }
    
    Class488(int i) {
	anInt5310 = 1014436167 * i;
    }
    
    public static void method7996(Class185 class185, long l) {
	if (3 != -504964405 * Class574.anInt7680
	    && -504964405 * Class574.anInt7680 != 0) {
	    if (-504964405 * Class574.anInt7680 == 1) {
		if (null == Class574.aStringArray7690
		    || 0 == Class574.aStringArray7690.length)
		    throw new RuntimeException("");
		int i = 0;
		for (int i_0_ = 0; i_0_ < Class574.aStringArray7690.length;
		     i_0_++) {
		    if (null != Class574.aStringArray7690[i_0_]) {
			try {
			    i += (Class632.aClass538_8269.method8915
				  (Class574.aStringArray7690[i_0_], false,
				   -1716159148));
			} catch (Exception_Sub1 exception_sub1) {
			    Class530.method8852(Class68.aClass68_723,
						exception_sub1.aString11396,
						(-299853035
						 * exception_sub1.anInt11395),
						exception_sub1.getCause(),
						(byte) 28);
			    Class574.anInt7680 = 214610089;
			    return;
			}
		    } else
			i += 100;
		}
		Class574.anInt7688
		    = -325555619 * (i / Class574.aStringArray7690.length);
		if (1879685621 * Class574.anInt7688 == 100) {
		    Class574.anInt7680
			= Class75.method1587(-93806242) * -1360119069;
		    if (2 != Class574.anInt7680 * -504964405)
			return;
		} else
		    return;
	    }
	    TwitchEvent[] twitchevents = Class523.aTwitchTV7088.Service();
	    if (twitchevents != null) {
		for (int i = 0; i < twitchevents.length; i++) {
		    TwitchEvent twitchevent = twitchevents[i];
		    if (twitchevent != null
			&& Class87.method1707(twitchevent, l)) {
			Class590 class590 = twitchevent.method6700();
			if (null != class590)
			    Class269.method5022(class590.method93(),
						twitchevent, (byte) 1);
		    }
		}
	    }
	    if (Class523.aTwitchTV7088.IsStreaming()
		&& (l - Class574.aLong7707 * 5008888367890022609L
		    > -4305046744967835077L * Class419.aLong4704)) {
		Class574.aLong7707 = -6716390560235218895L * l;
		if (class185.method3270())
		    Class574.aBool7681 = true;
	    }
	    if (Class523.aTwitchTV7088.IsStreaming()) {
		if (l - Class574.aLong7693 * 2246923764832097049L
		    < (long) (-1978386965 * Class574.anInt7684))
		    Class574.anInt7709 = -839084398;
		else if (l - 3839458923543450365L * Class574.aLong7694
			 < (long) (-1978386965 * Class574.anInt7684))
		    Class574.anInt7709 = -419542199;
		else
		    Class574.anInt7709 = 0;
	    } else
		Class574.anInt7709 = 0;
	    if ((l - -5263846699966654639L * Class574.aLong7705
		 > (long) (-1683876517 * Class574.anInt7685))
		&& Class523.aTwitchTV7088.GetWebcamState() == 5) {
		Class523.aTwitchTV7088.RestartWebcamDevice();
		Class574.aLong7705 = 392372425371390385L * l;
	    }
	}
    }
    
    static final void method7997(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -1406046755 * class669.aClass534_Sub26_8606.anInt10580;
    }
    
    static final void method7998(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    public static int method7999(Class665 class665, Class668 class668, int i,
				 int i_1_) {
	if (class665 == Class665.aClass665_8561)
	    return 443;
	return 50000 + i;
    }
    
    static final void method8000(int i) {
	int i_2_ = 256 + Class200_Sub8.anInt9909 * 1532525056;
	int i_3_ = -504193536 * Class200_Sub9.anInt9916 + 256;
	int i_4_
	    = (Class247.method4595(i_2_, i_3_, -878424575 * Class674.anInt8633,
				   -484269822)
	       - -2055021667 * Class453_Sub2.anInt10347);
	if (-579311691 * Class110.anInt1345 >= 100) {
	    Class200_Sub13.anInt9937
		= 329831680 + Class200_Sub8.anInt9909 * 514687488;
	    Class636.anInt8305
		= 1581550848 + -392624640 * Class200_Sub9.anInt9916;
	    Class677.anInt8654
		= (Class247.method4595(-116109187 * Class200_Sub13.anInt9937,
				       -1098179003 * Class636.anInt8305,
				       Class674.anInt8633 * -878424575,
				       -2110968632)
		   - -2055021667 * Class453_Sub2.anInt10347) * 996845503;
	} else {
	    if (Class200_Sub13.anInt9937 * -116109187 < i_2_) {
		Class200_Sub13.anInt9937
		    += (((i_2_ - -116109187 * Class200_Sub13.anInt9937)
			 * (-579311691 * Class110.anInt1345) / 1000)
			+ 365285283 * Class42.anInt321) * -2079086379;
		if (-116109187 * Class200_Sub13.anInt9937 > i_2_)
		    Class200_Sub13.anInt9937 = -2079086379 * i_2_;
	    }
	    if (Class200_Sub13.anInt9937 * -116109187 > i_2_) {
		Class200_Sub13.anInt9937
		    -= (-2079086379
			* (((-116109187 * Class200_Sub13.anInt9937 - i_2_)
			    * (Class110.anInt1345 * -579311691) / 1000)
			   + 365285283 * Class42.anInt321));
		if (-116109187 * Class200_Sub13.anInt9937 < i_2_)
		    Class200_Sub13.anInt9937 = i_2_ * -2079086379;
	    }
	    if (1529694271 * Class677.anInt8654 < i_4_) {
		Class677.anInt8654
		    += 996845503 * (Class42.anInt321 * 365285283
				    + (-579311691 * Class110.anInt1345
				       * (i_4_
					  - Class677.anInt8654 * 1529694271)
				       / 1000));
		if (Class677.anInt8654 * 1529694271 > i_4_)
		    Class677.anInt8654 = 996845503 * i_4_;
	    }
	    if (Class677.anInt8654 * 1529694271 > i_4_) {
		Class677.anInt8654
		    -= ((-579311691 * Class110.anInt1345
			 * (1529694271 * Class677.anInt8654 - i_4_) / 1000)
			+ Class42.anInt321 * 365285283) * 996845503;
		if (1529694271 * Class677.anInt8654 < i_4_)
		    Class677.anInt8654 = 996845503 * i_4_;
	    }
	    if (-1098179003 * Class636.anInt8305 < i_3_) {
		Class636.anInt8305
		    += (-866237299
			* ((-579311691 * Class110.anInt1345
			    * (i_3_ - -1098179003 * Class636.anInt8305) / 1000)
			   + Class42.anInt321 * 365285283));
		if (Class636.anInt8305 * -1098179003 > i_3_)
		    Class636.anInt8305 = i_3_ * -866237299;
	    }
	    if (Class636.anInt8305 * -1098179003 > i_3_) {
		Class636.anInt8305
		    -= (-866237299
			* ((Class110.anInt1345 * -579311691
			    * (Class636.anInt8305 * -1098179003 - i_3_) / 1000)
			   + 365285283 * Class42.anInt321));
		if (Class636.anInt8305 * -1098179003 < i_3_)
		    Class636.anInt8305 = -866237299 * i_3_;
	    }
	}
	i_2_ = 256 + 986574336 * Class652.anInt8484;
	i_3_ = 256 + Class609.anInt8007 * 106556928;
	i_4_
	    = (Class247.method4595(i_2_, i_3_, -878424575 * Class674.anInt8633,
				   -285164556)
	       - -1339841327 * Class341.anInt3554);
	int i_5_ = i_2_ - -116109187 * Class200_Sub13.anInt9937;
	int i_6_ = i_4_ - 1529694271 * Class677.anInt8654;
	int i_7_ = i_3_ - Class636.anInt8305 * -1098179003;
	int i_8_ = (int) Math.sqrt((double) (i_7_ * i_7_ + i_5_ * i_5_));
	int i_9_ = ((int) (Math.atan2((double) i_6_, (double) i_8_)
			   * 2607.5945876176133)
		    & 0x3fff);
	int i_10_ = ((int) (Math.atan2((double) i_5_, (double) i_7_)
			    * -2607.5945876176133)
		     & 0x3fff);
	if (i_9_ < 1024)
	    i_9_ = 1024;
	if (i_9_ > 3072)
	    i_9_ = 3072;
	if (Class566.anInt7589 * -864938791 < i_9_) {
	    Class566.anInt7589
		+= -1539495063 * ((Class221.anInt2311 * 1556001265
				   * (i_9_ - Class566.anInt7589 * -864938791
				      >> 3)
				   / 1000) + 372049135 * Class77.anInt820
				  << 3);
	    if (Class566.anInt7589 * -864938791 > i_9_)
		Class566.anInt7589 = i_9_ * -1539495063;
	}
	if (Class566.anInt7589 * -864938791 > i_9_) {
	    Class566.anInt7589
		-= (-1539495063
		    * ((372049135 * Class77.anInt820
			+ ((Class566.anInt7589 * -864938791 - i_9_ >> 3)
			   * (1556001265 * Class221.anInt2311) / 1000))
		       << 3));
	    if (-864938791 * Class566.anInt7589 < i_9_)
		Class566.anInt7589 = i_9_ * -1539495063;
	}
	int i_11_ = i_10_ - -890112543 * Class641.anInt8341;
	if (i_11_ > 8192)
	    i_11_ -= 16384;
	if (i_11_ < -8192)
	    i_11_ += 16384;
	i_11_ >>= 3;
	if (i_11_ > 0) {
	    Class641.anInt8341
		+= 486346273 * ((i_11_ * (Class221.anInt2311 * 1556001265)
				 / 1000) + Class77.anInt820 * 372049135
				<< 3);
	    Class641.anInt8341
		= (Class641.anInt8341 * -890112543 & 0x3fff) * 486346273;
	}
	if (i_11_ < 0) {
	    Class641.anInt8341
		-= ((1556001265 * Class221.anInt2311 * -i_11_ / 1000
		     + 372049135 * Class77.anInt820)
		    << 3) * 486346273;
	    Class641.anInt8341
		= (-890112543 * Class641.anInt8341 & 0x3fff) * 486346273;
	}
	int i_12_ = i_10_ - Class641.anInt8341 * -890112543;
	if (i_12_ > 8192)
	    i_12_ -= 16384;
	if (i_12_ < -8192)
	    i_12_ += 16384;
	if (i_12_ < 0 && i_11_ > 0 || i_12_ > 0 && i_11_ < 0)
	    Class641.anInt8341 = 486346273 * i_10_;
	Class2.anInt22 = 0;
    }
}
