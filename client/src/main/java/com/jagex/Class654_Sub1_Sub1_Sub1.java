/* Class654_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class654_Sub1_Sub1_Sub1 extends Class654_Sub1_Sub1
    implements Interface62
{
    boolean aBool11992;
    static int[] anIntArray11993;
    Class44_Sub13 aClass44_Sub13_11994;
    Class183 aClass183_11995;
    Class534_Sub18_Sub16 aClass534_Sub18_Sub16_11996;
    int anInt11997;
    static int[] anIntArray11998 = { 1, 2, 4, 8 };
    byte aByte11999;
    byte aByte12000;
    Class564 aClass564_12001;
    boolean aBool12002;
    boolean aBool12003;
    boolean aBool12004;
    
    public boolean method416() {
	return aBool12004;
    }
    
    public int method252() {
	return -1062339383 * anInt11997;
    }
    
    boolean method16850(int i) {
	if (null != aClass183_11995)
	    return aClass183_11995.method3027();
	return false;
    }
    
    public int method16876(int i) {
	return null != aClass183_11995 ? aClass183_11995.method3045() : 0;
    }
    
    Class550 method16853(Class185 class185, int i) {
	if (null == aClass183_11995)
	    return null;
	Class446 class446 = method10834();
	Class550 class550 = Class322.method5779(aBool12002, -806593658);
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_11994.method91(anInt11997 * -1062339383,
					      -320681177))
	       .aClass432_7956);
	if (null != class432) {
	    aClass183_11995.method3034(class446, null, 0);
	    class185.method3311(class446, aClass194Array10852[0], class432);
	} else
	    aClass183_11995.method3034(class446, aClass194Array10852[0], 0);
	return class550;
    }
    
    public boolean method413(byte i) {
	return true;
    }
    
    public Class564 method16855(Class185 class185, short i) {
	Class438 class438 = method10807().aClass438_4885;
	if (aClass564_12001 == null)
	    aClass564_12001
		= Class528.method8820((int) class438.aFloat4864,
				      (int) class438.aFloat4863,
				      (int) class438.aFloat4865,
				      method18612(class185, 0, (byte) 111),
				      (byte) 27);
	return aClass564_12001;
    }
    
    public void method414(Class185 class185, int i) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_11996 && aBool12004) {
	    Class7 class7 = method18614(class185, 262144, true, 1956523001);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_11996;
	    aClass534_Sub18_Sub16_11996 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9276(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       645293074);
    }
    
    void method16868(Class185 class185, int i) {
	/* empty */
    }
    
    boolean method16882(Class185 class185, int i, int i_0_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_11994.method91(-1062339383 * anInt11997,
					      1455388038))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_0_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18612(class185, 131072, (byte) 119);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_0_, class446, false, 0);
	}
	return false;
    }
    
    boolean method16848(byte i) {
	return aBool12003;
    }
    
    void method16851(Class185 class185, Class654_Sub1 class654_sub1, int i,
		     int i_1_, int i_2_, boolean bool, int i_3_) {
	if (class654_sub1 instanceof Class654_Sub1_Sub1_Sub1) {
	    Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1_4_
		= (Class654_Sub1_Sub1_Sub1) class654_sub1;
	    if (null != aClass183_11995
		&& null != class654_sub1_sub1_sub1_4_.aClass183_11995)
		aClass183_11995.method3077((class654_sub1_sub1_sub1_4_
					    .aClass183_11995),
					   i, i_1_, i_2_, bool);
	} else if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub2) {
	    Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2
		= (Class654_Sub1_Sub5_Sub2) class654_sub1;
	    if (aClass183_11995 != null
		&& class654_sub1_sub5_sub2.aClass183_12006 != null)
		aClass183_11995.method3077((class654_sub1_sub5_sub2
					    .aClass183_12006),
					   i, i_1_, i_2_, bool);
	}
    }
    
    boolean method16879() {
	if (null != aClass183_11995)
	    return aClass183_11995.method3027();
	return false;
    }
    
    Class183 method18612(Class185 class185, int i, byte i_5_) {
	if (null != aClass183_11995
	    && class185.method3330(aClass183_11995.method3101(), i) == 0)
	    return aClass183_11995;
	Class7 class7 = method18614(class185, i, false, -574374564);
	if (null != class7)
	    return (Class183) class7.anObject58;
	return null;
    }
    
    public int method409(int i) {
	return aByte12000;
    }
    
    public int method410(int i) {
	return aByte11999;
    }
    
    boolean method16849(int i) {
	if (aClass183_11995 != null)
	    return !aClass183_11995.method3062();
	return true;
    }
    
    public Class564 method16872(Class185 class185) {
	Class438 class438 = method10807().aClass438_4885;
	if (aClass564_12001 == null)
	    aClass564_12001
		= Class528.method8820((int) class438.aFloat4864,
				      (int) class438.aFloat4863,
				      (int) class438.aFloat4865,
				      method18612(class185, 0, (byte) 94),
				      (byte) 95);
	return aClass564_12001;
    }
    
    public boolean method419(byte i) {
	return aBool12004;
    }
    
    public void method408(Class185 class185, byte i) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (aClass534_Sub18_Sub16_11996 == null && aBool12004) {
	    Class7 class7 = method18614(class185, 262144, true, 611209819);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (null != class7 ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_11996;
	    aClass534_Sub18_Sub16_11996 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (class534_sub18_sub16 != null)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) 18);
    }
    
    boolean method16846(Class185 class185, int i, int i_6_, byte i_7_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_11994.method91(-1062339383 * anInt11997,
					      -1451354519))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_6_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18612(class185, 131072, (byte) 111);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_6_, class446, false, 0);
	}
	return false;
    }
    
    static {
	anIntArray11993 = new int[] { 16, 32, 64, 128 };
    }
    
    public int method9() {
	return aByte12000;
    }
    
    public int method145() {
	return aByte11999;
    }
    
    public int method56(int i) {
	return -1062339383 * anInt11997;
    }
    
    public void method141() {
	if (null != aClass183_11995)
	    aClass183_11995.method3014();
    }
    
    public void method144() {
	if (null != aClass183_11995)
	    aClass183_11995.method3014();
    }
    
    Class183 method18613(Class185 class185, int i) {
	if (null != aClass183_11995
	    && class185.method3330(aClass183_11995.method3101(), i) == 0)
	    return aClass183_11995;
	Class7 class7 = method18614(class185, i, false, -2136096930);
	if (null != class7)
	    return (Class183) class7.anObject58;
	return null;
    }
    
    public void method417(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (aClass534_Sub18_Sub16_11996 == null && aBool12004) {
	    Class7 class7 = method18614(class185, 262144, true, 1048744975);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (null != class7 ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_11996;
	    aClass534_Sub18_Sub16_11996 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (class534_sub18_sub16 != null)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) -65);
    }
    
    Class7 method18614(Class185 class185, int i, boolean bool, int i_8_) {
	Class602 class602
	    = ((Class602)
	       aClass44_Sub13_11994.method91(anInt11997 * -1062339383,
					     -601191939));
	Class151 class151;
	Class151 class151_9_;
	if (aBool11992) {
	    class151 = aClass556_10855.aClass151Array7436[aByte10853];
	    class151_9_ = aClass556_10855.aClass151Array7434[0];
	} else {
	    class151 = aClass556_10855.aClass151Array7434[aByte10853];
	    if (aByte10853 < 3)
		class151_9_
		    = aClass556_10855.aClass151Array7434[1 + aByte10853];
	    else
		class151_9_ = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	return class602.method9997(class185, i, aByte12000, aByte11999,
				   class151, class151_9_,
				   (int) class438.aFloat4864,
				   (int) class438.aFloat4863,
				   (int) class438.aFloat4865, bool, null,
				   1710187273);
    }
    
    public void method418(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (aClass534_Sub18_Sub16_11996 == null && aBool12004) {
	    Class7 class7 = method18614(class185, 262144, true, -1465570579);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (null != class7 ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_11996;
	    aClass534_Sub18_Sub16_11996 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (class534_sub18_sub16 != null)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) 74);
    }
    
    public void method421(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_11996 && aBool12004) {
	    Class7 class7 = method18614(class185, 262144, true, 772503472);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_11996;
	    aClass534_Sub18_Sub16_11996 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9276(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       -421496322);
    }
    
    public void method420(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (null == aClass534_Sub18_Sub16_11996 && aBool12004) {
	    Class7 class7 = method18614(class185, 262144, true, -467081528);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (class7 != null ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_11996;
	    aClass534_Sub18_Sub16_11996 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (null != class534_sub18_sub16)
	    aClass556_10855.method9276(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       1163864340);
    }
    
    boolean method16895() {
	if (aClass183_11995 != null)
	    return !aClass183_11995.method3062();
	return true;
    }
    
    public void method411(int i) {
	if (null != aClass183_11995)
	    aClass183_11995.method3014();
    }
    
    public int method253() {
	return -1062339383 * anInt11997;
    }
    
    public void method422(Class185 class185) {
	Object object = null;
	Class534_Sub18_Sub16 class534_sub18_sub16;
	if (aClass534_Sub18_Sub16_11996 == null && aBool12004) {
	    Class7 class7 = method18614(class185, 262144, true, -260960424);
	    class534_sub18_sub16
		= (Class534_Sub18_Sub16) (null != class7 ? class7.anObject59
					  : null);
	} else {
	    class534_sub18_sub16 = aClass534_Sub18_Sub16_11996;
	    aClass534_Sub18_Sub16_11996 = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	if (class534_sub18_sub16 != null)
	    aClass556_10855.method9275(class534_sub18_sub16, aByte10853,
				       (int) class438.aFloat4864,
				       (int) class438.aFloat4865, null,
				       (byte) 83);
    }
    
    public int method181() {
	return aByte11999;
    }
    
    public int method16866() {
	return null != aClass183_11995 ? aClass183_11995.method3045() : 0;
    }
    
    public int method16867() {
	return null != aClass183_11995 ? aClass183_11995.method3045() : 0;
    }
    
    public Class564 method16870(Class185 class185) {
	Class438 class438 = method10807().aClass438_4885;
	if (aClass564_12001 == null)
	    aClass564_12001
		= Class528.method8820((int) class438.aFloat4864,
				      (int) class438.aFloat4863,
				      (int) class438.aFloat4865,
				      method18612(class185, 0, (byte) 116),
				      (byte) 72);
	return aClass564_12001;
    }
    
    void method16871(Class185 class185) {
	/* empty */
    }
    
    boolean method16880(Class185 class185, int i, int i_10_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_11994.method91(-1062339383 * anInt11997,
					      1453615059))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_10_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18612(class185, 131072, (byte) 104);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_10_, class446, false, 0);
	}
	return false;
    }
    
    boolean method16873(Class185 class185, int i, int i_11_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_11994.method91(-1062339383 * anInt11997,
					      -220335306))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_11_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18612(class185, 131072, (byte) 65);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_11_, class446, false, 0);
	}
	return false;
    }
    
    public int method254() {
	return -1062339383 * anInt11997;
    }
    
    static int method18615(int i, int i_12_) {
	if (Class595.aClass595_7830.anInt7852 * 847393323 == i
	    || Class595.aClass595_7832.anInt7852 * 847393323 == i)
	    return anIntArray11993[i_12_ & 0x3];
	return anIntArray11998[i_12_ & 0x3];
    }
    
    boolean method16861() {
	return aBool12003;
    }
    
    void method16877(Class185 class185, Class654_Sub1 class654_sub1, int i,
		     int i_13_, int i_14_, boolean bool) {
	if (class654_sub1 instanceof Class654_Sub1_Sub1_Sub1) {
	    Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1_15_
		= (Class654_Sub1_Sub1_Sub1) class654_sub1;
	    if (null != aClass183_11995
		&& null != class654_sub1_sub1_sub1_15_.aClass183_11995)
		aClass183_11995.method3077((class654_sub1_sub1_sub1_15_
					    .aClass183_11995),
					   i, i_13_, i_14_, bool);
	} else if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub2) {
	    Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2
		= (Class654_Sub1_Sub5_Sub2) class654_sub1;
	    if (aClass183_11995 != null
		&& class654_sub1_sub5_sub2.aClass183_12006 != null)
		aClass183_11995.method3077((class654_sub1_sub5_sub2
					    .aClass183_12006),
					   i, i_13_, i_14_, bool);
	}
    }
    
    boolean method16869() {
	if (null != aClass183_11995)
	    return aClass183_11995.method3027();
	return false;
    }
    
    void method16845() {
	aBool12003 = false;
	if (null != aClass183_11995)
	    aClass183_11995
		.method3012(aClass183_11995.method3101() & ~0x10000);
    }
    
    void method16865() {
	aBool12003 = false;
	if (null != aClass183_11995)
	    aClass183_11995
		.method3012(aClass183_11995.method3101() & ~0x10000);
    }
    
    void method16881() {
	aBool12003 = false;
	if (null != aClass183_11995)
	    aClass183_11995
		.method3012(aClass183_11995.method3101() & ~0x10000);
    }
    
    boolean method16874(Class185 class185, int i, int i_16_) {
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_11994.method91(-1062339383 * anInt11997,
					      -1298830986))
	       .aClass432_7956);
	if (class432 != null)
	    return class185.method3309(i, i_16_, method10834(), class432,
				       1554530302);
	Class183 class183 = method18612(class185, 131072, (byte) 12);
	if (class183 != null) {
	    Class446 class446 = method10834();
	    return class183.method3039(i, i_16_, class446, false, 0);
	}
	return false;
    }
    
    void method16852(int i) {
	aBool12003 = false;
	if (null != aClass183_11995)
	    aClass183_11995
		.method3012(aClass183_11995.method3101() & ~0x10000);
    }
    
    boolean method16864() {
	if (aClass183_11995 != null)
	    return !aClass183_11995.method3062();
	return true;
    }
    
    public boolean method412() {
	return true;
    }
    
    public boolean method415() {
	return true;
    }
    
    public boolean method260() {
	return true;
    }
    
    public boolean method423() {
	return true;
    }
    
    Class550 method16884(Class185 class185) {
	if (null == aClass183_11995)
	    return null;
	Class446 class446 = method10834();
	Class550 class550 = Class322.method5779(aBool12002, -1703908172);
	Class432 class432
	    = (((Class602)
		aClass44_Sub13_11994.method91(anInt11997 * -1062339383,
					      -909853539))
	       .aClass432_7956);
	if (null != class432) {
	    aClass183_11995.method3034(class446, null, 0);
	    class185.method3311(class446, aClass194Array10852[0], class432);
	} else
	    aClass183_11995.method3034(class446, aClass194Array10852[0], 0);
	return class550;
    }
    
    public Class654_Sub1_Sub1_Sub1
	(Class556 class556, Class185 class185, Class44_Sub13 class44_sub13,
	 Class602 class602, int i, int i_17_, int i_18_, int i_19_, int i_20_,
	 boolean bool, int i_21_, int i_22_, boolean bool_23_) {
	super(class556, i_18_, i_19_, i_20_, i, i_17_,
	      Class460_Sub1.method15971(i_21_, i_22_, (short) -15813));
	aClass44_Sub13_11994 = class44_sub13;
	anInt11997 = 637362465 * class602.anInt7887;
	aBool11992 = bool;
	aByte12000 = (byte) i_21_;
	aByte11999 = (byte) i_22_;
	aBool12002 = 0 != class602.anInt7907 * -2134171963 && !bool;
	aBool12003 = bool_23_;
	aBool12004
	    = (class185.method3436() && class602.aBool7896 && !aBool11992
	       && Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
		      .method16923((byte) 13) != 0);
	int i_24_ = 2048;
	if (aBool12003)
	    i_24_ |= 0x10000;
	if (class602.aBool7962)
	    i_24_ |= 0x80000;
	Class7 class7 = method18614(class185, i_24_, aBool12004, -1964455840);
	if (class7 != null) {
	    aClass183_11995 = (Class183) class7.anObject58;
	    aClass534_Sub18_Sub16_11996
		= (Class534_Sub18_Sub16) class7.anObject59;
	    if (aBool12003 || class602.aBool7962) {
		aClass183_11995
		    = aClass183_11995.method3011((byte) 0, i_24_, false);
		if (class602.aBool7962) {
		    Class514 class514
			= client.aClass512_11100.method8420(1606060712);
		    aClass183_11995.method3058
			(-1440569789 * class514.anInt5728,
			 class514.anInt5729 * -1149266637,
			 -469029139 * class514.anInt5730,
			 class514.anInt5731 * -2027110357);
		}
	    }
	}
	method16862(1, -1943618112);
    }
    
    void method16883(Class185 class185, Class654_Sub1 class654_sub1, int i,
		     int i_25_, int i_26_, boolean bool) {
	if (class654_sub1 instanceof Class654_Sub1_Sub1_Sub1) {
	    Class654_Sub1_Sub1_Sub1 class654_sub1_sub1_sub1_27_
		= (Class654_Sub1_Sub1_Sub1) class654_sub1;
	    if (null != aClass183_11995
		&& null != class654_sub1_sub1_sub1_27_.aClass183_11995)
		aClass183_11995.method3077((class654_sub1_sub1_sub1_27_
					    .aClass183_11995),
					   i, i_25_, i_26_, bool);
	} else if (class654_sub1 instanceof Class654_Sub1_Sub5_Sub2) {
	    Class654_Sub1_Sub5_Sub2 class654_sub1_sub5_sub2
		= (Class654_Sub1_Sub5_Sub2) class654_sub1;
	    if (aClass183_11995 != null
		&& class654_sub1_sub5_sub2.aClass183_12006 != null)
		aClass183_11995.method3077((class654_sub1_sub5_sub2
					    .aClass183_12006),
					   i, i_25_, i_26_, bool);
	}
    }
    
    Class183 method18616(Class185 class185, int i) {
	if (null != aClass183_11995
	    && class185.method3330(aClass183_11995.method3101(), i) == 0)
	    return aClass183_11995;
	Class7 class7 = method18614(class185, i, false, -2079100260);
	if (null != class7)
	    return (Class183) class7.anObject58;
	return null;
    }
    
    Class183 method18617(Class185 class185, int i) {
	if (null != aClass183_11995
	    && class185.method3330(aClass183_11995.method3101(), i) == 0)
	    return aClass183_11995;
	Class7 class7 = method18614(class185, i, false, 1332209714);
	if (null != class7)
	    return (Class183) class7.anObject58;
	return null;
    }
    
    Class7 method18618(Class185 class185, int i, boolean bool) {
	Class602 class602
	    = ((Class602)
	       aClass44_Sub13_11994.method91(anInt11997 * -1062339383,
					     -317585294));
	Class151 class151;
	Class151 class151_28_;
	if (aBool11992) {
	    class151 = aClass556_10855.aClass151Array7436[aByte10853];
	    class151_28_ = aClass556_10855.aClass151Array7434[0];
	} else {
	    class151 = aClass556_10855.aClass151Array7434[aByte10853];
	    if (aByte10853 < 3)
		class151_28_
		    = aClass556_10855.aClass151Array7434[1 + aByte10853];
	    else
		class151_28_ = null;
	}
	Class438 class438 = method10807().aClass438_4885;
	return class602.method9997(class185, i, aByte12000, aByte11999,
				   class151, class151_28_,
				   (int) class438.aFloat4864,
				   (int) class438.aFloat4863,
				   (int) class438.aFloat4865, bool, null,
				   1478007227);
    }
    
    static final void method18619(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    static final void method18620(Class247 class247, Class243 class243,
				  Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2440
	    = Class99.method1859(string, class669, 1501869810);
	class247.aBool2561 = true;
    }
}
