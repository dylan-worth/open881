/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class RuntimeException_Sub1 extends RuntimeException
{
    public static int anInt12084;
    public static String aString12085;
    static Interface61 anInterface61_12086 = null;
    public static Applet anApplet12087;
    static long aLong12088;
    String aString12089;
    Throwable aThrowable12090;
    
    static String method18701(Throwable throwable) throws IOException {
	String string;
	if (throwable instanceof RuntimeException_Sub1) {
	    RuntimeException_Sub1 runtimeexception_sub1
		= (RuntimeException_Sub1) throwable;
	    string = new StringBuilder().append
			 (runtimeexception_sub1.aString12089).append
			 (" | ").toString();
	    throwable = runtimeexception_sub1.aThrowable12090;
	} else
	    string = "";
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	throwable.printStackTrace(printwriter);
	printwriter.close();
	String string_0_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_0_));
	String string_1_ = bufferedreader.readLine();
	for (;;) {
	    String string_2_ = bufferedreader.readLine();
	    if (null == string_2_)
		break;
	    int i = string_2_.indexOf('(');
	    int i_3_ = string_2_.indexOf(')', 1 + i);
	    String string_4_;
	    if (i != -1)
		string_4_ = string_2_.substring(0, i);
	    else
		string_4_ = string_2_;
	    string_4_ = string_4_.trim();
	    string_4_ = string_4_.substring(string_4_.lastIndexOf(' ') + 1);
	    string_4_ = string_4_.substring(string_4_.lastIndexOf('\t') + 1);
	    string = new StringBuilder().append(string).append(string_4_)
			 .toString();
	    if (i != -1 && i_3_ != -1) {
		int i_5_ = string_2_.indexOf(".java:", i);
		if (i_5_ >= 0)
		    string
			= new StringBuilder().append(string).append
			      (string_2_.substring(5 + i_5_, i_3_)).toString();
	    }
	    string = new StringBuilder().append(string).append(' ').toString();
	}
	string = new StringBuilder().append(string).append("| ").append
		     (string_1_).toString();
	return string;
    }
    
    public static void method18702(String string, Throwable throwable) {
	try {
	    String string_6_ = "";
	    if (throwable != null)
		string_6_ = Class469.method7640(throwable, -1966110560);
	    if (string != null) {
		if (throwable != null)
		    string_6_ = new StringBuilder().append(string_6_).append
				    (" | ").toString();
		string_6_ = new StringBuilder().append(string_6_).append
				(string).toString();
	    }
	    Class332.method5863(string_6_, (byte) 123);
	    string_6_ = Class253.method4635(string_6_, -2083377340);
	    URL url = null;
	    if (null != anApplet12087)
		url = anApplet12087.getCodeBase();
	    else if (null != anInterface61_12086)
		url = anInterface61_12086.method404(1642377025);
	    if (null != url) {
		String string_7_ = "Unknown";
		String string_8_ = "1.1";
		try {
		    string_7_ = System.getProperty("java.vendor");
		    string_8_ = System.getProperty("java.version");
		} catch (Exception exception) {
		    /* empty */
		}
		URL url_9_
		    = new URL(url,
			      new StringBuilder().append
				  ("clienterror.ws?c=").append
				  (1141119879 * anInt12084).append
				  ("&cs=").append
				  (Class97.anInt1160 * 855690843).append
				  ("&u=").append
				  (aString12085 != null
				   ? Class253.method4635(aString12085,
							 531899120)
				   : new StringBuilder().append("").append
					 (aLong12088 * 2640931341331960365L)
					 .toString())
				  .append
				  ("&v1=").append
				  (Class253.method4635(string_7_, -421461421))
				  .append
				  ("&v2=").append
				  (Class253.method4635(string_8_, 1792983569))
				  .append
				  ("&e=").append
				  (string_6_).toString());
		DataInputStream datainputstream
		    = new DataInputStream(url_9_.openStream());
		datainputstream.read();
		datainputstream.close();
	    }
	} catch (Exception exception) {
	    exception.printStackTrace();
	}
    }
    
    public static RuntimeException_Sub1 method18703(Throwable throwable,
						    String string) {
	RuntimeException_Sub1 runtimeexception_sub1;
	if (throwable instanceof RuntimeException_Sub1) {
	    runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
	    StringBuilder stringbuilder = new StringBuilder();
	    RuntimeException_Sub1 runtimeexception_sub1_10_
		= runtimeexception_sub1;
	    runtimeexception_sub1_10_.aString12089
		= stringbuilder.append
		      (runtimeexception_sub1_10_.aString12089).append
		      (' ').append
		      (string).toString();
	} else
	    runtimeexception_sub1
		= new RuntimeException_Sub1(throwable, string);
	return runtimeexception_sub1;
    }
    
    public static void method18704(String string, Throwable throwable) {
	try {
	    String string_11_ = "";
	    if (throwable != null)
		string_11_ = Class469.method7640(throwable, -1817758826);
	    if (string != null) {
		if (throwable != null)
		    string_11_ = new StringBuilder().append(string_11_).append
				     (" | ").toString();
		string_11_ = new StringBuilder().append(string_11_).append
				 (string).toString();
	    }
	    Class332.method5863(string_11_, (byte) 126);
	    string_11_ = Class253.method4635(string_11_, -1888557081);
	    URL url = null;
	    if (null != anApplet12087)
		url = anApplet12087.getCodeBase();
	    else if (null != anInterface61_12086)
		url = anInterface61_12086.method404(1420760220);
	    if (null != url) {
		String string_12_ = "Unknown";
		String string_13_ = "1.1";
		try {
		    string_12_ = System.getProperty("java.vendor");
		    string_13_ = System.getProperty("java.version");
		} catch (Exception exception) {
		    /* empty */
		}
		URL url_14_
		    = new URL(url,
			      new StringBuilder().append
				  ("clienterror.ws?c=").append
				  (1141119879 * anInt12084).append
				  ("&cs=").append
				  (Class97.anInt1160 * 855690843).append
				  ("&u=").append
				  (aString12085 != null
				   ? Class253.method4635(aString12085,
							 -2024779218)
				   : new StringBuilder().append("").append
					 (aLong12088 * 2640931341331960365L)
					 .toString())
				  .append
				  ("&v1=").append
				  (Class253.method4635(string_12_, 1175494244))
				  .append
				  ("&v2=").append
				  (Class253.method4635(string_13_, 1936063943))
				  .append
				  ("&e=").append
				  (string_11_).toString());
		DataInputStream datainputstream
		    = new DataInputStream(url_14_.openStream());
		datainputstream.read();
		datainputstream.close();
	    }
	} catch (Exception exception) {
	    exception.printStackTrace();
	}
    }
    
    public static RuntimeException_Sub1 method18705(Throwable throwable,
						    String string) {
	RuntimeException_Sub1 runtimeexception_sub1;
	if (throwable instanceof RuntimeException_Sub1) {
	    runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
	    StringBuilder stringbuilder = new StringBuilder();
	    RuntimeException_Sub1 runtimeexception_sub1_15_
		= runtimeexception_sub1;
	    runtimeexception_sub1_15_.aString12089
		= stringbuilder.append
		      (runtimeexception_sub1_15_.aString12089).append
		      (' ').append
		      (string).toString();
	} else
	    runtimeexception_sub1
		= new RuntimeException_Sub1(throwable, string);
	return runtimeexception_sub1;
    }
    
    static final void method18706(String string) {
	System.out.println(new StringBuilder().append("Error: ").append
			       (Class468.method7628(string, "%0a", "\n",
						    (byte) 85))
			       .toString());
    }
    
    static final void method18707(String string) {
	System.out.println(new StringBuilder().append("Error: ").append
			       (Class468.method7628(string, "%0a", "\n",
						    (byte) 123))
			       .toString());
    }
    
    public static RuntimeException_Sub1 method18708(Throwable throwable,
						    String string) {
	RuntimeException_Sub1 runtimeexception_sub1;
	if (throwable instanceof RuntimeException_Sub1) {
	    runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
	    StringBuilder stringbuilder = new StringBuilder();
	    RuntimeException_Sub1 runtimeexception_sub1_16_
		= runtimeexception_sub1;
	    runtimeexception_sub1_16_.aString12089
		= stringbuilder.append
		      (runtimeexception_sub1_16_.aString12089).append
		      (' ').append
		      (string).toString();
	} else
	    runtimeexception_sub1
		= new RuntimeException_Sub1(throwable, string);
	return runtimeexception_sub1;
    }
    
    public static void method18709(String string, Throwable throwable) {
	try {
	    String string_17_ = "";
	    if (throwable != null)
		string_17_ = Class469.method7640(throwable, -1970518107);
	    if (string != null) {
		if (throwable != null)
		    string_17_ = new StringBuilder().append(string_17_).append
				     (" | ").toString();
		string_17_ = new StringBuilder().append(string_17_).append
				 (string).toString();
	    }
	    Class332.method5863(string_17_, (byte) 2);
	    string_17_ = Class253.method4635(string_17_, 93254171);
	    URL url = null;
	    if (null != anApplet12087)
		url = anApplet12087.getCodeBase();
	    else if (null != anInterface61_12086)
		url = anInterface61_12086.method404(1434978979);
	    if (null != url) {
		String string_18_ = "Unknown";
		String string_19_ = "1.1";
		try {
		    string_18_ = System.getProperty("java.vendor");
		    string_19_ = System.getProperty("java.version");
		} catch (Exception exception) {
		    /* empty */
		}
		URL url_20_
		    = new URL(url,
			      new StringBuilder().append
				  ("clienterror.ws?c=").append
				  (1141119879 * anInt12084).append
				  ("&cs=").append
				  (Class97.anInt1160 * 855690843).append
				  ("&u=").append
				  (aString12085 != null
				   ? Class253.method4635(aString12085,
							 2074918293)
				   : new StringBuilder().append("").append
					 (aLong12088 * 2640931341331960365L)
					 .toString())
				  .append
				  ("&v1=").append
				  (Class253.method4635(string_18_, 1751780106))
				  .append
				  ("&v2=").append
				  (Class253.method4635(string_19_, 1200849014))
				  .append
				  ("&e=").append
				  (string_17_).toString());
		DataInputStream datainputstream
		    = new DataInputStream(url_20_.openStream());
		datainputstream.read();
		datainputstream.close();
	    }
	} catch (Exception exception) {
	    exception.printStackTrace();
	}
    }
    
    RuntimeException_Sub1(Throwable throwable, String string) {
	aString12089 = string;
	aThrowable12090 = throwable;
	initCause(throwable);
    }
    
    static String method18710(Throwable throwable) throws IOException {
	String string;
	if (throwable instanceof RuntimeException_Sub1) {
	    RuntimeException_Sub1 runtimeexception_sub1
		= (RuntimeException_Sub1) throwable;
	    string = new StringBuilder().append
			 (runtimeexception_sub1.aString12089).append
			 (" | ").toString();
	    throwable = runtimeexception_sub1.aThrowable12090;
	} else
	    string = "";
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	throwable.printStackTrace(printwriter);
	printwriter.close();
	String string_21_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_21_));
	String string_22_ = bufferedreader.readLine();
	for (;;) {
	    String string_23_ = bufferedreader.readLine();
	    if (null == string_23_)
		break;
	    int i = string_23_.indexOf('(');
	    int i_24_ = string_23_.indexOf(')', 1 + i);
	    String string_25_;
	    if (i != -1)
		string_25_ = string_23_.substring(0, i);
	    else
		string_25_ = string_23_;
	    string_25_ = string_25_.trim();
	    string_25_ = string_25_.substring(string_25_.lastIndexOf(' ') + 1);
	    string_25_
		= string_25_.substring(string_25_.lastIndexOf('\t') + 1);
	    string = new StringBuilder().append(string).append(string_25_)
			 .toString();
	    if (i != -1 && i_24_ != -1) {
		int i_26_ = string_23_.indexOf(".java:", i);
		if (i_26_ >= 0)
		    string = new StringBuilder().append(string).append
				 (string_23_.substring(5 + i_26_, i_24_))
				 .toString();
	    }
	    string = new StringBuilder().append(string).append(' ').toString();
	}
	string = new StringBuilder().append(string).append("| ").append
		     (string_22_).toString();
	return string;
    }
    
    public static RuntimeException_Sub1 method18711(Throwable throwable,
						    String string) {
	RuntimeException_Sub1 runtimeexception_sub1;
	if (throwable instanceof RuntimeException_Sub1) {
	    runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
	    StringBuilder stringbuilder = new StringBuilder();
	    RuntimeException_Sub1 runtimeexception_sub1_27_
		= runtimeexception_sub1;
	    runtimeexception_sub1_27_.aString12089
		= stringbuilder.append
		      (runtimeexception_sub1_27_.aString12089).append
		      (' ').append
		      (string).toString();
	} else
	    runtimeexception_sub1
		= new RuntimeException_Sub1(throwable, string);
	return runtimeexception_sub1;
    }
    
    static String method18712(Throwable throwable) throws IOException {
	String string;
	if (throwable instanceof RuntimeException_Sub1) {
	    RuntimeException_Sub1 runtimeexception_sub1
		= (RuntimeException_Sub1) throwable;
	    string = new StringBuilder().append
			 (runtimeexception_sub1.aString12089).append
			 (" | ").toString();
	    throwable = runtimeexception_sub1.aThrowable12090;
	} else
	    string = "";
	StringWriter stringwriter = new StringWriter();
	PrintWriter printwriter = new PrintWriter(stringwriter);
	throwable.printStackTrace(printwriter);
	printwriter.close();
	String string_28_ = stringwriter.toString();
	BufferedReader bufferedreader
	    = new BufferedReader(new StringReader(string_28_));
	String string_29_ = bufferedreader.readLine();
	for (;;) {
	    String string_30_ = bufferedreader.readLine();
	    if (null == string_30_)
		break;
	    int i = string_30_.indexOf('(');
	    int i_31_ = string_30_.indexOf(')', 1 + i);
	    String string_32_;
	    if (i != -1)
		string_32_ = string_30_.substring(0, i);
	    else
		string_32_ = string_30_;
	    string_32_ = string_32_.trim();
	    string_32_ = string_32_.substring(string_32_.lastIndexOf(' ') + 1);
	    string_32_
		= string_32_.substring(string_32_.lastIndexOf('\t') + 1);
	    string = new StringBuilder().append(string).append(string_32_)
			 .toString();
	    if (i != -1 && i_31_ != -1) {
		int i_33_ = string_30_.indexOf(".java:", i);
		if (i_33_ >= 0)
		    string = new StringBuilder().append(string).append
				 (string_30_.substring(5 + i_33_, i_31_))
				 .toString();
	    }
	    string = new StringBuilder().append(string).append(' ').toString();
	}
	string = new StringBuilder().append(string).append("| ").append
		     (string_29_).toString();
	return string;
    }
    
    static final void method18713(String string) {
	System.out.println(new StringBuilder().append("Error: ").append
			       (Class468.method7628(string, "%0a", "\n",
						    (byte) 61))
			       .toString());
    }
    
    static final String method18714(String string, String string_34_,
				    String string_35_) {
	for (int i = string.indexOf(string_34_); -1 != i;
	     i = string.indexOf(string_34_, i + string_35_.length()))
	    string
		= new StringBuilder().append(string.substring(0, i)).append
		      (string_35_).append
		      (string.substring(i + string_34_.length())).toString();
	return string;
    }
}
