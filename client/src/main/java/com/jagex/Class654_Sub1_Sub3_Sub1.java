/* Class654_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class654_Sub1_Sub3_Sub1 extends Class654_Sub1_Sub3
    implements Interface62
{
    int anInt12023;
    Class183 aClass183_12024;
    Class534_Sub18_Sub16 aClass534_Sub18_Sub16_12025;
    Class564 aClass564_12026;
    boolean aBool12027;
    byte aByte12028;
    byte aByte12029;
    Class44_Sub13 aClass44_Sub13_12030;
    boolean aBool12031;
    boolean aBool12032;
    
    boolean method16869() {
	if (null != aClass183_12024)
	    return aClass183_12024.method3027();
	return false;
    }
    
    boolean method16849(int i) {
	if (null != aClass183_12024)
	    return !aClass183_12024.method3062();
	return true;
    }
    
    boolean method16850(int i) {
	if (null != aClass183_12024)
	    return aClass183_12024.method3027();
	return false;
    }
    
    public int method16876(int i) {
	return null != aClass183_12024 ? aClass183_12024.method3045() : 0;
    }
    
    Class183 method18636(Class185 class185, int i, int i_0_) {
	if (aClass183_12024 != null
	    && class185.method3330(aClass183_12024.method3101(), i) == 0)
	    return aClass183_12024;
	Class7 class7 = method18637(class185, i, false, (byte) 1);
	if (class7 != null)
	    return (Class183) class7.anObject58;
	return null;
    }
    
    Class7 method18637(Class185 class185, int i, boolean bool, byte i_1_) {
	Class602 class602
	    = ((Class602)
	       aClass44_Sub13_12030.method91(anInt12023 * -2015809187,
					     -1946583819));
	Class151 class151;
	Class151 class151_2_;
	if (aBool12027) {
	    class151 = aClass556_10855.aClass151Array7436[aByte10853];
	    class151_2_ = aClass556_10855.aClass151Array7434[0];
	} else {
	    class151 = aClass556_10855.aClass151Array7434[aByte10853];
	    if (aByte10853 < 3)
		class151_2_
		    = aClass556_10855.aClass151Array7434[aByte10853 + 1];
	    else
		class151_2_ = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	return class602.method9997(class185, i, aByte12028, aByte12029,
				   class151, class151_2_,
				   (int) class438.aFloat4864,
				   (int) class438.aFloat4863,
				   (int) class438.aFloat4865, bool, null,
				   375283812);
    }
    
    public Class564 method16855(Class185 class185, short i) {
	Class438 class438 = method10807().aClass438_4885;
	if (aClass564_12026 == null)
	    aClass564_12026
		= Class528.method8820((int) class438.aFloat4864,
				      (int) class438.aFloat4863,
				      (int) class438.aFloat4865,
				      method18636(class185, 0, 1373367310),
				      (byte) 110);
	return aClass564_12026;
    }
    
    Class550 method16853(Class185 class185, int i) {
	if (null == aClass183_12024)
	    return null;
	Class446 class446 = class185.method3665();
	class446.method7236(method10834());
	class446.method7287((float) aShort11869, 0.0F, (float) aShort11867);
	Class550 class550 = Class322.method5779(aBool12031, 1347161901);
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12030.method91(anInt12023 * -2015809187,
					      1524727931))
	       .aClass432_7956);
	if (class432 != null) {
	    aClass183_12024.method3034(class446, null, 0);
	    class185.method3311(class446, aClass194Array10852[0], class432);
	} else
	    aClass183_12024.method3034(class446, aClass194Array10852[0], 0);
	return class550;
    }
    
    boolean method16880(Class185 class185, int i, int i_3_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12030.method91(anInt12023 * -2015809187,
					      -167578061))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_3_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18636(class185, 131072, 1378561912);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_3_, class446, false, 0);
	}
	return false;
    }
    
    Class183 method18638(Class185 class185, int i) {
	if (aClass183_12024 != null
	    && class185.method3330(aClass183_12024.method3101(), i) == 0)
	    return aClass183_12024;
	Class7 class7 = method18637(class185, i, false, (byte) 1);
	if (class7 != null)
	    return (Class183) class7.anObject58;
	return null;
    }
    
    boolean method16873(Class185 class185, int i, int i_4_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12030.method91(anInt12023 * -2015809187,
					      1507889156))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_4_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18636(class185, 131072, 1417509004);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_4_, class446, false, 0);
	}
	return false;
    }
    
    public int method409(int i) {
	return aByte12028;
    }
    
    public void method141() {
	if (aClass183_12024 != null)
	    aClass183_12024.method3014();
    }
    
    public boolean method415() {
	return true;
    }
    
    public boolean method413(byte i) {
	return true;
    }
    
    public boolean method419(byte i) {
	return aBool12032;
    }
    
    public void method408(Class185 class185, byte i) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12025 && aBool12032) {
	    Class7 class7 = method18637(class185, 262144, true, (byte) 1);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12025;
	    aClass534_Sub18_Sub16_12025 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) -37);
    }
    
    public int method252() {
	return anInt12023 * -2015809187;
    }
    
    public int method9() {
	return aByte12028;
    }
    
    public int method145() {
	return aByte12029;
    }
    
    public int method181() {
	return aByte12029;
    }
    
    public void method411(int i) {
	if (aClass183_12024 != null)
	    aClass183_12024.method3014();
    }
    
    public void method414(Class185 class185, int i) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (aClass534_Sub18_Sub16_12025 == null && aBool12032) {
	    Class7 class7 = method18637(class185, 262144, true, (byte) 1);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12025;
	    aClass534_Sub18_Sub16_12025 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9276(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       1106585938);
    }
    
    public boolean method416() {
	return aBool12032;
    }
    
    public void method417(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12025 && aBool12032) {
	    Class7 class7 = method18637(class185, 262144, true, (byte) 1);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12025;
	    aClass534_Sub18_Sub16_12025 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) -5);
    }
    
    Class550 method16884(Class185 class185) {
	if (null == aClass183_12024)
	    return null;
	Class446 class446 = class185.method3665();
	class446.method7236(method10834());
	class446.method7287((float) aShort11869, 0.0F, (float) aShort11867);
	Class550 class550 = Class322.method5779(aBool12031, 1554866029);
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12030.method91(anInt12023 * -2015809187,
					      -410620618))
	       .aClass432_7956);
	if (class432 != null) {
	    aClass183_12024.method3034(class446, null, 0);
	    class185.method3311(class446, aClass194Array10852[0], class432);
	} else
	    aClass183_12024.method3034(class446, aClass194Array10852[0], 0);
	return class550;
    }
    
    public void method418(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12025 && aBool12032) {
	    Class7 class7 = method18637(class185, 262144, true, (byte) 1);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12025;
	    aClass534_Sub18_Sub16_12025 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) -10);
    }
    
    public void method421(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (aClass534_Sub18_Sub16_12025 == null && aBool12032) {
	    Class7 class7 = method18637(class185, 262144, true, (byte) 1);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12025;
	    aClass534_Sub18_Sub16_12025 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9276(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       -591382623);
    }
    
    public void method420(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (aClass534_Sub18_Sub16_12025 == null && aBool12032) {
	    Class7 class7 = method18637(class185, 262144, true, (byte) 1);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12025;
	    aClass534_Sub18_Sub16_12025 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9276(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       -969279754);
    }
    
    boolean method16895() {
	if (null != aClass183_12024)
	    return !aClass183_12024.method3062();
	return true;
    }
    
    boolean method16874(Class185 class185, int i, int i_5_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12030.method91(anInt12023 * -2015809187,
					      -372918857))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_5_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18636(class185, 131072, 1571075551);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_5_, class446, false, 0);
	}
	return false;
    }
    
    boolean method16879() {
	if (null != aClass183_12024)
	    return aClass183_12024.method3027();
	return false;
    }
    
    public void method144() {
	if (aClass183_12024 != null)
	    aClass183_12024.method3014();
    }
    
    public int method16867() {
	return null != aClass183_12024 ? aClass183_12024.method3045() : 0;
    }
    
    public int method16866() {
	return null != aClass183_12024 ? aClass183_12024.method3045() : 0;
    }
    
    public int method56(int i) {
	return anInt12023 * -2015809187;
    }
    
    public Class564 method16870(Class185 class185) {
	Class438 class438 = method10807().aClass438_4885;
	if (aClass564_12026 == null)
	    aClass564_12026
		= Class528.method8820((int) class438.aFloat4864,
				      (int) class438.aFloat4863,
				      (int) class438.aFloat4865,
				      method18636(class185, 0, 1787027747),
				      (byte) 18);
	return aClass564_12026;
    }
    
    void method16871(Class185 class185) {
	/* empty */
    }
    
    boolean method16846(Class185 class185, int i, int i_6_, byte i_7_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12030.method91(anInt12023 * -2015809187,
					      -886015723))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_6_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18636(class185, 131072, 1852516558);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_6_, class446, false, 0);
	}
	return false;
    }
    
    void method16868(Class185 class185, int i) {
	/* empty */
    }
    
    public void method422(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_12025 && aBool12032) {
	    Class7 class7 = method18637(class185, 262144, true, (byte) 1);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_12025;
	    aClass534_Sub18_Sub16_12025 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) 23);
    }
    
    public Class564 method16872(Class185 class185) {
	Class438 class438 = method10807().aClass438_4885;
	if (aClass564_12026 == null)
	    aClass564_12026
		= Class528.method8820((int) class438.aFloat4864,
				      (int) class438.aFloat4863,
				      (int) class438.aFloat4865,
				      method18636(class185, 0, 764668528),
				      (byte) 105);
	return aClass564_12026;
    }
    
    boolean method16882(Class185 class185, int i, int i_8_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_12030.method91(anInt12023 * -2015809187,
					      -2073373313))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_8_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18636(class185, 131072, 798501503);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_8_, class446, false, 0);
	}
	return false;
    }
    
    public int method253() {
	return anInt12023 * -2015809187;
    }
    
    public int method254() {
	return anInt12023 * -2015809187;
    }
    
    public boolean method412() {
	return true;
    }
    
    boolean method16864() {
	if (null != aClass183_12024)
	    return !aClass183_12024.method3062();
	return true;
    }
    
    public boolean method260() {
	return true;
    }
    
    public boolean method423() {
	return true;
    }
    
    public Class654_Sub1_Sub3_Sub1
	(Class556 class556, Class185 class185, Class44_Sub13 class44_sub13,
	 Class602 class602, int i, int i_9_, int i_10_, int i_11_, int i_12_,
	 boolean bool, int i_13_, int i_14_, int i_15_, int i_16_) {
	super(class556, i_10_, i_11_, i_12_, i, i_9_, i_13_, i_14_);
	aClass44_Sub13_12030 = class44_sub13;
	anInt12023 = -1156878595 * class602.anInt7887;
	aBool12027 = bool;
	aByte12029 = (byte) i_16_;
	aByte12028 = (byte) i_15_;
	aBool12031 = 0 != -2134171963 * class602.anInt7907 && !bool;
	aBool12032
	    = (class185.method3436() && class602.aBool7896 && !aBool12027
	       && Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
		      .method16923((byte) 97) != 0);
	int i_17_ = 2048;
	if (class602.aBool7962)
	    i_17_ |= 0x80000;
	Class7 class7 = method18637(class185, i_17_, aBool12032, (byte) 1);
	if (class7 != null) {
	    aClass183_12024 = (Class183) class7.anObject58;
	    aClass534_Sub18_Sub16_12025
		= (Class534_Sub18_Sub16) class7.anObject59;
	    if (class602.aBool7962) {
		aClass183_12024
		    = aClass183_12024.method3011((byte) 0, i_17_, false);
		if (class602.aBool7962) {
		    Class514 class514
			= client.aClass512_11100.method8420(-603605650);
		    aClass183_12024.method3058
			(class514.anInt5728 * -1440569789,
			 -1149266637 * class514.anInt5729,
			 -469029139 * class514.anInt5730,
			 class514.anInt5731 * -2027110357);
		}
	    }
	}
	method16862(1, -1572194987);
    }
    
    Class183 method18639(Class185 class185, int i) {
	if (aClass183_12024 != null
	    && class185.method3330(aClass183_12024.method3101(), i) == 0)
	    return aClass183_12024;
	Class7 class7 = method18637(class185, i, false, (byte) 1);
	if (class7 != null)
	    return (Class183) class7.anObject58;
	return null;
    }
    
    Class183 method18640(Class185 class185, int i) {
	if (aClass183_12024 != null
	    && class185.method3330(aClass183_12024.method3101(), i) == 0)
	    return aClass183_12024;
	Class7 class7 = method18637(class185, i, false, (byte) 1);
	if (class7 != null)
	    return (Class183) class7.anObject58;
	return null;
    }
    
    public int method410(int i) {
	return aByte12029;
    }
    
    Class7 method18641(Class185 class185, int i, boolean bool) {
	Class602 class602
	    = ((Class602)
	       aClass44_Sub13_12030.method91(anInt12023 * -2015809187,
					     -1371162026));
	Class151 class151;
	Class151 class151_18_;
	if (aBool12027) {
	    class151 = aClass556_10855.aClass151Array7436[aByte10853];
	    class151_18_ = aClass556_10855.aClass151Array7434[0];
	} else {
	    class151 = aClass556_10855.aClass151Array7434[aByte10853];
	    if (aByte10853 < 3)
		class151_18_
		    = aClass556_10855.aClass151Array7434[aByte10853 + 1];
	    else
		class151_18_ = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	return class602.method9997(class185, i, aByte12028, aByte12029,
				   class151, class151_18_,
				   (int) class438.aFloat4864,
				   (int) class438.aFloat4863,
				   (int) class438.aFloat4865, bool, null,
				   981443435);
    }
    
    public static int method18642(int i, int i_19_, byte i_20_) {
	int i_21_ = 0;
	for (/**/; i_19_ > 0; i_19_--) {
	    i_21_ = i_21_ << 1 | i & 0x1;
	    i >>>= 1;
	}
	return i_21_;
    }
    
    static final void method18643(Class669 class669, int i) {
	int i_22_ = Class619.method10258((byte) 119);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (Class112.anInt1353
	       = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub7_10733
		     .method16935(-1807368365) * 467217081) * -710165623;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_22_;
	Class177.method2934((short) 24071);
	client.aClass512_11100.method8441(1345322635);
	Class672.method11096((byte) 1);
	client.aBool11048 = false;
    }
}
