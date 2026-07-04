/* Class662 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class662
{
    static Class171 aClass171_8551;
    static Class199 aClass199_8552 = new Class199(128);
    static int anInt8553;
    
    static Class534_Sub18_Sub8 method10978(byte[] is) {
	return new Class534_Sub18_Sub8(new Class534_Sub40(is),
				       Class283.anInterface18_3068);
    }
    
    static Class534_Sub18_Sub8 method10979(int i) {
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = (Class534_Sub18_Sub8) aClass199_8552.method3838((long) i);
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	byte[] is = Class294.aClass472_3158.method7743(i, 0, -1452512250);
	if (null == is || is.length <= 1)
	    return null;
	try {
	    class534_sub18_sub8 = Class275.method5148(is, (byte) 6);
	} catch (Exception exception) {
	    throw new RuntimeException(new StringBuilder().append
					   (exception.getMessage()).append
					   (" ").append
					   (i).toString());
	}
	aClass199_8552.method3834(class534_sub18_sub8, (long) i);
	return class534_sub18_sub8;
    }
    
    static Class534_Sub18_Sub8 method10980(int i) {
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = (Class534_Sub18_Sub8) aClass199_8552.method3838((long) i);
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	byte[] is = Class294.aClass472_3158.method7743(i, 0, -1663669625);
	if (null == is || is.length <= 1)
	    return null;
	try {
	    class534_sub18_sub8 = Class275.method5148(is, (byte) -21);
	} catch (Exception exception) {
	    throw new RuntimeException(new StringBuilder().append
					   (exception.getMessage()).append
					   (" ").append
					   (i).toString());
	}
	aClass199_8552.method3834(class534_sub18_sub8, (long) i);
	return class534_sub18_sub8;
    }
    
    static Class534_Sub18_Sub8 method10981(Class583 class583, int i,
					   int i_0_) {
	int i_1_ = -1610379455 * class583.anInt7794 | i << 10;
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = ((Class534_Sub18_Sub8)
	       aClass199_8552.method3838((long) i_1_ << 16));
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	byte[] is = (Class294.aClass472_3158.method7738
		     (Class294.aClass472_3158.method7668(i_1_, -1244905775),
		      (byte) -38));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -127);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_1_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_1_ << 16);
	    return class534_sub18_sub8;
	}
	i_1_ = -1610379455 * class583.anInt7794 | 65536 + i_0_ << 10;
	class534_sub18_sub8 = ((Class534_Sub18_Sub8)
			       aClass199_8552.method3838((long) i_1_ << 16));
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	is = (Class294.aClass472_3158.method7738
	      (Class294.aClass472_3158.method7668(i_1_, -1140816728),
	       (byte) -86));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -38);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_1_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_1_ << 16);
	    return class534_sub18_sub8;
	}
	i_1_ = -1610379455 * class583.anInt7794 | 0x3fffc00;
	class534_sub18_sub8 = ((Class534_Sub18_Sub8)
			       aClass199_8552.method3838((long) i_1_ << 16));
	if (class534_sub18_sub8 != null)
	    return class534_sub18_sub8;
	is = (Class294.aClass472_3158.method7738
	      (Class294.aClass472_3158.method7668(i_1_, 1745318794),
	       (byte) -14));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -111);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_1_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_1_ << 16);
	    return class534_sub18_sub8;
	}
	return null;
    }
    
    static Class534_Sub18_Sub8 method10982(int i) {
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = (Class534_Sub18_Sub8) aClass199_8552.method3838((long) i);
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	byte[] is = Class294.aClass472_3158.method7743(i, 0, -1071547380);
	if (null == is || is.length <= 1)
	    return null;
	try {
	    class534_sub18_sub8 = Class275.method5148(is, (byte) -127);
	} catch (Exception exception) {
	    throw new RuntimeException(new StringBuilder().append
					   (exception.getMessage()).append
					   (" ").append
					   (i).toString());
	}
	aClass199_8552.method3834(class534_sub18_sub8, (long) i);
	return class534_sub18_sub8;
    }
    
    static Class534_Sub18_Sub8 method10983(Class583 class583, int i,
					   int i_2_) {
	int i_3_ = -1610379455 * class583.anInt7794 | i << 10;
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = ((Class534_Sub18_Sub8)
	       aClass199_8552.method3838((long) i_3_ << 16));
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	byte[] is = (Class294.aClass472_3158.method7738
		     (Class294.aClass472_3158.method7668(i_3_, 1790922628),
		      (byte) -116));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -84);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_3_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_3_ << 16);
	    return class534_sub18_sub8;
	}
	i_3_ = -1610379455 * class583.anInt7794 | 65536 + i_2_ << 10;
	class534_sub18_sub8 = ((Class534_Sub18_Sub8)
			       aClass199_8552.method3838((long) i_3_ << 16));
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	is = (Class294.aClass472_3158.method7738
	      (Class294.aClass472_3158.method7668(i_3_, -603183683),
	       (byte) -49));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -32);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_3_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_3_ << 16);
	    return class534_sub18_sub8;
	}
	i_3_ = -1610379455 * class583.anInt7794 | 0x3fffc00;
	class534_sub18_sub8 = ((Class534_Sub18_Sub8)
			       aClass199_8552.method3838((long) i_3_ << 16));
	if (class534_sub18_sub8 != null)
	    return class534_sub18_sub8;
	is = (Class294.aClass472_3158.method7738
	      (Class294.aClass472_3158.method7668(i_3_, 935506566),
	       (byte) -27));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -69);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_3_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_3_ << 16);
	    return class534_sub18_sub8;
	}
	return null;
    }
    
    Class662() throws Throwable {
	throw new Error();
    }
    
    static Class534_Sub18_Sub8 method10984(Class583 class583, int i,
					   int i_4_) {
	int i_5_ = -1610379455 * class583.anInt7794 | i << 10;
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = ((Class534_Sub18_Sub8)
	       aClass199_8552.method3838((long) i_5_ << 16));
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	byte[] is = (Class294.aClass472_3158.method7738
		     (Class294.aClass472_3158.method7668(i_5_, -320002902),
		      (byte) -83));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -121);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_5_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_5_ << 16);
	    return class534_sub18_sub8;
	}
	i_5_ = -1610379455 * class583.anInt7794 | 65536 + i_4_ << 10;
	class534_sub18_sub8 = ((Class534_Sub18_Sub8)
			       aClass199_8552.method3838((long) i_5_ << 16));
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	is = (Class294.aClass472_3158.method7738
	      (Class294.aClass472_3158.method7668(i_5_, 1074809246),
	       (byte) -44));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -118);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_5_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_5_ << 16);
	    return class534_sub18_sub8;
	}
	i_5_ = -1610379455 * class583.anInt7794 | 0x3fffc00;
	class534_sub18_sub8 = ((Class534_Sub18_Sub8)
			       aClass199_8552.method3838((long) i_5_ << 16));
	if (class534_sub18_sub8 != null)
	    return class534_sub18_sub8;
	is = (Class294.aClass472_3158.method7738
	      (Class294.aClass472_3158.method7668(i_5_, -499865806),
	       (byte) -105));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -58);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_5_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_5_ << 16);
	    return class534_sub18_sub8;
	}
	return null;
    }
    
    static Class534_Sub18_Sub8 method10985(Class583 class583, int i,
					   int i_6_) {
	int i_7_ = -1610379455 * class583.anInt7794 | i << 10;
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = ((Class534_Sub18_Sub8)
	       aClass199_8552.method3838((long) i_7_ << 16));
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	byte[] is = (Class294.aClass472_3158.method7738
		     (Class294.aClass472_3158.method7668(i_7_, 890447990),
		      (byte) -45));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -46);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_7_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_7_ << 16);
	    return class534_sub18_sub8;
	}
	i_7_ = -1610379455 * class583.anInt7794 | 65536 + i_6_ << 10;
	class534_sub18_sub8 = ((Class534_Sub18_Sub8)
			       aClass199_8552.method3838((long) i_7_ << 16));
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	is = (Class294.aClass472_3158.method7738
	      (Class294.aClass472_3158.method7668(i_7_, 1947765844),
	       (byte) -80));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -51);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_7_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_7_ << 16);
	    return class534_sub18_sub8;
	}
	i_7_ = -1610379455 * class583.anInt7794 | 0x3fffc00;
	class534_sub18_sub8 = ((Class534_Sub18_Sub8)
			       aClass199_8552.method3838((long) i_7_ << 16));
	if (class534_sub18_sub8 != null)
	    return class534_sub18_sub8;
	is = (Class294.aClass472_3158.method7738
	      (Class294.aClass472_3158.method7668(i_7_, -1768950384),
	       (byte) 0));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -20);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_7_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_7_ << 16);
	    return class534_sub18_sub8;
	}
	return null;
    }
    
    static Class534_Sub18_Sub8 method10986(Class583 class583, int i,
					   int i_8_) {
	int i_9_ = -1610379455 * class583.anInt7794 | i << 10;
	Class534_Sub18_Sub8 class534_sub18_sub8
	    = ((Class534_Sub18_Sub8)
	       aClass199_8552.method3838((long) i_9_ << 16));
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	byte[] is = (Class294.aClass472_3158.method7738
		     (Class294.aClass472_3158.method7668(i_9_, -713694443),
		      (byte) -42));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -66);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_9_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_9_ << 16);
	    return class534_sub18_sub8;
	}
	i_9_ = -1610379455 * class583.anInt7794 | 65536 + i_8_ << 10;
	class534_sub18_sub8 = ((Class534_Sub18_Sub8)
			       aClass199_8552.method3838((long) i_9_ << 16));
	if (null != class534_sub18_sub8)
	    return class534_sub18_sub8;
	is = (Class294.aClass472_3158.method7738
	      (Class294.aClass472_3158.method7668(i_9_, -20002727),
	       (byte) -89));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -67);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_9_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_9_ << 16);
	    return class534_sub18_sub8;
	}
	i_9_ = -1610379455 * class583.anInt7794 | 0x3fffc00;
	class534_sub18_sub8 = ((Class534_Sub18_Sub8)
			       aClass199_8552.method3838((long) i_9_ << 16));
	if (class534_sub18_sub8 != null)
	    return class534_sub18_sub8;
	is = (Class294.aClass472_3158.method7738
	      (Class294.aClass472_3158.method7668(i_9_, 400991158),
	       (byte) -79));
	if (null != is) {
	    if (is.length <= 1)
		return null;
	    try {
		class534_sub18_sub8 = Class275.method5148(is, (byte) -68);
	    } catch (Exception exception) {
		throw new RuntimeException(new StringBuilder().append
					       (exception.getMessage()).append
					       (" ").append
					       (i_9_).toString());
	    }
	    class534_sub18_sub8.aClass583_11750 = class583;
	    aClass199_8552.method3834(class534_sub18_sub8, (long) i_9_ << 16);
	    return class534_sub18_sub8;
	}
	return null;
    }
    
    static Class534_Sub18_Sub8 method10987(byte[] is) {
	return new Class534_Sub18_Sub8(new Class534_Sub40(is),
				       Class283.anInterface18_3068);
    }
    
    static final void method10988(Class669 class669, int i) {
	int i_10_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_10_, -540072060);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.method17392(class247).method16271((byte) 26);
    }
    
    static final void method10989(Class669 class669, byte i) {
	int i_11_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_11_, 20775883);
	if (null == class247.aString2551)
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	else
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= class247.aString2551;
    }
    
    public static boolean method10990(int i, int i_12_, int i_13_) {
	if (!Class72.aBool758)
	    return false;
	int i_14_ = i >> 16;
	int i_15_ = i & 0xffff;
	if (null == Class44_Sub11.aClass243Array11006[i_14_]
	    || null == (Class44_Sub11.aClass243Array11006[i_14_]
			.aClass247Array2412[i_15_]))
	    return false;
	Class247 class247 = (Class44_Sub11.aClass243Array11006[i_14_]
			     .aClass247Array2412[i_15_]);
	if (-1 != i_12_ || 0 != class247.anInt2438 * -1960530827) {
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			Class72.aClass700_771.method14135((byte) -1));
		 null != class534_sub18_sub7;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			Class72.aClass700_771.method14139(1545953031))) {
		if (i_12_ == class534_sub18_sub7.anInt11703 * 980750511
		    && (class534_sub18_sub7.anInt11704 * -1180225371
			== class247.anInt2454 * -1278450723)
		    && (class534_sub18_sub7.anInt11706 * -1986934021 == 58
			|| 1007 == class534_sub18_sub7.anInt11706 * -1986934021
			|| 25 == -1986934021 * class534_sub18_sub7.anInt11706
			|| 57 == class534_sub18_sub7.anInt11706 * -1986934021
			|| class534_sub18_sub7.anInt11706 * -1986934021 == 30))
		    return true;
	    }
	} else {
	    for (Class534_Sub18_Sub7 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			Class72.aClass700_771.method14135((byte) -1));
		 class534_sub18_sub7 != null;
		 class534_sub18_sub7
		     = ((Class534_Sub18_Sub7)
			Class72.aClass700_771.method14139(1717568952))) {
		if (58 == class534_sub18_sub7.anInt11706 * -1986934021
		    || class534_sub18_sub7.anInt11706 * -1986934021 == 1007
		    || 25 == class534_sub18_sub7.anInt11706 * -1986934021
		    || 57 == class534_sub18_sub7.anInt11706 * -1986934021
		    || 30 == -1986934021 * class534_sub18_sub7.anInt11706) {
		    for (Class247 class247_16_
			     = Class112.method2017((-1180225371
						    * (class534_sub18_sub7
						       .anInt11704)),
						   369253707);
			 class247_16_ != null;
			 class247_16_
			     = Class578.method9799((Class44_Sub11
						    .aClass243Array11006
						    [(-1278450723
						      * (class247_16_
							 .anInt2454)) >> 16]),
						   class247_16_,
						   -1495101509)) {
			if (-1278450723 * class247.anInt2454
			    == class247_16_.anInt2454 * -1278450723)
			    return true;
		    }
		}
	    }
	}
	return false;
    }
    
    static void method10991(Class247[] class247s, Class247 class247,
			    boolean bool, int i) {
	int i_17_ = (class247.anInt2480 * 1500908359 != 0
		     ? class247.anInt2480 * 1500908359
		     : class247.anInt2468 * -881188269);
	int i_18_ = (-166726847 * class247.anInt2481 != 0
		     ? -166726847 * class247.anInt2481
		     : -1279656873 * class247.anInt2469);
	Class75_Sub1.method17366(class247s, -1278450723 * class247.anInt2454,
				 i_17_, i_18_, bool, -1192787435);
	if (null != class247.aClass247Array2621)
	    Class75_Sub1.method17366(class247.aClass247Array2621,
				     -1278450723 * class247.anInt2454, i_17_,
				     i_18_, bool, -1219493571);
	Class534_Sub37 class534_sub37
	    = ((Class534_Sub37)
	       client.aClass9_11224.method579((long) (-1278450723
						      * class247.anInt2454)));
	if (class534_sub37 != null)
	    Class515.method8590(class534_sub37.anInt10803 * 1225863589, i_17_,
				i_18_, bool, -1728923431);
	if (client.aClass247_11226 == class247) {
	    int i_19_ = -1843550713 * Class108.anInt1321;
	    int[] is = Class108.anIntArray1322;
	    for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
		Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
		    = (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
		       [is[i_20_]]);
		if (class654_sub1_sub5_sub1_sub2 != null)
		    class654_sub1_sub5_sub1_sub2.method18548(i_17_, i_18_,
							     bool, 188805964);
	    }
	    for (int i_21_ = 0; i_21_ < -1125820437 * client.anInt11321;
		 i_21_++) {
		int i_22_ = client.anIntArray11088[i_21_];
		Class534_Sub6 class534_sub6
		    = ((Class534_Sub6)
		       client.aClass9_11331.method579((long) i_22_));
		if (null != class534_sub6)
		    ((Class654_Sub1_Sub5_Sub1) class534_sub6.anObject10417)
			.method18548(i_17_, i_18_, bool, 188805964);
	    }
	}
    }
    
    public static int method10992(int i, boolean bool, byte i_23_) {
	if (bool)
	    return 0;
	Class534_Sub5 class534_sub5 = Class269.method5023(i, bool, (byte) -39);
	if (null == class534_sub5)
	    return ((((Class534_Sub18_Sub2)
		      Class219.aClass44_Sub19_2306.method91(i, 143457162))
		     .anInt11371)
		    * 1857484701);
	int i_24_ = 0;
	for (int i_25_ = 0; i_25_ < class534_sub5.anIntArray10414.length;
	     i_25_++) {
	    if (-1 == class534_sub5.anIntArray10414[i_25_])
		i_24_++;
	}
	i_24_ += ((((Class534_Sub18_Sub2)
		    Class219.aClass44_Sub19_2306.method91(i, 1524046628))
		   .anInt11371) * 1857484701
		  - class534_sub5.anIntArray10414.length);
	return i_24_;
    }
    
    static final void method10993(Class669 class669, int i) {
	int i_26_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_26_, -523240738);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_26_ >> 16];
	Class206_Sub1.method15706(class247, class243, class669, (byte) -69);
    }
    
    public static Class388 method10994(int i, byte i_27_) {
	if (null != Class639.aClass367_8316)
	    return Class639.aClass367_8316.method6342((byte) 33)
		       .method6370(i, -2119532675);
	return null;
    }
}
