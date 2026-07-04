/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import com.jagex.twitchtv.TwitchWebcamDevice;
import com.jagex.twitchtv.TwitchWebcamDeviceCapability;

public class Class300 implements Runnable
{
    Interface33 anInterface33_3221;
    String aString3222;
    Interface33 anInterface33_3223 = new Class297();
    Class294 aClass294_3224;
    long aLong3225;
    int anInt3226;
    long aLong3227;
    volatile boolean aBool3228;
    String aString3229;
    int anInt3230;
    boolean aBool3231;
    
    synchronized boolean method5518(byte i) {
	return anInterface33_3223.method213(-4821368797637575689L * aLong3225);
    }
    
    int method5519(byte i) {
	return 599204877 * anInt3226;
    }
    
    synchronized void method5520(int i) {
	aBool3231 = true;
    }
    
    public String method5521() {
	return aString3229;
    }
    
    synchronized boolean method5522() {
	return anInterface33_3223.method213(-4821368797637575689L * aLong3225);
    }
    
    synchronized void method5523(long l, String string, String string_0_,
				 int i, Class294 class294) {
	aLong3227 = l * -4822812343782375811L;
	aString3222 = string;
	aString3229 = string_0_;
	anInt3230 = -1654524133 * i;
	aClass294_3224 = class294;
    }
    
    public int method5524(int i) {
	if (null == aClass294_3224)
	    return 0;
	int i_1_ = -1262216053 * aClass294_3224.anInt3148;
	if (aClass294_3224.aBool3157
	    && 261982995 * anInt3230 < aClass294_3224.anInt3155 * 1646981573)
	    return anInt3230 * 261982995 + 1;
	if (i_1_ < 0 || i_1_ >= Class334.aClass294Array3506.length - 1)
	    return 100;
	if (255476555 * aClass294_3224.anInt3149 == 261982995 * anInt3230)
	    return aClass294_3224.anInt3155 * 1646981573;
	return aClass294_3224.anInt3149 * 255476555;
    }
    
    public int method5525(int i) {
	return anInt3230 * 261982995;
    }
    
    public String method5526(byte i) {
	return aString3229;
    }
    
    int method5527() {
	return 599204877 * anInt3226;
    }
    
    synchronized void method5528(Interface33 interface33, int i) {
	anInterface33_3221 = anInterface33_3223;
	anInterface33_3223 = interface33;
	aLong3225 = Class250.method4604((byte) -103) * 3785016743543846343L;
    }
    
    public Class294 method5529(byte i) {
	return aClass294_3224;
    }
    
    void method5530(byte i) {
	aBool3228 = true;
    }
    
    public void run() {
	while (!aBool3228) {
	    long l = Class250.method4604((byte) -54);
	    synchronized (this) {
		try {
		    anInt3226 += -1252275515;
		    if (anInterface33_3223 instanceof Class297)
			anInterface33_3223.method216(aBool3231, (short) 28439);
		    else {
			long l_2_ = Class250.method4604((byte) -53);
			if (Class254.aClass185_2683 != null
			    && null != anInterface33_3221
			    && anInterface33_3221.method24(2033268113) != 0
			    && (aLong3225 * -4821368797637575689L
				>= l_2_ - (long) anInterface33_3221
						     .method24(1786155040))) {
			    int i
				= (int) ((l_2_
					  - aLong3225 * -4821368797637575689L)
					 * 255L
					 / (long) anInterface33_3221
						      .method24(1901544815));
			    int i_3_ = 255 - i;
			    i = i << 24 | 0xffffff;
			    i_3_ = i_3_ << 24 | 0xffffff;
			    Class292.method5305(-841564954);
			    Class254.aClass185_2683.method3340(1, 0);
			    Class163 class163
				= (Class254.aClass185_2683.method3314
				   (1771907305 * Class706_Sub4.anInt10994,
				    Class18.anInt205 * -1091172141, true,
				    (byte) 1));
			    Class175_Sub1 class175_sub1
				= Class254.aClass185_2683.method3263();
			    class175_sub1.method15075(0,
						      class163.method2651());
			    Class254.aClass185_2683.method3260(class175_sub1,
							       173713544);
			    anInterface33_3221.method216(true, (short) 24396);
			    Class254.aClass185_2683.method3261(class175_sub1,
							       -11578496);
			    class163.method2657(0, 0, 0, i_3_, 1);
			    Class254.aClass185_2683.method3260(class175_sub1,
							       -1447038556);
			    Class254.aClass185_2683.method3340(1, 0);
			    anInterface33_3223.method216(true, (short) 21110);
			    Class254.aClass185_2683.method3261(class175_sub1,
							       -11578496);
			    class163.method2657(0, 0, 0, i, 1);
			} else {
			    if (null != anInterface33_3221) {
				aBool3231 = true;
				anInterface33_3221.method218((byte) -4);
				anInterface33_3221 = null;
			    }
			    if (aBool3231) {
				Class292.method5305(-841564954);
				if (null != Class254.aClass185_2683)
				    Class254.aClass185_2683.method3340(1, 0);
			    }
			    anInterface33_3223.method216
				(aBool3231 || (Class254.aClass185_2683 != null
					       && Class254.aClass185_2683
						      .method3241()),
				 (short) 22178);
			}
			try {
			    if (Class254.aClass185_2683 != null
				&& !(anInterface33_3223 instanceof Class297))
				Class254.aClass185_2683.method3289(1644809274);
			} catch (Exception_Sub7 exception_sub7) {
			    Class262.method4824
				(new StringBuilder().append
				     (exception_sub7.getMessage()).append
				     (Class700.aclient8805
					  .method8157((byte) 32))
				     .toString(),
				 exception_sub7, (byte) -39);
			    Class527.method8778(0, true, -511274631);
			}
		    }
		    aBool3231 = false;
		    if (null != Class254.aClass185_2683
			&& !(anInterface33_3223 instanceof Class297)
			&& (-1262216053 * aClass294_3224.anInt3148
			    < Class294.aClass294_3154.anInt3148 * -1262216053))
			Class683.method13925(-856614598);
		} catch (Exception exception) {
		    continue;
		}
	    }
	    long l_4_ = Class250.method4604((byte) -28);
	    int i = (int) (20L - (l_4_ - l));
	    if (i > 0)
		Class251.method4622((long) i);
	}
    }
    
    public Class294 method5531() {
	return aClass294_3224;
    }
    
    public void method5532() {
	while (!aBool3228) {
	    long l = Class250.method4604((byte) -103);
	    synchronized (this) {
		try {
		    anInt3226 += -1252275515;
		    if (anInterface33_3223 instanceof Class297)
			anInterface33_3223.method216(aBool3231, (short) 28977);
		    else {
			long l_5_ = Class250.method4604((byte) -87);
			if (Class254.aClass185_2683 != null
			    && null != anInterface33_3221
			    && anInterface33_3221.method24(1984116197) != 0
			    && (aLong3225 * -4821368797637575689L
				>= l_5_ - (long) anInterface33_3221
						     .method24(1960407637))) {
			    int i
				= (int) ((l_5_
					  - aLong3225 * -4821368797637575689L)
					 * 255L
					 / (long) anInterface33_3221
						      .method24(1880356754));
			    int i_6_ = 255 - i;
			    i = i << 24 | 0xffffff;
			    i_6_ = i_6_ << 24 | 0xffffff;
			    Class292.method5305(-841564954);
			    Class254.aClass185_2683.method3340(1, 0);
			    Class163 class163
				= (Class254.aClass185_2683.method3314
				   (1771907305 * Class706_Sub4.anInt10994,
				    Class18.anInt205 * -1091172141, true,
				    (byte) 1));
			    Class175_Sub1 class175_sub1
				= Class254.aClass185_2683.method3263();
			    class175_sub1.method15075(0,
						      class163.method2651());
			    Class254.aClass185_2683.method3260(class175_sub1,
							       -1231934755);
			    anInterface33_3221.method216(true, (short) 28932);
			    Class254.aClass185_2683.method3261(class175_sub1,
							       -11578496);
			    class163.method2657(0, 0, 0, i_6_, 1);
			    Class254.aClass185_2683.method3260(class175_sub1,
							       -821533592);
			    Class254.aClass185_2683.method3340(1, 0);
			    anInterface33_3223.method216(true, (short) 31353);
			    Class254.aClass185_2683.method3261(class175_sub1,
							       -11578496);
			    class163.method2657(0, 0, 0, i, 1);
			} else {
			    if (null != anInterface33_3221) {
				aBool3231 = true;
				anInterface33_3221.method218((byte) -93);
				anInterface33_3221 = null;
			    }
			    if (aBool3231) {
				Class292.method5305(-841564954);
				if (null != Class254.aClass185_2683)
				    Class254.aClass185_2683.method3340(1, 0);
			    }
			    anInterface33_3223.method216
				(aBool3231 || (Class254.aClass185_2683 != null
					       && Class254.aClass185_2683
						      .method3241()),
				 (short) 31286);
			}
			try {
			    if (Class254.aClass185_2683 != null
				&& !(anInterface33_3223 instanceof Class297))
				Class254.aClass185_2683.method3289(1588446543);
			} catch (Exception_Sub7 exception_sub7) {
			    Class262.method4824
				(new StringBuilder().append
				     (exception_sub7.getMessage()).append
				     (Class700.aclient8805
					  .method8157((byte) 33))
				     .toString(),
				 exception_sub7, (byte) -48);
			    Class527.method8778(0, true, -1504778495);
			}
		    }
		    aBool3231 = false;
		    if (null != Class254.aClass185_2683
			&& !(anInterface33_3223 instanceof Class297)
			&& (-1262216053 * aClass294_3224.anInt3148
			    < Class294.aClass294_3154.anInt3148 * -1262216053))
			Class683.method13925(-1519477387);
		} catch (Exception exception) {
		    continue;
		}
	    }
	    long l_7_ = Class250.method4604((byte) -95);
	    int i = (int) (20L - (l_7_ - l));
	    if (i > 0)
		Class251.method4622((long) i);
	}
    }
    
    int method5533() {
	return 599204877 * anInt3226;
    }
    
    int method5534() {
	return 599204877 * anInt3226;
    }
    
    synchronized void method5535() {
	aBool3231 = true;
    }
    
    int method5536() {
	return 599204877 * anInt3226;
    }
    
    synchronized void method5537(long l, String string, String string_8_,
				 int i, Class294 class294) {
	aLong3227 = l * -4822812343782375811L;
	aString3222 = string;
	aString3229 = string_8_;
	anInt3230 = -1654524133 * i;
	aClass294_3224 = class294;
    }
    
    synchronized boolean method5538() {
	return anInterface33_3223.method213(-4821368797637575689L * aLong3225);
    }
    
    synchronized void method5539(long l, String string, String string_9_,
				 int i, Class294 class294, byte i_10_) {
	aLong3227 = l * -4822812343782375811L;
	aString3222 = string;
	aString3229 = string_9_;
	anInt3230 = -1654524133 * i;
	aClass294_3224 = class294;
    }
    
    synchronized boolean method5540() {
	return anInterface33_3223.method213(-4821368797637575689L * aLong3225);
    }
    
    void method5541() {
	aBool3228 = true;
    }
    
    public int method5542() {
	return anInt3230 * 261982995;
    }
    
    synchronized void method5543(long l, String string, String string_11_,
				 int i, Class294 class294) {
	aLong3227 = l * -4822812343782375811L;
	aString3222 = string;
	aString3229 = string_11_;
	anInt3230 = -1654524133 * i;
	aClass294_3224 = class294;
    }
    
    public String method5544(byte i) {
	return aString3222;
    }
    
    public int method5545() {
	if (null == aClass294_3224)
	    return 0;
	int i = -1262216053 * aClass294_3224.anInt3148;
	if (aClass294_3224.aBool3157
	    && 261982995 * anInt3230 < aClass294_3224.anInt3155 * 1646981573)
	    return anInt3230 * 261982995 + 1;
	if (i < 0 || i >= Class334.aClass294Array3506.length - 1)
	    return 100;
	if (255476555 * aClass294_3224.anInt3149 == 261982995 * anInt3230)
	    return aClass294_3224.anInt3155 * 1646981573;
	return aClass294_3224.anInt3149 * 255476555;
    }
    
    public void method5546() {
	while (!aBool3228) {
	    long l = Class250.method4604((byte) -34);
	    synchronized (this) {
		try {
		    anInt3226 += -1252275515;
		    if (anInterface33_3223 instanceof Class297)
			anInterface33_3223.method216(aBool3231, (short) 23920);
		    else {
			long l_12_ = Class250.method4604((byte) -7);
			if (Class254.aClass185_2683 != null
			    && null != anInterface33_3221
			    && anInterface33_3221.method24(1859363804) != 0
			    && (aLong3225 * -4821368797637575689L
				>= l_12_ - (long) anInterface33_3221
						      .method24(1985541342))) {
			    int i
				= (int) ((l_12_
					  - aLong3225 * -4821368797637575689L)
					 * 255L
					 / (long) anInterface33_3221
						      .method24(2132595567));
			    int i_13_ = 255 - i;
			    i = i << 24 | 0xffffff;
			    i_13_ = i_13_ << 24 | 0xffffff;
			    Class292.method5305(-841564954);
			    Class254.aClass185_2683.method3340(1, 0);
			    Class163 class163
				= (Class254.aClass185_2683.method3314
				   (1771907305 * Class706_Sub4.anInt10994,
				    Class18.anInt205 * -1091172141, true,
				    (byte) 1));
			    Class175_Sub1 class175_sub1
				= Class254.aClass185_2683.method3263();
			    class175_sub1.method15075(0,
						      class163.method2651());
			    Class254.aClass185_2683.method3260(class175_sub1,
							       -1653603617);
			    anInterface33_3221.method216(true, (short) 22440);
			    Class254.aClass185_2683.method3261(class175_sub1,
							       -11578496);
			    class163.method2657(0, 0, 0, i_13_, 1);
			    Class254.aClass185_2683.method3260(class175_sub1,
							       2044724945);
			    Class254.aClass185_2683.method3340(1, 0);
			    anInterface33_3223.method216(true, (short) 18127);
			    Class254.aClass185_2683.method3261(class175_sub1,
							       -11578496);
			    class163.method2657(0, 0, 0, i, 1);
			} else {
			    if (null != anInterface33_3221) {
				aBool3231 = true;
				anInterface33_3221.method218((byte) -64);
				anInterface33_3221 = null;
			    }
			    if (aBool3231) {
				Class292.method5305(-841564954);
				if (null != Class254.aClass185_2683)
				    Class254.aClass185_2683.method3340(1, 0);
			    }
			    anInterface33_3223.method216
				(aBool3231 || (Class254.aClass185_2683 != null
					       && Class254.aClass185_2683
						      .method3241()),
				 (short) 22451);
			}
			try {
			    if (Class254.aClass185_2683 != null
				&& !(anInterface33_3223 instanceof Class297))
				Class254.aClass185_2683.method3289(1495565095);
			} catch (Exception_Sub7 exception_sub7) {
			    Class262.method4824
				(new StringBuilder().append
				     (exception_sub7.getMessage()).append
				     (Class700.aclient8805
					  .method8157((byte) 32))
				     .toString(),
				 exception_sub7, (byte) -54);
			    Class527.method8778(0, true, 418453976);
			}
		    }
		    aBool3231 = false;
		    if (null != Class254.aClass185_2683
			&& !(anInterface33_3223 instanceof Class297)
			&& (-1262216053 * aClass294_3224.anInt3148
			    < Class294.aClass294_3154.anInt3148 * -1262216053))
			Class683.method13925(-1862078596);
		} catch (Exception exception) {
		    continue;
		}
	    }
	    long l_14_ = Class250.method4604((byte) -99);
	    int i = (int) (20L - (l_14_ - l));
	    if (i > 0)
		Class251.method4622((long) i);
	}
    }
    
    public Class294 method5547() {
	return aClass294_3224;
    }
    
    public String method5548() {
	return aString3222;
    }
    
    public String method5549() {
	return aString3222;
    }
    
    public long method5550(int i) {
	return -4271337981209449771L * aLong3227;
    }
    
    Class300() {
	anInterface33_3221 = null;
    }
    
    synchronized void method5551(long l, String string, String string_15_,
				 int i, Class294 class294) {
	aLong3227 = l * -4822812343782375811L;
	aString3222 = string;
	aString3229 = string_15_;
	anInt3230 = -1654524133 * i;
	aClass294_3224 = class294;
    }
    
    void method5552() {
	aBool3228 = true;
    }
    
    void method5553() {
	aBool3228 = true;
    }
    
    static void method5554(Class669 class669, int i) {
	class669.anIntArray8595[2088438307 * class669.anInt8600 - 1]
	    = (((Class273)
		Class223.aClass53_Sub2_2316.method91((class669.anIntArray8595
						      [(class669.anInt8600
							* 2088438307) - 1]),
						     -1892602477)).anInt3017
	       * 510960247);
    }
    
    static final void method5555(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method18603
		  (1862409252).method9921((byte) -49);
    }
    
    static Class594 method5556(int i, int i_16_) {
	Class594[] class594s = Class102.method1905((byte) 25);
	for (int i_17_ = 0; i_17_ < class594s.length; i_17_++) {
	    Class594 class594 = class594s[i_17_];
	    if (1296567549 * class594.anInt7827 == i)
		return class594;
	}
	return null;
    }
    
    static void method5557(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_18_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_19_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	TwitchWebcamDevice twitchwebcamdevice
	    = Class562.method9468(i_18_, -1382745355);
	TwitchWebcamDeviceCapability twitchwebcamdevicecapability = null;
	if (twitchwebcamdevice != null)
	    twitchwebcamdevicecapability
		= twitchwebcamdevice.method1793(i_19_);
	if (twitchwebcamdevicecapability == null) {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	} else {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1656448669 * twitchwebcamdevicecapability.anInt1150;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1356474957 * twitchwebcamdevicecapability.anInt1151;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= twitchwebcamdevicecapability.anInt1152 * -1260779495;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1646869335 * twitchwebcamdevicecapability.anInt1153;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -2026063923 * twitchwebcamdevicecapability.anInt1154;
	}
    }
}
