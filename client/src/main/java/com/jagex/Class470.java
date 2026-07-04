/* Class470 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

public class Class470 implements Callable
{
    URL anURL5151;
    Class534_Sub18_Sub18_Sub1 aClass534_Sub18_Sub18_Sub1_5152;
    Class464 this$0;
    public static Class44_Sub17 aClass44_Sub17_5153;
    
    public Object call() throws Exception {
	URLConnection urlconnection = anURL5151.openConnection();
	urlconnection.setConnectTimeout(10000);
	urlconnection.setReadTimeout(60000);
	boolean bool = true;
	try {
	    urlconnection.connect();
	} catch (IOException ioexception) {
	    this$0.aLong5101
		= Class250.method4604((byte) -52) * -5105697228281306819L;
	    bool = false;
	}
	return new Class474(this$0,
			    bool ? urlconnection.getInputStream() : null,
			    aClass534_Sub18_Sub18_Sub1_5152, anURL5151);
    }
    
    Class470(Class464 class464, URL url,
	     Class534_Sub18_Sub18_Sub1 class534_sub18_sub18_sub1) {
	this$0 = class464;
	anURL5151 = url;
	aClass534_Sub18_Sub18_Sub1_5152 = class534_sub18_sub18_sub1;
    }
    
    public Object method7642() throws Exception {
	URLConnection urlconnection = anURL5151.openConnection();
	urlconnection.setConnectTimeout(10000);
	urlconnection.setReadTimeout(60000);
	boolean bool = true;
	try {
	    urlconnection.connect();
	} catch (IOException ioexception) {
	    this$0.aLong5101
		= Class250.method4604((byte) -112) * -5105697228281306819L;
	    bool = false;
	}
	return new Class474(this$0,
			    bool ? urlconnection.getInputStream() : null,
			    aClass534_Sub18_Sub18_Sub1_5152, anURL5151);
    }
    
    public Object method7643() throws Exception {
	URLConnection urlconnection = anURL5151.openConnection();
	urlconnection.setConnectTimeout(10000);
	urlconnection.setReadTimeout(60000);
	boolean bool = true;
	try {
	    urlconnection.connect();
	} catch (IOException ioexception) {
	    this$0.aLong5101
		= Class250.method4604((byte) -76) * -5105697228281306819L;
	    bool = false;
	}
	return new Class474(this$0,
			    bool ? urlconnection.getInputStream() : null,
			    aClass534_Sub18_Sub18_Sub1_5152, anURL5151);
    }
    
    public static final boolean method7644(String string, String string_0_,
					   String string_1_, String string_2_,
					   int i) {
	if (null == string || string_1_ == null)
	    return false;
	if (string.startsWith("#") || string_1_.startsWith("#"))
	    return string.equals(string_1_);
	return string_0_.equals(string_2_);
    }
    
    static final void method7645(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2595
	    = Class99.method1859(string, class669, -1200776165);
	class247.aBool2561 = true;
    }
}
