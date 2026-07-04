/* Class451_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.zip.CRC32;

public class Class451_Sub1 extends Class451
{
    Class464 aClass464_10295;
    Class450 aClass450_10296;
    Class567 aClass567_10297;
    static final int anInt10298 = 1;
    Class463 aClass463_10299;
    Class567 aClass567_10300;
    Class534_Sub18_Sub18 aClass534_Sub18_Sub18_10301;
    int anInt10302;
    byte[] aByteArray10303;
    int anInt10304;
    int anInt10305;
    int anInt10306 = 0;
    static final byte aByte10307 = 1;
    static final byte aByte10308 = -1;
    static final byte aByte10309 = 0;
    byte[] aByteArray10310;
    Class9 aClass9_10311 = new Class9(16);
    boolean aBool10312;
    boolean aBool10313;
    boolean aBool10314;
    int anInt10315 = 0;
    Class700 aClass700_10316;
    Class700 aClass700_10317 = new Class700();
    static final int anInt10318 = 2;
    long aLong10319 = 0L;
    static final int anInt10320 = 1000;
    static final int anInt10321 = 250;
    static CRC32 aCRC32_10322 = new CRC32();
    Class462 aClass462_10323;
    static final int anInt10324 = 0;
    boolean aBool10325;
    
    public int method15882() {
	if (null == aClass462_10323)
	    return 0;
	return -1069101825 * aClass462_10323.anInt5078;
    }
    
    void method15883(int i, byte[] is, int i_0_, int i_1_, int i_2_) {
	if (!method15884(i, is, i_0_, i_1_, (byte) 107)) {
	    anInt10302 = i * -145809837;
	    aByteArray10303 = is;
	    anInt10304 = i_0_ * -577083317;
	    aClass462_10323 = null;
	    aClass534_Sub18_Sub18_10301 = null;
	    if (!aClass450_10296.method7334(-548434987))
		aClass534_Sub18_Sub18_10301
		    = aClass450_10296.method7332(255, anInt10305 * -426609471,
						 (byte) 0, true, -1918555082);
	}
    }
    
    boolean method15884(int i, byte[] is, int i_3_, int i_4_, byte i_5_) {
	if (i == anInt10302 * -103623205 && i_3_ == anInt10304 * 981999971) {
	    boolean bool = true;
	    for (int i_6_ = 0; i_6_ < aByteArray10303.length; i_6_++) {
		if (aByteArray10303[i_6_] != is[i_6_]) {
		    bool = false;
		    break;
		}
	    }
	    if (bool)
		return true;
	}
	return false;
    }
    
    public int method15885(int i) {
	if (method7385(-589443639) == null) {
	    if (null == aClass534_Sub18_Sub18_10301)
		return 0;
	    return aClass534_Sub18_Sub18_10301.method18461(539738960);
	}
	return 100;
    }
    
    Class451_Sub1(int i, Class567 class567, Class567 class567_7_,
		  Class450 class450, Class464 class464, Class463 class463,
		  int i_8_, byte[] is, int i_9_, boolean bool, int i_10_) {
	anInt10305 = 578820929 * i;
	aClass567_10297 = class567;
	if (null == aClass567_10297)
	    aBool10314 = false;
	else {
	    aBool10314 = true;
	    aClass700_10316 = new Class700();
	}
	aClass567_10300 = class567_7_;
	aClass450_10296 = class450;
	aClass464_10295 = class464;
	aClass463_10299 = class463;
	anInt10302 = -145809837 * i_8_;
	aByteArray10303 = is;
	anInt10304 = -577083317 * i_9_;
	aBool10325 = bool;
	if (null != aClass567_10300)
	    aClass534_Sub18_Sub18_10301
		= aClass463_10299.method7519(anInt10305 * -426609471,
					     aClass567_10300, 31645619);
    }
    
    byte[] method7373(int i, int i_11_) {
	Class534_Sub18_Sub18 class534_sub18_sub18
	    = method15886(i, 0, (byte) -3);
	if (class534_sub18_sub18 == null)
	    return null;
	byte[] is = class534_sub18_sub18.method18460((short) -13530);
	class534_sub18_sub18.method8892((byte) 1);
	return is;
    }
    
    Class534_Sub18_Sub18 method15886(int i, int i_12_, byte i_13_) {
	Class534_Sub18_Sub18 class534_sub18_sub18
	    = (Class534_Sub18_Sub18) aClass9_10311.method579((long) i);
	if (null != class534_sub18_sub18 && 0 == i_12_
	    && !class534_sub18_sub18.aBool11886
	    && class534_sub18_sub18.aBool11888) {
	    class534_sub18_sub18.method8892((byte) 1);
	    class534_sub18_sub18 = null;
	}
	if (null == class534_sub18_sub18) {
	    if (0 == i_12_) {
		if (aClass567_10297 != null && aByteArray10310[i] != -1)
		    class534_sub18_sub18
			= aClass463_10299.method7519(i, aClass567_10297,
						     31645619);
		else if (null != aClass464_10295) {
		    class534_sub18_sub18
			= aClass464_10295.method7559(anInt10305 * -426609471,
						     i, (byte) 2, true,
						     (aClass462_10323
						      .anIntArray5083[i]),
						     (aClass462_10323
						      .anIntArray5093[i]),
						     2143256298);
		    if (null == class534_sub18_sub18)
			return null;
		} else if (!aClass450_10296.method7334(1417890298))
		    class534_sub18_sub18
			= aClass450_10296.method7332(-426609471 * anInt10305,
						     i, (byte) 2, true,
						     -1473613452);
		else
		    return null;
	    } else if (i_12_ == 1) {
		if (aClass567_10297 == null)
		    throw new RuntimeException();
		class534_sub18_sub18
		    = aClass463_10299.method7521(i, aClass567_10297,
						 263468909);
	    } else if (i_12_ == 2) {
		if (aClass567_10297 == null)
		    throw new RuntimeException();
		if (aByteArray10310[i] != -1)
		    throw new RuntimeException();
		if (null != aClass464_10295)
		    return null;
		if (!aClass450_10296.method7340((byte) 24))
		    class534_sub18_sub18
			= aClass450_10296.method7332(anInt10305 * -426609471,
						     i, (byte) 2, false,
						     1868983385);
		else
		    return null;
	    } else
		throw new RuntimeException();
	    aClass9_10311.method581(class534_sub18_sub18, (long) i);
	}
	if (class534_sub18_sub18.aBool11888)
	    return null;
	byte[] is = class534_sub18_sub18.method18460((short) 13320);
	if (class534_sub18_sub18 instanceof Class534_Sub18_Sub18_Sub3) {
	    Class534_Sub18_Sub18 class534_sub18_sub18_14_;
	    try {
		if (null == is || is.length <= 2)
		    throw new RuntimeException();
		aCRC32_10322.reset();
		aCRC32_10322.update(is, 0, is.length - 2);
		int i_15_ = (int) aCRC32_10322.getValue();
		if (aClass462_10323.anIntArray5083[i] != i_15_)
		    throw new RuntimeException();
		if (aClass462_10323.aByteArrayArray5079 != null
		    && aClass462_10323.aByteArrayArray5079[i] != null) {
		    byte[] is_16_ = aClass462_10323.aByteArrayArray5079[i];
		    byte[] is_17_
			= Class70.method1413(is, 0, is.length - 2, 2057322020);
		    for (int i_18_ = 0; i_18_ < 64; i_18_++) {
			if (is_17_[i_18_] != is_16_[i_18_])
			    throw new RuntimeException();
		    }
		}
		int i_19_ = (((is[is.length - 2] & 0xff) << 8)
			     + (is[is.length - 1] & 0xff));
		if (i_19_ != (aClass462_10323.anIntArray5093[i] & 0xffff))
		    throw new RuntimeException();
		if (1 != aByteArray10310[i]) {
		    if (aByteArray10310[i] != 0) {
			/* empty */
		    }
		    anInt10306 += 1378367907;
		    aByteArray10310[i] = (byte) 1;
		}
		if (!class534_sub18_sub18.aBool11886)
		    class534_sub18_sub18.method8892((byte) 1);
		class534_sub18_sub18_14_ = class534_sub18_sub18;
	    } catch (Exception exception) {
		aByteArray10310[i] = (byte) -1;
		class534_sub18_sub18.method8892((byte) 1);
		if (class534_sub18_sub18.aBool11886) {
		    if (null != aClass464_10295) {
			if (!aClass464_10295.method7547(734201788)) {
			    Class534_Sub18_Sub18_Sub1 class534_sub18_sub18_sub1
				= (aClass464_10295.method7559
				   (-426609471 * anInt10305, i, (byte) 2, true,
				    aClass462_10323.anIntArray5083[i],
				    aClass462_10323.anIntArray5093[i],
				    2141123374));
			    if (null != class534_sub18_sub18_sub1)
				aClass9_10311.method581
				    (class534_sub18_sub18_sub1, (long) i);
			}
		    } else if (!aClass450_10296.method7334(857240635)) {
			Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
			    = aClass450_10296.method7332((anInt10305
							  * -426609471),
							 i, (byte) 2, true,
							 -1374026126);
			aClass9_10311.method581(class534_sub18_sub18_sub2,
						(long) i);
		    }
		}
		return null;
	    }
	    return class534_sub18_sub18_14_;
	}
	try {
	    if (null == is || is.length <= 2) {
		if (aClass464_10295 != null) {
		    class534_sub18_sub18.method8892((byte) 1);
		    return null;
		}
		throw new RuntimeException();
	    }
	    aCRC32_10322.reset();
	    aCRC32_10322.update(is, 0, is.length - 2);
	    int i_20_ = (int) aCRC32_10322.getValue();
	    if (aClass462_10323.anIntArray5083[i] != i_20_)
		throw new RuntimeException();
	    if (aClass462_10323.aByteArrayArray5079 != null
		&& null != aClass462_10323.aByteArrayArray5079[i]) {
		byte[] is_21_ = aClass462_10323.aByteArrayArray5079[i];
		byte[] is_22_
		    = Class70.method1413(is, 0, is.length - 2, 2044039290);
		for (int i_23_ = 0; i_23_ < 64; i_23_++) {
		    if (is_21_[i_23_] != is_22_[i_23_])
			throw new RuntimeException();
		}
	    }
	    if (aClass464_10295 != null) {
		aClass450_10296.anInt4928 = 0;
		aClass450_10296.anInt4929 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    aClass450_10296.method7354(anInt10305 * -426609471, i, (byte) 24);
	    class534_sub18_sub18.method8892((byte) 1);
	    if (class534_sub18_sub18.aBool11886) {
		if (aClass464_10295 != null) {
		    if (!aClass464_10295.method7547(465535924)) {
			Class534_Sub18_Sub18_Sub1 class534_sub18_sub18_sub1
			    = (aClass464_10295.method7559
			       (anInt10305 * -426609471, i, (byte) 2, true,
				aClass462_10323.anIntArray5083[i],
				aClass462_10323.anIntArray5093[i],
				2124455883));
			if (null != class534_sub18_sub18_sub1)
			    aClass9_10311.method581(class534_sub18_sub18_sub1,
						    (long) i);
		    }
		} else if (!aClass450_10296.method7334(-781864403)) {
		    Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
			= aClass450_10296.method7332(anInt10305 * -426609471,
						     i, (byte) 2, true,
						     -264864213);
		    aClass9_10311.method581(class534_sub18_sub18_sub2,
					    (long) i);
		}
	    }
	    return null;
	}
	is[is.length - 2] = (byte) (aClass462_10323.anIntArray5093[i] >>> 8);
	is[is.length - 1] = (byte) aClass462_10323.anIntArray5093[i];
	if (aClass567_10297 != null) {
	    aClass463_10299.method7520(i, is, aClass567_10297, (byte) -45);
	    if (1 != aByteArray10310[i]) {
		anInt10306 += 1378367907;
		aByteArray10310[i] = (byte) 1;
	    }
	}
	if (!class534_sub18_sub18.aBool11886)
	    class534_sub18_sub18.method8892((byte) 1);
	return class534_sub18_sub18;
    }
    
    void method15887(int i) {
	if (null != aClass700_10316 && method7385(1296598305) != null) {
	    for (Class534 class534 = aClass700_10317.method14135((byte) -1);
		 class534 != null;
		 class534 = aClass700_10317.method14139(734584242)) {
		int i_24_ = (int) (class534.aLong7158 * 8258869577519436579L);
		if (i_24_ < 0
		    || i_24_ >= aClass462_10323.anInt5082 * -540639821
		    || 0 == aClass462_10323.anIntArray5074[i_24_])
		    class534.method8892((byte) 1);
		else {
		    if (0 == aByteArray10310[i_24_])
			method15886(i_24_, 1, (byte) -6);
		    if (-1 == aByteArray10310[i_24_])
			method15886(i_24_, 2, (byte) -103);
		    if (1 == aByteArray10310[i_24_])
			class534.method8892((byte) 1);
		}
	    }
	}
    }
    
    void method15888(int i) {
	if (aClass700_10316 != null) {
	    if (method7385(1217673820) == null)
		return;
	    if (aBool10314) {
		boolean bool = true;
		for (Class534 class534
			 = aClass700_10316.method14135((byte) -1);
		     class534 != null;
		     class534 = aClass700_10316.method14139(1595039990)) {
		    int i_25_
			= (int) (class534.aLong7158 * 8258869577519436579L);
		    if (0 == aByteArray10310[i_25_])
			method15886(i_25_, 1, (byte) -88);
		    if (aByteArray10310[i_25_] != 0)
			class534.method8892((byte) 1);
		    else
			bool = false;
		}
		while (1547024225 * anInt10315
		       < aClass462_10323.anIntArray5074.length) {
		    if (aClass462_10323.anIntArray5074[anInt10315 * 1547024225]
			== 0)
			anInt10315 += -1164759903;
		    else {
			if (aClass463_10299.anInt5096 * 720483641 >= 250) {
			    bool = false;
			    break;
			}
			if (0 == aByteArray10310[1547024225 * anInt10315])
			    method15886(1547024225 * anInt10315, 1,
					(byte) -25);
			if (0 == aByteArray10310[1547024225 * anInt10315]) {
			    Class534 class534 = new Class534();
			    class534.aLong7158
				= (long) anInt10315 * 323771927485105579L;
			    aClass700_10316.method14131(class534, (short) 789);
			    bool = false;
			}
			anInt10315 += -1164759903;
		    }
		}
		if (bool) {
		    aBool10314 = false;
		    anInt10315 = 0;
		}
	    } else if (aBool10312) {
		boolean bool = true;
		for (Class534 class534
			 = aClass700_10316.method14135((byte) -1);
		     class534 != null;
		     class534 = aClass700_10316.method14139(1752190324)) {
		    int i_26_
			= (int) (8258869577519436579L * class534.aLong7158);
		    if (aByteArray10310[i_26_] != 1)
			method15886(i_26_, 2, (byte) -103);
		    if (1 == aByteArray10310[i_26_])
			class534.method8892((byte) 1);
		    else
			bool = false;
		}
		while (anInt10315 * 1547024225
		       < aClass462_10323.anIntArray5074.length) {
		    if (0 == (aClass462_10323.anIntArray5074
			      [anInt10315 * 1547024225]))
			anInt10315 += -1164759903;
		    else {
			if (aClass450_10296.method7340((byte) 24)) {
			    bool = false;
			    break;
			}
			if (1 != aByteArray10310[anInt10315 * 1547024225])
			    method15886(1547024225 * anInt10315, 2,
					(byte) -44);
			if (1 != aByteArray10310[anInt10315 * 1547024225]) {
			    Class534 class534 = new Class534();
			    class534.aLong7158
				= (long) anInt10315 * 323771927485105579L;
			    aClass700_10316.method14131(class534, (short) 789);
			    bool = false;
			}
			anInt10315 += -1164759903;
		    }
		}
		if (bool) {
		    aBool10312 = false;
		    anInt10315 = 0;
		}
	    } else
		aClass700_10316 = null;
	}
	if (aBool10325 && (Class250.method4604((byte) -66)
			   >= aLong10319 * 7569302836751318645L)) {
	    for (Class534_Sub18_Sub18 class534_sub18_sub18
		     = ((Class534_Sub18_Sub18)
			aClass9_10311.method583(-1600108877));
		 null != class534_sub18_sub18;
		 class534_sub18_sub18
		     = ((Class534_Sub18_Sub18)
			aClass9_10311.method584((byte) -100))) {
		if (!class534_sub18_sub18.aBool11888) {
		    if (class534_sub18_sub18.aBool11887) {
			if (!class534_sub18_sub18.aBool11886)
			    throw new RuntimeException();
			class534_sub18_sub18.method8892((byte) 1);
		    } else
			class534_sub18_sub18.aBool11887 = true;
		}
	    }
	    aLong10319 = ((Class250.method4604((byte) -55) + 1000L)
			  * -7416744348770491939L);
	}
    }
    
    void method7381(int i) {
	if (null != aClass567_10297) {
	    for (Class534 class534 = aClass700_10317.method14135((byte) -1);
		 null != class534;
		 class534 = aClass700_10317.method14139(691392946)) {
		if (8258869577519436579L * class534.aLong7158 == (long) i)
		    return;
	    }
	    Class534 class534 = new Class534();
	    class534.aLong7158 = (long) i * 936217890172187787L;
	    aClass700_10317.method14131(class534, (short) 789);
	}
    }
    
    public void method15889() {
	if (null == aClass464_10295 && aClass567_10297 != null) {
	    aBool10312 = true;
	    aBool10313 = true;
	    if (null == aClass700_10316)
		aClass700_10316 = new Class700();
	}
    }
    
    Class462 method7385(int i) {
	if (null != aClass462_10323)
	    return aClass462_10323;
	if (aClass534_Sub18_Sub18_10301 == null) {
	    if (aClass450_10296.method7334(1197677757))
		return null;
	    aClass534_Sub18_Sub18_10301
		= aClass450_10296.method7332(255, anInt10305 * -426609471,
					     (byte) 0, true, -1607131530);
	}
	if (aClass534_Sub18_Sub18_10301.aBool11888)
	    return null;
	byte[] is = aClass534_Sub18_Sub18_10301.method18460((short) 9311);
	if (aClass534_Sub18_Sub18_10301 instanceof Class534_Sub18_Sub18_Sub3) {
	    try {
		if (is == null)
		    throw new RuntimeException();
		aClass462_10323 = new Class462(is, anInt10302 * -103623205,
					       aByteArray10303);
		if (aClass462_10323.anInt5077 * 909547911
		    != anInt10304 * 981999971)
		    throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		aClass462_10323 = null;
		if (aClass450_10296.method7334(339314327))
		    aClass534_Sub18_Sub18_10301 = null;
		else
		    aClass534_Sub18_Sub18_10301
			= aClass450_10296.method7332(255,
						     -426609471 * anInt10305,
						     (byte) 0, true,
						     -884974389);
		return null;
	    }
	} else {
	    try {
		if (is == null)
		    throw new RuntimeException();
		aClass462_10323 = new Class462(is, -103623205 * anInt10302,
					       aByteArray10303);
	    } catch (RuntimeException runtimeexception) {
		aClass450_10296.method7354(255, -426609471 * anInt10305,
					   (byte) -32);
		aClass462_10323 = null;
		if (aClass450_10296.method7334(-243467271))
		    aClass534_Sub18_Sub18_10301 = null;
		else
		    aClass534_Sub18_Sub18_10301
			= aClass450_10296.method7332(255,
						     anInt10305 * -426609471,
						     (byte) 0, true,
						     1111501827);
		return null;
	    }
	    if (null != aClass567_10300)
		aClass463_10299.method7520(anInt10305 * -426609471, is,
					   aClass567_10300, (byte) -4);
	}
	aClass534_Sub18_Sub18_10301 = null;
	if (aClass567_10297 != null) {
	    aByteArray10310 = new byte[aClass462_10323.anInt5082 * -540639821];
	    anInt10306 = 0;
	}
	return aClass462_10323;
    }
    
    public void method15890(int i) {
	if (null == aClass464_10295 && aClass567_10297 != null) {
	    aBool10312 = true;
	    aBool10313 = true;
	    if (null == aClass700_10316)
		aClass700_10316 = new Class700();
	}
    }
    
    void method15891(boolean bool) {
	aClass464_10295.method7550(bool, 894945745);
    }
    
    int method7375(int i, int i_27_) {
	Class534_Sub18_Sub18 class534_sub18_sub18
	    = (Class534_Sub18_Sub18) aClass9_10311.method579((long) i);
	if (class534_sub18_sub18 != null)
	    return class534_sub18_sub18.method18461(1930517263);
	return 0;
    }
    
    public boolean method15892(byte i) {
	return aBool10313;
    }
    
    public boolean method15893() {
	return aBool10313;
    }
    
    boolean method15894(int i) {
	return aClass464_10295 != null;
    }
    
    Class462 method7386() {
	if (null != aClass462_10323)
	    return aClass462_10323;
	if (aClass534_Sub18_Sub18_10301 == null) {
	    if (aClass450_10296.method7334(-128291688))
		return null;
	    aClass534_Sub18_Sub18_10301
		= aClass450_10296.method7332(255, anInt10305 * -426609471,
					     (byte) 0, true, -1308669630);
	}
	if (aClass534_Sub18_Sub18_10301.aBool11888)
	    return null;
	byte[] is = aClass534_Sub18_Sub18_10301.method18460((short) 26697);
	if (aClass534_Sub18_Sub18_10301 instanceof Class534_Sub18_Sub18_Sub3) {
	    try {
		if (is == null)
		    throw new RuntimeException();
		aClass462_10323 = new Class462(is, anInt10302 * -103623205,
					       aByteArray10303);
		if (aClass462_10323.anInt5077 * 909547911
		    != anInt10304 * 981999971)
		    throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		aClass462_10323 = null;
		if (aClass450_10296.method7334(-1262223733))
		    aClass534_Sub18_Sub18_10301 = null;
		else
		    aClass534_Sub18_Sub18_10301
			= aClass450_10296.method7332(255,
						     -426609471 * anInt10305,
						     (byte) 0, true, 40367156);
		return null;
	    }
	} else {
	    try {
		if (is == null)
		    throw new RuntimeException();
		aClass462_10323 = new Class462(is, -103623205 * anInt10302,
					       aByteArray10303);
	    } catch (RuntimeException runtimeexception) {
		aClass450_10296.method7354(255, -426609471 * anInt10305,
					   (byte) 69);
		aClass462_10323 = null;
		if (aClass450_10296.method7334(-637302181))
		    aClass534_Sub18_Sub18_10301 = null;
		else
		    aClass534_Sub18_Sub18_10301
			= aClass450_10296.method7332(255,
						     anInt10305 * -426609471,
						     (byte) 0, true,
						     905883503);
		return null;
	    }
	    if (null != aClass567_10300)
		aClass463_10299.method7520(anInt10305 * -426609471, is,
					   aClass567_10300, (byte) -84);
	}
	aClass534_Sub18_Sub18_10301 = null;
	if (aClass567_10297 != null) {
	    aByteArray10310 = new byte[aClass462_10323.anInt5082 * -540639821];
	    anInt10306 = 0;
	}
	return aClass462_10323;
    }
    
    Class462 method7376() {
	if (null != aClass462_10323)
	    return aClass462_10323;
	if (aClass534_Sub18_Sub18_10301 == null) {
	    if (aClass450_10296.method7334(1654767065))
		return null;
	    aClass534_Sub18_Sub18_10301
		= aClass450_10296.method7332(255, anInt10305 * -426609471,
					     (byte) 0, true, 567570564);
	}
	if (aClass534_Sub18_Sub18_10301.aBool11888)
	    return null;
	byte[] is = aClass534_Sub18_Sub18_10301.method18460((short) -11160);
	if (aClass534_Sub18_Sub18_10301 instanceof Class534_Sub18_Sub18_Sub3) {
	    try {
		if (is == null)
		    throw new RuntimeException();
		aClass462_10323 = new Class462(is, anInt10302 * -103623205,
					       aByteArray10303);
		if (aClass462_10323.anInt5077 * 909547911
		    != anInt10304 * 981999971)
		    throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		aClass462_10323 = null;
		if (aClass450_10296.method7334(-473936184))
		    aClass534_Sub18_Sub18_10301 = null;
		else
		    aClass534_Sub18_Sub18_10301
			= aClass450_10296.method7332(255,
						     -426609471 * anInt10305,
						     (byte) 0, true,
						     279857761);
		return null;
	    }
	} else {
	    try {
		if (is == null)
		    throw new RuntimeException();
		aClass462_10323 = new Class462(is, -103623205 * anInt10302,
					       aByteArray10303);
	    } catch (RuntimeException runtimeexception) {
		aClass450_10296.method7354(255, -426609471 * anInt10305,
					   (byte) -97);
		aClass462_10323 = null;
		if (aClass450_10296.method7334(61117552))
		    aClass534_Sub18_Sub18_10301 = null;
		else
		    aClass534_Sub18_Sub18_10301
			= aClass450_10296.method7332(255,
						     anInt10305 * -426609471,
						     (byte) 0, true,
						     -1276828465);
		return null;
	    }
	    if (null != aClass567_10300)
		aClass463_10299.method7520(anInt10305 * -426609471, is,
					   aClass567_10300, (byte) -79);
	}
	aClass534_Sub18_Sub18_10301 = null;
	if (aClass567_10297 != null) {
	    aByteArray10310 = new byte[aClass462_10323.anInt5082 * -540639821];
	    anInt10306 = 0;
	}
	return aClass462_10323;
    }
    
    void method7377(int i) {
	if (null != aClass567_10297) {
	    for (Class534 class534 = aClass700_10317.method14135((byte) -1);
		 null != class534;
		 class534 = aClass700_10317.method14139(770126512)) {
		if (8258869577519436579L * class534.aLong7158 == (long) i)
		    return;
	    }
	    Class534 class534 = new Class534();
	    class534.aLong7158 = (long) i * 936217890172187787L;
	    aClass700_10317.method14131(class534, (short) 789);
	}
    }
    
    void method7378(int i) {
	if (null != aClass567_10297) {
	    for (Class534 class534 = aClass700_10317.method14135((byte) -1);
		 null != class534;
		 class534 = aClass700_10317.method14139(810007103)) {
		if (8258869577519436579L * class534.aLong7158 == (long) i)
		    return;
	    }
	    Class534 class534 = new Class534();
	    class534.aLong7158 = (long) i * 936217890172187787L;
	    aClass700_10317.method14131(class534, (short) 789);
	}
    }
    
    void method7379(int i) {
	if (null != aClass567_10297) {
	    for (Class534 class534 = aClass700_10317.method14135((byte) -1);
		 null != class534;
		 class534 = aClass700_10317.method14139(925634062)) {
		if (8258869577519436579L * class534.aLong7158 == (long) i)
		    return;
	    }
	    Class534 class534 = new Class534();
	    class534.aLong7158 = (long) i * 936217890172187787L;
	    aClass700_10317.method14131(class534, (short) 789);
	}
    }
    
    void method7380(int i) {
	if (null != aClass567_10297) {
	    for (Class534 class534 = aClass700_10317.method14135((byte) -1);
		 null != class534;
		 class534 = aClass700_10317.method14139(2089991744)) {
		if (8258869577519436579L * class534.aLong7158 == (long) i)
		    return;
	    }
	    Class534 class534 = new Class534();
	    class534.aLong7158 = (long) i * 936217890172187787L;
	    aClass700_10317.method14131(class534, (short) 789);
	}
    }
    
    boolean method15895(int i, byte[] is, int i_28_, int i_29_) {
	if (i == anInt10302 * -103623205 && i_28_ == anInt10304 * 981999971) {
	    boolean bool = true;
	    for (int i_30_ = 0; i_30_ < aByteArray10303.length; i_30_++) {
		if (aByteArray10303[i_30_] != is[i_30_]) {
		    bool = false;
		    break;
		}
	    }
	    if (bool)
		return true;
	}
	return false;
    }
    
    int method7382(int i) {
	Class534_Sub18_Sub18 class534_sub18_sub18
	    = (Class534_Sub18_Sub18) aClass9_10311.method579((long) i);
	if (class534_sub18_sub18 != null)
	    return class534_sub18_sub18.method18461(-595092782);
	return 0;
    }
    
    int method7383(int i) {
	Class534_Sub18_Sub18 class534_sub18_sub18
	    = (Class534_Sub18_Sub18) aClass9_10311.method579((long) i);
	if (class534_sub18_sub18 != null)
	    return class534_sub18_sub18.method18461(-2083630389);
	return 0;
    }
    
    void method15896() {
	if (null != aClass700_10316 && method7385(1875380082) != null) {
	    for (Class534 class534 = aClass700_10317.method14135((byte) -1);
		 class534 != null;
		 class534 = aClass700_10317.method14139(618530438)) {
		int i = (int) (class534.aLong7158 * 8258869577519436579L);
		if (i < 0 || i >= aClass462_10323.anInt5082 * -540639821
		    || 0 == aClass462_10323.anIntArray5074[i])
		    class534.method8892((byte) 1);
		else {
		    if (0 == aByteArray10310[i])
			method15886(i, 1, (byte) -86);
		    if (-1 == aByteArray10310[i])
			method15886(i, 2, (byte) -91);
		    if (1 == aByteArray10310[i])
			class534.method8892((byte) 1);
		}
	    }
	}
    }
    
    void method15897(int i, byte[] is, int i_31_, int i_32_) {
	if (!method15884(i, is, i_31_, i_32_, (byte) 115)) {
	    anInt10302 = i * -145809837;
	    aByteArray10303 = is;
	    anInt10304 = i_31_ * -577083317;
	    aClass462_10323 = null;
	    aClass534_Sub18_Sub18_10301 = null;
	    if (!aClass450_10296.method7334(-844167193))
		aClass534_Sub18_Sub18_10301
		    = aClass450_10296.method7332(255, anInt10305 * -426609471,
						 (byte) 0, true, 1644333102);
	}
    }
    
    Class534_Sub18_Sub18 method15898(int i, int i_33_) {
	Class534_Sub18_Sub18 class534_sub18_sub18
	    = (Class534_Sub18_Sub18) aClass9_10311.method579((long) i);
	if (null != class534_sub18_sub18 && 0 == i_33_
	    && !class534_sub18_sub18.aBool11886
	    && class534_sub18_sub18.aBool11888) {
	    class534_sub18_sub18.method8892((byte) 1);
	    class534_sub18_sub18 = null;
	}
	if (null == class534_sub18_sub18) {
	    if (0 == i_33_) {
		if (aClass567_10297 != null && aByteArray10310[i] != -1)
		    class534_sub18_sub18
			= aClass463_10299.method7519(i, aClass567_10297,
						     31645619);
		else if (null != aClass464_10295) {
		    class534_sub18_sub18
			= aClass464_10295.method7559(anInt10305 * -426609471,
						     i, (byte) 2, true,
						     (aClass462_10323
						      .anIntArray5083[i]),
						     (aClass462_10323
						      .anIntArray5093[i]),
						     2138849253);
		    if (null == class534_sub18_sub18)
			return null;
		} else if (!aClass450_10296.method7334(1663247172))
		    class534_sub18_sub18
			= aClass450_10296.method7332(-426609471 * anInt10305,
						     i, (byte) 2, true,
						     -756129555);
		else
		    return null;
	    } else if (i_33_ == 1) {
		if (aClass567_10297 == null)
		    throw new RuntimeException();
		class534_sub18_sub18
		    = aClass463_10299.method7521(i, aClass567_10297,
						 -504155892);
	    } else if (i_33_ == 2) {
		if (aClass567_10297 == null)
		    throw new RuntimeException();
		if (aByteArray10310[i] != -1)
		    throw new RuntimeException();
		if (null != aClass464_10295)
		    return null;
		if (!aClass450_10296.method7340((byte) 24))
		    class534_sub18_sub18
			= aClass450_10296.method7332(anInt10305 * -426609471,
						     i, (byte) 2, false,
						     618500778);
		else
		    return null;
	    } else
		throw new RuntimeException();
	    aClass9_10311.method581(class534_sub18_sub18, (long) i);
	}
	if (class534_sub18_sub18.aBool11888)
	    return null;
	byte[] is = class534_sub18_sub18.method18460((short) 4716);
	if (class534_sub18_sub18 instanceof Class534_Sub18_Sub18_Sub3) {
	    Class534_Sub18_Sub18 class534_sub18_sub18_34_;
	    try {
		if (null == is || is.length <= 2)
		    throw new RuntimeException();
		aCRC32_10322.reset();
		aCRC32_10322.update(is, 0, is.length - 2);
		int i_35_ = (int) aCRC32_10322.getValue();
		if (aClass462_10323.anIntArray5083[i] != i_35_)
		    throw new RuntimeException();
		if (aClass462_10323.aByteArrayArray5079 != null
		    && aClass462_10323.aByteArrayArray5079[i] != null) {
		    byte[] is_36_ = aClass462_10323.aByteArrayArray5079[i];
		    byte[] is_37_
			= Class70.method1413(is, 0, is.length - 2, 1873533549);
		    for (int i_38_ = 0; i_38_ < 64; i_38_++) {
			if (is_37_[i_38_] != is_36_[i_38_])
			    throw new RuntimeException();
		    }
		}
		int i_39_ = (((is[is.length - 2] & 0xff) << 8)
			     + (is[is.length - 1] & 0xff));
		if (i_39_ != (aClass462_10323.anIntArray5093[i] & 0xffff))
		    throw new RuntimeException();
		if (1 != aByteArray10310[i]) {
		    if (aByteArray10310[i] != 0) {
			/* empty */
		    }
		    anInt10306 += 1378367907;
		    aByteArray10310[i] = (byte) 1;
		}
		if (!class534_sub18_sub18.aBool11886)
		    class534_sub18_sub18.method8892((byte) 1);
		class534_sub18_sub18_34_ = class534_sub18_sub18;
	    } catch (Exception exception) {
		aByteArray10310[i] = (byte) -1;
		class534_sub18_sub18.method8892((byte) 1);
		if (class534_sub18_sub18.aBool11886) {
		    if (null != aClass464_10295) {
			if (!aClass464_10295.method7547(-1719420677)) {
			    Class534_Sub18_Sub18_Sub1 class534_sub18_sub18_sub1
				= (aClass464_10295.method7559
				   (-426609471 * anInt10305, i, (byte) 2, true,
				    aClass462_10323.anIntArray5083[i],
				    aClass462_10323.anIntArray5093[i],
				    2116214711));
			    if (null != class534_sub18_sub18_sub1)
				aClass9_10311.method581
				    (class534_sub18_sub18_sub1, (long) i);
			}
		    } else if (!aClass450_10296.method7334(432180959)) {
			Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
			    = aClass450_10296.method7332((anInt10305
							  * -426609471),
							 i, (byte) 2, true,
							 1697981982);
			aClass9_10311.method581(class534_sub18_sub18_sub2,
						(long) i);
		    }
		}
		return null;
	    }
	    return class534_sub18_sub18_34_;
	}
	try {
	    if (null == is || is.length <= 2) {
		if (aClass464_10295 != null) {
		    class534_sub18_sub18.method8892((byte) 1);
		    return null;
		}
		throw new RuntimeException();
	    }
	    aCRC32_10322.reset();
	    aCRC32_10322.update(is, 0, is.length - 2);
	    int i_40_ = (int) aCRC32_10322.getValue();
	    if (aClass462_10323.anIntArray5083[i] != i_40_)
		throw new RuntimeException();
	    if (aClass462_10323.aByteArrayArray5079 != null
		&& null != aClass462_10323.aByteArrayArray5079[i]) {
		byte[] is_41_ = aClass462_10323.aByteArrayArray5079[i];
		byte[] is_42_
		    = Class70.method1413(is, 0, is.length - 2, 2028283358);
		for (int i_43_ = 0; i_43_ < 64; i_43_++) {
		    if (is_41_[i_43_] != is_42_[i_43_])
			throw new RuntimeException();
		}
	    }
	    if (aClass464_10295 != null) {
		aClass450_10296.anInt4928 = 0;
		aClass450_10296.anInt4929 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    aClass450_10296.method7354(anInt10305 * -426609471, i, (byte) 0);
	    class534_sub18_sub18.method8892((byte) 1);
	    if (class534_sub18_sub18.aBool11886) {
		if (aClass464_10295 != null) {
		    if (!aClass464_10295.method7547(911878933)) {
			Class534_Sub18_Sub18_Sub1 class534_sub18_sub18_sub1
			    = (aClass464_10295.method7559
			       (anInt10305 * -426609471, i, (byte) 2, true,
				aClass462_10323.anIntArray5083[i],
				aClass462_10323.anIntArray5093[i],
				2147294319));
			if (null != class534_sub18_sub18_sub1)
			    aClass9_10311.method581(class534_sub18_sub18_sub1,
						    (long) i);
		    }
		} else if (!aClass450_10296.method7334(-424861980)) {
		    Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
			= aClass450_10296.method7332(anInt10305 * -426609471,
						     i, (byte) 2, true,
						     -198501256);
		    aClass9_10311.method581(class534_sub18_sub18_sub2,
					    (long) i);
		}
	    }
	    return null;
	}
	is[is.length - 2] = (byte) (aClass462_10323.anIntArray5093[i] >>> 8);
	is[is.length - 1] = (byte) aClass462_10323.anIntArray5093[i];
	if (aClass567_10297 != null) {
	    aClass463_10299.method7520(i, is, aClass567_10297, (byte) -117);
	    if (1 != aByteArray10310[i]) {
		anInt10306 += 1378367907;
		aByteArray10310[i] = (byte) 1;
	    }
	}
	if (!class534_sub18_sub18.aBool11886)
	    class534_sub18_sub18.method8892((byte) 1);
	return class534_sub18_sub18;
    }
    
    void method15899(int i, byte[] is, int i_44_, int i_45_) {
	if (!method15884(i, is, i_44_, i_45_, (byte) 127)) {
	    anInt10302 = i * -145809837;
	    aByteArray10303 = is;
	    anInt10304 = i_44_ * -577083317;
	    aClass462_10323 = null;
	    aClass534_Sub18_Sub18_10301 = null;
	    if (!aClass450_10296.method7334(1977447323))
		aClass534_Sub18_Sub18_10301
		    = aClass450_10296.method7332(255, anInt10305 * -426609471,
						 (byte) 0, true, -2041302682);
	}
    }
    
    boolean method15900() {
	return aClass464_10295 != null;
    }
    
    public int method15901(byte i) {
	if (null == aClass462_10323)
	    return 0;
	return -1069101825 * aClass462_10323.anInt5078;
    }
    
    public int method15902() {
	if (method7385(-1938356548) == null) {
	    if (null == aClass534_Sub18_Sub18_10301)
		return 0;
	    return aClass534_Sub18_Sub18_10301.method18461(826381964);
	}
	return 100;
    }
    
    byte[] method7384(int i) {
	Class534_Sub18_Sub18 class534_sub18_sub18
	    = method15886(i, 0, (byte) -78);
	if (class534_sub18_sub18 == null)
	    return null;
	byte[] is = class534_sub18_sub18.method18460((short) 15045);
	class534_sub18_sub18.method8892((byte) 1);
	return is;
    }
    
    byte[] method7372(int i) {
	Class534_Sub18_Sub18 class534_sub18_sub18
	    = method15886(i, 0, (byte) -105);
	if (class534_sub18_sub18 == null)
	    return null;
	byte[] is = class534_sub18_sub18.method18460((short) 5339);
	class534_sub18_sub18.method8892((byte) 1);
	return is;
    }
    
    Class534_Sub18_Sub18 method15903(int i, int i_46_) {
	Class534_Sub18_Sub18 class534_sub18_sub18
	    = (Class534_Sub18_Sub18) aClass9_10311.method579((long) i);
	if (null != class534_sub18_sub18 && 0 == i_46_
	    && !class534_sub18_sub18.aBool11886
	    && class534_sub18_sub18.aBool11888) {
	    class534_sub18_sub18.method8892((byte) 1);
	    class534_sub18_sub18 = null;
	}
	if (null == class534_sub18_sub18) {
	    if (0 == i_46_) {
		if (aClass567_10297 != null && aByteArray10310[i] != -1)
		    class534_sub18_sub18
			= aClass463_10299.method7519(i, aClass567_10297,
						     31645619);
		else if (null != aClass464_10295) {
		    class534_sub18_sub18
			= aClass464_10295.method7559(anInt10305 * -426609471,
						     i, (byte) 2, true,
						     (aClass462_10323
						      .anIntArray5083[i]),
						     (aClass462_10323
						      .anIntArray5093[i]),
						     2132177806);
		    if (null == class534_sub18_sub18)
			return null;
		} else if (!aClass450_10296.method7334(746934398))
		    class534_sub18_sub18
			= aClass450_10296.method7332(-426609471 * anInt10305,
						     i, (byte) 2, true,
						     -101380288);
		else
		    return null;
	    } else if (i_46_ == 1) {
		if (aClass567_10297 == null)
		    throw new RuntimeException();
		class534_sub18_sub18
		    = aClass463_10299.method7521(i, aClass567_10297,
						 -106031894);
	    } else if (i_46_ == 2) {
		if (aClass567_10297 == null)
		    throw new RuntimeException();
		if (aByteArray10310[i] != -1)
		    throw new RuntimeException();
		if (null != aClass464_10295)
		    return null;
		if (!aClass450_10296.method7340((byte) 24))
		    class534_sub18_sub18
			= aClass450_10296.method7332(anInt10305 * -426609471,
						     i, (byte) 2, false,
						     -1028230167);
		else
		    return null;
	    } else
		throw new RuntimeException();
	    aClass9_10311.method581(class534_sub18_sub18, (long) i);
	}
	if (class534_sub18_sub18.aBool11888)
	    return null;
	byte[] is = class534_sub18_sub18.method18460((short) 22421);
	if (class534_sub18_sub18 instanceof Class534_Sub18_Sub18_Sub3) {
	    Class534_Sub18_Sub18 class534_sub18_sub18_47_;
	    try {
		if (null == is || is.length <= 2)
		    throw new RuntimeException();
		aCRC32_10322.reset();
		aCRC32_10322.update(is, 0, is.length - 2);
		int i_48_ = (int) aCRC32_10322.getValue();
		if (aClass462_10323.anIntArray5083[i] != i_48_)
		    throw new RuntimeException();
		if (aClass462_10323.aByteArrayArray5079 != null
		    && aClass462_10323.aByteArrayArray5079[i] != null) {
		    byte[] is_49_ = aClass462_10323.aByteArrayArray5079[i];
		    byte[] is_50_
			= Class70.method1413(is, 0, is.length - 2, 2014651817);
		    for (int i_51_ = 0; i_51_ < 64; i_51_++) {
			if (is_50_[i_51_] != is_49_[i_51_])
			    throw new RuntimeException();
		    }
		}
		int i_52_ = (((is[is.length - 2] & 0xff) << 8)
			     + (is[is.length - 1] & 0xff));
		if (i_52_ != (aClass462_10323.anIntArray5093[i] & 0xffff))
		    throw new RuntimeException();
		if (1 != aByteArray10310[i]) {
		    if (aByteArray10310[i] != 0) {
			/* empty */
		    }
		    anInt10306 += 1378367907;
		    aByteArray10310[i] = (byte) 1;
		}
		if (!class534_sub18_sub18.aBool11886)
		    class534_sub18_sub18.method8892((byte) 1);
		class534_sub18_sub18_47_ = class534_sub18_sub18;
	    } catch (Exception exception) {
		aByteArray10310[i] = (byte) -1;
		class534_sub18_sub18.method8892((byte) 1);
		if (class534_sub18_sub18.aBool11886) {
		    if (null != aClass464_10295) {
			if (!aClass464_10295.method7547(628175244)) {
			    Class534_Sub18_Sub18_Sub1 class534_sub18_sub18_sub1
				= (aClass464_10295.method7559
				   (-426609471 * anInt10305, i, (byte) 2, true,
				    aClass462_10323.anIntArray5083[i],
				    aClass462_10323.anIntArray5093[i],
				    2130299999));
			    if (null != class534_sub18_sub18_sub1)
				aClass9_10311.method581
				    (class534_sub18_sub18_sub1, (long) i);
			}
		    } else if (!aClass450_10296.method7334(794368036)) {
			Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
			    = aClass450_10296.method7332((anInt10305
							  * -426609471),
							 i, (byte) 2, true,
							 -1248280617);
			aClass9_10311.method581(class534_sub18_sub18_sub2,
						(long) i);
		    }
		}
		return null;
	    }
	    return class534_sub18_sub18_47_;
	}
	try {
	    if (null == is || is.length <= 2) {
		if (aClass464_10295 != null) {
		    class534_sub18_sub18.method8892((byte) 1);
		    return null;
		}
		throw new RuntimeException();
	    }
	    aCRC32_10322.reset();
	    aCRC32_10322.update(is, 0, is.length - 2);
	    int i_53_ = (int) aCRC32_10322.getValue();
	    if (aClass462_10323.anIntArray5083[i] != i_53_)
		throw new RuntimeException();
	    if (aClass462_10323.aByteArrayArray5079 != null
		&& null != aClass462_10323.aByteArrayArray5079[i]) {
		byte[] is_54_ = aClass462_10323.aByteArrayArray5079[i];
		byte[] is_55_
		    = Class70.method1413(is, 0, is.length - 2, 1833006159);
		for (int i_56_ = 0; i_56_ < 64; i_56_++) {
		    if (is_54_[i_56_] != is_55_[i_56_])
			throw new RuntimeException();
		}
	    }
	    if (aClass464_10295 != null) {
		aClass450_10296.anInt4928 = 0;
		aClass450_10296.anInt4929 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    aClass450_10296.method7354(anInt10305 * -426609471, i, (byte) -33);
	    class534_sub18_sub18.method8892((byte) 1);
	    if (class534_sub18_sub18.aBool11886) {
		if (aClass464_10295 != null) {
		    if (!aClass464_10295.method7547(-1353188555)) {
			Class534_Sub18_Sub18_Sub1 class534_sub18_sub18_sub1
			    = (aClass464_10295.method7559
			       (anInt10305 * -426609471, i, (byte) 2, true,
				aClass462_10323.anIntArray5083[i],
				aClass462_10323.anIntArray5093[i],
				2131006161));
			if (null != class534_sub18_sub18_sub1)
			    aClass9_10311.method581(class534_sub18_sub18_sub1,
						    (long) i);
		    }
		} else if (!aClass450_10296.method7334(-876356654)) {
		    Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
			= aClass450_10296.method7332(anInt10305 * -426609471,
						     i, (byte) 2, true,
						     812698290);
		    aClass9_10311.method581(class534_sub18_sub18_sub2,
					    (long) i);
		}
	    }
	    return null;
	}
	is[is.length - 2] = (byte) (aClass462_10323.anIntArray5093[i] >>> 8);
	is[is.length - 1] = (byte) aClass462_10323.anIntArray5093[i];
	if (aClass567_10297 != null) {
	    aClass463_10299.method7520(i, is, aClass567_10297, (byte) -9);
	    if (1 != aByteArray10310[i]) {
		anInt10306 += 1378367907;
		aByteArray10310[i] = (byte) 1;
	    }
	}
	if (!class534_sub18_sub18.aBool11886)
	    class534_sub18_sub18.method8892((byte) 1);
	return class534_sub18_sub18;
    }
    
    void method15904(boolean bool, int i) {
	aClass464_10295.method7550(bool, 894945745);
    }
    
    boolean method15905() {
	return aClass464_10295 != null;
    }
    
    void method15906() {
	if (null != aClass700_10316 && method7385(1463258716) != null) {
	    for (Class534 class534 = aClass700_10317.method14135((byte) -1);
		 class534 != null;
		 class534 = aClass700_10317.method14139(1203261199)) {
		int i = (int) (class534.aLong7158 * 8258869577519436579L);
		if (i < 0 || i >= aClass462_10323.anInt5082 * -540639821
		    || 0 == aClass462_10323.anIntArray5074[i])
		    class534.method8892((byte) 1);
		else {
		    if (0 == aByteArray10310[i])
			method15886(i, 1, (byte) -38);
		    if (-1 == aByteArray10310[i])
			method15886(i, 2, (byte) -106);
		    if (1 == aByteArray10310[i])
			class534.method8892((byte) 1);
		}
	    }
	}
    }
    
    public int method15907(byte i) {
	if (null == aClass462_10323)
	    return 0;
	if (!aBool10314)
	    return -1069101825 * aClass462_10323.anInt5078;
	Class534 class534 = aClass700_10316.method14135((byte) -1);
	if (null == class534)
	    return 0;
	return (int) (class534.aLong7158 * 8258869577519436579L);
    }
    
    void method15908() {
	if (aClass700_10316 != null) {
	    if (method7385(1595177543) == null)
		return;
	    if (aBool10314) {
		boolean bool = true;
		for (Class534 class534
			 = aClass700_10316.method14135((byte) -1);
		     class534 != null;
		     class534 = aClass700_10316.method14139(578760287)) {
		    int i = (int) (class534.aLong7158 * 8258869577519436579L);
		    if (0 == aByteArray10310[i])
			method15886(i, 1, (byte) -124);
		    if (aByteArray10310[i] != 0)
			class534.method8892((byte) 1);
		    else
			bool = false;
		}
		while (1547024225 * anInt10315
		       < aClass462_10323.anIntArray5074.length) {
		    if (aClass462_10323.anIntArray5074[anInt10315 * 1547024225]
			== 0)
			anInt10315 += -1164759903;
		    else {
			if (aClass463_10299.anInt5096 * 720483641 >= 250) {
			    bool = false;
			    break;
			}
			if (0 == aByteArray10310[1547024225 * anInt10315])
			    method15886(1547024225 * anInt10315, 1,
					(byte) -26);
			if (0 == aByteArray10310[1547024225 * anInt10315]) {
			    Class534 class534 = new Class534();
			    class534.aLong7158
				= (long) anInt10315 * 323771927485105579L;
			    aClass700_10316.method14131(class534, (short) 789);
			    bool = false;
			}
			anInt10315 += -1164759903;
		    }
		}
		if (bool) {
		    aBool10314 = false;
		    anInt10315 = 0;
		}
	    } else if (aBool10312) {
		boolean bool = true;
		for (Class534 class534
			 = aClass700_10316.method14135((byte) -1);
		     class534 != null;
		     class534 = aClass700_10316.method14139(1596683798)) {
		    int i = (int) (8258869577519436579L * class534.aLong7158);
		    if (aByteArray10310[i] != 1)
			method15886(i, 2, (byte) -10);
		    if (1 == aByteArray10310[i])
			class534.method8892((byte) 1);
		    else
			bool = false;
		}
		while (anInt10315 * 1547024225
		       < aClass462_10323.anIntArray5074.length) {
		    if (0 == (aClass462_10323.anIntArray5074
			      [anInt10315 * 1547024225]))
			anInt10315 += -1164759903;
		    else {
			if (aClass450_10296.method7340((byte) 24)) {
			    bool = false;
			    break;
			}
			if (1 != aByteArray10310[anInt10315 * 1547024225])
			    method15886(1547024225 * anInt10315, 2,
					(byte) -117);
			if (1 != aByteArray10310[anInt10315 * 1547024225]) {
			    Class534 class534 = new Class534();
			    class534.aLong7158
				= (long) anInt10315 * 323771927485105579L;
			    aClass700_10316.method14131(class534, (short) 789);
			    bool = false;
			}
			anInt10315 += -1164759903;
		    }
		}
		if (bool) {
		    aBool10312 = false;
		    anInt10315 = 0;
		}
	    } else
		aClass700_10316 = null;
	}
	if (aBool10325 && (Class250.method4604((byte) -3)
			   >= aLong10319 * 7569302836751318645L)) {
	    for (Class534_Sub18_Sub18 class534_sub18_sub18
		     = ((Class534_Sub18_Sub18)
			aClass9_10311.method583(-1928415979));
		 null != class534_sub18_sub18;
		 class534_sub18_sub18
		     = ((Class534_Sub18_Sub18)
			aClass9_10311.method584((byte) -111))) {
		if (!class534_sub18_sub18.aBool11888) {
		    if (class534_sub18_sub18.aBool11887) {
			if (!class534_sub18_sub18.aBool11886)
			    throw new RuntimeException();
			class534_sub18_sub18.method8892((byte) 1);
		    } else
			class534_sub18_sub18.aBool11887 = true;
		}
	    }
	    aLong10319 = ((Class250.method4604((byte) -47) + 1000L)
			  * -7416744348770491939L);
	}
    }
    
    void method15909() {
	if (aClass700_10316 != null) {
	    if (method7385(-250941026) == null)
		return;
	    if (aBool10314) {
		boolean bool = true;
		for (Class534 class534
			 = aClass700_10316.method14135((byte) -1);
		     class534 != null;
		     class534 = aClass700_10316.method14139(830002839)) {
		    int i = (int) (class534.aLong7158 * 8258869577519436579L);
		    if (0 == aByteArray10310[i])
			method15886(i, 1, (byte) -125);
		    if (aByteArray10310[i] != 0)
			class534.method8892((byte) 1);
		    else
			bool = false;
		}
		while (1547024225 * anInt10315
		       < aClass462_10323.anIntArray5074.length) {
		    if (aClass462_10323.anIntArray5074[anInt10315 * 1547024225]
			== 0)
			anInt10315 += -1164759903;
		    else {
			if (aClass463_10299.anInt5096 * 720483641 >= 250) {
			    bool = false;
			    break;
			}
			if (0 == aByteArray10310[1547024225 * anInt10315])
			    method15886(1547024225 * anInt10315, 1,
					(byte) -74);
			if (0 == aByteArray10310[1547024225 * anInt10315]) {
			    Class534 class534 = new Class534();
			    class534.aLong7158
				= (long) anInt10315 * 323771927485105579L;
			    aClass700_10316.method14131(class534, (short) 789);
			    bool = false;
			}
			anInt10315 += -1164759903;
		    }
		}
		if (bool) {
		    aBool10314 = false;
		    anInt10315 = 0;
		}
	    } else if (aBool10312) {
		boolean bool = true;
		for (Class534 class534
			 = aClass700_10316.method14135((byte) -1);
		     class534 != null;
		     class534 = aClass700_10316.method14139(2144297426)) {
		    int i = (int) (8258869577519436579L * class534.aLong7158);
		    if (aByteArray10310[i] != 1)
			method15886(i, 2, (byte) -39);
		    if (1 == aByteArray10310[i])
			class534.method8892((byte) 1);
		    else
			bool = false;
		}
		while (anInt10315 * 1547024225
		       < aClass462_10323.anIntArray5074.length) {
		    if (0 == (aClass462_10323.anIntArray5074
			      [anInt10315 * 1547024225]))
			anInt10315 += -1164759903;
		    else {
			if (aClass450_10296.method7340((byte) 24)) {
			    bool = false;
			    break;
			}
			if (1 != aByteArray10310[anInt10315 * 1547024225])
			    method15886(1547024225 * anInt10315, 2,
					(byte) -37);
			if (1 != aByteArray10310[anInt10315 * 1547024225]) {
			    Class534 class534 = new Class534();
			    class534.aLong7158
				= (long) anInt10315 * 323771927485105579L;
			    aClass700_10316.method14131(class534, (short) 789);
			    bool = false;
			}
			anInt10315 += -1164759903;
		    }
		}
		if (bool) {
		    aBool10312 = false;
		    anInt10315 = 0;
		}
	    } else
		aClass700_10316 = null;
	}
	if (aBool10325 && (Class250.method4604((byte) -32)
			   >= aLong10319 * 7569302836751318645L)) {
	    for (Class534_Sub18_Sub18 class534_sub18_sub18
		     = ((Class534_Sub18_Sub18)
			aClass9_10311.method583(-1940348536));
		 null != class534_sub18_sub18;
		 class534_sub18_sub18
		     = ((Class534_Sub18_Sub18)
			aClass9_10311.method584((byte) -17))) {
		if (!class534_sub18_sub18.aBool11888) {
		    if (class534_sub18_sub18.aBool11887) {
			if (!class534_sub18_sub18.aBool11886)
			    throw new RuntimeException();
			class534_sub18_sub18.method8892((byte) 1);
		    } else
			class534_sub18_sub18.aBool11887 = true;
		}
	    }
	    aLong10319 = ((Class250.method4604((byte) -112) + 1000L)
			  * -7416744348770491939L);
	}
    }
    
    public int method15910() {
	return anInt10306 * 176734731;
    }
    
    public int method15911() {
	if (null == aClass462_10323)
	    return 0;
	return -1069101825 * aClass462_10323.anInt5078;
    }
    
    public int method15912() {
	return anInt10306 * 176734731;
    }
    
    void method7374(int i, int i_57_) {
	if (null != aClass567_10297) {
	    for (Class534 class534 = aClass700_10317.method14135((byte) -1);
		 null != class534;
		 class534 = aClass700_10317.method14139(1042468381)) {
		if (8258869577519436579L * class534.aLong7158 == (long) i)
		    return;
	    }
	    Class534 class534 = new Class534();
	    class534.aLong7158 = (long) i * 936217890172187787L;
	    aClass700_10317.method14131(class534, (short) 789);
	}
    }
    
    public int method15913(int i) {
	return anInt10306 * 176734731;
    }
    
    void method15914(int i, byte[] is, int i_58_, int i_59_) {
	if (!method15884(i, is, i_58_, i_59_, (byte) 118)) {
	    anInt10302 = i * -145809837;
	    aByteArray10303 = is;
	    anInt10304 = i_58_ * -577083317;
	    aClass462_10323 = null;
	    aClass534_Sub18_Sub18_10301 = null;
	    if (!aClass450_10296.method7334(1588495682))
		aClass534_Sub18_Sub18_10301
		    = aClass450_10296.method7332(255, anInt10305 * -426609471,
						 (byte) 0, true, 1245054910);
	}
    }
    
    public void method15915() {
	if (null == aClass464_10295 && aClass567_10297 != null) {
	    aBool10312 = true;
	    aBool10313 = true;
	    if (null == aClass700_10316)
		aClass700_10316 = new Class700();
	}
    }
    
    Class534_Sub18_Sub18 method15916(int i, int i_60_) {
	Class534_Sub18_Sub18 class534_sub18_sub18
	    = (Class534_Sub18_Sub18) aClass9_10311.method579((long) i);
	if (null != class534_sub18_sub18 && 0 == i_60_
	    && !class534_sub18_sub18.aBool11886
	    && class534_sub18_sub18.aBool11888) {
	    class534_sub18_sub18.method8892((byte) 1);
	    class534_sub18_sub18 = null;
	}
	if (null == class534_sub18_sub18) {
	    if (0 == i_60_) {
		if (aClass567_10297 != null && aByteArray10310[i] != -1)
		    class534_sub18_sub18
			= aClass463_10299.method7519(i, aClass567_10297,
						     31645619);
		else if (null != aClass464_10295) {
		    class534_sub18_sub18
			= aClass464_10295.method7559(anInt10305 * -426609471,
						     i, (byte) 2, true,
						     (aClass462_10323
						      .anIntArray5083[i]),
						     (aClass462_10323
						      .anIntArray5093[i]),
						     2119765779);
		    if (null == class534_sub18_sub18)
			return null;
		} else if (!aClass450_10296.method7334(-1202331531))
		    class534_sub18_sub18
			= aClass450_10296.method7332(-426609471 * anInt10305,
						     i, (byte) 2, true,
						     -1761567348);
		else
		    return null;
	    } else if (i_60_ == 1) {
		if (aClass567_10297 == null)
		    throw new RuntimeException();
		class534_sub18_sub18
		    = aClass463_10299.method7521(i, aClass567_10297,
						 -1125698401);
	    } else if (i_60_ == 2) {
		if (aClass567_10297 == null)
		    throw new RuntimeException();
		if (aByteArray10310[i] != -1)
		    throw new RuntimeException();
		if (null != aClass464_10295)
		    return null;
		if (!aClass450_10296.method7340((byte) 24))
		    class534_sub18_sub18
			= aClass450_10296.method7332(anInt10305 * -426609471,
						     i, (byte) 2, false,
						     1166674764);
		else
		    return null;
	    } else
		throw new RuntimeException();
	    aClass9_10311.method581(class534_sub18_sub18, (long) i);
	}
	if (class534_sub18_sub18.aBool11888)
	    return null;
	byte[] is = class534_sub18_sub18.method18460((short) 8198);
	if (class534_sub18_sub18 instanceof Class534_Sub18_Sub18_Sub3) {
	    Class534_Sub18_Sub18 class534_sub18_sub18_61_;
	    try {
		if (null == is || is.length <= 2)
		    throw new RuntimeException();
		aCRC32_10322.reset();
		aCRC32_10322.update(is, 0, is.length - 2);
		int i_62_ = (int) aCRC32_10322.getValue();
		if (aClass462_10323.anIntArray5083[i] != i_62_)
		    throw new RuntimeException();
		if (aClass462_10323.aByteArrayArray5079 != null
		    && aClass462_10323.aByteArrayArray5079[i] != null) {
		    byte[] is_63_ = aClass462_10323.aByteArrayArray5079[i];
		    byte[] is_64_
			= Class70.method1413(is, 0, is.length - 2, 2035815453);
		    for (int i_65_ = 0; i_65_ < 64; i_65_++) {
			if (is_64_[i_65_] != is_63_[i_65_])
			    throw new RuntimeException();
		    }
		}
		int i_66_ = (((is[is.length - 2] & 0xff) << 8)
			     + (is[is.length - 1] & 0xff));
		if (i_66_ != (aClass462_10323.anIntArray5093[i] & 0xffff))
		    throw new RuntimeException();
		if (1 != aByteArray10310[i]) {
		    if (aByteArray10310[i] != 0) {
			/* empty */
		    }
		    anInt10306 += 1378367907;
		    aByteArray10310[i] = (byte) 1;
		}
		if (!class534_sub18_sub18.aBool11886)
		    class534_sub18_sub18.method8892((byte) 1);
		class534_sub18_sub18_61_ = class534_sub18_sub18;
	    } catch (Exception exception) {
		aByteArray10310[i] = (byte) -1;
		class534_sub18_sub18.method8892((byte) 1);
		if (class534_sub18_sub18.aBool11886) {
		    if (null != aClass464_10295) {
			if (!aClass464_10295.method7547(1049913405)) {
			    Class534_Sub18_Sub18_Sub1 class534_sub18_sub18_sub1
				= (aClass464_10295.method7559
				   (-426609471 * anInt10305, i, (byte) 2, true,
				    aClass462_10323.anIntArray5083[i],
				    aClass462_10323.anIntArray5093[i],
				    2146998174));
			    if (null != class534_sub18_sub18_sub1)
				aClass9_10311.method581
				    (class534_sub18_sub18_sub1, (long) i);
			}
		    } else if (!aClass450_10296.method7334(1697011299)) {
			Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
			    = aClass450_10296.method7332((anInt10305
							  * -426609471),
							 i, (byte) 2, true,
							 -823020752);
			aClass9_10311.method581(class534_sub18_sub18_sub2,
						(long) i);
		    }
		}
		return null;
	    }
	    return class534_sub18_sub18_61_;
	}
	try {
	    if (null == is || is.length <= 2) {
		if (aClass464_10295 != null) {
		    class534_sub18_sub18.method8892((byte) 1);
		    return null;
		}
		throw new RuntimeException();
	    }
	    aCRC32_10322.reset();
	    aCRC32_10322.update(is, 0, is.length - 2);
	    int i_67_ = (int) aCRC32_10322.getValue();
	    if (aClass462_10323.anIntArray5083[i] != i_67_)
		throw new RuntimeException();
	    if (aClass462_10323.aByteArrayArray5079 != null
		&& null != aClass462_10323.aByteArrayArray5079[i]) {
		byte[] is_68_ = aClass462_10323.aByteArrayArray5079[i];
		byte[] is_69_
		    = Class70.method1413(is, 0, is.length - 2, 2141122237);
		for (int i_70_ = 0; i_70_ < 64; i_70_++) {
		    if (is_68_[i_70_] != is_69_[i_70_])
			throw new RuntimeException();
		}
	    }
	    if (aClass464_10295 != null) {
		aClass450_10296.anInt4928 = 0;
		aClass450_10296.anInt4929 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    aClass450_10296.method7354(anInt10305 * -426609471, i, (byte) 52);
	    class534_sub18_sub18.method8892((byte) 1);
	    if (class534_sub18_sub18.aBool11886) {
		if (aClass464_10295 != null) {
		    if (!aClass464_10295.method7547(-1355858529)) {
			Class534_Sub18_Sub18_Sub1 class534_sub18_sub18_sub1
			    = (aClass464_10295.method7559
			       (anInt10305 * -426609471, i, (byte) 2, true,
				aClass462_10323.anIntArray5083[i],
				aClass462_10323.anIntArray5093[i],
				2121719792));
			if (null != class534_sub18_sub18_sub1)
			    aClass9_10311.method581(class534_sub18_sub18_sub1,
						    (long) i);
		    }
		} else if (!aClass450_10296.method7334(-1287621795)) {
		    Class534_Sub18_Sub18_Sub2 class534_sub18_sub18_sub2
			= aClass450_10296.method7332(anInt10305 * -426609471,
						     i, (byte) 2, true,
						     -617557831);
		    aClass9_10311.method581(class534_sub18_sub18_sub2,
					    (long) i);
		}
	    }
	    return null;
	}
	is[is.length - 2] = (byte) (aClass462_10323.anIntArray5093[i] >>> 8);
	is[is.length - 1] = (byte) aClass462_10323.anIntArray5093[i];
	if (aClass567_10297 != null) {
	    aClass463_10299.method7520(i, is, aClass567_10297, (byte) -64);
	    if (1 != aByteArray10310[i]) {
		anInt10306 += 1378367907;
		aByteArray10310[i] = (byte) 1;
	    }
	}
	if (!class534_sub18_sub18.aBool11886)
	    class534_sub18_sub18.method8892((byte) 1);
	return class534_sub18_sub18;
    }
    
    void method15917(boolean bool) {
	aClass464_10295.method7550(bool, 894945745);
    }
    
    boolean method15918(int i, byte[] is, int i_71_, int i_72_) {
	if (i == anInt10302 * -103623205 && i_71_ == anInt10304 * 981999971) {
	    boolean bool = true;
	    for (int i_73_ = 0; i_73_ < aByteArray10303.length; i_73_++) {
		if (aByteArray10303[i_73_] != is[i_73_]) {
		    bool = false;
		    break;
		}
	    }
	    if (bool)
		return true;
	}
	return false;
    }
    
    boolean method15919() {
	return aClass464_10295 != null;
    }
    
    boolean method15920() {
	return aClass464_10295 != null;
    }
    
    int method7371(int i) {
	Class534_Sub18_Sub18 class534_sub18_sub18
	    = (Class534_Sub18_Sub18) aClass9_10311.method579((long) i);
	if (class534_sub18_sub18 != null)
	    return class534_sub18_sub18.method18461(423593745);
	return 0;
    }
    
    public int method15921() {
	if (null == aClass462_10323)
	    return 0;
	if (!aBool10314)
	    return -1069101825 * aClass462_10323.anInt5078;
	Class534 class534 = aClass700_10316.method14135((byte) -1);
	if (null == class534)
	    return 0;
	return (int) (class534.aLong7158 * 8258869577519436579L);
    }
    
    static final void method15922(Class669 class669, int i) {
	int i_74_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_74_, 1821801925);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_74_ >> 16];
	Class303.method5576(class247, class243, class669, (short) 1029);
    }
    
    public static Class534_Sub42_Sub1 method15923(int i, int i_75_, int i_76_,
						  int i_77_, int i_78_) {
	synchronized (Class534_Sub42_Sub1.aClass534_Sub42_Sub1Array11855) {
	    Class534_Sub42_Sub1 class534_sub42_sub1;
	    if (0 == Class534_Sub42_Sub1.anInt11856 * 1045872731)
		class534_sub42_sub1 = new Class534_Sub42_Sub1();
	    else
		class534_sub42_sub1
		    = (Class534_Sub42_Sub1.aClass534_Sub42_Sub1Array11855
		       [((Class534_Sub42_Sub1.anInt11856 -= 1321758675)
			 * 1045872731)]);
	    class534_sub42_sub1.anInt11860 = -466592867 * i;
	    class534_sub42_sub1.anInt11850 = i_75_ * -1991833173;
	    class534_sub42_sub1.anInt11857 = i_76_ * -934260093;
	    class534_sub42_sub1.anInt11858 = i_77_ * -220200763;
	    class534_sub42_sub1.aLong11859
		= Class250.method4604((byte) -37) * 747553093241954833L;
	    Class534_Sub42_Sub1 class534_sub42_sub1_79_ = class534_sub42_sub1;
	    return class534_sub42_sub1_79_;
	}
    }
}
