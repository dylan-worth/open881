/* Class706_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class706_Sub3 extends Class706
{
    static float aFloat10975;
    static float aFloat10976;
    static int anInt10977 = 0;
    static int anInt10978 = 0;
    static float aFloat10979;
    Class443 aClass443_10980;
    static float aFloat10981;
    static float aFloat10982;
    static float aFloat10983;
    static int anInt10984;
    Class443 aClass443_10985 = new Class443();
    static int anInt10986 = 0;
    
    public void method17267(int i) {
	anInt10977 = 469516263 * i;
    }
    
    public Class706_Sub3(Class298 class298) {
	super(class298);
	aClass443_10980
	    = new Class443(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    }
    
    public void method17268(int i, int i_0_) {
	anInt10977 = 469516263 * i;
    }
    
    public void method17269(int i, int i_1_) {
	anInt10978 = -1754075597 * i;
    }
    
    public void method17270(int i, int i_2_) {
	anInt10986 = 648419935 * i;
    }
    
    public void method17271(int i, int i_3_) {
	anInt10984 = -2143463467 * i;
    }
    
    public Class438 method14236(int i) {
	Class438 class438 = new Class438(0.0F, 0.0F, 1000.0F);
	class438.method7021(Class443.method7200(aClass443_10985));
	class438.aFloat4863 *= -1.0F;
	class438.method7026(aClass298_8844.method5385((byte) 122));
	return class438;
    }
    
    public Class443 method17272(int i) {
	return new Class443(aClass443_10985);
    }
    
    public void method17273(int i, int i_4_, int i_5_, byte i_6_) {
	Class446 class446 = new Class446();
	class446.method7241(0.0, 0.0, 0.0, (double) i, (double) -i_4_,
			    (double) i_5_, 0.0F, 1.0F, 0.0F);
	Class442 class442 = new Class442();
	class446.method7260(class442.aFloatArray4877);
	Class443 class443 = class442.method7131();
	class443.method7182();
	aClass443_10985.method7145(class443);
    }
    
    public void method14239(float f, int i) {
	Class443 class443 = method17272(716377293);
	if (0 != anInt10977 * -334470185 || -1911440133 * anInt10978 != 0) {
	    Class443 class443_7_ = Class443.method7137();
	    class443_7_.method7147(1.0F, 0.0F, 0.0F,
				   (float) (3.141592653589793
					    * (double) (anInt10977
							* -334470185)
					    * 2.0) / 16384.0F);
	    class443.method7158(class443_7_);
	    Class438 class438 = Class438.method6996(0.0F, 1.0F, 0.0F);
	    class438.method7021(class443);
	    Class443 class443_8_ = Class443.method7137();
	    class438.method7002();
	    class443_8_.method7146(class438,
				   ((float) (2.0
					     * (3.141592653589793
						* (double) (anInt10978
							    * -1911440133)))
				    / 16384.0F));
	    class443.method7158(class443_8_);
	    method17278(class443, (byte) 1);
	    anInt10977 = 0;
	    anInt10978 = 0;
	}
	if (aClass298_8844.method5388((byte) 38) == Class305.aClass305_3266
	    && (0 != anInt10986 * 1200406943 || 59713917 * anInt10984 != 0)) {
	    class443.method7182();
	    Class347_Sub2 class347_sub2
		= (Class347_Sub2) aClass298_8844.method5380((byte) -29);
	    Class534_Sub36 class534_sub36
		= class347_sub2.method6133((byte) -80);
	    Class438 class438 = class534_sub36.method16483(811110127);
	    Class438 class438_9_
		= Class438.method6996(0.0F, 0.0F,
				      (float) (59713917 * anInt10984));
	    class438_9_.method7021(class443);
	    class438_9_.aFloat4863 *= -1.0F;
	    class438.method7026(class438_9_);
	    Class438 class438_10_
		= Class438.method6996((float) (1200406943 * anInt10986), 0.0F,
				      0.0F);
	    class438_10_.method7021(class443);
	    class438_10_.aFloat4863 *= -1.0F;
	    class438.method7026(class438_10_);
	    method17274(class438, -1367377418);
	    class347_sub2.method15787
		(new Class534_Sub36(class534_sub36.anInt10796 * 955276319,
				    (int) class438.aFloat4864,
				    (int) class438.aFloat4863,
				    (int) class438.aFloat4865),
		 -1062631237);
	    anInt10986 = 0;
	    anInt10984 = 0;
	}
    }
    
    void method17274(Class438 class438, int i) {
	if (-1.0F != aFloat10981 && class438.aFloat4864 < aFloat10981)
	    class438.aFloat4864 = aFloat10981;
	if (aFloat10982 != -1.0F && class438.aFloat4864 > aFloat10982)
	    class438.aFloat4864 = aFloat10982;
	if (aFloat10983 != -1.0F && class438.aFloat4863 < aFloat10983)
	    class438.aFloat4863 = aFloat10983;
	if (-1.0F != aFloat10975 && class438.aFloat4863 > aFloat10975)
	    class438.aFloat4863 = aFloat10975;
	if (aFloat10976 != -1.0F && class438.aFloat4865 < aFloat10976)
	    class438.aFloat4865 = aFloat10976;
	if (-1.0F != aFloat10979 && class438.aFloat4865 > aFloat10979)
	    class438.aFloat4865 = aFloat10979;
    }
    
    public void method17275(Class438 class438, int i, int i_11_, int i_12_,
			    int i_13_, int i_14_, int i_15_, byte i_16_) {
	aFloat10981
	    = i == -1 ? -1.0F : class438.aFloat4864 - (float) (512 * i);
	aFloat10982 = (i_11_ == -1 ? -1.0F
		       : (float) (512 * i_11_) + class438.aFloat4864);
	aFloat10983
	    = i_14_ == -1 ? -1.0F : -class438.aFloat4863 - (float) (512
								    * i_14_);
	aFloat10975
	    = i_15_ == -1 ? -1.0F : -class438.aFloat4863 + (float) (i_15_
								    * 512);
	aFloat10976
	    = -1 == i_12_ ? -1.0F : class438.aFloat4865 - (float) (i_12_
								   * 512);
	aFloat10979 = (i_13_ == -1 ? -1.0F
		       : (float) (512 * i_13_) + class438.aFloat4865);
    }
    
    public boolean method14237(byte i) {
	return (!Float.isNaN(aClass443_10985.aFloat4881)
		&& aClass298_8844.method5385((byte) 118) != null);
    }
    
    public void method14251(Class534_Sub40 class534_sub40) {
	aClass443_10985.method7143(class534_sub40);
    }
    
    public void method14240(Class287 class287, Class446 class446, int i,
			    int i_17_, float f, int i_18_) {
	Class438 class438
	    = Class438.method6994(aClass298_8844.method5385((byte) 117));
	class438.aFloat4864 -= (float) i;
	class438.aFloat4865 -= (float) i_17_;
	class438.aFloat4863 *= -1.0F;
	class446.method7262(Class443.method7200(aClass443_10985));
	class446.method7251(class438);
	class446.method7243();
	class438.method7074();
    }
    
    public void method14235(Class534_Sub40 class534_sub40, int i) {
	aClass443_10985.method7143(class534_sub40);
    }
    
    public Class443 method17276() {
	return new Class443(aClass443_10985);
    }
    
    public void method17277(Class438 class438, int i, int i_19_, int i_20_,
			    int i_21_, int i_22_, int i_23_) {
	aFloat10981
	    = i == -1 ? -1.0F : class438.aFloat4864 - (float) (512 * i);
	aFloat10982 = (i_19_ == -1 ? -1.0F
		       : (float) (512 * i_19_) + class438.aFloat4864);
	aFloat10983
	    = i_22_ == -1 ? -1.0F : -class438.aFloat4863 - (float) (512
								    * i_22_);
	aFloat10975
	    = i_23_ == -1 ? -1.0F : -class438.aFloat4863 + (float) (i_23_
								    * 512);
	aFloat10976
	    = -1 == i_20_ ? -1.0F : class438.aFloat4865 - (float) (i_20_
								   * 512);
	aFloat10979 = (i_21_ == -1 ? -1.0F
		       : (float) (512 * i_21_) + class438.aFloat4865);
    }
    
    public void method14238(float f) {
	Class443 class443 = method17272(438022735);
	if (0 != anInt10977 * -334470185 || -1911440133 * anInt10978 != 0) {
	    Class443 class443_24_ = Class443.method7137();
	    class443_24_.method7147(1.0F, 0.0F, 0.0F,
				    (float) (3.141592653589793
					     * (double) (anInt10977
							 * -334470185)
					     * 2.0) / 16384.0F);
	    class443.method7158(class443_24_);
	    Class438 class438 = Class438.method6996(0.0F, 1.0F, 0.0F);
	    class438.method7021(class443);
	    Class443 class443_25_ = Class443.method7137();
	    class438.method7002();
	    class443_25_.method7146(class438,
				    ((float) (2.0
					      * (3.141592653589793
						 * (double) (anInt10978
							     * -1911440133)))
				     / 16384.0F));
	    class443.method7158(class443_25_);
	    method17278(class443, (byte) 1);
	    anInt10977 = 0;
	    anInt10978 = 0;
	}
	if (aClass298_8844.method5388((byte) 17) == Class305.aClass305_3266
	    && (0 != anInt10986 * 1200406943 || 59713917 * anInt10984 != 0)) {
	    class443.method7182();
	    Class347_Sub2 class347_sub2
		= (Class347_Sub2) aClass298_8844.method5380((byte) -122);
	    Class534_Sub36 class534_sub36
		= class347_sub2.method6133((byte) 30);
	    Class438 class438 = class534_sub36.method16483(926930123);
	    Class438 class438_26_
		= Class438.method6996(0.0F, 0.0F,
				      (float) (59713917 * anInt10984));
	    class438_26_.method7021(class443);
	    class438_26_.aFloat4863 *= -1.0F;
	    class438.method7026(class438_26_);
	    Class438 class438_27_
		= Class438.method6996((float) (1200406943 * anInt10986), 0.0F,
				      0.0F);
	    class438_27_.method7021(class443);
	    class438_27_.aFloat4863 *= -1.0F;
	    class438.method7026(class438_27_);
	    method17274(class438, 93071264);
	    class347_sub2.method15787
		(new Class534_Sub36(class534_sub36.anInt10796 * 955276319,
				    (int) class438.aFloat4864,
				    (int) class438.aFloat4863,
				    (int) class438.aFloat4865),
		 -1062631237);
	    anInt10986 = 0;
	    anInt10984 = 0;
	}
    }
    
    public void method17278(Class443 class443, byte i) {
	aClass443_10980.aFloat4881 = class443.aFloat4881;
	aClass443_10980.aFloat4884 = class443.aFloat4884;
	aClass443_10980.aFloat4883 = class443.aFloat4883;
	aClass443_10980.aFloat4879 = class443.aFloat4879;
	aClass443_10985.method7145(aClass443_10980);
    }
    
    public boolean method14245() {
	return (!Float.isNaN(aClass443_10985.aFloat4881)
		&& aClass298_8844.method5385((byte) 114) != null);
    }
    
    public void method14244(float f) {
	Class443 class443 = method17272(1505396907);
	if (0 != anInt10977 * -334470185 || -1911440133 * anInt10978 != 0) {
	    Class443 class443_28_ = Class443.method7137();
	    class443_28_.method7147(1.0F, 0.0F, 0.0F,
				    (float) (3.141592653589793
					     * (double) (anInt10977
							 * -334470185)
					     * 2.0) / 16384.0F);
	    class443.method7158(class443_28_);
	    Class438 class438 = Class438.method6996(0.0F, 1.0F, 0.0F);
	    class438.method7021(class443);
	    Class443 class443_29_ = Class443.method7137();
	    class438.method7002();
	    class443_29_.method7146(class438,
				    ((float) (2.0
					      * (3.141592653589793
						 * (double) (anInt10978
							     * -1911440133)))
				     / 16384.0F));
	    class443.method7158(class443_29_);
	    method17278(class443, (byte) 1);
	    anInt10977 = 0;
	    anInt10978 = 0;
	}
	if (aClass298_8844.method5388((byte) 64) == Class305.aClass305_3266
	    && (0 != anInt10986 * 1200406943 || 59713917 * anInt10984 != 0)) {
	    class443.method7182();
	    Class347_Sub2 class347_sub2
		= (Class347_Sub2) aClass298_8844.method5380((byte) -21);
	    Class534_Sub36 class534_sub36
		= class347_sub2.method6133((byte) 64);
	    Class438 class438 = class534_sub36.method16483(-199737678);
	    Class438 class438_30_
		= Class438.method6996(0.0F, 0.0F,
				      (float) (59713917 * anInt10984));
	    class438_30_.method7021(class443);
	    class438_30_.aFloat4863 *= -1.0F;
	    class438.method7026(class438_30_);
	    Class438 class438_31_
		= Class438.method6996((float) (1200406943 * anInt10986), 0.0F,
				      0.0F);
	    class438_31_.method7021(class443);
	    class438_31_.aFloat4863 *= -1.0F;
	    class438.method7026(class438_31_);
	    method17274(class438, -1030262992);
	    class347_sub2.method15787
		(new Class534_Sub36(class534_sub36.anInt10796 * 955276319,
				    (int) class438.aFloat4864,
				    (int) class438.aFloat4863,
				    (int) class438.aFloat4865),
		 -1062631237);
	    anInt10986 = 0;
	    anInt10984 = 0;
	}
    }
    
    public Class438 method14250() {
	Class438 class438 = new Class438(0.0F, 0.0F, 1000.0F);
	class438.method7021(Class443.method7200(aClass443_10980));
	class438.aFloat4863 *= -1.0F;
	class438.method7026(aClass298_8844.method5385((byte) 120));
	return class438;
    }
    
    public void method17279(int i) {
	anInt10984 = -2143463467 * i;
    }
    
    public Class438 method14241() {
	Class438 class438 = new Class438(0.0F, 0.0F, 1000.0F);
	class438.method7021(Class443.method7200(aClass443_10985));
	class438.aFloat4863 *= -1.0F;
	class438.method7026(aClass298_8844.method5385((byte) 125));
	return class438;
    }
    
    public Class438 method14249() {
	Class438 class438 = new Class438(0.0F, 0.0F, 1000.0F);
	class438.method7021(Class443.method7200(aClass443_10980));
	class438.aFloat4863 *= -1.0F;
	class438.method7026(aClass298_8844.method5385((byte) 117));
	return class438;
    }
    
    public Class438 method14248(int i) {
	Class438 class438 = new Class438(0.0F, 0.0F, 1000.0F);
	class438.method7021(Class443.method7200(aClass443_10980));
	class438.aFloat4863 *= -1.0F;
	class438.method7026(aClass298_8844.method5385((byte) 115));
	return class438;
    }
    
    public Class443 method17280() {
	return new Class443(aClass443_10985);
    }
    
    public void method17281(Class443 class443) {
	aClass443_10980.aFloat4881 = class443.aFloat4881;
	aClass443_10980.aFloat4884 = class443.aFloat4884;
	aClass443_10980.aFloat4883 = class443.aFloat4883;
	aClass443_10980.aFloat4879 = class443.aFloat4879;
	aClass443_10985.method7145(aClass443_10980);
    }
    
    public void method14242(float f) {
	Class443 class443 = method17272(-1439917426);
	if (0 != anInt10977 * -334470185 || -1911440133 * anInt10978 != 0) {
	    Class443 class443_32_ = Class443.method7137();
	    class443_32_.method7147(1.0F, 0.0F, 0.0F,
				    (float) (3.141592653589793
					     * (double) (anInt10977
							 * -334470185)
					     * 2.0) / 16384.0F);
	    class443.method7158(class443_32_);
	    Class438 class438 = Class438.method6996(0.0F, 1.0F, 0.0F);
	    class438.method7021(class443);
	    Class443 class443_33_ = Class443.method7137();
	    class438.method7002();
	    class443_33_.method7146(class438,
				    ((float) (2.0
					      * (3.141592653589793
						 * (double) (anInt10978
							     * -1911440133)))
				     / 16384.0F));
	    class443.method7158(class443_33_);
	    method17278(class443, (byte) 1);
	    anInt10977 = 0;
	    anInt10978 = 0;
	}
	if (aClass298_8844.method5388((byte) 71) == Class305.aClass305_3266
	    && (0 != anInt10986 * 1200406943 || 59713917 * anInt10984 != 0)) {
	    class443.method7182();
	    Class347_Sub2 class347_sub2
		= (Class347_Sub2) aClass298_8844.method5380((byte) -39);
	    Class534_Sub36 class534_sub36 = class347_sub2.method6133((byte) 8);
	    Class438 class438 = class534_sub36.method16483(-658084469);
	    Class438 class438_34_
		= Class438.method6996(0.0F, 0.0F,
				      (float) (59713917 * anInt10984));
	    class438_34_.method7021(class443);
	    class438_34_.aFloat4863 *= -1.0F;
	    class438.method7026(class438_34_);
	    Class438 class438_35_
		= Class438.method6996((float) (1200406943 * anInt10986), 0.0F,
				      0.0F);
	    class438_35_.method7021(class443);
	    class438_35_.aFloat4863 *= -1.0F;
	    class438.method7026(class438_35_);
	    method17274(class438, 381986711);
	    class347_sub2.method15787
		(new Class534_Sub36(class534_sub36.anInt10796 * 955276319,
				    (int) class438.aFloat4864,
				    (int) class438.aFloat4863,
				    (int) class438.aFloat4865),
		 -1062631237);
	    anInt10986 = 0;
	    anInt10984 = 0;
	}
    }
    
    public void method17282(int i) {
	anInt10978 = -1754075597 * i;
    }
    
    public void method17283(int i) {
	anInt10978 = -1754075597 * i;
    }
    
    public void method14246(Class287 class287, Class446 class446, int i,
			    int i_36_, float f) {
	Class438 class438
	    = Class438.method6994(aClass298_8844.method5385((byte) 115));
	class438.aFloat4864 -= (float) i;
	class438.aFloat4865 -= (float) i_36_;
	class438.aFloat4863 *= -1.0F;
	class446.method7262(Class443.method7200(aClass443_10985));
	class446.method7251(class438);
	class446.method7243();
	class438.method7074();
    }
    
    void method17284(Class438 class438) {
	if (-1.0F != aFloat10981 && class438.aFloat4864 < aFloat10981)
	    class438.aFloat4864 = aFloat10981;
	if (aFloat10982 != -1.0F && class438.aFloat4864 > aFloat10982)
	    class438.aFloat4864 = aFloat10982;
	if (aFloat10983 != -1.0F && class438.aFloat4863 < aFloat10983)
	    class438.aFloat4863 = aFloat10983;
	if (-1.0F != aFloat10975 && class438.aFloat4863 > aFloat10975)
	    class438.aFloat4863 = aFloat10975;
	if (aFloat10976 != -1.0F && class438.aFloat4865 < aFloat10976)
	    class438.aFloat4865 = aFloat10976;
	if (-1.0F != aFloat10979 && class438.aFloat4865 > aFloat10979)
	    class438.aFloat4865 = aFloat10979;
    }
    
    void method17285(Class438 class438) {
	if (-1.0F != aFloat10981 && class438.aFloat4864 < aFloat10981)
	    class438.aFloat4864 = aFloat10981;
	if (aFloat10982 != -1.0F && class438.aFloat4864 > aFloat10982)
	    class438.aFloat4864 = aFloat10982;
	if (aFloat10983 != -1.0F && class438.aFloat4863 < aFloat10983)
	    class438.aFloat4863 = aFloat10983;
	if (-1.0F != aFloat10975 && class438.aFloat4863 > aFloat10975)
	    class438.aFloat4863 = aFloat10975;
	if (aFloat10976 != -1.0F && class438.aFloat4865 < aFloat10976)
	    class438.aFloat4865 = aFloat10976;
	if (-1.0F != aFloat10979 && class438.aFloat4865 > aFloat10979)
	    class438.aFloat4865 = aFloat10979;
    }
    
    void method17286(Class438 class438) {
	if (-1.0F != aFloat10981 && class438.aFloat4864 < aFloat10981)
	    class438.aFloat4864 = aFloat10981;
	if (aFloat10982 != -1.0F && class438.aFloat4864 > aFloat10982)
	    class438.aFloat4864 = aFloat10982;
	if (aFloat10983 != -1.0F && class438.aFloat4863 < aFloat10983)
	    class438.aFloat4863 = aFloat10983;
	if (-1.0F != aFloat10975 && class438.aFloat4863 > aFloat10975)
	    class438.aFloat4863 = aFloat10975;
	if (aFloat10976 != -1.0F && class438.aFloat4865 < aFloat10976)
	    class438.aFloat4865 = aFloat10976;
	if (-1.0F != aFloat10979 && class438.aFloat4865 > aFloat10979)
	    class438.aFloat4865 = aFloat10979;
    }
    
    public void method17287(Class438 class438, int i, int i_37_, int i_38_,
			    int i_39_, int i_40_, int i_41_) {
	aFloat10981
	    = i == -1 ? -1.0F : class438.aFloat4864 - (float) (512 * i);
	aFloat10982 = (i_37_ == -1 ? -1.0F
		       : (float) (512 * i_37_) + class438.aFloat4864);
	aFloat10983
	    = i_40_ == -1 ? -1.0F : -class438.aFloat4863 - (float) (512
								    * i_40_);
	aFloat10975
	    = i_41_ == -1 ? -1.0F : -class438.aFloat4863 + (float) (i_41_
								    * 512);
	aFloat10976
	    = -1 == i_38_ ? -1.0F : class438.aFloat4865 - (float) (i_38_
								   * 512);
	aFloat10979 = (i_39_ == -1 ? -1.0F
		       : (float) (512 * i_39_) + class438.aFloat4865);
    }
    
    public Class438 method14247() {
	Class438 class438 = new Class438(0.0F, 0.0F, 1000.0F);
	class438.method7021(Class443.method7200(aClass443_10985));
	class438.aFloat4863 *= -1.0F;
	class438.method7026(aClass298_8844.method5385((byte) 127));
	return class438;
    }
    
    public void method17288(Class438 class438, int i, int i_42_, int i_43_,
			    int i_44_, int i_45_, int i_46_) {
	aFloat10981
	    = i == -1 ? -1.0F : class438.aFloat4864 - (float) (512 * i);
	aFloat10982 = (i_42_ == -1 ? -1.0F
		       : (float) (512 * i_42_) + class438.aFloat4864);
	aFloat10983
	    = i_45_ == -1 ? -1.0F : -class438.aFloat4863 - (float) (512
								    * i_45_);
	aFloat10975
	    = i_46_ == -1 ? -1.0F : -class438.aFloat4863 + (float) (i_46_
								    * 512);
	aFloat10976
	    = -1 == i_43_ ? -1.0F : class438.aFloat4865 - (float) (i_43_
								   * 512);
	aFloat10979 = (i_44_ == -1 ? -1.0F
		       : (float) (512 * i_44_) + class438.aFloat4865);
    }
    
    public Class438 method14243() {
	Class438 class438 = new Class438(0.0F, 0.0F, 1000.0F);
	class438.method7021(Class443.method7200(aClass443_10985));
	class438.aFloat4863 *= -1.0F;
	class438.method7026(aClass298_8844.method5385((byte) 114));
	return class438;
    }
    
    public Class443 method17289() {
	return new Class443(aClass443_10985);
    }
    
    static {
	anInt10984 = 0;
	aFloat10981 = -1.0F;
	aFloat10982 = -1.0F;
	aFloat10983 = -1.0F;
	aFloat10975 = -1.0F;
	aFloat10976 = -1.0F;
	aFloat10979 = -1.0F;
    }
    
    public static long method17290(int i, int i_47_, int i_48_, int i_49_,
				   int i_50_, int i_51_, int i_52_) {
	Class84.aCalendar837.clear();
	Class84.aCalendar837.set(i_51_, i_50_, i_49_, i_48_, i_47_, i);
	return Class84.aCalendar837.getTime().getTime();
    }
}
