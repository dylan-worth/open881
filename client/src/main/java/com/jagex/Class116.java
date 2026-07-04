/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Class116
{
    static boolean aBool1401 = false;
    
    static void method2111(Class568[][][] class568s) {
	for (int i = 0; i < class568s.length; i++) {
	    Class568[][] class568s_0_ = class568s[i];
	    for (int i_1_ = 0; i_1_ < class568s_0_.length; i_1_++) {
		for (int i_2_ = 0; i_2_ < class568s_0_[i_1_].length; i_2_++) {
		    Class568 class568 = class568s_0_[i_1_][i_2_];
		    if (null != class568) {
			if (class568.aClass654_Sub1_Sub2_7607
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub2_7607)
				.method411(-2084816632);
			if (class568.aClass654_Sub1_Sub3_7600
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub3_7600)
				.method411(-2084816632);
			if (class568.aClass654_Sub1_Sub3_7601
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub3_7601)
				.method411(-2084816632);
			if (class568.aClass654_Sub1_Sub1_7598
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub1_7598)
				.method411(-2084816632);
			if (class568.aClass654_Sub1_Sub1_7597
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub1_7597)
				.method411(-2084816632);
			for (Class559 class559 = class568.aClass559_7604;
			     null != class559;
			     class559 = class559.aClass559_7497) {
			    Class654_Sub1_Sub5 class654_sub1_sub5
				= class559.aClass654_Sub1_Sub5_7500;
			    if (class654_sub1_sub5 instanceof Interface62)
				((Interface62) class654_sub1_sub5)
				    .method411(-2084816632);
			}
		    }
		}
	    }
	}
    }
    
    public static void method2112() {
	if (!aBool1401) {
	    Class216.method4113((client.aClass512_11100.method8424((byte) 110)
				 .aClass568ArrayArrayArray7433),
				938093975);
	    if ((client.aClass512_11100.method8424((byte) 33)
		 .aClass568ArrayArrayArray7460)
		!= null)
		Class216.method4113((client.aClass512_11100.method8424
				     ((byte) 86).aClass568ArrayArrayArray7460),
				    -54560382);
	    aBool1401 = true;
	}
    }
    
    Class116() throws Throwable {
	throw new Error();
    }
    
    public static void method2113() {
	if (!aBool1401) {
	    Class216.method4113((client.aClass512_11100.method8424((byte) 94)
				 .aClass568ArrayArrayArray7433),
				273279185);
	    if ((client.aClass512_11100.method8424((byte) 63)
		 .aClass568ArrayArrayArray7460)
		!= null)
		Class216.method4113((client.aClass512_11100.method8424
				     ((byte) 16).aClass568ArrayArrayArray7460),
				    464967886);
	    aBool1401 = true;
	}
    }
    
    public static void method2114() {
	if (!aBool1401) {
	    Class216.method4113((client.aClass512_11100.method8424((byte) 95)
				 .aClass568ArrayArrayArray7433),
				1947651914);
	    if ((client.aClass512_11100.method8424((byte) 123)
		 .aClass568ArrayArrayArray7460)
		!= null)
		Class216.method4113((client.aClass512_11100.method8424
				     ((byte) 13).aClass568ArrayArrayArray7460),
				    280362093);
	    aBool1401 = true;
	}
    }
    
    static void method2115(Class568[][][] class568s) {
	for (int i = 0; i < class568s.length; i++) {
	    Class568[][] class568s_3_ = class568s[i];
	    for (int i_4_ = 0; i_4_ < class568s_3_.length; i_4_++) {
		for (int i_5_ = 0; i_5_ < class568s_3_[i_4_].length; i_5_++) {
		    Class568 class568 = class568s_3_[i_4_][i_5_];
		    if (null != class568) {
			if (class568.aClass654_Sub1_Sub2_7607
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub2_7607)
				.method411(-2084816632);
			if (class568.aClass654_Sub1_Sub3_7600
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub3_7600)
				.method411(-2084816632);
			if (class568.aClass654_Sub1_Sub3_7601
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub3_7601)
				.method411(-2084816632);
			if (class568.aClass654_Sub1_Sub1_7598
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub1_7598)
				.method411(-2084816632);
			if (class568.aClass654_Sub1_Sub1_7597
			    instanceof Interface62)
			    ((Interface62) class568.aClass654_Sub1_Sub1_7597)
				.method411(-2084816632);
			for (Class559 class559 = class568.aClass559_7604;
			     null != class559;
			     class559 = class559.aClass559_7497) {
			    Class654_Sub1_Sub5 class654_sub1_sub5
				= class559.aClass654_Sub1_Sub5_7500;
			    if (class654_sub1_sub5 instanceof Interface62)
				((Interface62) class654_sub1_sub5)
				    .method411(-2084816632);
			}
		    }
		}
	    }
	}
    }
    
    public static long method2116(int i) {
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
		int i_6_
		    = inputstream.read(class534_sub40.aByteArray10810,
				       class534_sub40.anInt10811 * 31645619,
				       1000 - (31645619
					       * class534_sub40.anInt10811));
		if (-1 == i_6_)
		    break;
		class534_sub40.anInt10811 += -1387468933 * i_6_;
		if (class534_sub40.anInt10811 * 31645619 >= 1000)
		    return 0L;
	    }
	    class534_sub40.anInt10811 = 0;
	    long l_7_ = class534_sub40.method16537(1359621443);
	    l = l_7_;
	} catch (Exception exception) {
	    return 0L;
	}
	return l;
    }
    
    static final void method2117(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	int i_8_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class538.method8923(string, i_8_ == 1, -1923352169);
    }
}
