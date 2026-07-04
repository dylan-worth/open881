/* Class388 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class388
{
    Interface42 anInterface42_4051;
    float aFloat4052;
    Class388 aClass388_4053;
    float aFloat4054;
    float aFloat4055;
    float aFloat4056;
    long aLong4057;
    long aLong4058;
    
    public Class388 method6506() {
	return aClass388_4053;
    }
    
    float method6507(int i) {
	return aFloat4054;
    }
    
    public float method6508(int i) {
	float f = 1.0F;
	for (Class388 class388_0_ = this; null != class388_0_;
	     class388_0_ = class388_0_.method6512(-2075814524))
	    f *= class388_0_.method6507(-1785290979);
	return f;
    }
    
    public float method6509() {
	float f = aFloat4052;
	for (Class388 class388_1_ = aClass388_4053; class388_1_ != null;
	     class388_1_ = class388_1_.method6512(-2075814524))
	    f *= class388_1_.method6511(-1164023876);
	f = Math.min(Math.max(f, 0.0F), 1.0F);
	return f;
    }
    
    public float method6510(int i) {
	float f = aFloat4052;
	for (Class388 class388_2_ = aClass388_4053; class388_2_ != null;
	     class388_2_ = class388_2_.method6512(-2075814524))
	    f *= class388_2_.method6511(-1164023876);
	f = Math.min(Math.max(f, 0.0F), 1.0F);
	return f;
    }
    
    public float method6511(int i) {
	return aFloat4052;
    }
    
    public Class388 method6512(int i) {
	return aClass388_4053;
    }
    
    Class388(int i, float f, Object object, Class369 class369,
	     Interface42 interface42, Class388 class388_3_) {
	aClass388_4053 = class388_3_;
	anInterface42_4051 = interface42;
	aFloat4052 = 1.0F;
	aFloat4054 = f;
	aFloat4056 = -1.0F;
	aFloat4055 = -1.0F;
	aLong4057 = -4481104531038263255L;
	aLong4058 = 712730124581831467L;
    }
    
    float method6513() {
	return aFloat4054;
    }
    
    public float method6514() {
	float f = 1.0F;
	for (Class388 class388_4_ = this; null != class388_4_;
	     class388_4_ = class388_4_.method6512(-2075814524))
	    f *= class388_4_.method6507(-1987139803);
	return f;
    }
    
    public float method6515() {
	float f = 1.0F;
	for (Class388 class388_5_ = this; null != class388_5_;
	     class388_5_ = class388_5_.method6512(-2075814524))
	    f *= class388_5_.method6507(-1921224118);
	return f;
    }
    
    public float method6516() {
	float f = 1.0F;
	for (Class388 class388_6_ = this; null != class388_6_;
	     class388_6_ = class388_6_.method6512(-2075814524))
	    f *= class388_6_.method6507(-1665720745);
	return f;
    }
    
    public float method6517() {
	float f = 1.0F;
	for (Class388 class388_7_ = this; null != class388_7_;
	     class388_7_ = class388_7_.method6512(-2075814524))
	    f *= class388_7_.method6507(-1404701731);
	return f;
    }
    
    void method6518() {
	if (null != anInterface42_4051) {
	    float f = anInterface42_4051.method330((short) 13408);
	    if (f != aFloat4052 && aFloat4055 < 0.0F) {
		aFloat4056 = aFloat4052;
		aFloat4055 = f;
		aLong4057
		    = Class250.method4604((byte) -32) * 4481104531038263255L;
		aLong4058
		    = 2513963836655059764L + 1232882733767576371L * aLong4057;
	    }
	}
	if (aFloat4055 >= 0.0F) {
	    long l = Class250.method4604((byte) -7);
	    if (l > aLong4058 * -4099439640659305347L) {
		aFloat4052 = aFloat4055;
		aFloat4055 = -1.0F;
	    } else {
		float f = aFloat4055 - aFloat4056;
		long l_8_ = (aLong4058 * -4099439640659305347L
			     - -3255428938666341401L * aLong4057);
		float f_9_ = f / (float) l_8_;
		aFloat4052
		    = (aFloat4056
		       + ((float) (l - aLong4057 * -3255428938666341401L)
			  * f_9_));
		if (aFloat4052 == aFloat4055)
		    aFloat4055 = -1.0F;
	    }
	}
	aFloat4052 = Math.min(1.0F, Math.max(aFloat4052, 0.0F));
    }
    
    public float method6519() {
	float f = aFloat4052;
	for (Class388 class388_10_ = aClass388_4053; class388_10_ != null;
	     class388_10_ = class388_10_.method6512(-2075814524))
	    f *= class388_10_.method6511(-1164023876);
	f = Math.min(Math.max(f, 0.0F), 1.0F);
	return f;
    }
    
    public void method6520(float f, byte i) {
	if (anInterface42_4051 == null) {
	    aFloat4055 = f;
	    aFloat4056 = aFloat4052;
	    aLong4057
		= Class250.method4604((byte) -121) * 4481104531038263255L;
	    aLong4058
		= 2513963836655059764L + aLong4057 * 1232882733767576371L;
	}
    }
    
    public float method6521() {
	float f = aFloat4052;
	for (Class388 class388_11_ = aClass388_4053; class388_11_ != null;
	     class388_11_ = class388_11_.method6512(-2075814524))
	    f *= class388_11_.method6511(-1164023876);
	f = Math.min(Math.max(f, 0.0F), 1.0F);
	return f;
    }
    
    void method6522(byte i) {
	if (null != anInterface42_4051) {
	    float f = anInterface42_4051.method330((short) 11945);
	    if (f != aFloat4052 && aFloat4055 < 0.0F) {
		aFloat4056 = aFloat4052;
		aFloat4055 = f;
		aLong4057
		    = Class250.method4604((byte) -19) * 4481104531038263255L;
		aLong4058
		    = 2513963836655059764L + 1232882733767576371L * aLong4057;
	    }
	}
	if (aFloat4055 >= 0.0F) {
	    long l = Class250.method4604((byte) -115);
	    if (l > aLong4058 * -4099439640659305347L) {
		aFloat4052 = aFloat4055;
		aFloat4055 = -1.0F;
	    } else {
		float f = aFloat4055 - aFloat4056;
		long l_12_ = (aLong4058 * -4099439640659305347L
			      - -3255428938666341401L * aLong4057);
		float f_13_ = f / (float) l_12_;
		aFloat4052
		    = (aFloat4056
		       + ((float) (l - aLong4057 * -3255428938666341401L)
			  * f_13_));
		if (aFloat4052 == aFloat4055)
		    aFloat4055 = -1.0F;
	    }
	}
	aFloat4052 = Math.min(1.0F, Math.max(aFloat4052, 0.0F));
    }
    
    public void method6523(float f) {
	if (anInterface42_4051 == null) {
	    aFloat4055 = f;
	    aFloat4056 = aFloat4052;
	    aLong4057 = Class250.method4604((byte) -78) * 4481104531038263255L;
	    aLong4058
		= 2513963836655059764L + aLong4057 * 1232882733767576371L;
	}
    }
    
    public void method6524(float f) {
	if (anInterface42_4051 == null) {
	    aFloat4055 = f;
	    aFloat4056 = aFloat4052;
	    aLong4057
		= Class250.method4604((byte) -124) * 4481104531038263255L;
	    aLong4058
		= 2513963836655059764L + aLong4057 * 1232882733767576371L;
	}
    }
    
    static boolean method6525(int i) {
	if (1832109523 * Class65.anInt662 != -1)
	    return Class217.method4115(-280007858);
	return Class229.method4202(Class65.aString694, Class65.aString665,
				   509995250);
    }
    
    static final void method6526(Class669 class669, byte i) {
	int i_14_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class534_Sub18_Sub19 class534_sub18_sub19
	    = Class618.aClass458_8101.method7433(i_14_, -1203343574);
	if (null == class534_sub18_sub19.anIntArray11890)
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= class534_sub18_sub19.anIntArray11890.length;
    }
    
    static final void method6527(Class669 class669, short i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class523.method8723(class247, class243, class669, -1635552170);
    }
    
    static final void method6528(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.method17392(class247).method16271((byte) 54);
    }
    
    static void method6529(int i, byte i_15_) {
	synchronized (Class49.aClass203_364) {
	    Class49.aClass203_364.method3876(i, (byte) 0);
	}
    }
}
