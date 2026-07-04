/* Class654_Sub1_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class654_Sub1_Sub2_Sub1 extends Class654_Sub1_Sub2
    implements Interface62
{
    boolean aBool12052;
    Class183 aClass183_12053;
    Class44_Sub13 aClass44_Sub13_12054;
    byte aByte12055;
    int anInt12056;
    boolean aBool12057;
    Class564 aClass564_12058;
    boolean aBool12059;
    Class534_Sub18_Sub16 aClass534_Sub18_Sub16_12060;
    boolean aBool12061;
    
    void method16851(Class185 class185, Class654_Sub1 class654_sub1, int i,
		     int i_0_, int i_1_, boolean bool, int i_2_) {
	if (class654_sub1 instanceof Class654_Sub1_Sub2_Sub1) {
	    Class654_Sub1_Sub2_Sub1 class654_sub1_sub2_sub1_3_
		= (Class654_Sub1_Sub2_Sub1) class654_sub1;
	    if (null != aClass183_12053
		&& class654_sub1_sub2_sub1_3_.aClass183_12053 != null)
		aClass183_12053.method3077((class654_sub1_sub2_sub1_3_
					    .aClass183_12053),
					   i, i_0_, i_1_, bool);
	}
    }
    
    void method16871(Class185 class185) {
	/* empty */
    }
    
    boolean method16850(int i) {
	if (null != aClass183_12053)
	    return aClass183_12053.method3027();
	return false;
    }
    
    public int method16876(int i) {
	return null != aClass183_12053 ? aClass183_12053.method3045() : 0;
    }
    
    Class183 method18660(Class185 class185, int i, int i_4_) {
	if (aClass183_12053 != null
	    && class185.method3330(aClass183_12053.method3101(), i) == 0)
	    return aClass183_12053;
	Class7 class7 = method18661(class185, i, false, (byte) 0);
	if (null != class7)
	    return (Class183) class7.anObject58;
	return null;
    }
    
    boolean method16869() {
	if (null != aClass183_12053)
	    return aClass183_12053.method3027();
	return false;
    }
    
    void method16881() {
	aBool12057 = false;
	if (null != aClass183_12053)
	    aClass183_12053
		.method3012(aClass183_12053.method3101() & ~0x10000);
    }
    
    public boolean method419(byte i) {
	return aBool12061;
    }
    
    public Class564 method16855(Class185 class185, short i) {
	Class438 class438 = method10807().aClass438_4885;
	if (null == aClass564_12058)
	    aClass564_12058
		= Class528.method8820((int) class438.aFloat4864,
				      (int) class438.aFloat4863,
				      (int) class438.aFloat4865,
				      method18660(class185, 0, 1974551593),
				      (byte) 85);
	return aClass564_12058;
    }
    
    boolean method16861() {
	return aBool12057;
    }
    
    boolean method16848(byte i) {
	return aBool12057;
    }
    
    public Class654_Sub1_Sub2_Sub1
	(Class556 class556, Class185 class185, Class44_Sub13 class44_sub13,
	 Class602 class602, int i, int i_5_, int i_6_, int i_7_, int i_8_,
	 boolean bool, int i_9_, boolean bool_10_) {
	super(class556, i_6_, i_7_, i_8_, i, i_5_,
	      -1303202133 * class602.anInt7941);
	aClass44_Sub13_12054 = class44_sub13;
	anInt12056 = -534220601 * class602.anInt7887;
	aBool12052 = bool;
	aByte12055 = (byte) i_9_;
	aBool12059 = -2134171963 * class602.anInt7907 != 0 && !bool;
	aBool12057 = bool_10_;
	aBool12061
	    = (class185.method3436() && class602.aBool7896 && !aBool12052
	       && Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
		      .method16923((byte) 22) != 0);
	int i_11_ = 2048;
	if (aBool12057)
	    i_11_ |= 0x10000;
	if (class602.aBool7962)
	    i_11_ |= 0x80000;
	Class7 class7 = method18661(class185, i_11_, aBool12061, (byte) 0);
	if (class7 != null) {
	    aClass183_12053 = (Class183) class7.anObject58;
	    aClass534_Sub18_Sub16_12060
		= (Class534_Sub18_Sub16) class7.anObject59;
	    if (aBool12057 || class602.aBool7962) {
		aClass183_12053
		    = aClass183_12053.method3011((byte) 0, i_11_, false);
		if (class602.aBool7962) {
		    Class514 class514
			= client.aClass512_11100.method8420(-11368959);
		    aClass183_12053.method3058
			(class514.anInt5728 * -1440569789,
			 class514.anInt5729 * -1149266637,
			 class514.anInt5730 * -469029139,
			 -2027110357 * class514.anInt5731);
		}
	    }
	}
	method16862(1, -18818759);
    }
    
    void method16852(int i) {
	aBool12057 = false;
	if (null != aClass183_12053)
	    aClass183_12053
		.method3012(aClass183_12053.method3101() & ~0x10000);
    }
    
    public int method56(int i) {
	return anInt12056 * -1970666801;
    }
    
    public void method421(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12060 && aBool12061) {
	    Class7 class7 = method18661(class185, 262144, true, (byte) 0);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12060;
	    aClass534_Sub18_Sub16_12060 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (class534_sub18_sub16 != null)
	    aClass556_10855.method9276(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       -11940272);
    }
    
    public int method410(int i) {
	return aByte12055;
    }
    
    Class550 method16853(Class185 class185, int i) {
	if (null == aClass183_12053)
	    return null;
	Class446 class446 = method10834();
	Class550 class550 = Class322.method5779(aBool12059, 860978084);
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12054.method91(anInt12056 * -1970666801,
					      -1268418918))
	       .aClass432_7956);
	if (class432 != null) {
	    aClass183_12053.method3034(class446, null, 0);
	    class185.method3311(class446, aClass194Array10852[0], class432);
	} else
	    aClass183_12053.method3034(class446, aClass194Array10852[0], 0);
	return class550;
    }
    
    boolean method16849(int i) {
	if (null != aClass183_12053)
	    return !aClass183_12053.method3062();
	return true;
    }
    
    public void method418(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12060 && aBool12061) {
	    Class7 class7 = method18661(class185, 262144, true, (byte) 0);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (null != class7 ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12060;
	    aClass534_Sub18_Sub16_12060 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (class534_sub18_sub16 != null)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) 12);
    }
    
    public void method408(Class185 class185, byte i) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12060 && aBool12061) {
	    Class7 class7 = method18661(class185, 262144, true, (byte) 0);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (null != class7 ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12060;
	    aClass534_Sub18_Sub16_12060 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (class534_sub18_sub16 != null)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) -6);
    }
    
    public void method414(Class185 class185, int i) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12060 && aBool12061) {
	    Class7 class7 = method18661(class185, 262144, true, (byte) 0);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12060;
	    aClass534_Sub18_Sub16_12060 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (class534_sub18_sub16 != null)
	    aClass556_10855.method9276(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       490582405);
    }
    
    public int method9() {
	return 847393323 * Class595.aClass595_7846.anInt7852;
    }
    
    public int method145() {
	return aByte12055;
    }
    
    public int method181() {
	return aByte12055;
    }
    
    public void method141() {
	if (null != aClass183_12053)
	    aClass183_12053.method3014();
    }
    
    public void method144() {
	if (null != aClass183_12053)
	    aClass183_12053.method3014();
    }
    
    public boolean method416() {
	return aBool12061;
    }
    
    public void method417(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12060 && aBool12061) {
	    Class7 class7 = method18661(class185, 262144, true, (byte) 0);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (null != class7 ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12060;
	    aClass534_Sub18_Sub16_12060 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (class534_sub18_sub16 != null)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) -17);
    }
    
    public void method422(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12060 && aBool12061) {
	    Class7 class7 = method18661(class185, 262144, true, (byte) 0);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (null != class7 ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12060;
	    aClass534_Sub18_Sub16_12060 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (class534_sub18_sub16 != null)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) -67);
    }
    
    public int method254() {
	return anInt12056 * -1970666801;
    }
    
    public void method411(int i) {
	if (null != aClass183_12053)
	    aClass183_12053.method3014();
    }
    
    public void method420(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12060 && aBool12061) {
	    Class7 class7 = method18661(class185, 262144, true, (byte) 0);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12060;
	    aClass534_Sub18_Sub16_12060 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (class534_sub18_sub16 != null)
	    aClass556_10855.method9276(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       271384692);
    }
    
    boolean method16895() {
	if (null != aClass183_12053)
	    return !aClass183_12053.method3062();
	return true;
    }
    
    boolean method16864() {
	if (null != aClass183_12053)
	    return !aClass183_12053.method3062();
	return true;
    }
    
    boolean method16879() {
	if (null != aClass183_12053)
	    return aClass183_12053.method3027();
	return false;
    }
    
    Class7 method18661(Class185 class185, int i, boolean bool, byte i_12_) {
	Class602 class602
	    = ((Class602)
	       aClass44_Sub13_12054.method91(-1970666801 * anInt12056,
					     -2119976163));
	Class151 class151;
	Class151 class151_13_;
	if (aBool12052) {
	    class151 = aClass556_10855.aClass151Array7436[aByte10853];
	    class151_13_ = aClass556_10855.aClass151Array7434[0];
	} else {
	    class151 = aClass556_10855.aClass151Array7434[aByte10853];
	    if (aByte10853 < 3)
		class151_13_
		    = aClass556_10855.aClass151Array7434[1 + aByte10853];
	    else
		class151_13_ = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	return class602.method9997(class185, i,
				   (847393323
				    * Class595.aClass595_7846.anInt7852),
				   aByte12055, class151, class151_13_,
				   (int) class438.aFloat4864,
				   (int) class438.aFloat4863,
				   (int) class438.aFloat4865, bool, null,
				   2115713274);
    }
    
    public Class564 method16872(Class185 class185) {
	Class438 class438 = method10807().aClass438_4885;
	if (null == aClass564_12058)
	    aClass564_12058
		= Class528.method8820((int) class438.aFloat4864,
				      (int) class438.aFloat4863,
				      (int) class438.aFloat4865,
				      method18660(class185, 0, 1322286951),
				      (byte) 111);
	return aClass564_12058;
    }
    
    public int method16866() {
	return null != aClass183_12053 ? aClass183_12053.method3045() : 0;
    }
    
    public Class564 method16870(Class185 class185) {
	Class438 class438 = method10807().aClass438_4885;
	if (null == aClass564_12058)
	    aClass564_12058
		= Class528.method8820((int) class438.aFloat4864,
				      (int) class438.aFloat4863,
				      (int) class438.aFloat4865,
				      method18660(class185, 0, 1434279627),
				      (byte) 110);
	return aClass564_12058;
    }
    
    public boolean method260() {
	return true;
    }
    
    void method16868(Class185 class185, int i) {
	/* empty */
    }
    
    boolean method16880(Class185 class185, int i, int i_14_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12054.method91(anInt12056 * -1970666801,
					      364333223))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_14_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18660(class185, 131072, 794925573);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_14_, class446, false, 0);
	}
	return false;
    }
    
    boolean method16873(Class185 class185, int i, int i_15_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12054.method91(anInt12056 * -1970666801,
					      -1896310268))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_15_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18660(class185, 131072, 2027342178);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_15_, class446, false, 0);
	}
	return false;
    }
    
    boolean method16874(Class185 class185, int i, int i_16_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12054.method91(anInt12056 * -1970666801,
					      -1341165203))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_16_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18660(class185, 131072, 118446141);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_16_, class446, false, 0);
	}
	return false;
    }
    
    boolean method16882(Class185 class185, int i, int i_17_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12054.method91(anInt12056 * -1970666801,
					      -233505161))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_17_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18660(class185, 131072, -508421947);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_17_, class446, false, 0);
	}
	return false;
    }
    
    public int method409(int i) {
	return 847393323 * Class595.aClass595_7846.anInt7852;
    }
    
    void method16877(Class185 class185, Class654_Sub1 class654_sub1, int i,
		     int i_18_, int i_19_, boolean bool) {
	if (class654_sub1 instanceof Class654_Sub1_Sub2_Sub1) {
	    Class654_Sub1_Sub2_Sub1 class654_sub1_sub2_sub1_20_
		= (Class654_Sub1_Sub2_Sub1) class654_sub1;
	    if (null != aClass183_12053
		&& class654_sub1_sub2_sub1_20_.aClass183_12053 != null)
		aClass183_12053.method3077((class654_sub1_sub2_sub1_20_
					    .aClass183_12053),
					   i, i_18_, i_19_, bool);
	}
    }
    
    void method16883(Class185 class185, Class654_Sub1 class654_sub1, int i,
		     int i_21_, int i_22_, boolean bool) {
	if (class654_sub1 instanceof Class654_Sub1_Sub2_Sub1) {
	    Class654_Sub1_Sub2_Sub1 class654_sub1_sub2_sub1_23_
		= (Class654_Sub1_Sub2_Sub1) class654_sub1;
	    if (null != aClass183_12053
		&& class654_sub1_sub2_sub1_23_.aClass183_12053 != null)
		aClass183_12053.method3077((class654_sub1_sub2_sub1_23_
					    .aClass183_12053),
					   i, i_21_, i_22_, bool);
	}
    }
    
    void method16845() {
	aBool12057 = false;
	if (null != aClass183_12053)
	    aClass183_12053
		.method3012(aClass183_12053.method3101() & ~0x10000);
    }
    
    void method16865() {
	aBool12057 = false;
	if (null != aClass183_12053)
	    aClass183_12053
		.method3012(aClass183_12053.method3101() & ~0x10000);
    }
    
    public int method16867() {
	return null != aClass183_12053 ? aClass183_12053.method3045() : 0;
    }
    
    public int method252() {
	return anInt12056 * -1970666801;
    }
    
    public int method253() {
	return anInt12056 * -1970666801;
    }
    
    public boolean method413(byte i) {
	return true;
    }
    
    public boolean method412() {
	return true;
    }
    
    public boolean method415() {
	return true;
    }
    
    boolean method16846(Class185 class185, int i, int i_24_, byte i_25_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12054.method91(anInt12056 * -1970666801,
					      1152372281))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_24_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18660(class185, 131072, -466707805);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_24_, class446, false, 0);
	}
	return false;
    }
    
    public boolean method423() {
	return true;
    }
    
    Class550 method16884(Class185 class185) {
	if (null == aClass183_12053)
	    return null;
	Class446 class446 = method10834();
	Class550 class550 = Class322.method5779(aBool12059, 155174587);
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12054.method91(anInt12056 * -1970666801,
					      66419176))
	       .aClass432_7956);
	if (class432 != null) {
	    aClass183_12053.method3034(class446, null, 0);
	    class185.method3311(class446, aClass194Array10852[0], class432);
	} else
	    aClass183_12053.method3034(class446, aClass194Array10852[0], 0);
	return class550;
    }
    
    Class183 method18662(Class185 class185, int i) {
	if (aClass183_12053 != null
	    && class185.method3330(aClass183_12053.method3101(), i) == 0)
	    return aClass183_12053;
	Class7 class7 = method18661(class185, i, false, (byte) 0);
	if (null != class7)
	    return (Class183) class7.anObject58;
	return null;
    }
    
    Class7 method18663(Class185 class185, int i, boolean bool) {
	Class602 class602
	    = ((Class602)
	       aClass44_Sub13_12054.method91(-1970666801 * anInt12056,
					     483827959));
	Class151 class151;
	Class151 class151_26_;
	if (aBool12052) {
	    class151 = aClass556_10855.aClass151Array7436[aByte10853];
	    class151_26_ = aClass556_10855.aClass151Array7434[0];
	} else {
	    class151 = aClass556_10855.aClass151Array7434[aByte10853];
	    if (aByte10853 < 3)
		class151_26_
		    = aClass556_10855.aClass151Array7434[1 + aByte10853];
	    else
		class151_26_ = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	return class602.method9997(class185, i,
				   (847393323
				    * Class595.aClass595_7846.anInt7852),
				   aByte12055, class151, class151_26_,
				   (int) class438.aFloat4864,
				   (int) class438.aFloat4863,
				   (int) class438.aFloat4865, bool, null,
				   2025288838);
    }
}
