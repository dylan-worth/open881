/* Class571 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class571 implements Interface76
{
    public static Class571 aClass571_7664;
    int anInt7665;
    static Class571 aClass571_7666 = new Class571(0);
    
    public int method93() {
	return -789009079 * anInt7665;
    }
    
    public int method22() {
	return -789009079 * anInt7665;
    }
    
    static {
	aClass571_7664 = new Class571(1);
    }
    
    public int method53() {
	return -789009079 * anInt7665;
    }
    
    static Class571[] method9626() {
	return new Class571[] { aClass571_7664, aClass571_7666 };
    }
    
    static Class571[] method9627() {
	return new Class571[] { aClass571_7664, aClass571_7666 };
    }
    
    Class571(int i) {
	anInt7665 = i * -1532504839;
    }
    
    public static int method9628(int i) {
	return Class523.aTwitchTV7088.GetChatState();
    }
    
    static final void method9629(Class669 class669, int i) {
	class669.anInt8594 -= -1374580330;
	String string
	    = ((String)
	       class669.anObjectArray8593[1485266147 * class669.anInt8594]);
	String string_0_ = (String) (class669.anObjectArray8593
				     [1485266147 * class669.anInt8594 + 1]);
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aClass631_12226 != null
	    && (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aClass631_12226
		.aBool8206))
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= string_0_;
	else
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= string;
    }
    
    static final void method9630(Class669 class669, int i) {
	class669.anInt8594 -= -1374580330;
	String string
	    = ((String)
	       class669.anObjectArray8593[1485266147 * class669.anInt8594]);
	String string_1_ = (String) (class669.anObjectArray8593
				     [1 + class669.anInt8594 * 1485266147]);
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = new StringBuilder().append(string).append(string_1_).toString();
    }
    
    static final void method9631(Class669 class669, int i) {
	int i_2_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class458.method7436((char) i_2_, -1122167887) ? 1 : 0;
    }
    
    static final void method9632(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (class669.anIntArray8605
	       [class669.anIntArray8591[662605117 * class669.anInt8613]]);
    }
    
    static final void method9633(Class669 class669, int i) {
	int i_3_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class15 class15
	    = (Class15) Class531.aClass44_Sub7_7135.method91(i_3_, -21563702);
	if (-1 == 368739509 * class15.anInt158
	    && class15.anInt159 * 615907051 >= 0)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 615907051 * class15.anInt159;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= i_3_;
    }
    
    public static void method9634
	(float f, Class438 class438, Class438 class438_4_,
	 Class438 class438_5_, Class438 class438_6_, Class438 class438_7_,
	 float f_8_, float f_9_, float f_10_, float f_11_, int i) {
	if (!class438_4_.method7056(class438)) {
	    Class438 class438_12_ = Class438.method7055(class438_4_, class438);
	    float f_13_ = class438_12_.method7012();
	    if (f_8_ > 0.0F) {
		class438_6_ = Class438.method6994(class438_6_);
		class438_6_.method7016(f_9_ * (f_13_ / f_8_));
	    }
	    if (class438_6_.aFloat4864 == Float.POSITIVE_INFINITY
		|| Float.isNaN(class438.aFloat4864) || f_13_ > f_10_) {
		class438.method6992(class438_4_);
		class438_5_.method6999();
	    } else {
		Class438 class438_14_ = Class438.method6994(class438_5_);
		class438_14_.method7013();
		Class438 class438_15_
		    = Class438.method7018(class438_14_, class438_6_);
		Class438 class438_16_
		    = Class438.method7015(class438_14_, class438_15_);
		class438_16_.method7016(0.5F);
		Class438 class438_17_ = Class438.method6994(class438_5_);
		Class438 class438_18_ = Class438.method6994(class438_12_);
		class438_18_.method7013();
		if (class438_16_.aFloat4864 > class438_18_.aFloat4864) {
		    if (class438_12_.aFloat4864 < 0.0F) {
			class438_17_.aFloat4864 += class438_6_.aFloat4864 * f;
			if (class438_17_.aFloat4864 > 0.0F)
			    class438_17_.aFloat4864 = 0.0F;
		    } else {
			class438_17_.aFloat4864 -= class438_6_.aFloat4864 * f;
			if (class438_17_.aFloat4864 < 0.0F)
			    class438_17_.aFloat4864 = 0.0F;
		    }
		} else if (class438_14_.aFloat4864 < class438_7_.aFloat4864) {
		    if (class438_12_.aFloat4864 < 0.0F) {
			class438_17_.aFloat4864 -= f * class438_6_.aFloat4864;
			if (class438_17_.aFloat4864 < -class438_7_.aFloat4864)
			    class438_17_.aFloat4864 = -class438_7_.aFloat4864;
		    } else {
			class438_17_.aFloat4864 += f * class438_6_.aFloat4864;
			if (class438_17_.aFloat4864 > class438_7_.aFloat4864)
			    class438_17_.aFloat4864 = class438_7_.aFloat4864;
		    }
		}
		if (class438_16_.aFloat4863 > class438_18_.aFloat4863) {
		    if (class438_12_.aFloat4863 < 0.0F) {
			class438_17_.aFloat4863 += class438_6_.aFloat4863 * f;
			if (class438_17_.aFloat4863 > 0.0F)
			    class438_17_.aFloat4863 = 0.0F;
		    } else {
			class438_17_.aFloat4863 -= class438_6_.aFloat4863 * f;
			if (class438_17_.aFloat4863 < 0.0F)
			    class438_17_.aFloat4863 = 0.0F;
		    }
		} else if (class438_14_.aFloat4863 < class438_7_.aFloat4863) {
		    if (class438_12_.aFloat4863 < 0.0F) {
			class438_17_.aFloat4863 -= f * class438_6_.aFloat4863;
			if (class438_17_.aFloat4863 < -class438_7_.aFloat4863)
			    class438_17_.aFloat4863 = -class438_7_.aFloat4863;
		    } else {
			class438_17_.aFloat4863 += f * class438_6_.aFloat4863;
			if (class438_17_.aFloat4863 > class438_7_.aFloat4863)
			    class438_17_.aFloat4863 = class438_7_.aFloat4863;
		    }
		}
		if (class438_16_.aFloat4865 > class438_18_.aFloat4865) {
		    if (class438_12_.aFloat4865 < 0.0F) {
			class438_17_.aFloat4865 += class438_6_.aFloat4865 * f;
			if (class438_17_.aFloat4865 > 0.0F)
			    class438_17_.aFloat4865 = 0.0F;
		    } else {
			class438_17_.aFloat4865 -= f * class438_6_.aFloat4865;
			if (class438_17_.aFloat4865 < 0.0F)
			    class438_17_.aFloat4865 = 0.0F;
		    }
		} else if (class438_14_.aFloat4865 < class438_7_.aFloat4865) {
		    if (class438_12_.aFloat4865 < 0.0F) {
			class438_17_.aFloat4865 -= class438_6_.aFloat4865 * f;
			if (class438_17_.aFloat4865 < -class438_7_.aFloat4865)
			    class438_17_.aFloat4865 = -class438_7_.aFloat4865;
		    } else {
			class438_17_.aFloat4865 += f * class438_6_.aFloat4865;
			if (class438_17_.aFloat4865 > class438_7_.aFloat4865)
			    class438_17_.aFloat4865 = class438_7_.aFloat4865;
		    }
		}
		class438_5_.method7024(class438_17_, 0.8F);
		if (f_13_ < f_11_ && class438_5_.method7012() < f_11_) {
		    class438.method6992(class438_4_);
		    class438_5_.method6999();
		} else
		    class438.method7026(Class438.method7020(class438_5_, f));
		class438_14_.method7074();
		class438_17_.method7074();
		class438_18_.method7074();
	    }
	}
    }
}
