/* Class654_Sub1_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class654_Sub1_Sub5_Sub2 extends Class654_Sub1_Sub5
    implements Interface62
{
    byte aByte12005;
    Class183 aClass183_12006;
    Class534_Sub18_Sub16 aClass534_Sub18_Sub16_12007;
    boolean aBool12008;
    int anInt12009;
    Class564 aClass564_12010;
    byte aByte12011;
    boolean aBool12012;
    boolean aBool12013;
    Class44_Sub13 aClass44_Sub13_12014;
    boolean aBool12015;
    boolean aBool12016;
    
    public void method141() {
	if (null != aClass183_12006)
	    aClass183_12006.method3014();
    }
    
    boolean method16849(int i) {
	if (aClass183_12006 != null)
	    return !aClass183_12006.method3062();
	return true;
    }
    
    boolean method16850(int i) {
	if (null != aClass183_12006)
	    return aClass183_12006.method3027();
	return false;
    }
    
    public int method16866() {
	return null != aClass183_12006 ? aClass183_12006.method3045() : 0;
    }
    
    Class183 method18621(Class185 class185, int i, int i_0_) {
	if (aClass183_12006 != null
	    && class185.method3330(aClass183_12006.method3101(), i) == 0)
	    return aClass183_12006;
	Class7 class7 = method18622(class185, i, false, -26007294);
	if (null != class7)
	    return (Class183) class7.anObject58;
	return null;
    }
    
    Class7 method18622(Class185 class185, int i, boolean bool, int i_1_) {
	Class602 class602
	    = ((Class602)
	       aClass44_Sub13_12014.method91(anInt12009 * -1368245725,
					     239909749));
	Class151 class151;
	Class151 class151_2_;
	if (aBool12008) {
	    class151 = aClass556_10855.aClass151Array7436[aByte10853];
	    class151_2_ = aClass556_10855.aClass151Array7434[0];
	} else {
	    class151 = aClass556_10855.aClass151Array7434[aByte10853];
	    if (aByte10853 < 3)
		class151_2_
		    = aClass556_10855.aClass151Array7434[1 + aByte10853];
	    else
		class151_2_ = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	return (class602.method9997
		(class185, i,
		 (aByte12005 != Class595.aClass595_7850.anInt7852 * 847393323
		  ? (int) aByte12005
		  : Class595.aClass595_7836.anInt7852 * 847393323),
		 (aByte12005 == Class595.aClass595_7850.anInt7852 * 847393323
		  ? (int) (4 + aByte12011) : aByte12011),
		 class151, class151_2_, (int) class438.aFloat4864,
		 (int) class438.aFloat4863, (int) class438.aFloat4865, bool,
		 null, 428199971));
    }
    
    public Class564 method16855(Class185 class185, short i) {
	Class438 class438 = method10807().aClass438_4885;
	if (aClass564_12010 == null)
	    aClass564_12010
		= Class528.method8820((int) class438.aFloat4864,
				      (int) class438.aFloat4863,
				      (int) class438.aFloat4865,
				      method18621(class185, 0, 1450300181),
				      (byte) 66);
	return aClass564_12010;
    }
    
    Class550 method16853(Class185 class185, int i) {
	if (aClass183_12006 == null)
	    return null;
	Class446 class446 = method10834();
	Class550 class550 = Class322.method5779(aBool12012, -472920851);
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12014.method91(-1368245725 * anInt12009,
					      -290272556))
	       .aClass432_7956);
	if (class432 != null) {
	    aClass183_12006.method3034(class446, null, 0);
	    class185.method3311(class446, aClass194Array10852[0], class432);
	} else
	    aClass183_12006.method3034(class446, aClass194Array10852[0], 0);
	return class550;
    }
    
    void method16868(Class185 class185, int i) {
	/* empty */
    }
    
    boolean method16846(Class185 class185, int i, int i_3_, byte i_4_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12014.method91(-1368245725 * anInt12009,
					      1229143727))
	       .aClass432_7956);
	if (null != class432)
	    return class185.method3309(i, i_3_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18621(class185, 131072, 1705225227);
	if (null != class183) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_3_, class446, false, 0);
	}
	return false;
    }
    
    public int method9() {
	return aByte12005;
    }
    
    void method16851(Class185 class185, Class654_Sub1 class654_sub1, int i,
		     int i_5_, int i_6_, boolean bool, int i_7_) {
	if (class654_sub1 instanceof Class654_Sub1_Sub1_Sub1) {
	    Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1
		= (Class654_Sub1_Sub1_Sub1) class654_sub1;
	    if (aClass183_12006 != null
		&& null != class654_sub1_sub1_sub1.aClass183_11995)
		aClass183_12006.method3077((class654_sub1_sub1_sub1
					    .aClass183_11995),
					   i, i_5_, i_6_, bool);
	} else if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub2) {
	    Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2_8_
		= (Class654_Sub1_Sub5_Sub2) class654_sub1;
	    if (aClass183_12006 != null
		&& class654_sub1_sub5_sub2_8_.aClass183_12006 != null)
		aClass183_12006.method3077((class654_sub1_sub5_sub2_8_
					    .aClass183_12006),
					   i, i_5_, i_6_, bool);
	}
    }
    
    void method16852(int i) {
	aBool12013 = false;
	if (null != aClass183_12006)
	    aClass183_12006
		.method3012(aClass183_12006.method3101() & ~0x10000);
    }
    
    public int method56(int i) {
	return anInt12009 * -1368245725;
    }
    
    public int method252() {
	return anInt12009 * -1368245725;
    }
    
    public int method254() {
	return anInt12009 * -1368245725;
    }
    
    public void method411(int i) {
	if (null != aClass183_12006)
	    aClass183_12006.method3014();
    }
    
    public boolean method413(byte i) {
	return aBool12016;
    }
    
    public boolean method419(byte i) {
	return aBool12015;
    }
    
    public int method410(int i) {
	return aByte12011;
    }
    
    public void method414(Class185 class185, int i) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12007 && aBool12015) {
	    Class7 class7 = method18622(class185, 262144, true, -467394202);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12007;
	    aClass534_Sub18_Sub16_12007 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9276(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       -780491788);
    }
    
    public int method18623(int i) {
	return aClass183_12006 != null ? aClass183_12006.method3041() / 4 : 15;
    }
    
    boolean method16873(Class185 class185, int i, int i_9_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12014.method91(-1368245725 * anInt12009,
					      -639624024))
	       .aClass432_7956);
	if (null != class432)
	    return class185.method3309(i, i_9_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18621(class185, 131072, 1499034784);
	if (null != class183) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_9_, class446, false, 0);
	}
	return false;
    }
    
    public int method145() {
	return aByte12011;
    }
    
    public void method144() {
	if (null != aClass183_12006)
	    aClass183_12006.method3014();
    }
    
    public void method408(Class185 class185, byte i) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12007 && aBool12015) {
	    Class7 class7 = method18622(class185, 262144, true, 158894556);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (null != class7 ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12007;
	    aClass534_Sub18_Sub16_12007 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) -65);
    }
    
    void method16883(Class185 class185, Class654_Sub1 class654_sub1, int i,
		     int i_10_, int i_11_, boolean bool) {
	if (class654_sub1 instanceof Class654_Sub1_Sub1_Sub1) {
	    Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1
		= (Class654_Sub1_Sub1_Sub1) class654_sub1;
	    if (aClass183_12006 != null
		&& null != class654_sub1_sub1_sub1.aClass183_11995)
		aClass183_12006.method3077((class654_sub1_sub1_sub1
					    .aClass183_11995),
					   i, i_10_, i_11_, bool);
	} else if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub2) {
	    Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2_12_
		= (Class654_Sub1_Sub5_Sub2) class654_sub1;
	    if (aClass183_12006 != null
		&& class654_sub1_sub5_sub2_12_.aClass183_12006 != null)
		aClass183_12006.method3077((class654_sub1_sub5_sub2_12_
					    .aClass183_12006),
					   i, i_10_, i_11_, bool);
	}
    }
    
    public int method409(int i) {
	return aByte12005;
    }
    
    public void method417(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12007 && aBool12015) {
	    Class7 class7 = method18622(class185, 262144, true, -1224806866);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (null != class7 ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12007;
	    aClass534_Sub18_Sub16_12007 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) 19);
    }
    
    public void method422(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12007 && aBool12015) {
	    Class7 class7 = method18622(class185, 262144, true, 1166711077);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (null != class7 ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12007;
	    aClass534_Sub18_Sub16_12007 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) -86);
    }
    
    public void method418(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12007 && aBool12015) {
	    Class7 class7 = method18622(class185, 262144, true, 643075197);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (null != class7 ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12007;
	    aClass534_Sub18_Sub16_12007 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) 56);
    }
    
    public void method421(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12007 && aBool12015) {
	    Class7 class7 = method18622(class185, 262144, true, -2028010008);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12007;
	    aClass534_Sub18_Sub16_12007 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9276(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       -355747204);
    }
    
    public void method420(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12007 && aBool12015) {
	    Class7 class7 = method18622(class185, 262144, true, -681562901);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12007;
	    aClass534_Sub18_Sub16_12007 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9276(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       1354113482);
    }
    
    void method16845() {
	aBool12013 = false;
	if (null != aClass183_12006)
	    aClass183_12006
		.method3012(aClass183_12006.method3101() & ~0x10000);
    }
    
    boolean method16864() {
	if (aClass183_12006 != null)
	    return !aClass183_12006.method3062();
	return true;
    }
    
    public int method18624() {
	return aClass183_12006 != null ? aClass183_12006.method3041() / 4 : 15;
    }
    
    boolean method16869() {
	if (null != aClass183_12006)
	    return aClass183_12006.method3027();
	return false;
    }
    
    public int method181() {
	return aByte12011;
    }
    
    public int method16867() {
	return null != aClass183_12006 ? aClass183_12006.method3045() : 0;
    }
    
    public Class564 method16872(Class185 class185) {
	Class438 class438 = method10807().aClass438_4885;
	if (aClass564_12010 == null)
	    aClass564_12010
		= Class528.method8820((int) class438.aFloat4864,
				      (int) class438.aFloat4863,
				      (int) class438.aFloat4865,
				      method18621(class185, 0, 1619905613),
				      (byte) 51);
	return aClass564_12010;
    }
    
    boolean method16895() {
	if (aClass183_12006 != null)
	    return !aClass183_12006.method3062();
	return true;
    }
    
    void method16871(Class185 class185) {
	/* empty */
    }
    
    Class183 method18625(Class185 class185, int i) {
	if (aClass183_12006 != null
	    && class185.method3330(aClass183_12006.method3101(), i) == 0)
	    return aClass183_12006;
	Class7 class7 = method18622(class185, i, false, -115357080);
	if (null != class7)
	    return (Class183) class7.anObject58;
	return null;
    }
    
    public Class564 method16870(Class185 class185) {
	Class438 class438 = method10807().aClass438_4885;
	if (aClass564_12010 == null)
	    aClass564_12010
		= Class528.method8820((int) class438.aFloat4864,
				      (int) class438.aFloat4863,
				      (int) class438.aFloat4865,
				      method18621(class185, 0, 1411250450),
				      (byte) 61);
	return aClass564_12010;
    }
    
    boolean method16874(Class185 class185, int i, int i_13_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12014.method91(-1368245725 * anInt12009,
					      550551651))
	       .aClass432_7956);
	if (null != class432)
	    return class185.method3309(i, i_13_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18621(class185, 131072, 1405657722);
	if (null != class183) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_13_, class446, false, 0);
	}
	return false;
    }
    
    boolean method16882(Class185 class185, int i, int i_14_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12014.method91(-1368245725 * anInt12009,
					      213341769))
	       .aClass432_7956);
	if (null != class432)
	    return class185.method3309(i, i_14_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18621(class185, 131072, 1201498952);
	if (null != class183) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_14_, class446, false, 0);
	}
	return false;
    }
    
    boolean method16861() {
	return aBool12013;
    }
    
    boolean method16848(byte i) {
	return aBool12013;
    }
    
    public int method16876(int i) {
	return null != aClass183_12006 ? aClass183_12006.method3045() : 0;
    }
    
    boolean method16880(Class185 class185, int i, int i_15_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12014.method91(-1368245725 * anInt12009,
					      1518377378))
	       .aClass432_7956);
	if (null != class432)
	    return class185.method3309(i, i_15_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18621(class185, 131072, 2097720826);
	if (null != class183) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_15_, class446, false, 0);
	}
	return false;
    }
    
    void method16881() {
	aBool12013 = false;
	if (null != aClass183_12006)
	    aClass183_12006
		.method3012(aClass183_12006.method3101() & ~0x10000);
    }
    
    boolean method16879() {
	if (null != aClass183_12006)
	    return aClass183_12006.method3027();
	return false;
    }
    
    public Class654_Sub1_Sub5_Sub2
	(Class556 class556, Class185 class185, Class44_Sub13 class44_sub13,
	 Class602 class602, int i, int i_16_, int i_17_, int i_18_, int i_19_,
	 boolean bool, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_,
	 int i_25_, boolean bool_26_, boolean bool_27_) {
	super(class556, i, i_16_, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_,
	      i_23_, class602.anInt7940 * 1288889595 == 1,
	      Class304.method5598(i_24_, i_25_, (byte) 22));
	aClass44_Sub13_12014 = class44_sub13;
	anInt12009 = 531068291 * class602.anInt7887;
	aByte10853 = (byte) i_16_;
	aBool12008 = bool;
	aByte12005 = (byte) i_24_;
	aByte12011 = (byte) i_25_;
	aBool12012 = 0 != -2134171963 * class602.anInt7907 && !bool;
	aBool12013 = bool_26_;
	aBool12015
	    = (class185.method3436() && class602.aBool7896 && !aBool12008
	       && Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
		      .method16923((byte) 59) != 0);
	aBool12016 = bool_27_;
	int i_28_ = 2048;
	if (aBool12013)
	    i_28_ |= 0x10000;
	if (class602.aBool7962)
	    i_28_ |= 0x80000;
	Class7 class7 = method18622(class185, i_28_, aBool12015, -1874845801);
	if (class7 != null) {
	    aClass183_12006 = (Class183) class7.anObject58;
	    aClass534_Sub18_Sub16_12007
		= (Class534_Sub18_Sub16) class7.anObject59;
	    if (aBool12013 || class602.aBool7962) {
		aClass183_12006
		    = aClass183_12006.method3011((byte) 0, i_28_, false);
		if (class602.aBool7962) {
		    Class514 class514
			= client.aClass512_11100.method8420(-1878652853);
		    aClass183_12006.method3058
			(class514.anInt5728 * -1440569789,
			 -1149266637 * class514.anInt5729,
			 class514.anInt5730 * -469029139,
			 class514.anInt5731 * -2027110357);
		}
	    }
	}
	method16862(1, -587678212);
    }
    
    public int method253() {
	return anInt12009 * -1368245725;
    }
    
    public boolean method416() {
	return aBool12015;
    }
    
    public boolean method412() {
	return aBool12016;
    }
    
    public boolean method415() {
	return aBool12016;
    }
    
    public boolean method260() {
	return aBool12016;
    }
    
    public boolean method423() {
	return aBool12016;
    }
    
    Class550 method16884(Class185 class185) {
	if (aClass183_12006 == null)
	    return null;
	Class446 class446 = method10834();
	Class550 class550 = Class322.method5779(aBool12012, -570468411);
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12014.method91(-1368245725 * anInt12009,
					      820990252))
	       .aClass432_7956);
	if (class432 != null) {
	    aClass183_12006.method3034(class446, null, 0);
	    class185.method3311(class446, aClass194Array10852[0], class432);
	} else
	    aClass183_12006.method3034(class446, aClass194Array10852[0], 0);
	return class550;
    }
    
    Class183 method18626(Class185 class185, int i) {
	if (aClass183_12006 != null
	    && class185.method3330(aClass183_12006.method3101(), i) == 0)
	    return aClass183_12006;
	Class7 class7 = method18622(class185, i, false, -1716455753);
	if (null != class7)
	    return (Class183) class7.anObject58;
	return null;
    }
    
    void method16865() {
	aBool12013 = false;
	if (null != aClass183_12006)
	    aClass183_12006
		.method3012(aClass183_12006.method3101() & ~0x10000);
    }
    
    Class7 method18627(Class185 class185, int i, boolean bool) {
	Class602 class602
	    = ((Class602)
	       aClass44_Sub13_12014.method91(anInt12009 * -1368245725,
					     -695470049));
	Class151 class151;
	Class151 class151_29_;
	if (aBool12008) {
	    class151 = aClass556_10855.aClass151Array7436[aByte10853];
	    class151_29_ = aClass556_10855.aClass151Array7434[0];
	} else {
	    class151 = aClass556_10855.aClass151Array7434[aByte10853];
	    if (aByte10853 < 3)
		class151_29_
		    = aClass556_10855.aClass151Array7434[1 + aByte10853];
	    else
		class151_29_ = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	return (class602.method9997
		(class185, i,
		 (aByte12005 != Class595.aClass595_7850.anInt7852 * 847393323
		  ? (int) aByte12005
		  : Class595.aClass595_7836.anInt7852 * 847393323),
		 (aByte12005 == Class595.aClass595_7850.anInt7852 * 847393323
		  ? (int) (4 + aByte12011) : aByte12011),
		 class151, class151_29_, (int) class438.aFloat4864,
		 (int) class438.aFloat4863, (int) class438.aFloat4865, bool,
		 null, 1125499645));
    }
    
    Class7 method18628(Class185 class185, int i, boolean bool) {
	Class602 class602
	    = ((Class602)
	       aClass44_Sub13_12014.method91(anInt12009 * -1368245725,
					     346759173));
	Class151 class151;
	Class151 class151_30_;
	if (aBool12008) {
	    class151 = aClass556_10855.aClass151Array7436[aByte10853];
	    class151_30_ = aClass556_10855.aClass151Array7434[0];
	} else {
	    class151 = aClass556_10855.aClass151Array7434[aByte10853];
	    if (aByte10853 < 3)
		class151_30_
		    = aClass556_10855.aClass151Array7434[1 + aByte10853];
	    else
		class151_30_ = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	return (class602.method9997
		(class185, i,
		 (aByte12005 != Class595.aClass595_7850.anInt7852 * 847393323
		  ? (int) aByte12005
		  : Class595.aClass595_7836.anInt7852 * 847393323),
		 (aByte12005 == Class595.aClass595_7850.anInt7852 * 847393323
		  ? (int) (4 + aByte12011) : aByte12011),
		 class151, class151_30_, (int) class438.aFloat4864,
		 (int) class438.aFloat4863, (int) class438.aFloat4865, bool,
		 null, 387161133));
    }
    
    public int method18629() {
	return aClass183_12006 != null ? aClass183_12006.method3041() / 4 : 15;
    }
    
    void method16877(Class185 class185, Class654_Sub1 class654_sub1, int i,
		     int i_31_, int i_32_, boolean bool) {
	if (class654_sub1 instanceof Class654_Sub1_Sub1_Sub1) {
	    Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1
		= (Class654_Sub1_Sub1_Sub1) class654_sub1;
	    if (aClass183_12006 != null
		&& null != class654_sub1_sub1_sub1.aClass183_11995)
		aClass183_12006.method3077((class654_sub1_sub1_sub1
					    .aClass183_11995),
					   i, i_31_, i_32_, bool);
	} else if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub2) {
	    Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2_33_
		= (Class654_Sub1_Sub5_Sub2) class654_sub1;
	    if (aClass183_12006 != null
		&& class654_sub1_sub5_sub2_33_.aClass183_12006 != null)
		aClass183_12006.method3077((class654_sub1_sub5_sub2_33_
					    .aClass183_12006),
					   i, i_31_, i_32_, bool);
	}
    }
    
    public static void method18630(String string, byte i) {
	Class114.aString1396 = string;
	Class114.anInt1389 = Class114.aString1396.length() * 399107939;
    }
    
    static final void method18631(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub37_10760
		  .method17192(2013146551);
    }
}
