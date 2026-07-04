/* Class429 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class429
{
    public Object anObject4819;
    public int anInt4820;
    
    public boolean method6800(Object object) {
	if (!(object instanceof Class429))
	    return false;
	Class429 class429_0_ = (Class429) object;
	if (null == class429_0_.anObject4819 && null != anObject4819)
	    return false;
	if (null == anObject4819 && class429_0_.anObject4819 != null)
	    return false;
	if (anInt4820 * -608978823 == class429_0_.anInt4820 * -608978823
	    && class429_0_.anObject4819.equals(anObject4819))
	    return true;
	return false;
    }
    
    public boolean equals(Object object) {
	if (!(object instanceof Class429))
	    return false;
	Class429 class429_1_ = (Class429) object;
	if (null == class429_1_.anObject4819 && null != anObject4819)
	    return false;
	if (null == anObject4819 && class429_1_.anObject4819 != null)
	    return false;
	if (anInt4820 * -608978823 == class429_1_.anInt4820 * -608978823
	    && class429_1_.anObject4819.equals(anObject4819))
	    return true;
	return false;
    }
    
    public boolean method6801(Object object) {
	if (!(object instanceof Class429))
	    return false;
	Class429 class429_2_ = (Class429) object;
	if (null == class429_2_.anObject4819 && null != anObject4819)
	    return false;
	if (null == anObject4819 && class429_2_.anObject4819 != null)
	    return false;
	if (anInt4820 * -608978823 == class429_2_.anInt4820 * -608978823
	    && class429_2_.anObject4819.equals(anObject4819))
	    return true;
	return false;
    }
    
    public Class429(int i) {
	anInt4820 = i * -1694682679;
    }
    
    public boolean method6802(Object object) {
	if (!(object instanceof Class429))
	    return false;
	Class429 class429_3_ = (Class429) object;
	if (null == class429_3_.anObject4819 && null != anObject4819)
	    return false;
	if (null == anObject4819 && class429_3_.anObject4819 != null)
	    return false;
	if (anInt4820 * -608978823 == class429_3_.anInt4820 * -608978823
	    && class429_3_.anObject4819.equals(anObject4819))
	    return true;
	return false;
    }
    
    public Class429(int i, Object object) {
	anInt4820 = -1694682679 * i;
	anObject4819 = object;
    }
    
    public boolean method6803(Object object) {
	if (!(object instanceof Class429))
	    return false;
	Class429 class429_4_ = (Class429) object;
	if (null == class429_4_.anObject4819 && null != anObject4819)
	    return false;
	if (null == anObject4819 && class429_4_.anObject4819 != null)
	    return false;
	if (anInt4820 * -608978823 == class429_4_.anInt4820 * -608978823
	    && class429_4_.anObject4819.equals(anObject4819))
	    return true;
	return false;
    }
    
    static Class534_Sub18_Sub8 method6804(Class583 class583, int i, int i_5_,
					  short i_6_) {
	int i_7_ = -1610379455 * class583.anInt7794 | i << 10;
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = ((Class534_Sub18_Sub8)
	       Class662.aClass199_8552.method3838((long) i_7_ << 16));
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	byte[] is = (Class294.aClass472_3158.method7738
		     (Class294.aClass472_3158.method7668(i_7_, -788579568),
		      (byte) -24));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -9);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_7_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    Class662.aClass199_8552.method3834(class534_sub18_sub8,
					       (long) i_7_ << 16);
	    return class534_sub18_sub8;
	}
	i_7_ = -1610379455 * class583.anInt7794 | 65536 + i_5_ << 10;
	class534_sub18_sub8
	    = ((Class534_Sub18_Sub8)
	       Class662.aClass199_8552.method3838((long) i_7_ << 16));
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	is = (Class294.aClass472_3158.method7738
	      (Class294.aClass472_3158.method7668(i_7_, -1486109255),
	       (byte) -89));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -19);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_7_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    Class662.aClass199_8552.method3834(class534_sub18_sub8,
					       (long) i_7_ << 16);
	    return class534_sub18_sub8;
	}
	i_7_ = -1610379455 * class583.anInt7794 | 0x3fffc00;
	class534_sub18_sub8
	    = ((Class534_Sub18_Sub8)
	       Class662.aClass199_8552.method3838((long) i_7_ << 16));
	if (class534_sub18_sub8 != null)
	    return class534_sub18_sub8;
	is = (Class294.aClass472_3158.method7738
	      (Class294.aClass472_3158.method7668(i_7_, 48325217),
	       (byte) -62));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -30);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_7_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    Class662.aClass199_8552.method3834(class534_sub18_sub8,
					       (long) i_7_ << 16);
	    return class534_sub18_sub8;
	}
	return null;
    }
    
    static final void method6805(Class669 class669, int i) {
	int i_8_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_8_, 251173846);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_8_ >> 16];
	Class80.method1630(class247, class243, class669, (byte) -25);
    }
    
    static final void method6806(Class669 class669, byte i) {
	int i_9_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_9_, 1419553870);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_9_ >> 16];
	Class619.method10256(class247, class243, class669, -148648999);
    }
    
    static final void method6807(Class669 class669, int i) {
	int i_10_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Character.toUpperCase((char) i_10_);
    }
    
    static final void method6808(Class669 class669, int i) {
	int i_11_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class534_Sub18_Sub9 class534_sub18_sub9
	    = Class232.method4339(-2079658306);
	if (null != class534_sub18_sub9) {
	    boolean bool
		= class534_sub18_sub9.method18260(i_11_ >> 28 & 0x3,
						  i_11_ >> 14 & 0x3fff,
						  i_11_ & 0x3fff,
						  Class679.anIntArray8659,
						  1615115016);
	    if (bool)
		Class534_Sub2.method16018(Class679.anIntArray8659[1],
					  Class679.anIntArray8659[2],
					  -352432696);
	}
    }
    
    static final void method6809(Class669 class669, byte i) {
	int i_12_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class599.aClass298_Sub1_7871.method5374(i_12_, (byte) 92);
    }
    
    static final void method6810(Class669 class669, byte i) {
	Class690_Sub12.method16990(-2134065801);
    }
    
    static Class692[] method6811(int i) {
	return (new Class692[]
		{ Class692.aClass692_8760, Class692.aClass692_8762,
		  Class692.aClass692_8761 });
    }
    
    static final void method6812(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class247.anInt2484
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * -1802351777;
	Class454.method7416(class247, -1117239780);
    }
    
    static boolean method6813(Interface62 interface62, int i) {
	Class602 class602
	    = ((Class602)
	       client.aClass512_11100.method8428(-1486655428)
		   .method91(interface62.method56(-668166309), 802124444));
	if (350336715 * class602.anInt7890 == -1)
	    return true;
	Class85 class85
	    = ((Class85)
	       Class394_Sub1.aClass44_Sub18_10148
		   .method91(class602.anInt7890 * 350336715, -266047471));
	if (-1 == class85.anInt842 * 138454787)
	    return true;
	return class85.method1674(1347529095);
    }
}
