/* Class706_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class706_Sub4 extends Class706
{
    Class438 aClass438_10990;
    Class438 aClass438_10991 = new Class438();
    boolean aBool10992;
    Class438 aClass438_10993 = new Class438(Float.NaN, Float.NaN, Float.NaN);
    public static int anInt10994;
    Class438 aClass438_10995;
    Interface31 anInterface31_10996;
    
    public Class438 method17296() {
	return aClass438_10993;
    }
    
    public void method17297(Interface31 interface31, Class438 class438,
			    boolean bool, byte i) {
	anInterface31_10996 = interface31;
	aClass438_10991.method6992(class438);
	aBool10992 = bool;
	interface31.method182(-976379334);
    }
    
    public void method17298(int i) {
	if (null != anInterface31_10996)
	    anInterface31_10996
		= (aClass298_8844.method5382(2098632102).method180
		   (anInterface31_10996.method184(1567569876),
		    anInterface31_10996.method90((byte) 5), (byte) 38));
    }
    
    public void method14239(float f, int i) {
	if (anInterface31_10996 != null) {
	    aClass438_10990.method6992(anInterface31_10996.method182
					   (-976379334)
					   .method16483(-2084133926));
	    aClass298_8844.method5352(false, f, aClass438_10993,
				      aClass298_8844.method5391((byte) 73),
				      aClass438_10990, aClass438_10995,
				      (byte) -106);
	}
    }
    
    public boolean method14237(byte i) {
	return !Float.isNaN(aClass438_10993.aFloat4864);
    }
    
    public void method14240(Class287 class287, Class446 class446, int i,
			    int i_0_, float f, int i_1_) {
	Class438 class438
	    = Class438.method6994(aClass298_8844.method5385((byte) 115));
	class438.aFloat4864 -= (float) i;
	class438.aFloat4865 -= (float) i_0_;
	class438.aFloat4863 *= -1.0F;
	Class438 class438_2_ = method14236(308999563);
	class438_2_.aFloat4864 -= (float) i;
	class438_2_.aFloat4865 -= (float) i_0_;
	class438_2_.aFloat4863 *= -1.0F;
	class446.method7241((double) class438.aFloat4864,
			    (double) class438.aFloat4863,
			    (double) class438.aFloat4865,
			    (double) class438_2_.aFloat4864,
			    (double) class438_2_.aFloat4863,
			    (double) class438_2_.aFloat4865, 0.0F, 1.0F, 0.0F);
	class438.method7074();
	class438_2_.method7074();
    }
    
    public Class438 method14236(int i) {
	Class438 class438 = Class438.method6994(aClass438_10993);
	Class438 class438_3_ = Class438.method6994(aClass438_10991);
	if (aBool10992)
	    class438_3_.method7021(anInterface31_10996.method183(1965636947));
	class438.method7026(class438_3_);
	class438_3_.method7074();
	return class438;
    }
    
    public Class438 method14248(int i) {
	Class438 class438 = Class438.method6994(aClass438_10990);
	Class438 class438_4_ = Class438.method6994(aClass438_10991);
	if (aBool10992)
	    class438_4_.method7021(anInterface31_10996.method183(1870710438));
	class438.method7026(class438_4_);
	class438_4_.method7074();
	return class438;
    }
    
    public void method17299(Interface31 interface31, Class438 class438,
			    boolean bool) {
	anInterface31_10996 = interface31;
	aClass438_10991.method6992(class438);
	aBool10992 = bool;
	interface31.method182(-976379334);
    }
    
    public void method14235(Class534_Sub40 class534_sub40, int i) {
	Class296 class296
	    = Class530.method8850(class534_sub40.method16527(1096019119),
				  1737482778);
	int i_5_ = class534_sub40.method16529((byte) 1);
	anInterface31_10996
	    = aClass298_8844.method5382(1902506093).method180(class296, i_5_,
							      (byte) 120);
	aClass438_10991.method7080(class534_sub40);
	if (class534_sub40.method16527(187902388) == 1)
	    aBool10992 = true;
	else
	    aBool10992 = false;
    }
    
    public boolean method14245() {
	return !Float.isNaN(aClass438_10993.aFloat4864);
    }
    
    public void method14238(float f) {
	if (anInterface31_10996 != null) {
	    aClass438_10990.method6992(anInterface31_10996.method182
					   (-976379334)
					   .method16483(450229911));
	    aClass298_8844.method5352(false, f, aClass438_10993,
				      aClass298_8844.method5391((byte) 118),
				      aClass438_10990, aClass438_10995,
				      (byte) -79);
	}
    }
    
    public Class706_Sub4(Class298 class298) {
	super(class298);
	aClass438_10990 = new Class438(Float.NaN, Float.NaN, Float.NaN);
	aClass438_10995 = new Class438();
    }
    
    public Class438 method14249() {
	Class438 class438 = Class438.method6994(aClass438_10990);
	Class438 class438_6_ = Class438.method6994(aClass438_10991);
	if (aBool10992)
	    class438_6_.method7021(anInterface31_10996.method183(1849779828));
	class438.method7026(class438_6_);
	class438_6_.method7074();
	return class438;
    }
    
    public void method14246(Class287 class287, Class446 class446, int i,
			    int i_7_, float f) {
	Class438 class438
	    = Class438.method6994(aClass298_8844.method5385((byte) 123));
	class438.aFloat4864 -= (float) i;
	class438.aFloat4865 -= (float) i_7_;
	class438.aFloat4863 *= -1.0F;
	Class438 class438_8_ = method14236(308999563);
	class438_8_.aFloat4864 -= (float) i;
	class438_8_.aFloat4865 -= (float) i_7_;
	class438_8_.aFloat4863 *= -1.0F;
	class446.method7241((double) class438.aFloat4864,
			    (double) class438.aFloat4863,
			    (double) class438.aFloat4865,
			    (double) class438_8_.aFloat4864,
			    (double) class438_8_.aFloat4863,
			    (double) class438_8_.aFloat4865, 0.0F, 1.0F, 0.0F);
	class438.method7074();
	class438_8_.method7074();
    }
    
    public Class438 method17300(byte i) {
	return aClass438_10993;
    }
    
    public Class438 method14243() {
	Class438 class438 = Class438.method6994(aClass438_10993);
	Class438 class438_9_ = Class438.method6994(aClass438_10991);
	if (aBool10992)
	    class438_9_.method7021(anInterface31_10996.method183(2019305234));
	class438.method7026(class438_9_);
	class438_9_.method7074();
	return class438;
    }
    
    public Class438 method14241() {
	Class438 class438 = Class438.method6994(aClass438_10993);
	Class438 class438_10_ = Class438.method6994(aClass438_10991);
	if (aBool10992)
	    class438_10_.method7021(anInterface31_10996.method183(1930709112));
	class438.method7026(class438_10_);
	class438_10_.method7074();
	return class438;
    }
    
    public void method14242(float f) {
	if (anInterface31_10996 != null) {
	    aClass438_10990.method6992(anInterface31_10996.method182
					   (-976379334)
					   .method16483(429440983));
	    aClass298_8844.method5352(false, f, aClass438_10993,
				      aClass298_8844.method5391((byte) 107),
				      aClass438_10990, aClass438_10995,
				      (byte) -13);
	}
    }
    
    public Class438 method14250() {
	Class438 class438 = Class438.method6994(aClass438_10990);
	Class438 class438_11_ = Class438.method6994(aClass438_10991);
	if (aBool10992)
	    class438_11_.method7021(anInterface31_10996.method183(1872288223));
	class438.method7026(class438_11_);
	class438_11_.method7074();
	return class438;
    }
    
    public void method14251(Class534_Sub40 class534_sub40) {
	Class296 class296
	    = Class530.method8850(class534_sub40.method16527(-1380628403),
				  271587385);
	int i = class534_sub40.method16529((byte) 1);
	anInterface31_10996
	    = aClass298_8844.method5382(2130905375).method180(class296, i,
							      (byte) 117);
	aClass438_10991.method7080(class534_sub40);
	if (class534_sub40.method16527(1221892427) == 1)
	    aBool10992 = true;
	else
	    aBool10992 = false;
    }
    
    public void method17301() {
	if (null != anInterface31_10996)
	    anInterface31_10996
		= (aClass298_8844.method5382(2037411502).method180
		   (anInterface31_10996.method184(634464993),
		    anInterface31_10996.method90((byte) 5), (byte) 33));
    }
    
    public Class438 method17302() {
	return aClass438_10993;
    }
    
    public Class438 method14247() {
	Class438 class438 = Class438.method6994(aClass438_10993);
	Class438 class438_12_ = Class438.method6994(aClass438_10991);
	if (aBool10992)
	    class438_12_.method7021(anInterface31_10996.method183(1643113245));
	class438.method7026(class438_12_);
	class438_12_.method7074();
	return class438;
    }
    
    public void method14244(float f) {
	if (anInterface31_10996 != null) {
	    aClass438_10990.method6992(anInterface31_10996.method182
					   (-976379334)
					   .method16483(-847942537));
	    aClass298_8844.method5352(false, f, aClass438_10993,
				      aClass298_8844.method5391((byte) 35),
				      aClass438_10990, aClass438_10995,
				      (byte) -44);
	}
    }
    
    static final void method17303(Class669 class669, int i) {
	int i_13_ = Class306.anInt3273 * 1964065355;
	int i_14_ = Class238.anInt2380 * -844799891;
	int i_15_ = -1;
	if (Class713.aBool8884) {
	    Class6[] class6s = Class264.method4841((byte) -71);
	    for (int i_16_ = 0; i_16_ < class6s.length; i_16_++) {
		Class6 class6 = class6s[i_16_];
		if (class6.anInt52 * -1991181227 == i_13_
		    && i_14_ == -778390023 * class6.anInt53) {
		    i_15_ = i_16_;
		    break;
		}
	    }
	}
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_15_;
    }
    
    static final void method17304(Class669 class669, byte i) {
	if (null != Class574.aClass534_Sub26_7710) {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1;
	    class669.aClass534_Sub26_8606 = Class574.aClass534_Sub26_7710;
	} else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
}
