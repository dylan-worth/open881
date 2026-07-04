/* Class666 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Class666
{
    Class247 aClass247_8574;
    Class243 aClass243_8575;
    static int anInt8576;
    public static Class547 aClass547_8577;
    
    Class247 method11010() {
	return aClass243_8575.method4476((-1278450723
					  * aClass247_8574.anInt2454),
					 1191695865);
    }
    
    void method11011(int i) {
	aClass243_8575 = null;
	aClass247_8574 = null;
    }
    
    boolean method11012(int i, int i_0_, int i_1_) {
	Class247 class247 = Class81.method1637(i, i_0_, 1829488146);
	if (null != class247) {
	    aClass243_8575 = Class44_Sub11.aClass243Array11006[i >> 16];
	    aClass247_8574 = class247;
	    return true;
	}
	method11011(-1112161412);
	return false;
    }
    
    Class666() {
	/* empty */
    }
    
    Class247 method11013() {
	return aClass243_8575.method4476((-1278450723
					  * aClass247_8574.anInt2454),
					 903564489);
    }
    
    Class247 method11014(byte i) {
	return aClass243_8575.method4476((-1278450723
					  * aClass247_8574.anInt2454),
					 -1428455085);
    }
    
    boolean method11015(int i, int i_2_) {
	Class247 class247 = Class81.method1637(i, i_2_, 307571028);
	if (null != class247) {
	    aClass243_8575 = Class44_Sub11.aClass243Array11006[i >> 16];
	    aClass247_8574 = class247;
	    return true;
	}
	method11011(515113644);
	return false;
    }
    
    boolean method11016(int i, int i_3_) {
	Class247 class247 = Class81.method1637(i, i_3_, 1072132166);
	if (null != class247) {
	    aClass243_8575 = Class44_Sub11.aClass243Array11006[i >> 16];
	    aClass247_8574 = class247;
	    return true;
	}
	method11011(-919454639);
	return false;
    }
    
    void method11017() {
	aClass243_8575 = null;
	aClass247_8574 = null;
    }
    
    void method11018() {
	aClass243_8575 = null;
	aClass247_8574 = null;
    }
    
    static long method11019(CharSequence charsequence, int i) {
	long l = 0L;
	int i_4_ = charsequence.length();
	for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
	    l *= 37L;
	    char c = charsequence.charAt(i_5_);
	    if (c >= 'A' && c <= 'Z')
		l += (long) ('\001' + c - 'A');
	    else if (c >= 'a' && c <= 'z')
		l += (long) ('\001' + c - 'a');
	    else if (c >= '0' && c <= '9')
		l += (long) (c + '\033' - '0');
	    if (l >= 177917621779460413L)
		break;
	}
	for (/**/; l % 37L == 0L && 0L != l; l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    public static byte[] method11020
	(Class534_Sub40 class534_sub40, int i, int i_6_) throws IOException {
	ByteArrayInputStream bytearrayinputstream
	    = new ByteArrayInputStream(class534_sub40.aByteArray10810);
	bytearrayinputstream.skip((long) (class534_sub40.anInt10811
					  * 31645619));
	return Class100.method1884(bytearrayinputstream, i, (byte) -28);
    }
    
    static final void method11021(byte i) {
	for (int i_7_ = Class78.aClass103_825.aClass612_1294
			    .method10101(true, -1707797281);
	     i_7_ != -1;
	     i_7_ = Class78.aClass103_825.aClass612_1294
			.method10101(false, -1707797281)) {
	    Class190.method3768(i_7_, 2147109519);
	    client.anIntArray11254
		[(client.anInt11255 += -650296415) * -11706271 - 1 & 0x3f]
		= i_7_;
	}
	for (Class534_Sub18_Sub6 class534_sub18_sub6
		 = Class227.method4184(1411372889);
	     null != class534_sub18_sub6;
	     class534_sub18_sub6 = Class227.method4184(-1066595300)) {
	    int i_8_ = class534_sub18_sub6.method18122(-1667245096);
	    long l = class534_sub18_sub6.method18123(1877042680);
	    if (1 == i_8_) {
		Class150 class150
		    = ((Class150)
		       Class407.aClass110_Sub1_Sub2_4312.method91((int) l,
								  -330181336));
		Class77.aClass155_Sub1_819.method114(class150,
						     (-1479053575
						      * (class534_sub18_sub6
							 .anInt11666)),
						     -834567353);
		client.anIntArray11260
		    [(client.anInt11062 += 92818243) * -2145052309 - 1 & 0x3f]
		    = (int) l;
	    } else if (i_8_ == 2) {
		Class150 class150
		    = ((Class150)
		       Class407.aClass110_Sub1_Sub2_4312.method91((int) l,
								  -420783390));
		Class77.aClass155_Sub1_819.method118(class150,
						     (class534_sub18_sub6
						      .aString11677),
						     (byte) 11);
		client.anIntArray11345
		    [(client.anInt11240 += -2053902573) * 600257307 - 1 & 0x3f]
		    = (int) l;
	    } else if (i_8_ == 3) {
		Class247 class247 = Class112.method2017((int) l, 937985204);
		if (!class534_sub18_sub6.aString11677
			 .equals(class247.aString2533)) {
		    class247.aString2533 = class534_sub18_sub6.aString11677;
		    Class454.method7416(class247, -1790909332);
		}
	    } else if (23 == i_8_) {
		Class247 class247 = Class112.method2017((int) l, -437761290);
		if ((1 == class534_sub18_sub6.anInt11666 * -1479053575)
		    != class247.aBool2539) {
		    class247.aBool2539
			= -1479053575 * class534_sub18_sub6.anInt11666 == 1;
		    Class454.method7416(class247, -536414115);
		}
	    } else if (4 == i_8_) {
		Class247 class247 = Class112.method2017((int) l, 135411645);
		int i_9_ = class534_sub18_sub6.anInt11666 * -1479053575;
		int i_10_ = 1817172891 * class534_sub18_sub6.anInt11660;
		int i_11_ = class534_sub18_sub6.anInt11661 * 1418837181;
		if (i_9_ != class247.anInt2496 * -1866862435
		    || class247.anInt2497 * 939166901 != i_10_
		    || i_11_ != 27898029 * class247.anInt2550) {
		    class247.anInt2496 = -214166091 * i_9_;
		    class247.anInt2497 = 931070365 * i_10_;
		    class247.anInt2550 = i_11_ * 1933783845;
		    class247.aClass301_2635 = null;
		    Class454.method7416(class247, -1893779560);
		}
	    } else if (i_8_ == 5) {
		Class247 class247 = Class112.method2017((int) l, 1308101723);
		if (1565138829 * class247.anInt2524
		    != -1479053575 * class534_sub18_sub6.anInt11666) {
		    if (class534_sub18_sub6.anInt11666 * -1479053575 != -1) {
			if (null == class247.aClass711_2442)
			    class247.aClass711_2442 = new Class711_Sub2();
			class247.aClass711_2442.method14330
			    (-1479053575 * class534_sub18_sub6.anInt11666,
			     1947679078);
		    } else
			class247.aClass711_2442 = null;
		    class247.anInt2524
			= 1248087069 * class534_sub18_sub6.anInt11666;
		    Class454.method7416(class247, -1247772952);
		}
	    } else if (i_8_ == 6) {
		int i_12_ = -1479053575 * class534_sub18_sub6.anInt11666;
		int i_13_ = i_12_ >> 10 & 0x1f;
		int i_14_ = i_12_ >> 5 & 0x1f;
		int i_15_ = i_12_ & 0x1f;
		int i_16_ = (i_14_ << 11) + (i_13_ << 19) + (i_15_ << 3);
		Class247 class247 = Class112.method2017((int) l, 1674227924);
		if (i_16_ != class247.anInt2482 * 290091559) {
		    class247.anInt2482 = i_16_ * -1996628585;
		    Class454.method7416(class247, -1363307151);
		}
	    } else if (7 == i_8_) {
		Class247 class247 = Class112.method2017((int) l, -112888118);
		boolean bool
		    = 1 == -1479053575 * class534_sub18_sub6.anInt11666;
		if (class247.aBool2473 != bool) {
		    class247.aBool2473 = bool;
		    Class454.method7416(class247, -1629275432);
		}
	    } else if (8 == i_8_) {
		Class247 class247 = Class112.method2017((int) l, 463674787);
		if ((-1479053575 * class534_sub18_sub6.anInt11666
		     != 1033849275 * class247.anInt2502)
		    || (class534_sub18_sub6.anInt11660 * 1817172891
			!= -806242263 * class247.anInt2503)
		    || (1418837181 * class534_sub18_sub6.anInt11661
			!= -1230478387 * class247.anInt2508)) {
		    class247.anInt2502
			= -1241099045 * class534_sub18_sub6.anInt11666;
		    class247.anInt2503
			= class534_sub18_sub6.anInt11660 * 1519648291;
		    class247.anInt2508
			= 1517530289 * class534_sub18_sub6.anInt11661;
		    if (403396513 * class247.anInt2606 != -1) {
			if (-1843491229 * class247.anInt2594 > 0)
			    class247.anInt2508
				= (-2116337403
				   * (-720602720 * class247.anInt2508
				      / (-1843491229 * class247.anInt2594)));
			else if (class247.anInt2456 * -1855456835 > 0)
			    class247.anInt2508
				= (-720602720 * class247.anInt2508
				   / (-1855456835 * class247.anInt2456)
				   * -2116337403);
		    }
		    Class454.method7416(class247, -733774776);
		}
	    } else if (i_8_ == 9) {
		Class247 class247 = Class112.method2017((int) l, -90154485);
		if ((-1479053575 * class534_sub18_sub6.anInt11666
		     != 403396513 * class247.anInt2606)
		    || (class534_sub18_sub6.anInt11660 * 1817172891
			!= class247.anInt2602 * -148110895)) {
		    class247.anInt2606
			= class534_sub18_sub6.anInt11666 * -2017265575;
		    class247.anInt2602
			= class534_sub18_sub6.anInt11660 * -501443157;
		    Class454.method7416(class247, -1488013762);
		}
	    } else if (i_8_ == 10) {
		Class247 class247 = Class112.method2017((int) l, -74902100);
		if ((class247.anInt2500 * -495767299
		     != class534_sub18_sub6.anInt11666 * -1479053575)
		    || (class247.anInt2598 * 1797197351
			!= 1817172891 * class534_sub18_sub6.anInt11660)
		    || (1418837181 * class534_sub18_sub6.anInt11661
			!= class247.anInt2624 * -1513459333)) {
		    class247.anInt2500
			= 1865868461 * class534_sub18_sub6.anInt11666;
		    class247.anInt2598
			= 97297261 * class534_sub18_sub6.anInt11660;
		    class247.anInt2624
			= 1239247143 * class534_sub18_sub6.anInt11661;
		    Class454.method7416(class247, -2087658204);
		}
	    } else if (i_8_ == 11) {
		Class247 class247 = Class112.method2017((int) l, 522845106);
		class247.aByte2458 = (byte) 0;
		class247.anInt2466
		    = ((class247.anInt2462
			= 1378796175 * class534_sub18_sub6.anInt11666)
		       * -1394902803);
		class247.aByte2562 = (byte) 0;
		class247.anInt2467
		    = ((class247.anInt2463
			= -2129973849 * class534_sub18_sub6.anInt11660)
		       * 1048318347);
		Class454.method7416(class247, -1992567247);
	    } else if (12 == i_8_) {
		Class247 class247 = Class112.method2017((int) l, 1651933610);
		int i_17_ = -1479053575 * class534_sub18_sub6.anInt11666;
		if (class247 != null
		    && 0 == -1960530827 * class247.anInt2438) {
		    if (i_17_ > (class247.anInt2481 * -166726847
				 - -1279656873 * class247.anInt2469))
			i_17_ = (class247.anInt2481 * -166726847
				 - -1279656873 * class247.anInt2469);
		    if (i_17_ < 0)
			i_17_ = 0;
		    if (2142374941 * class247.anInt2479 != i_17_) {
			class247.anInt2479 = i_17_ * 170726965;
			Class454.method7416(class247, -1764946026);
		    }
		}
	    } else if (i_8_ == 13) {
		Class247 class247 = Class112.method2017((int) l, 2005223251);
		class247.anInt2634
		    = class534_sub18_sub6.anInt11666 * -2138999323;
	    } else if (14 == i_8_) {
		Class113.aBool1373 = true;
		Class113.anInt1375
		    = class534_sub18_sub6.anInt11666 * -408370053;
		Class113.anInt1376
		    = class534_sub18_sub6.anInt11660 * 796998229;
	    } else if (15 == i_8_) {
		Class247 class247 = Class112.method2017((int) l, 205836656);
		class247.anInt2531
		    = class534_sub18_sub6.anInt11666 * -663837393;
	    } else if (21 == i_8_) {
		Class247 class247 = Class112.method2017((int) l, 1006660969);
		class247.aBool2501
		    = class534_sub18_sub6.anInt11666 * -1479053575 == 1;
	    } else if (22 == i_8_) {
		Class247 class247 = Class112.method2017((int) l, 1761876455);
		class247.aBool2471
		    = -1479053575 * class534_sub18_sub6.anInt11666 == 1;
	    } else if (17 == i_8_) {
		Class247 class247 = Class112.method2017((int) l, 1815456343);
		int i_18_ = (int) (l >> 32);
		class247.method4513(i_18_,
				    (short) (class534_sub18_sub6.anInt11666
					     * -1479053575),
				    (short) (1817172891
					     * class534_sub18_sub6.anInt11660),
				    (byte) 72);
	    } else if (i_8_ == 20) {
		Class247 class247 = Class112.method2017((int) l, -357622649);
		int i_19_ = (int) (l >> 32);
		class247.method4530(i_19_,
				    (short) (-1479053575
					     * class534_sub18_sub6.anInt11666),
				    (short) (1817172891
					     * class534_sub18_sub6.anInt11660),
				    585189251);
	    }
	}
    }
}
