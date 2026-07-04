/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class70
{
    static final int anInt730 = 1000;
    static final String aString731 = "passwordchoice.ws";
    static final int anInt732 = 2;
    static final int anInt733 = 7;
    static BigInteger aBigInteger734
	= (new BigInteger
	   ("80782894952180643741752986186714059433953886149239752893425047584684715842049"));
    static BigInteger aBigInteger735
	= (new BigInteger
	   ("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"));
    static final String aString736 = "m=accountappeal/login.ws";
    static final int anInt737 = 3;
    static final int anInt738 = 4;
    public static final int anInt739 = 5;
    static final int anInt740 = 6;
    static final String aString741 = "services";
    static final int anInt742 = 2;
    public static int anInt743;
    
    static boolean method1402(String string) {
	if (null == string)
	    return false;
	try {
	    new URL(string);
	} catch (MalformedURLException malformedurlexception) {
	    return false;
	}
	return true;
    }
    
    static boolean method1403(String string) {
	if (null == string)
	    return false;
	try {
	    new URL(string);
	} catch (MalformedURLException malformedurlexception) {
	    return false;
	}
	return true;
    }
    
    public static long method1404() {
	long l;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class217.method4116("services", false,
						       (byte) 0))
				  .append
				  ("m=accountappeal/login.ws").toString());
	    URLConnection urlconnection = url.openConnection();
	    urlconnection.setRequestProperty("connection", "close");
	    urlconnection.setDoInput(true);
	    urlconnection.setDoOutput(true);
	    urlconnection.setConnectTimeout(5000);
	    OutputStreamWriter outputstreamwriter
		= new OutputStreamWriter(urlconnection.getOutputStream());
	    outputstreamwriter.write("data1=req");
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(new byte[1000]);
	    for (;;) {
		int i = inputstream.read(class534_sub40.aByteArray10810,
					 class534_sub40.anInt10811 * 31645619,
					 1000 - (31645619
						 * class534_sub40.anInt10811));
		if (-1 == i)
		    break;
		class534_sub40.anInt10811 += -1387468933 * i;
		if (class534_sub40.anInt10811 * 31645619 >= 1000)
		    return 0L;
	    }
	    class534_sub40.anInt10811 = 0;
	    long l_0_ = class534_sub40.method16537(1359621443);
	    l = l_0_;
	} catch (Exception exception) {
	    return 0L;
	}
	return l;
    }
    
    Class70() throws Throwable {
	throw new Error();
    }
    
    public static final int method1405(long l, String string) {
	Random random = new Random();
	Class534_Sub40 class534_sub40 = new Class534_Sub40(128);
	Class534_Sub40 class534_sub40_1_ = new Class534_Sub40(128);
	int[] is = new int[4];
	is[0] = random.nextInt();
	is[1] = random.nextInt();
	is[2] = (int) (l >> 32);
	is[3] = (int) l;
	class534_sub40.method16506(10, 1745842286);
	for (int i = 0; i < 4; i++)
	    class534_sub40.method16510(random.nextInt(), -1228843512);
	class534_sub40.method16510(is[0], -1862630017);
	class534_sub40.method16510(is[1], -772208184);
	class534_sub40.method16505(l);
	class534_sub40.method16505(0L);
	for (int i = 0; i < 4; i++)
	    class534_sub40.method16510(random.nextInt(), -400895817);
	class534_sub40.method16556(aBigInteger734, aBigInteger735, 432340289);
	class534_sub40_1_.method16506(10, 1764842743);
	for (int i = 0; i < 3; i++)
	    class534_sub40_1_.method16510(random.nextInt(), -945882261);
	class534_sub40_1_.method16505(random.nextLong());
	class534_sub40_1_.method16564(random.nextLong());
	Class646.method10690(class534_sub40_1_, (byte) 6);
	class534_sub40_1_.method16505(random.nextLong());
	class534_sub40_1_.method16556(aBigInteger734, aBigInteger735,
				      -510176098);
	int i = Class668.method11029(string, (byte) 0);
	if (0 != i % 8)
	    i += 8 - i % 8;
	Class534_Sub40 class534_sub40_2_ = new Class534_Sub40(i);
	class534_sub40_2_.method16713(string, 309969531);
	class534_sub40_2_.anInt10811 = -1387468933 * i;
	class534_sub40_2_.method16552(is, 1263787473);
	Class534_Sub40 class534_sub40_3_
	    = new Class534_Sub40(31645619 * class534_sub40_1_.anInt10811
				 + (31645619 * class534_sub40.anInt10811 + 5)
				 + 31645619 * class534_sub40_2_.anInt10811);
	class534_sub40_3_.method16506(2, 1600106212);
	class534_sub40_3_.method16506(31645619 * class534_sub40.anInt10811,
				      685863063);
	class534_sub40_3_.method16519(class534_sub40.aByteArray10810, 0,
				      class534_sub40.anInt10811 * 31645619,
				      -1271753683);
	class534_sub40_3_.method16506(class534_sub40_1_.anInt10811 * 31645619,
				      1540274511);
	class534_sub40_3_.method16519(class534_sub40_1_.aByteArray10810, 0,
				      class534_sub40_1_.anInt10811 * 31645619,
				      -1067464684);
	class534_sub40_3_.method16507(31645619 * class534_sub40_2_.anInt10811,
				      1656477695);
	class534_sub40_3_.method16519(class534_sub40_2_.aByteArray10810, 0,
				      class534_sub40_2_.anInt10811 * 31645619,
				      846818276);
	String string_4_
	    = Class493.method8120(class534_sub40_3_.aByteArray10810,
				  (byte) -29);
	int i_5_;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class217.method4116("services", false,
						       (byte) 0))
				  .append
				  ("m=accountappeal/login.ws").toString());
	    URLConnection urlconnection = url.openConnection();
	    urlconnection.setDoInput(true);
	    urlconnection.setDoOutput(true);
	    urlconnection.setConnectTimeout(5000);
	    OutputStreamWriter outputstreamwriter
		= new OutputStreamWriter(urlconnection.getOutputStream());
	    outputstreamwriter.write
		(new StringBuilder().append("data2=").append
		     (Class253.method4635(string_4_, -1238444799)).append
		     ("&dest=").append
		     (Class253.method4635("passwordchoice.ws", 1342624126))
		     .toString());
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    class534_sub40_3_ = new Class534_Sub40(new byte[1000]);
	    for (;;) {
		int i_6_
		    = inputstream.read(class534_sub40_3_.aByteArray10810,
				       class534_sub40_3_.anInt10811 * 31645619,
				       1000 - (class534_sub40_3_.anInt10811
					       * 31645619));
		if (i_6_ == -1)
		    break;
		class534_sub40_3_.anInt10811 += -1387468933 * i_6_;
		if (31645619 * class534_sub40_3_.anInt10811 >= 1000)
		    return 5;
	    }
	    outputstreamwriter.close();
	    inputstream.close();
	    String string_7_ = new String(class534_sub40_3_.aByteArray10810);
	    if (string_7_.startsWith("OFFLINE"))
		return 4;
	    if (string_7_.startsWith("WRONG"))
		return 7;
	    if (string_7_.startsWith("RELOAD"))
		return 3;
	    if (string_7_
		    .startsWith("Not permitted for social network accounts."))
		return 6;
	    class534_sub40_3_.method16553(is, (byte) 83);
	    for (/**/;
		 (class534_sub40_3_.anInt10811 * 31645619 > 0
		  && 0 == (class534_sub40_3_.aByteArray10810
			   [31645619 * class534_sub40_3_.anInt10811 - 1]));
		 class534_sub40_3_.anInt10811 -= -1387468933) {
		/* empty */
	    }
	    string_7_ = new String(class534_sub40_3_.aByteArray10810, 0,
				   class534_sub40_3_.anInt10811 * 31645619);
	    if (Class665.method11007(string_7_, -376515119)) {
		Class468.method7622(string_7_, true, client.aBool11032,
				    1411490484);
		return 2;
	    }
	    i_5_ = 5;
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    return 5;
	}
	return i_5_;
    }
    
    static boolean method1406(String string) {
	if (null == string)
	    return false;
	try {
	    new URL(string);
	} catch (MalformedURLException malformedurlexception) {
	    return false;
	}
	return true;
    }
    
    public static long method1407() {
	long l;
	try {
	    URL url = new URL(new StringBuilder().append
				  (Class217.method4116("services", false,
						       (byte) 0))
				  .append
				  ("m=accountappeal/login.ws").toString());
	    URLConnection urlconnection = url.openConnection();
	    urlconnection.setRequestProperty("connection", "close");
	    urlconnection.setDoInput(true);
	    urlconnection.setDoOutput(true);
	    urlconnection.setConnectTimeout(5000);
	    OutputStreamWriter outputstreamwriter
		= new OutputStreamWriter(urlconnection.getOutputStream());
	    outputstreamwriter.write("data1=req");
	    outputstreamwriter.flush();
	    InputStream inputstream = urlconnection.getInputStream();
	    Class534_Sub40 class534_sub40 = new Class534_Sub40(new byte[1000]);
	    for (;;) {
		int i = inputstream.read(class534_sub40.aByteArray10810,
					 class534_sub40.anInt10811 * 31645619,
					 1000 - (31645619
						 * class534_sub40.anInt10811));
		if (-1 == i)
		    break;
		class534_sub40.anInt10811 += -1387468933 * i;
		if (class534_sub40.anInt10811 * 31645619 >= 1000)
		    return 0L;
	    }
	    class534_sub40.anInt10811 = 0;
	    long l_8_ = class534_sub40.method16537(1359621443);
	    l = l_8_;
	} catch (Exception exception) {
	    return 0L;
	}
	return l;
    }
    
    static void method1408(Class534_Sub18_Sub7 class534_sub18_sub7, int i) {
	if (!Class72.aBool758) {
	    class534_sub18_sub7.method8892((byte) 1);
	    Class72.anInt765 -= 914117357;
	    if (!class534_sub18_sub7.aBool11707) {
		long l
		    = class534_sub18_sub7.aLong11709 * -6387465159951953483L;
		Class534_Sub18_Sub11 class534_sub18_sub11;
		for (class534_sub18_sub11 = ((Class534_Sub18_Sub11)
					     Class72.aClass9_768.method579(l));
		     (null != class534_sub18_sub11
		      && !class534_sub18_sub11.aString11793
			      .equals(class534_sub18_sub7.aString11708));
		     class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    Class72.aClass9_768.method582(1141690348))) {
		    /* empty */
		}
		if (class534_sub18_sub11 != null
		    && class534_sub18_sub11.method18347(class534_sub18_sub7,
							-1226459794))
		    Class526.method8761(class534_sub18_sub11, -26193475);
	    } else {
		for (Class534_Sub18_Sub11 class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    Class72.aClass696_772.method14078(1221951837));
		     null != class534_sub18_sub11;
		     class534_sub18_sub11
			 = ((Class534_Sub18_Sub11)
			    Class72.aClass696_772.method14080((byte) 47))) {
		    if (class534_sub18_sub11.aString11793
			    .equals(class534_sub18_sub7.aString11708)) {
			boolean bool = false;
			for (Class534_Sub18_Sub7 class534_sub18_sub7_9_
				 = ((Class534_Sub18_Sub7)
				    class534_sub18_sub11.aClass696_11794
					.method14078(1221951837));
			     null != class534_sub18_sub7_9_;
			     class534_sub18_sub7_9_
				 = ((Class534_Sub18_Sub7)
				    class534_sub18_sub11.aClass696_11794
					.method14080((byte) 42))) {
			    if (class534_sub18_sub7_9_
				== class534_sub18_sub7) {
				if (class534_sub18_sub11.method18347
				    (class534_sub18_sub7, -1226459794))
				    Class526.method8761(class534_sub18_sub11,
							-26193475);
				bool = true;
				break;
			    }
			}
			if (bool)
			    break;
		    }
		}
	    }
	}
    }
    
    static void method1409(int i, int i_10_, int i_11_) {
	Class72.anInt777 = -1105907919 * i;
	Class72.anInt778 = i_10_ * -1266523535;
    }
    
    static final void method1410(Class669 class669, int i) {
	int i_12_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_12_, 1612406473);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_12_ >> 16];
	Class130.method2305(class247, class243, class669, (byte) -125);
    }
    
    static final void method1411(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2565
	    = Class99.method1859(string, class669, 1248312647);
	class247.aBool2561 = true;
    }
    
    public static void method1412(int i) {
	if (null != IcmpService_Sub1.anIcmpService_Sub1_10890) {
	    try {
		IcmpService_Sub1.anIcmpService_Sub1_10890.quit();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    IcmpService_Sub1.anIcmpService_Sub1_10890 = null;
	}
    }
    
    public static byte[] method1413(byte[] is, int i, int i_13_, int i_14_) {
	byte[] is_15_;
	if (i > 0) {
	    is_15_ = new byte[i_13_];
	    for (int i_16_ = 0; i_16_ < i_13_; i_16_++)
		is_15_[i_16_] = is[i + i_16_];
	} else
	    is_15_ = is;
	Class3 class3 = new Class3();
	class3.method515(253143041);
	class3.method527(is_15_, (long) (i_13_ * 8));
	byte[] is_17_ = new byte[64];
	class3.method516(is_17_, 0, 1849433465);
	return is_17_;
    }
}
