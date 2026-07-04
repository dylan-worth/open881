/* Class464 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;
import java.awt.Font;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class464
{
    int anInt5099;
    int anInt5100;
    long aLong5101;
    static final int anInt5102 = 10000;
    volatile int anInt5103 = 0;
    static final int anInt5104 = 2;
    ExecutorService anExecutorService5105 = Executors.newFixedThreadPool(2);
    static final int anInt5106 = 60000;
    String aString5107;
    static final int anInt5108 = 10000;
    static final int anInt5109 = 10;
    boolean aBool5110 = false;
    public static Canvas aCanvas5111;
    static Font aFont5112;
    public static Class472 aClass472_5113;
    
    public void method7545() {
	anExecutorService5105.shutdown();
    }
    
    Class534_Sub18_Sub18_Sub1 method7546(int i) {
	return method7559(255, 255, (byte) 0, true, 0, 0, 2142194113);
    }
    
    boolean method7547(int i) {
	return 728104507 * anInt5103 >= 10;
    }
    
    public Class464(String string, int i, int i_0_) {
	aString5107 = string;
	anInt5100 = i * -1195386527;
	anInt5099 = -1036106071 * i_0_;
    }
    
    void method7548(byte i) {
	anInt5103 -= -1915868429;
    }
    
    public void method7549(int i) {
	anExecutorService5105.shutdown();
    }
    
    void method7550(boolean bool, int i) {
	aBool5110 = bool;
    }
    
    void method7551(boolean bool) {
	aBool5110 = bool;
    }
    
    Class534_Sub18_Sub18_Sub1 method7552() {
	return method7559(255, 255, (byte) 0, true, 0, 0, 2135320262);
    }
    
    Class534_Sub18_Sub18_Sub1 method7553() {
	return method7559(255, 255, (byte) 0, true, 0, 0, 2139908921);
    }
    
    Class534_Sub18_Sub18_Sub1 method7554(int i, int i_1_, byte i_2_,
					 boolean bool, int i_3_, int i_4_) {
	if (i < 0 || i_1_ < 0)
	    throw new RuntimeException(new StringBuilder().append(i).append
					   (",").append
					   (i_1_).toString());
	if (method7547(-1737952977))
	    return null;
	boolean bool_5_ = i == 255 && i_1_ == 255;
	if (!aBool5110 && !bool_5_)
	    return null;
	if (10000L + aLong5101 * -3745950328826741227L
	    >= Class250.method4604((byte) -99))
	    return null;
	Object object = null;
	String string;
	if (bool_5_)
	    string = new StringBuilder().append("&cb=").append
			 (Class250.method4604((byte) -73)).toString();
	else
	    string = new StringBuilder().append("&c=").append(i_3_).append
			 ("&v=").append
			 (i_4_).toString();
	URL url;
	try {
	    url = new URL("http", aString5107, anInt5100 * -1570075999,
			  new StringBuilder().append("/ms?m=").append
			      (anInt5099 * -2066367079).append
			      ("&a=").append
			      (i).append
			      ("&g=").append
			      (i_1_).append
			      (string).toString());
	} catch (MalformedURLException malformedurlexception) {
	    return null;
	}
	Class534_Sub18_Sub18_Sub1 class534_sub18_sub18_sub1
	    = new Class534_Sub18_Sub18_Sub1(i_2_);
	class534_sub18_sub18_sub1.aBool11886 = bool;
	anInt5103 += -1915868429;
	Future future
	    = anExecutorService5105
		  .submit(new Class470(this, url, class534_sub18_sub18_sub1));
	class534_sub18_sub18_sub1.method18762(future, (byte) 4);
	return class534_sub18_sub18_sub1;
    }
    
    void method7555() {
	anInt5103 -= -1915868429;
    }
    
    Class534_Sub18_Sub18_Sub1 method7556() {
	return method7559(255, 255, (byte) 0, true, 0, 0, 2129211239);
    }
    
    public void method7557() {
	anExecutorService5105.shutdown();
    }
    
    void method7558(boolean bool) {
	aBool5110 = bool;
    }
    
    Class534_Sub18_Sub18_Sub1 method7559(int i, int i_6_, byte i_7_,
					 boolean bool, int i_8_, int i_9_,
					 int i_10_) {
	if (i < 0 || i_6_ < 0)
	    throw new RuntimeException(new StringBuilder().append(i).append
					   (",").append
					   (i_6_).toString());
	if (method7547(-1070444732))
	    return null;
	boolean bool_11_ = i == 255 && i_6_ == 255;
	if (!aBool5110 && !bool_11_)
	    return null;
	if (10000L + aLong5101 * -3745950328826741227L
	    >= Class250.method4604((byte) -20))
	    return null;
	Object object = null;
	String string;
	if (bool_11_)
	    string = new StringBuilder().append("&cb=").append
			 (Class250.method4604((byte) -10)).toString();
	else
	    string = new StringBuilder().append("&c=").append(i_8_).append
			 ("&v=").append
			 (i_9_).toString();
	URL url;
	try {
	    url = new URL("http", aString5107, anInt5100 * -1570075999,
			  new StringBuilder().append("/ms?m=").append
			      (anInt5099 * -2066367079).append
			      ("&a=").append
			      (i).append
			      ("&g=").append
			      (i_6_).append
			      (string).toString());
	} catch (MalformedURLException malformedurlexception) {
	    return null;
	}
	Class534_Sub18_Sub18_Sub1 class534_sub18_sub18_sub1
	    = new Class534_Sub18_Sub18_Sub1(i_7_);
	class534_sub18_sub18_sub1.aBool11886 = bool;
	anInt5103 += -1915868429;
	Future future
	    = anExecutorService5105
		  .submit(new Class470(this, url, class534_sub18_sub18_sub1));
	class534_sub18_sub18_sub1.method18762(future, (byte) 4);
	return class534_sub18_sub18_sub1;
    }
    
    static final void method7560(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_12_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_13_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	if (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.aClass631_12226
	    != null) {
	    for (int i_14_ = 0; i_14_ < Class330.anIntArray3490.length;
		 i_14_++) {
		if (Class330.anIntArray3490[i_14_] == i_12_) {
		    Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			.aClass631_12226.method10439
			(i_14_, i_13_, Class307.aClass44_Sub15_3349,
			 -1567435655);
		    return;
		}
	    }
	    for (int i_15_ = 0; i_15_ < Class330.anIntArray3489.length;
		 i_15_++) {
		if (Class330.anIntArray3489[i_15_] == i_12_) {
		    Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			.aClass631_12226.method10439
			(i_15_, i_13_, Class307.aClass44_Sub15_3349,
			 -1567435655);
		    break;
		}
	    }
	}
    }
    
    static final void method7561(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class175.method2921(class247, class243, class669, (byte) 54);
    }
    
    static final void method7562(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aBool11296 ? 1 : 0;
    }
    
    static final void method7563(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (null != Class114.aString1397
	    && Class114.aString1397.equalsIgnoreCase(string))
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 1;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
    }
    
    static final void method7564(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -686202593 * Class200_Sub23.aClass534_Sub28_10040.anInt10635;
    }
    
    static final void method7565(int i, int i_16_) {
	Class534_Sub40_Sub1 class534_sub40_sub1
	    = client.aClass100_11264.aClass534_Sub40_Sub1_1179;
	while (class534_sub40_sub1.method18287(-1013636781 * (client
							      .aClass100_11264
							      .anInt1197),
					       499142777)
	       >= 15) {
	    int i_17_ = class534_sub40_sub1.method18295(15, -761815447);
	    if (i_17_ == 32767)
		break;
	    boolean bool = false;
	    Class534_Sub6 class534_sub6
		= (Class534_Sub6) client.aClass9_11331.method579((long) i_17_);
	    if (class534_sub6 == null) {
		Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
		    = (new Class654_Sub1_Sub5_Sub1_Sub1
		       (client.aClass512_11100.method8424((byte) 76)));
		class654_sub1_sub5_sub1_sub1.anInt11922 = -2061161143 * i_17_;
		class534_sub6
		    = new Class534_Sub6(class654_sub1_sub5_sub1_sub1);
		client.aClass9_11331.method581(class534_sub6, (long) i_17_);
		client.aClass534_Sub6Array11085
		    [(client.anInt11148 += 1085173643) * 759971875 - 1]
		    = class534_sub6;
		bool = true;
	    }
	    Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
		= (Class654_Sub1_Sub5_Sub1_Sub1) class534_sub6.anObject10417;
	    client.anIntArray11088
		[(client.anInt11321 += 590354627) * -1125820437 - 1]
		= i_17_;
	    class654_sub1_sub5_sub1_sub1.anInt11967
		= client.anInt11091 * -526016129;
	    if (null != class654_sub1_sub5_sub1_sub1.aClass307_12204
		&& class654_sub1_sub5_sub1_sub1.aClass307_12204
		       .method5638(566172937))
		Class694.method14069(class654_sub1_sub5_sub1_sub1, -836779145);
	    int i_18_ = class534_sub40_sub1.method18295(1, -761815447);
	    if (i_18_ == 1)
		client.anIntArray11298
		    [(client.anInt11089 += 382245089) * 1422306081 - 1]
		    = i_17_;
	    class654_sub1_sub5_sub1_sub1.method18827
		((Class307) (Class578.aClass44_Sub3_7743.method91
			     (class534_sub40_sub1.method18295(15, -761815447),
			      312191946)),
		 (byte) -2);
	    int i_19_ = class534_sub40_sub1.method18295(2, -761815447);
	    int i_20_
		= (class534_sub40_sub1.method18295(3, -761815447) + 4 << 11
		   & 0x3fff);
	    int i_21_ = class534_sub40_sub1.method18295(1, -761815447);
	    int i_22_ = class534_sub40_sub1.method18295(i, -761815447);
	    if (i_22_ > (1 << i - 1) - 1)
		i_22_ -= 1 << i;
	    int i_23_ = class534_sub40_sub1.method18295(i, -761815447);
	    if (i_23_ > (1 << i - 1) - 1)
		i_23_ -= 1 << i;
	    class654_sub1_sub5_sub1_sub1.method18535
		((-1821838479
		  * class654_sub1_sub5_sub1_sub1.aClass307_12204.anInt3328),
		 407034505);
	    class654_sub1_sub5_sub1_sub1.anInt11971
		= ((-1373680215
		    * class654_sub1_sub5_sub1_sub1.aClass307_12204.anInt3312)
		   << 3) * 1883849079;
	    if (bool)
		class654_sub1_sub5_sub1_sub1.method18523(i_20_, true,
							 1630027464);
	    class654_sub1_sub5_sub1_sub1.method18832
		(i_19_,
		 i_23_ + (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			  .anIntArray11977[0]),
		 i_22_ + (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
			  .anIntArray11978[0]),
		 i_21_ == 1,
		 class654_sub1_sub5_sub1_sub1.method18545((byte) 1),
		 -1847053285);
	    if (class654_sub1_sub5_sub1_sub1.aClass307_12204
		    .method5638(1810953596))
		Class449.method7330(class654_sub1_sub5_sub1_sub1.aByte10854,
				    (class654_sub1_sub5_sub1_sub1
				     .anIntArray11977[0]),
				    (class654_sub1_sub5_sub1_sub1
				     .anIntArray11978[0]),
				    0, null, class654_sub1_sub5_sub1_sub1,
				    null, 781517515);
	    if (bool)
		class654_sub1_sub5_sub1_sub1.method18825(-142843878);
	}
	class534_sub40_sub1.method18296(1749555738);
    }
    
    static void method7566(Class536_Sub3 class536_sub3, int i) {
	class536_sub3.aClass654_Sub1_Sub5_Sub1_10358 = null;
	if (Class536_Sub3.anInt10357 * 1885450739 < 20) {
	    Class536_Sub3.aClass709_10362.method14287(class536_sub3,
						      1794620115);
	    Class536_Sub3.anInt10357 += 816205627;
	}
    }
    
    public static final void method7567(byte i) {
	for (Class534_Sub4 class534_sub4
		 = ((Class534_Sub4)
		    Class534_Sub4.aClass700_10408.method14135((byte) -1));
	     class534_sub4 != null;
	     class534_sub4 = (Class534_Sub4) Class534_Sub4.aClass700_10408
						 .method14139(1673072700)) {
	    if (!class534_sub4.aBool10407) {
		class534_sub4.aBool10406 = true;
		if (class534_sub4.anInt10397 * -1522052283 >= 0
		    && -1246362377 * class534_sub4.anInt10400 >= 0
		    && (class534_sub4.anInt10397 * -1522052283
			< client.aClass512_11100.method8417(664292586))
		    && (-1246362377 * class534_sub4.anInt10400
			< client.aClass512_11100.method8418(-1533611049)))
		    Class229.method4207(class534_sub4, (byte) 0);
	    } else
		class534_sub4.method8892((byte) 1);
	}
	for (Class534_Sub4 class534_sub4
		 = ((Class534_Sub4)
		    Class534_Sub4.aClass700_10409.method14135((byte) -1));
	     class534_sub4 != null;
	     class534_sub4 = (Class534_Sub4) Class534_Sub4.aClass700_10409
						 .method14139(903719768)) {
	    if (!class534_sub4.aBool10407)
		class534_sub4.aBool10406 = true;
	    else
		class534_sub4.method8892((byte) 1);
	}
    }
    
    static final void method7568(Class669 class669, int i) {
	int i_24_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub22_10745
		  .method14026(i_24_, -2024064741);
    }
}
