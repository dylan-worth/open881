/* Class528 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class528
{
    boolean aBool7100;
    Class711 aClass711_7101;
    Class654_Sub1 aClass654_Sub1_7102;
    int anInt7103;
    int anInt7104;
    Class629 aClass629_7105;
    boolean aBool7106 = false;
    Class183 aClass183_7107;
    byte aByte7108;
    Class711 aClass711_7109;
    int anInt7110;
    int anInt7111;
    int anInt7112;
    boolean aBool7113;
    Class44_Sub13 aClass44_Sub13_7114;
    Class534_Sub18_Sub16 aClass534_Sub18_Sub16_7115;
    boolean[] aBoolArray7116;
    int anInt7117 = -853568467;
    boolean aBool7118;
    Class596 aClass596_7119;
    
    void method8781(Class654_Sub1 class654_sub1) {
	if (null != aClass711_7101 && aClass711_7101.method14338((byte) 0)) {
	    aClass711_7101.method14393((client.anInt11101
					- anInt7110 * -1588764245),
				       (byte) 1);
	    if (aClass711_7101.method14343((byte) 1))
		aClass711_7101.method14330(-1, 1739547585);
	    if (!aClass711_7101.method14336(1367453715)) {
		aClass711_7109 = aClass711_7101;
		aBool7113 = true;
		anInt7110 = -44920573 * client.anInt11101;
		return;
	    }
	}
	if (aClass711_7109.method14338((byte) 0)) {
	    if (aClass711_7109.method14393((client.anInt11101
					    - anInt7110 * -1588764245),
					   (byte) 1)) {
		if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
			.method16923((byte) 80)
		    == 2)
		    aBool7118 = false;
		if (aClass711_7109.method14343((byte) 1)) {
		    aClass711_7109.method14330(-1, 1557878796);
		    aBool7113 = false;
		    method8796(false, -1, 0, 0, -795974408);
		}
	    }
	} else
	    method8796(false, -1, 0, 0, -1873432736);
	anInt7110 = client.anInt11101 * -44920573;
    }
    
    void method8782(Class185 class185) {
	method8787(class185, 262144, true, true, 1451476775);
    }
    
    void method8783(Class596 class596, byte i) {
	aClass596_7119 = class596;
	aClass183_7107 = null;
    }
    
    int method8784() {
	return anInt7112 * 1225303721;
    }
    
    final Class183 method8785(Class185 class185, int i, boolean bool,
			      boolean bool_0_) {
	Class602 class602
	    = (Class602) aClass44_Sub13_7114.method91(1626333597 * anInt7103,
						      118020666);
	if (null != class602.anIntArray7943)
	    class602
		= class602.method9988(Class78.aClass103_825,
				      (3 == -1468443459 * client.anInt11155
				       ? (Interface20) (Class201
							.anInterface20_2188)
				       : Class78.aClass103_825),
				      -827801569);
	if (null == class602) {
	    method8791(class185, 198005613);
	    anInt7117 = -853568467;
	    return null;
	}
	if (!aBool7113
	    && class602.anInt7887 * -1562722583 != -1632623525 * anInt7117) {
	    method8796(true, -1, 0, 0, -1948633237);
	    aBool7118 = false;
	    aClass183_7107 = null;
	}
	method8792(aClass654_Sub1_7102, -939953274);
	if (bool_0_)
	    bool_0_ = bool_0_ & (aBool7100 & !aBool7118
				 & Class44_Sub6.aClass534_Sub35_10989
				       .aClass690_Sub6_10743
				       .method16923((byte) 11) != 0);
	if (bool && !bool_0_) {
	    anInt7117 = class602.anInt7887 * 905362699;
	    return null;
	}
	Class438 class438 = aClass654_Sub1_7102.method10807().aClass438_4885;
	Class556 class556 = client.aClass512_11100.method8424((byte) 27);
	if (bool_0_) {
	    class556.method9276(aClass534_Sub18_Sub16_7115, aByte7108,
				(int) class438.aFloat4864,
				(int) class438.aFloat4865, aBoolArray7116,
				1743066401);
	    aBool7118 = false;
	}
	Class151 class151 = class556.aClass151Array7432[aByte7108];
	Class151 class151_1_;
	if (aBool7106)
	    class151_1_ = class556.aClass151Array7434[0];
	else
	    class151_1_
		= (aByte7108 < 3 ? class556.aClass151Array7432[aByte7108 + 1]
		   : null);
	Class183 class183 = null;
	if (aClass711_7109.method14338((byte) 0)) {
	    if (bool_0_)
		i |= 0x40000;
	    class183
		= (class602.method9986
		   (class185, i,
		    (11 != anInt7104 * -1932952217 ? -1932952217 * anInt7104
		     : 10),
		    (11 == -1932952217 * anInt7104
		     ? -2129482149 * anInt7111 + 4 : anInt7111 * -2129482149),
		    class151, class151_1_, (int) class438.aFloat4864,
		    class151.method2498((int) class438.aFloat4864,
					(int) class438.aFloat4865, 2142769647),
		    (int) class438.aFloat4865, aClass711_7109, aClass596_7119,
		    -1091155918));
	    if (class183 != null) {
		if (bool_0_) {
		    if (aBoolArray7116 == null)
			aBoolArray7116 = new boolean[4];
		    aClass534_Sub18_Sub16_7115
			= class183.method3040(aClass534_Sub18_Sub16_7115);
		    class556.method9275(aClass534_Sub18_Sub16_7115, aByte7108,
					(int) class438.aFloat4864,
					(int) class438.aFloat4865,
					aBoolArray7116, (byte) 41);
		    aBool7118 = true;
		}
		anInt7112 = class183.method3045() * 1570856345;
		class183.method3042();
	    } else {
		aBoolArray7116 = null;
		aClass534_Sub18_Sub16_7115 = null;
		anInt7112 = 0;
	    }
	    aClass183_7107 = null;
	} else if (aClass183_7107 == null
		   || (aClass183_7107.method3101() & i) != i
		   || (-1632623525 * anInt7117
		       != -1562722583 * class602.anInt7887)) {
	    if (null != aClass183_7107)
		i |= aClass183_7107.method3101();
	    Class7 class7
		= (class602.method9997
		   (class185, i,
		    (anInt7104 * -1932952217 != 11 ? -1932952217 * anInt7104
		     : 10),
		    (11 == anInt7104 * -1932952217
		     ? anInt7111 * -2129482149 + 4 : anInt7111 * -2129482149),
		    class151, class151_1_, (int) class438.aFloat4864,
		    class151.method2498((int) class438.aFloat4864,
					(int) class438.aFloat4865, 1734580218),
		    (int) class438.aFloat4865, bool_0_, aClass596_7119,
		    1916451160));
	    if (null != class7) {
		aClass183_7107 = class183 = (Class183) class7.anObject58;
		if (bool_0_) {
		    aClass534_Sub18_Sub16_7115
			= (Class534_Sub18_Sub16) class7.anObject59;
		    aBoolArray7116 = null;
		    class556.method9275(aClass534_Sub18_Sub16_7115, aByte7108,
					(int) class438.aFloat4864,
					(int) class438.aFloat4865, null,
					(byte) 27);
		    aBool7118 = true;
		}
		anInt7112 = class183.method3045() * 1570856345;
		class183.method3042();
	    } else {
		aBoolArray7116 = null;
		aClass534_Sub18_Sub16_7115 = null;
		aClass183_7107 = null;
		anInt7112 = 0;
	    }
	} else
	    class183 = aClass183_7107;
	anInt7117 = 905362699 * class602.anInt7887;
	return class183;
    }
    
    Class602 method8786(int i) {
	return (Class602) aClass44_Sub13_7114.method91(anInt7103 * 1626333597,
						       -1437136589);
    }
    
    final Class183 method8787(Class185 class185, int i, boolean bool,
			      boolean bool_2_, int i_3_) {
	Class602 class602
	    = (Class602) aClass44_Sub13_7114.method91(1626333597 * anInt7103,
						      -613906176);
	if (null != class602.anIntArray7943)
	    class602
		= class602.method9988(Class78.aClass103_825,
				      (3 == -1468443459 * client.anInt11155
				       ? (Interface20) (Class201
							.anInterface20_2188)
				       : Class78.aClass103_825),
				      2058045850);
	if (null == class602) {
	    method8791(class185, 198005613);
	    anInt7117 = -853568467;
	    return null;
	}
	if (!aBool7113
	    && class602.anInt7887 * -1562722583 != -1632623525 * anInt7117) {
	    method8796(true, -1, 0, 0, -1582604330);
	    aBool7118 = false;
	    aClass183_7107 = null;
	}
	method8792(aClass654_Sub1_7102, -2098312331);
	if (bool_2_)
	    bool_2_ = bool_2_ & (aBool7100 & !aBool7118
				 & Class44_Sub6.aClass534_Sub35_10989
				       .aClass690_Sub6_10743
				       .method16923((byte) 3) != 0);
	if (bool && !bool_2_) {
	    anInt7117 = class602.anInt7887 * 905362699;
	    return null;
	}
	Class438 class438 = aClass654_Sub1_7102.method10807().aClass438_4885;
	Class556 class556 = client.aClass512_11100.method8424((byte) 104);
	if (bool_2_) {
	    class556.method9276(aClass534_Sub18_Sub16_7115, aByte7108,
				(int) class438.aFloat4864,
				(int) class438.aFloat4865, aBoolArray7116,
				1080063439);
	    aBool7118 = false;
	}
	Class151 class151 = class556.aClass151Array7432[aByte7108];
	Class151 class151_4_;
	if (aBool7106)
	    class151_4_ = class556.aClass151Array7434[0];
	else
	    class151_4_
		= (aByte7108 < 3 ? class556.aClass151Array7432[aByte7108 + 1]
		   : null);
	Class183 class183 = null;
	if (aClass711_7109.method14338((byte) 0)) {
	    if (bool_2_)
		i |= 0x40000;
	    class183
		= (class602.method9986
		   (class185, i,
		    (11 != anInt7104 * -1932952217 ? -1932952217 * anInt7104
		     : 10),
		    (11 == -1932952217 * anInt7104
		     ? -2129482149 * anInt7111 + 4 : anInt7111 * -2129482149),
		    class151, class151_4_, (int) class438.aFloat4864,
		    class151.method2498((int) class438.aFloat4864,
					(int) class438.aFloat4865,
					-1296134664),
		    (int) class438.aFloat4865, aClass711_7109, aClass596_7119,
		    1414108195));
	    if (class183 != null) {
		if (bool_2_) {
		    if (aBoolArray7116 == null)
			aBoolArray7116 = new boolean[4];
		    aClass534_Sub18_Sub16_7115
			= class183.method3040(aClass534_Sub18_Sub16_7115);
		    class556.method9275(aClass534_Sub18_Sub16_7115, aByte7108,
					(int) class438.aFloat4864,
					(int) class438.aFloat4865,
					aBoolArray7116, (byte) 104);
		    aBool7118 = true;
		}
		anInt7112 = class183.method3045() * 1570856345;
		class183.method3042();
	    } else {
		aBoolArray7116 = null;
		aClass534_Sub18_Sub16_7115 = null;
		anInt7112 = 0;
	    }
	    aClass183_7107 = null;
	} else if (aClass183_7107 == null
		   || (aClass183_7107.method3101() & i) != i
		   || (-1632623525 * anInt7117
		       != -1562722583 * class602.anInt7887)) {
	    if (null != aClass183_7107)
		i |= aClass183_7107.method3101();
	    Class7 class7
		= (class602.method9997
		   (class185, i,
		    (anInt7104 * -1932952217 != 11 ? -1932952217 * anInt7104
		     : 10),
		    (11 == anInt7104 * -1932952217
		     ? anInt7111 * -2129482149 + 4 : anInt7111 * -2129482149),
		    class151, class151_4_, (int) class438.aFloat4864,
		    class151.method2498((int) class438.aFloat4864,
					(int) class438.aFloat4865, 1736500575),
		    (int) class438.aFloat4865, bool_2_, aClass596_7119,
		    575984172));
	    if (null != class7) {
		aClass183_7107 = class183 = (Class183) class7.anObject58;
		if (bool_2_) {
		    aClass534_Sub18_Sub16_7115
			= (Class534_Sub18_Sub16) class7.anObject59;
		    aBoolArray7116 = null;
		    class556.method9275(aClass534_Sub18_Sub16_7115, aByte7108,
					(int) class438.aFloat4864,
					(int) class438.aFloat4865, null,
					(byte) 40);
		    aBool7118 = true;
		}
		anInt7112 = class183.method3045() * 1570856345;
		class183.method3042();
	    } else {
		aBoolArray7116 = null;
		aClass534_Sub18_Sub16_7115 = null;
		aClass183_7107 = null;
		anInt7112 = 0;
	    }
	} else
	    class183 = aClass183_7107;
	anInt7117 = 905362699 * class602.anInt7887;
	return class183;
    }
    
    void method8788(Class185 class185, Class183 class183, Class446 class446,
		    int i, int i_5_, int i_6_, int i_7_, boolean bool,
		    byte i_8_) {
	Class172[] class172s = class183.method3168();
	Class158[] class158s = class183.method3065();
	if ((aClass629_7105 == null || aClass629_7105.aBool8189)
	    && (null != class172s || null != class158s)) {
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_7114.method91(1626333597 * anInt7103,
						-701437373));
	    if (class602.anIntArray7943 != null)
		class602 = (class602.method9988
			    (Class78.aClass103_825,
			     (client.anInt11155 * -1468443459 == 3
			      ? (Interface20) Class201.anInterface20_2188
			      : Class78.aClass103_825),
			     -1841057426));
	    if (null != class602)
		aClass629_7105 = Class629.method10422(client.anInt11101, true);
	}
	if (null != aClass629_7105) {
	    class183.method3073(class446);
	    if (bool)
		aClass629_7105.method10393(class185, (long) client.anInt11101,
					   class172s, class158s, false);
	    else
		aClass629_7105.method10392((long) client.anInt11101);
	    aClass629_7105.method10396(aByte7108, i, i_5_, i_6_, i_7_);
	}
    }
    
    int method8789(byte i) {
	return -method8805((byte) 47);
    }
    
    void method8790(Class185 class185, int i) {
	method8787(class185, 262144, true, true, 1350687483);
    }
    
    void method8791(Class185 class185, int i) {
	if (aClass534_Sub18_Sub16_7115 != null) {
	    Class438 class438
		= aClass654_Sub1_7102.method10807().aClass438_4885;
	    client.aClass512_11100.method8424((byte) 66).method9276
		(aClass534_Sub18_Sub16_7115, aByte7108,
		 (int) class438.aFloat4864, (int) class438.aFloat4865,
		 aBoolArray7116, 1708005769);
	    aBoolArray7116 = null;
	    aClass534_Sub18_Sub16_7115 = null;
	}
    }
    
    void method8792(Class654_Sub1 class654_sub1, int i) {
	if (null != aClass711_7101 && aClass711_7101.method14338((byte) 0)) {
	    aClass711_7101.method14393((client.anInt11101
					- anInt7110 * -1588764245),
				       (byte) 1);
	    if (aClass711_7101.method14343((byte) 1))
		aClass711_7101.method14330(-1, 1704252654);
	    if (!aClass711_7101.method14336(1353847942)) {
		aClass711_7109 = aClass711_7101;
		aBool7113 = true;
		anInt7110 = -44920573 * client.anInt11101;
		return;
	    }
	}
	if (aClass711_7109.method14338((byte) 0)) {
	    if (aClass711_7109.method14393((client.anInt11101
					    - anInt7110 * -1588764245),
					   (byte) 1)) {
		if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
			.method16923((byte) 49)
		    == 2)
		    aBool7118 = false;
		if (aClass711_7109.method14343((byte) 1)) {
		    aClass711_7109.method14330(-1, 1474782467);
		    aBool7113 = false;
		    method8796(false, -1, 0, 0, -498687422);
		}
	    }
	} else
	    method8796(false, -1, 0, 0, -1871926831);
	anInt7110 = client.anInt11101 * -44920573;
    }
    
    void method8793(Class185 class185) {
	if (aClass534_Sub18_Sub16_7115 != null) {
	    Class438 class438
		= aClass654_Sub1_7102.method10807().aClass438_4885;
	    client.aClass512_11100.method8424((byte) 15).method9276
		(aClass534_Sub18_Sub16_7115, aByte7108,
		 (int) class438.aFloat4864, (int) class438.aFloat4865,
		 aBoolArray7116, 1968201006);
	    aBoolArray7116 = null;
	    aClass534_Sub18_Sub16_7115 = null;
	}
    }
    
    public void method8794(int i, int i_9_) {
	aClass711_7101 = null;
	if (i_9_ > 0) {
	    aClass711_7101 = new Class711_Sub3(aClass654_Sub1_7102, false);
	    aClass711_7101.method14334(i, i_9_, 1, false, (byte) -114);
	} else {
	    aBool7113 = true;
	    method8796(false, i, 1, 0, -1366548989);
	}
    }
    
    int method8795() {
	return anInt7112 * 1225303721;
    }
    
    void method8796(boolean bool, int i, int i_10_, int i_11_, int i_12_) {
	int i_13_ = i;
	boolean bool_14_ = false;
	if (i_13_ == -1) {
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_7114.method91(1626333597 * anInt7103,
						-709254757));
	    Class602 class602_15_ = class602;
	    if (null != class602.anIntArray7943)
		class602 = (class602.method9988
			    (Class78.aClass103_825,
			     (3 == -1468443459 * client.anInt11155
			      ? (Interface20) Class201.anInterface20_2188
			      : Class78.aClass103_825),
			     1446717606));
	    if (class602 == null)
		return;
	    if (class602 == class602_15_)
		class602_15_ = null;
	    if (class602.method10015((byte) -43)) {
		if (!class602.aBool7916
		    || Class44_Sub6.aClass534_Sub35_10989
			   .aClass690_Sub30_10739
			   .method17143(-1569503751) == 1) {
		    if (bool && aClass711_7109.method14338((byte) 0)
			&& class602.method9996(aClass711_7109
						   .method14329(671433061),
					       -1065165449))
			return;
		    if (class602.anInt7887 * -1562722583
			!= -1632623525 * anInt7117)
			bool_14_ = class602.aBool7944;
		    i_13_ = class602.method9994((byte) 28);
		    if (class602.method9993(-384752090))
			i_10_ = 0;
		    else
			i_10_ = 1;
		}
	    } else if (null != class602_15_
		       && class602_15_.method10015((byte) -3)
		       && (!class602_15_.aBool7916
			   || Class44_Sub6.aClass534_Sub35_10989
				  .aClass690_Sub30_10739
				  .method17143(-1569503751) == 1)) {
		if (bool && aClass711_7109.method14338((byte) 0)
		    && class602_15_.method9996(aClass711_7109
						   .method14329(1409324946),
					       -1087932781))
		    return;
		if (-1632623525 * anInt7117
		    != class602.anInt7887 * -1562722583)
		    bool_14_ = class602_15_.aBool7944;
		i_13_ = class602_15_.method9994((byte) 90);
		if (class602_15_.method9993(-384752090))
		    i_10_ = 0;
		else
		    i_10_ = 1;
	    }
	}
	if (i_13_ == -1)
	    aClass711_7109.method14332(-1, false, 632820104);
	else {
	    aClass711_7109.method14334(i_13_, i_11_, i_10_, bool_14_,
				       (byte) -120);
	    anInt7110 = -44920573 * client.anInt11101;
	    aBool7118 = false;
	    aClass183_7107 = null;
	}
    }
    
    int method8797() {
	return anInt7112 * 1225303721;
    }
    
    int method8798() {
	return anInt7112 * 1225303721;
    }
    
    void method8799(Class596 class596) {
	aClass596_7119 = class596;
	aClass183_7107 = null;
    }
    
    void method8800(Class596 class596) {
	aClass596_7119 = class596;
	aClass183_7107 = null;
    }
    
    void method8801(Class654_Sub1 class654_sub1) {
	if (null != aClass711_7101 && aClass711_7101.method14338((byte) 0)) {
	    aClass711_7101.method14393((client.anInt11101
					- anInt7110 * -1588764245),
				       (byte) 1);
	    if (aClass711_7101.method14343((byte) 1))
		aClass711_7101.method14330(-1, 1096603042);
	    if (!aClass711_7101.method14336(1910404080)) {
		aClass711_7109 = aClass711_7101;
		aBool7113 = true;
		anInt7110 = -44920573 * client.anInt11101;
		return;
	    }
	}
	if (aClass711_7109.method14338((byte) 0)) {
	    if (aClass711_7109.method14393((client.anInt11101
					    - anInt7110 * -1588764245),
					   (byte) 1)) {
		if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
			.method16923((byte) 73)
		    == 2)
		    aBool7118 = false;
		if (aClass711_7109.method14343((byte) 1)) {
		    aClass711_7109.method14330(-1, 1966730825);
		    aBool7113 = false;
		    method8796(false, -1, 0, 0, -78154370);
		}
	    }
	} else
	    method8796(false, -1, 0, 0, -206970325);
	anInt7110 = client.anInt11101 * -44920573;
    }
    
    Class602 method8802() {
	return (Class602) aClass44_Sub13_7114.method91(anInt7103 * 1626333597,
						       -1285157659);
    }
    
    final Class183 method8803(Class185 class185, int i, boolean bool,
			      boolean bool_16_) {
	Class602 class602
	    = ((Class602)
	       aClass44_Sub13_7114.method91(1626333597 * anInt7103, 46430326));
	if (null != class602.anIntArray7943)
	    class602
		= class602.method9988(Class78.aClass103_825,
				      (3 == -1468443459 * client.anInt11155
				       ? (Interface20) (Class201
							.anInterface20_2188)
				       : Class78.aClass103_825),
				      -1618556356);
	if (null == class602) {
	    method8791(class185, 198005613);
	    anInt7117 = -853568467;
	    return null;
	}
	if (!aBool7113
	    && class602.anInt7887 * -1562722583 != -1632623525 * anInt7117) {
	    method8796(true, -1, 0, 0, -2058876638);
	    aBool7118 = false;
	    aClass183_7107 = null;
	}
	method8792(aClass654_Sub1_7102, 1332901662);
	if (bool_16_)
	    bool_16_ = bool_16_ & (aBool7100 & !aBool7118
				   & Class44_Sub6.aClass534_Sub35_10989
					 .aClass690_Sub6_10743
					 .method16923((byte) 70) != 0);
	if (bool && !bool_16_) {
	    anInt7117 = class602.anInt7887 * 905362699;
	    return null;
	}
	Class438 class438 = aClass654_Sub1_7102.method10807().aClass438_4885;
	Class556 class556 = client.aClass512_11100.method8424((byte) 112);
	if (bool_16_) {
	    class556.method9276(aClass534_Sub18_Sub16_7115, aByte7108,
				(int) class438.aFloat4864,
				(int) class438.aFloat4865, aBoolArray7116,
				364132060);
	    aBool7118 = false;
	}
	Class151 class151 = class556.aClass151Array7432[aByte7108];
	Class151 class151_17_;
	if (aBool7106)
	    class151_17_ = class556.aClass151Array7434[0];
	else
	    class151_17_
		= (aByte7108 < 3 ? class556.aClass151Array7432[aByte7108 + 1]
		   : null);
	Class183 class183 = null;
	if (aClass711_7109.method14338((byte) 0)) {
	    if (bool_16_)
		i |= 0x40000;
	    class183
		= (class602.method9986
		   (class185, i,
		    (11 != anInt7104 * -1932952217 ? -1932952217 * anInt7104
		     : 10),
		    (11 == -1932952217 * anInt7104
		     ? -2129482149 * anInt7111 + 4 : anInt7111 * -2129482149),
		    class151, class151_17_, (int) class438.aFloat4864,
		    class151.method2498((int) class438.aFloat4864,
					(int) class438.aFloat4865, -747305729),
		    (int) class438.aFloat4865, aClass711_7109, aClass596_7119,
		    1462194973));
	    if (class183 != null) {
		if (bool_16_) {
		    if (aBoolArray7116 == null)
			aBoolArray7116 = new boolean[4];
		    aClass534_Sub18_Sub16_7115
			= class183.method3040(aClass534_Sub18_Sub16_7115);
		    class556.method9275(aClass534_Sub18_Sub16_7115, aByte7108,
					(int) class438.aFloat4864,
					(int) class438.aFloat4865,
					aBoolArray7116, (byte) -94);
		    aBool7118 = true;
		}
		anInt7112 = class183.method3045() * 1570856345;
		class183.method3042();
	    } else {
		aBoolArray7116 = null;
		aClass534_Sub18_Sub16_7115 = null;
		anInt7112 = 0;
	    }
	    aClass183_7107 = null;
	} else if (aClass183_7107 == null
		   || (aClass183_7107.method3101() & i) != i
		   || (-1632623525 * anInt7117
		       != -1562722583 * class602.anInt7887)) {
	    if (null != aClass183_7107)
		i |= aClass183_7107.method3101();
	    Class7 class7
		= (class602.method9997
		   (class185, i,
		    (anInt7104 * -1932952217 != 11 ? -1932952217 * anInt7104
		     : 10),
		    (11 == anInt7104 * -1932952217
		     ? anInt7111 * -2129482149 + 4 : anInt7111 * -2129482149),
		    class151, class151_17_, (int) class438.aFloat4864,
		    class151.method2498((int) class438.aFloat4864,
					(int) class438.aFloat4865,
					-1792249514),
		    (int) class438.aFloat4865, bool_16_, aClass596_7119,
		    1819911868));
	    if (null != class7) {
		aClass183_7107 = class183 = (Class183) class7.anObject58;
		if (bool_16_) {
		    aClass534_Sub18_Sub16_7115
			= (Class534_Sub18_Sub16) class7.anObject59;
		    aBoolArray7116 = null;
		    class556.method9275(aClass534_Sub18_Sub16_7115, aByte7108,
					(int) class438.aFloat4864,
					(int) class438.aFloat4865, null,
					(byte) -21);
		    aBool7118 = true;
		}
		anInt7112 = class183.method3045() * 1570856345;
		class183.method3042();
	    } else {
		aBoolArray7116 = null;
		aClass534_Sub18_Sub16_7115 = null;
		aClass183_7107 = null;
		anInt7112 = 0;
	    }
	} else
	    class183 = aClass183_7107;
	anInt7117 = 905362699 * class602.anInt7887;
	return class183;
    }
    
    final Class183 method8804(Class185 class185, int i, boolean bool,
			      boolean bool_18_) {
	Class602 class602
	    = (Class602) aClass44_Sub13_7114.method91(1626333597 * anInt7103,
						      -1472364173);
	if (null != class602.anIntArray7943)
	    class602
		= class602.method9988(Class78.aClass103_825,
				      (3 == -1468443459 * client.anInt11155
				       ? (Interface20) (Class201
							.anInterface20_2188)
				       : Class78.aClass103_825),
				      -1540275983);
	if (null == class602) {
	    method8791(class185, 198005613);
	    anInt7117 = -853568467;
	    return null;
	}
	if (!aBool7113
	    && class602.anInt7887 * -1562722583 != -1632623525 * anInt7117) {
	    method8796(true, -1, 0, 0, 653756311);
	    aBool7118 = false;
	    aClass183_7107 = null;
	}
	method8792(aClass654_Sub1_7102, 193614997);
	if (bool_18_)
	    bool_18_ = bool_18_ & (aBool7100 & !aBool7118
				   & Class44_Sub6.aClass534_Sub35_10989
					 .aClass690_Sub6_10743
					 .method16923((byte) 107) != 0);
	if (bool && !bool_18_) {
	    anInt7117 = class602.anInt7887 * 905362699;
	    return null;
	}
	Class438 class438 = aClass654_Sub1_7102.method10807().aClass438_4885;
	Class556 class556 = client.aClass512_11100.method8424((byte) 42);
	if (bool_18_) {
	    class556.method9276(aClass534_Sub18_Sub16_7115, aByte7108,
				(int) class438.aFloat4864,
				(int) class438.aFloat4865, aBoolArray7116,
				1680065763);
	    aBool7118 = false;
	}
	Class151 class151 = class556.aClass151Array7432[aByte7108];
	Class151 class151_19_;
	if (aBool7106)
	    class151_19_ = class556.aClass151Array7434[0];
	else
	    class151_19_
		= (aByte7108 < 3 ? class556.aClass151Array7432[aByte7108 + 1]
		   : null);
	Class183 class183 = null;
	if (aClass711_7109.method14338((byte) 0)) {
	    if (bool_18_)
		i |= 0x40000;
	    class183
		= (class602.method9986
		   (class185, i,
		    (11 != anInt7104 * -1932952217 ? -1932952217 * anInt7104
		     : 10),
		    (11 == -1932952217 * anInt7104
		     ? -2129482149 * anInt7111 + 4 : anInt7111 * -2129482149),
		    class151, class151_19_, (int) class438.aFloat4864,
		    class151.method2498((int) class438.aFloat4864,
					(int) class438.aFloat4865, -677368615),
		    (int) class438.aFloat4865, aClass711_7109, aClass596_7119,
		    1851188717));
	    if (class183 != null) {
		if (bool_18_) {
		    if (aBoolArray7116 == null)
			aBoolArray7116 = new boolean[4];
		    aClass534_Sub18_Sub16_7115
			= class183.method3040(aClass534_Sub18_Sub16_7115);
		    class556.method9275(aClass534_Sub18_Sub16_7115, aByte7108,
					(int) class438.aFloat4864,
					(int) class438.aFloat4865,
					aBoolArray7116, (byte) -30);
		    aBool7118 = true;
		}
		anInt7112 = class183.method3045() * 1570856345;
		class183.method3042();
	    } else {
		aBoolArray7116 = null;
		aClass534_Sub18_Sub16_7115 = null;
		anInt7112 = 0;
	    }
	    aClass183_7107 = null;
	} else if (aClass183_7107 == null
		   || (aClass183_7107.method3101() & i) != i
		   || (-1632623525 * anInt7117
		       != -1562722583 * class602.anInt7887)) {
	    if (null != aClass183_7107)
		i |= aClass183_7107.method3101();
	    Class7 class7
		= (class602.method9997
		   (class185, i,
		    (anInt7104 * -1932952217 != 11 ? -1932952217 * anInt7104
		     : 10),
		    (11 == anInt7104 * -1932952217
		     ? anInt7111 * -2129482149 + 4 : anInt7111 * -2129482149),
		    class151, class151_19_, (int) class438.aFloat4864,
		    class151.method2498((int) class438.aFloat4864,
					(int) class438.aFloat4865, -497708351),
		    (int) class438.aFloat4865, bool_18_, aClass596_7119,
		    337271174));
	    if (null != class7) {
		aClass183_7107 = class183 = (Class183) class7.anObject58;
		if (bool_18_) {
		    aClass534_Sub18_Sub16_7115
			= (Class534_Sub18_Sub16) class7.anObject59;
		    aBoolArray7116 = null;
		    class556.method9275(aClass534_Sub18_Sub16_7115, aByte7108,
					(int) class438.aFloat4864,
					(int) class438.aFloat4865, null,
					(byte) 29);
		    aBool7118 = true;
		}
		anInt7112 = class183.method3045() * 1570856345;
		class183.method3042();
	    } else {
		aBoolArray7116 = null;
		aClass534_Sub18_Sub16_7115 = null;
		aClass183_7107 = null;
		anInt7112 = 0;
	    }
	} else
	    class183 = aClass183_7107;
	anInt7117 = 905362699 * class602.anInt7887;
	return class183;
    }
    
    int method8805(byte i) {
	return anInt7112 * 1225303721;
    }
    
    void method8806(Class185 class185, Class183 class183, Class446 class446,
		    int i, int i_20_, int i_21_, int i_22_, boolean bool) {
	Class172[] class172s = class183.method3168();
	Class158[] class158s = class183.method3065();
	if ((aClass629_7105 == null || aClass629_7105.aBool8189)
	    && (null != class172s || null != class158s)) {
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_7114.method91(1626333597 * anInt7103,
						-1185018862));
	    if (class602.anIntArray7943 != null)
		class602 = (class602.method9988
			    (Class78.aClass103_825,
			     (client.anInt11155 * -1468443459 == 3
			      ? (Interface20) Class201.anInterface20_2188
			      : Class78.aClass103_825),
			     1965208370));
	    if (null != class602)
		aClass629_7105 = Class629.method10422(client.anInt11101, true);
	}
	if (null != aClass629_7105) {
	    class183.method3073(class446);
	    if (bool)
		aClass629_7105.method10393(class185, (long) client.anInt11101,
					   class172s, class158s, false);
	    else
		aClass629_7105.method10392((long) client.anInt11101);
	    aClass629_7105.method10396(aByte7108, i, i_20_, i_21_, i_22_);
	}
    }
    
    public void method8807(int i, int i_23_, int i_24_) {
	aClass711_7101 = null;
	if (i_23_ > 0) {
	    aClass711_7101 = new Class711_Sub3(aClass654_Sub1_7102, false);
	    aClass711_7101.method14334(i, i_23_, 1, false, (byte) -77);
	} else {
	    aBool7113 = true;
	    method8796(false, i, 1, 0, -588573596);
	}
    }
    
    void method8808(Class185 class185, Class183 class183, Class446 class446,
		    int i, int i_25_, int i_26_, int i_27_, boolean bool) {
	Class172[] class172s = class183.method3168();
	Class158[] class158s = class183.method3065();
	if ((aClass629_7105 == null || aClass629_7105.aBool8189)
	    && (null != class172s || null != class158s)) {
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_7114.method91(1626333597 * anInt7103,
						501160114));
	    if (class602.anIntArray7943 != null)
		class602 = (class602.method9988
			    (Class78.aClass103_825,
			     (client.anInt11155 * -1468443459 == 3
			      ? (Interface20) Class201.anInterface20_2188
			      : Class78.aClass103_825),
			     1292493740));
	    if (null != class602)
		aClass629_7105 = Class629.method10422(client.anInt11101, true);
	}
	if (null != aClass629_7105) {
	    class183.method3073(class446);
	    if (bool)
		aClass629_7105.method10393(class185, (long) client.anInt11101,
					   class172s, class158s, false);
	    else
		aClass629_7105.method10392((long) client.anInt11101);
	    aClass629_7105.method10396(aByte7108, i, i_25_, i_26_, i_27_);
	}
    }
    
    boolean method8809(byte i) {
	return aBool7100;
    }
    
    void method8810(Class185 class185) {
	method8787(class185, 262144, true, true, 1599611161);
    }
    
    Class528(Class185 class185, Class44_Sub13 class44_sub13, Class602 class602,
	     int i, int i_28_, int i_29_, Class654_Sub1 class654_sub1,
	     boolean bool, int i_30_, int i_31_) {
	anInt7112 = 0;
	aBool7113 = false;
	aBool7118 = false;
	aClass44_Sub13_7114 = class44_sub13;
	anInt7103 = 947750589 * class602.anInt7887;
	anInt7104 = 243748439 * i;
	anInt7111 = i_28_ * -1083780653;
	aClass654_Sub1_7102 = class654_sub1;
	aBool7113 = -1 != i_30_;
	aByte7108 = (byte) i_29_;
	aBool7106 = bool;
	aBool7100 = class185.method3436() && class602.aBool7896 && !aBool7106;
	aClass711_7109 = new Class711_Sub3(class654_sub1, false);
	method8796(false, i_30_, 1, aBool7113 ? i_31_ : 0, 474947379);
    }
    
    void method8811(Class185 class185) {
	method8787(class185, 262144, true, true, 2109200526);
    }
    
    void method8812(Class185 class185) {
	if (aClass534_Sub18_Sub16_7115 != null) {
	    Class438 class438
		= aClass654_Sub1_7102.method10807().aClass438_4885;
	    client.aClass512_11100.method8424((byte) 110).method9276
		(aClass534_Sub18_Sub16_7115, aByte7108,
		 (int) class438.aFloat4864, (int) class438.aFloat4865,
		 aBoolArray7116, -1195509084);
	    aBoolArray7116 = null;
	    aClass534_Sub18_Sub16_7115 = null;
	}
    }
    
    boolean method8813() {
	return aBool7100;
    }
    
    int method8814() {
	return -method8805((byte) 112);
    }
    
    void method8815(Class654_Sub1 class654_sub1) {
	if (null != aClass711_7101 && aClass711_7101.method14338((byte) 0)) {
	    aClass711_7101.method14393((client.anInt11101
					- anInt7110 * -1588764245),
				       (byte) 1);
	    if (aClass711_7101.method14343((byte) 1))
		aClass711_7101.method14330(-1, 2108282549);
	    if (!aClass711_7101.method14336(1292133032)) {
		aClass711_7109 = aClass711_7101;
		aBool7113 = true;
		anInt7110 = -44920573 * client.anInt11101;
		return;
	    }
	}
	if (aClass711_7109.method14338((byte) 0)) {
	    if (aClass711_7109.method14393((client.anInt11101
					    - anInt7110 * -1588764245),
					   (byte) 1)) {
		if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub6_10743
			.method16923((byte) 82)
		    == 2)
		    aBool7118 = false;
		if (aClass711_7109.method14343((byte) 1)) {
		    aClass711_7109.method14330(-1, 1491988917);
		    aBool7113 = false;
		    method8796(false, -1, 0, 0, -1505243591);
		}
	    }
	} else
	    method8796(false, -1, 0, 0, -1018895410);
	anInt7110 = client.anInt11101 * -44920573;
    }
    
    void method8816(Class185 class185, Class183 class183, Class446 class446,
		    int i, int i_32_, int i_33_, int i_34_, boolean bool) {
	Class172[] class172s = class183.method3168();
	Class158[] class158s = class183.method3065();
	if ((aClass629_7105 == null || aClass629_7105.aBool8189)
	    && (null != class172s || null != class158s)) {
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_7114.method91(1626333597 * anInt7103,
						-1078233830));
	    if (class602.anIntArray7943 != null)
		class602 = (class602.method9988
			    (Class78.aClass103_825,
			     (client.anInt11155 * -1468443459 == 3
			      ? (Interface20) Class201.anInterface20_2188
			      : Class78.aClass103_825),
			     -628549688));
	    if (null != class602)
		aClass629_7105 = Class629.method10422(client.anInt11101, true);
	}
	if (null != aClass629_7105) {
	    class183.method3073(class446);
	    if (bool)
		aClass629_7105.method10393(class185, (long) client.anInt11101,
					   class172s, class158s, false);
	    else
		aClass629_7105.method10392((long) client.anInt11101);
	    aClass629_7105.method10396(aByte7108, i, i_32_, i_33_, i_34_);
	}
    }
    
    void method8817(boolean bool, int i, int i_35_, int i_36_) {
	int i_37_ = i;
	boolean bool_38_ = false;
	if (i_37_ == -1) {
	    Class602 class602
		= ((Class602)
		   aClass44_Sub13_7114.method91(1626333597 * anInt7103,
						-1004560806));
	    Class602 class602_39_ = class602;
	    if (null != class602.anIntArray7943)
		class602 = (class602.method9988
			    (Class78.aClass103_825,
			     (3 == -1468443459 * client.anInt11155
			      ? (Interface20) Class201.anInterface20_2188
			      : Class78.aClass103_825),
			     1075023040));
	    if (class602 == null)
		return;
	    if (class602 == class602_39_)
		class602_39_ = null;
	    if (class602.method10015((byte) -103)) {
		if (!class602.aBool7916
		    || Class44_Sub6.aClass534_Sub35_10989
			   .aClass690_Sub30_10739
			   .method17143(-1569503751) == 1) {
		    if (bool && aClass711_7109.method14338((byte) 0)
			&& class602.method9996(aClass711_7109
						   .method14329(1905688560),
					       728638516))
			return;
		    if (class602.anInt7887 * -1562722583
			!= -1632623525 * anInt7117)
			bool_38_ = class602.aBool7944;
		    i_37_ = class602.method9994((byte) -108);
		    if (class602.method9993(-384752090))
			i_35_ = 0;
		    else
			i_35_ = 1;
		}
	    } else if (null != class602_39_
		       && class602_39_.method10015((byte) -21)
		       && (!class602_39_.aBool7916
			   || Class44_Sub6.aClass534_Sub35_10989
				  .aClass690_Sub30_10739
				  .method17143(-1569503751) == 1)) {
		if (bool && aClass711_7109.method14338((byte) 0)
		    && class602_39_.method9996(aClass711_7109
						   .method14329(1649191661),
					       -984165378))
		    return;
		if (-1632623525 * anInt7117
		    != class602.anInt7887 * -1562722583)
		    bool_38_ = class602_39_.aBool7944;
		i_37_ = class602_39_.method9994((byte) -42);
		if (class602_39_.method9993(-384752090))
		    i_35_ = 0;
		else
		    i_35_ = 1;
	    }
	}
	if (i_37_ == -1)
	    aClass711_7109.method14332(-1, false, 1854337741);
	else {
	    aClass711_7109.method14334(i_37_, i_36_, i_35_, bool_38_,
				       (byte) -106);
	    anInt7110 = -44920573 * client.anInt11101;
	    aBool7118 = false;
	    aClass183_7107 = null;
	}
    }
    
    static final void method8818(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_40_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_41_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	Class534_Sub18_Sub19 class534_sub18_sub19
	    = Class618.aClass458_8101.method7433(i_40_, -1203343574);
	int i_42_ = class534_sub18_sub19.anIntArray11890[i_41_];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_42_;
    }
    
    static final void method8819(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    static Class564 method8820(int i, int i_43_, int i_44_, Class183 class183,
			       byte i_45_) {
	if (null == class183)
	    return null;
	Class564 class564
	    = new Class564(i, i_43_, i_44_, class183.method3041(),
			   class183.method3134(), class183.method3043(),
			   class183.method3045(), class183.method3046(),
			   class183.method3047(), class183.method3038());
	return class564;
    }
}
