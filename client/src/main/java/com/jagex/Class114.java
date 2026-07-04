/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Class114
{
    static String[] aStringArray1382;
    static boolean aBool1383;
    static int anInt1384;
    static int anInt1385 = 0;
    static int anInt1386;
    static int anInt1387;
    static int anInt1388;
    static int anInt1389;
    static int anInt1390;
    static final String aString1391 = "Failure";
    static final int anInt1392 = 350;
    static int anInt1393 = 0;
    static final String aString1394 = "\\/.:, _-+[]~@";
    static final String aString1395 = "Success";
    static String aString1396 = "";
    public static String aString1397;
    
    public static void method2074(String string) {
	aString1396 = string;
	anInt1389 = aString1396.length() * 399107939;
    }
    
    public static void method2075(String string) {
	if (null == Class200_Sub11.aStringArray9930)
	    Class56.method1226(-1144030400);
	client.aCalendar11332
	    .setTime(new Date(Class250.method4604((byte) -4)));
	int i = client.aCalendar11332.get(11);
	int i_0_ = client.aCalendar11332.get(12);
	int i_1_ = client.aCalendar11332.get(13);
	String string_2_
	    = new StringBuilder().append(Integer.toString(i / 10)).append
		  (i % 10).append
		  (":").append
		  (i_0_ / 10).append
		  (i_0_ % 10).append
		  (":").append
		  (i_1_ / 10).append
		  (i_1_ % 10).toString();
	String[] strings = Class387.method6504(string, '\n', -868083639);
	for (int i_3_ = 0; i_3_ < strings.length; i_3_++) {
	    for (int i_4_ = anInt1385 * -1716872169; i_4_ > 0; i_4_--)
		Class200_Sub11.aStringArray9930[i_4_]
		    = Class200_Sub11.aStringArray9930[i_4_ - 1];
	    Class200_Sub11.aStringArray9930[0]
		= new StringBuilder().append(string_2_).append(": ").append
		      (strings[i_3_]).toString();
	    if (null != Class504.aFileOutputStream5633) {
		try {
		    Class504.aFileOutputStream5633.write
			(Class387.method6503(new StringBuilder().append
						 (Class200_Sub11
						  .aStringArray9930[0])
						 .append
						 ("\n").toString(),
					     -2086465675));
		} catch (IOException ioexception) {
		    /* empty */
		}
	    }
	    if (-1716872169 * anInt1385
		< Class200_Sub11.aStringArray9930.length - 1) {
		anInt1385 += 1351113639;
		if (anInt1393 * -596800939 > 0)
		    anInt1393 += 719528701;
	    }
	}
    }
    
    static void method2076() {
	if (Class212.method4013(1749682179)) {
	    if (null == Class200_Sub11.aStringArray9930)
		Class56.method1226(-723997110);
	    aBool1383 = true;
	    anInt1390 = 0;
	}
    }
    
    Class114() throws Throwable {
	throw new Error();
    }
    
    static void method2077() {
	if (Class212.method4013(-1191153549)) {
	    if (null == Class200_Sub11.aStringArray9930)
		Class56.method1226(1919037373);
	    aBool1383 = true;
	    anInt1390 = 0;
	}
    }
    
    static void method2078() {
	if (Class212.method4013(830794246)) {
	    if (null == Class200_Sub11.aStringArray9930)
		Class56.method1226(360851016);
	    aBool1383 = true;
	    anInt1390 = 0;
	}
    }
    
    static boolean method2079() {
	return aBool1383;
    }
    
    static void method2080() {
	if (Class212.method4013(630243684)) {
	    if (null == Class200_Sub11.aStringArray9930)
		Class56.method1226(-99483700);
	    aBool1383 = true;
	    anInt1390 = 0;
	}
    }
    
    static {
	anInt1388 = 0;
	anInt1389 = 0;
	anInt1390 = 0;
	aBool1383 = false;
	anInt1387 = 556419873;
    }
    
    static void method2081() {
	anInt1386
	    = -218904694 + (Class322.aClass16_3420.anInt189 * -858559641
			    + -2123874781 * Class322.aClass16_3420.anInt190);
	anInt1384
	    = (Class67.aClass16_720.anInt190 * -309101603
	       + 376293017 * Class67.aClass16_720.anInt189 + -1626528650);
	Class200_Sub11.aStringArray9930 = new String[500];
	for (int i = 0; i < Class200_Sub11.aStringArray9930.length; i++)
	    Class200_Sub11.aStringArray9930[i] = "";
	Class73.method1567(Class58.aClass58_631.method1245((Class539
							    .aClass672_7171),
							   (byte) -60),
			   -1975312279);
    }
    
    static void method2082() {
	aBool1383 = false;
	Class422.method6785((byte) -13);
    }
    
    static void method2083() {
	aBool1383 = false;
	Class422.method6785((byte) -119);
    }
    
    static void method2084() {
	if (Class504.aFileOutputStream5633 != null) {
	    try {
		Class504.aFileOutputStream5633.close();
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	Class504.aFileOutputStream5633 = null;
    }
    
    static void method2085() {
	if (Class504.aFileOutputStream5633 != null) {
	    try {
		Class504.aFileOutputStream5633.close();
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	Class504.aFileOutputStream5633 = null;
    }
    
    static boolean method2086() {
	return aBool1383;
    }
    
    static void method2087(String[] strings) {
	if (strings.length > 1) {
	    for (int i = 0; i < strings.length; i++) {
		if (strings[i].startsWith("pause")) {
		    int i_5_ = 5;
		    try {
			i_5_ = Integer.parseInt(strings[i].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class73.method1567(new StringBuilder().append
					   ("Pausing for ").append
					   (i_5_).append
					   (" seconds...").toString(),
				       -1654909305);
		    aStringArray1382 = strings;
		    anInt1387 = -556419873 * (1 + i);
		    Class303.aLong3252
			= (Class250.method4604((byte) -81)
			   + (long) (1000 * i_5_)) * 6271713210732061629L;
		    break;
		}
		aString1396 = strings[i];
		Class649.method10705(false, (byte) 124);
	    }
	} else {
	    aString1396 = new StringBuilder().append(aString1396).append
			      (strings[0]).toString();
	    anInt1389 += strings[0].length() * 399107939;
	}
    }
    
    public static void method2088(String string) {
	aString1396 = string;
	anInt1389 = aString1396.length() * 399107939;
    }
    
    static void method2089() {
	if (anInt1390 * 431834035 < 102)
	    anInt1390 += -2067868446;
	if (-1804400865 * anInt1387 != -1
	    && (7283764449686237077L * Class303.aLong3252
		< Class250.method4604((byte) -71))) {
	    for (int i = anInt1387 * -1804400865; i < aStringArray1382.length;
		 i++) {
		if (aStringArray1382[i].startsWith("pause")) {
		    int i_6_ = 5;
		    try {
			i_6_ = Integer
				   .parseInt(aStringArray1382[i].substring(6));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class73.method1567(new StringBuilder().append
					   ("Pausing for ").append
					   (i_6_).append
					   (" seconds...").toString(),
				       -1378519532);
		    anInt1387 = -556419873 * (1 + i);
		    Class303.aLong3252
			= (Class250.method4604((byte) -122)
			   + (long) (i_6_ * 1000)) * 6271713210732061629L;
		    return;
		}
		aString1396 = aStringArray1382[i];
		Class649.method10705(false, (byte) 117);
	    }
	    anInt1387 = 556419873;
	}
	if (-1756158727 * client.anInt11193 != 0) {
	    anInt1393 -= client.anInt11193 * 643697769;
	    if (-596800939 * anInt1393 >= anInt1385 * -1716872169)
		anInt1393 = -1262726981 * anInt1385 - 719528701;
	    if (anInt1393 * -596800939 < 0)
		anInt1393 = 0;
	    client.anInt11193 = 0;
	}
	for (int i = 0; i < 1779655715 * client.anInt11066; i++) {
	    Interface63 interface63 = client.anInterface63Array11067[i];
	    int i_7_ = interface63.method431((byte) -90);
	    char c = interface63.method424((byte) 1);
	    int i_8_ = interface63.method426((byte) 16);
	    if (84 == i_7_)
		Class649.method10705(false, (byte) 25);
	    if (80 == i_7_)
		Class649.method10705(true, (byte) 83);
	    else if (66 == i_7_ && (i_8_ & 0x4) != 0) {
		if (null != Class118.aClipboard1421) {
		    String string = "";
		    for (int i_9_ = Class200_Sub11.aStringArray9930.length - 1;
			 i_9_ >= 0; i_9_--) {
			if (Class200_Sub11.aStringArray9930[i_9_] != null
			    && (Class200_Sub11.aStringArray9930[i_9_].length()
				> 0))
			    string
				= new StringBuilder().append(string).append
				      (Class200_Sub11.aStringArray9930[i_9_])
				      .append
				      ('\n').toString();
		    }
		    Class118.aClipboard1421
			.setContents(new StringSelection(string), null);
		}
	    } else if (i_7_ == 67 && 0 != (i_8_ & 0x4)) {
		if (null != Class118.aClipboard1421) {
		    try {
			Transferable transferable
			    = Class118.aClipboard1421.getContents(null);
			if (transferable != null) {
			    String string
				= (String) (transferable.getTransferData
					    (DataFlavor.stringFlavor));
			    if (string != null) {
				String[] strings
				    = Class387.method6504(string, '\n',
							  36903371);
				Class634.method10532(strings, (byte) -100);
			    }
			}
		    } catch (Exception exception) {
			/* empty */
		    }
		}
	    } else if (85 == i_7_ && -1360080309 * anInt1389 > 0) {
		aString1396
		    = new StringBuilder().append
			  (aString1396.substring(0,
						 -1360080309 * anInt1389 - 1))
			  .append
			  (aString1396.substring(-1360080309 * anInt1389))
			  .toString();
		anInt1389 -= 399107939;
	    } else if (101 == i_7_
		       && anInt1389 * -1360080309 < aString1396.length())
		aString1396
		    = new StringBuilder().append
			  (aString1396.substring(0, anInt1389 * -1360080309))
			  .append
			  (aString1396.substring(anInt1389 * -1360080309 + 1))
			  .toString();
	    else if (i_7_ == 96 && -1360080309 * anInt1389 > 0)
		anInt1389 -= 399107939;
	    else if (97 == i_7_
		     && -1360080309 * anInt1389 < aString1396.length())
		anInt1389 += 399107939;
	    else if (102 == i_7_)
		anInt1389 = 0;
	    else if (103 == i_7_)
		anInt1389 = aString1396.length() * 399107939;
	    else if (104 == i_7_
		     && (2030085227 * anInt1388
			 < Class200_Sub11.aStringArray9930.length)) {
		anInt1388 += 1417472067;
		Class247.method4594(-1155626103);
		anInt1389 = aString1396.length() * 399107939;
	    } else if (i_7_ == 105 && 2030085227 * anInt1388 > 0) {
		anInt1388 -= 1417472067;
		Class247.method4594(250486845);
		anInt1389 = aString1396.length() * 399107939;
	    } else if (Class604.method10031(c, 2125206466)
		       || "\\/.:, _-+[]~@".indexOf(c) != -1) {
		aString1396
		    = new StringBuilder().append
			  (aString1396.substring(0, anInt1389 * -1360080309))
			  .append
			  (client.anInterface63Array11067[i]
			       .method424((byte) 1))
			  .append
			  (aString1396.substring(anInt1389 * -1360080309))
			  .toString();
		anInt1389 += 399107939;
	    }
	}
	client.anInt11066 = 0;
	client.anInt11199 = 0;
	Class422.method6785((byte) -60);
    }
    
    static boolean method2090() {
	if (Class534_Sub18_Sub2.method17848(-1850530127 * client.anInt11039,
					    -1975663795))
	    return false;
	return true;
    }
    
    static void method2091() {
	if (Class212.method4013(2123454207)) {
	    if (null == Class200_Sub11.aStringArray9930)
		Class56.method1226(61231999);
	    aBool1383 = true;
	    anInt1390 = 0;
	}
    }
    
    public static void method2092(String string) {
	aString1396 = string;
	anInt1389 = aString1396.length() * 399107939;
    }
    
    public static void method2093(String string) {
	aString1396 = string;
	anInt1389 = aString1396.length() * 399107939;
    }
    
    static void method2094(Class185 class185) {
	if (Class228.method4188(1895800279) && Class302.method5570((byte) 112))
	    Class672.method11091(0, 0, Class706_Sub4.anInt10994 * 1771907305,
				 350, -1810769046);
	class185.method3373(0, 0, 1771907305 * Class706_Sub4.anInt10994, 350);
	class185.method3298(0, 0, Class706_Sub4.anInt10994 * 1771907305, 350,
			    anInt1390 * 431834035 << 24 | 0x332277, 1);
	int i = 350 / (-103516429 * anInt1384);
	if (-1716872169 * anInt1385 > 0) {
	    int i_10_ = 346 - anInt1384 * -103516429 - 4;
	    int i_11_ = i_10_ * i / (i + -1716872169 * anInt1385 - 1);
	    int i_12_ = 4;
	    if (anInt1385 * -1716872169 > 1)
		i_12_
		    += ((-1716872169 * anInt1385 - 1 - anInt1393 * -596800939)
			* (i_10_ - i_11_) / (anInt1385 * -1716872169 - 1));
	    class185.method3298(Class706_Sub4.anInt10994 * 1771907305 - 16,
				i_12_, 12, i_11_,
				anInt1390 * 431834035 << 24 | 0x332277, 2);
	    for (int i_13_ = -596800939 * anInt1393;
		 (i_13_ < i + -596800939 * anInt1393
		  && i_13_ < -1716872169 * anInt1385);
		 i_13_++) {
		String[] strings
		    = Class387.method6504((Class200_Sub11.aStringArray9930
					   [i_13_]),
					  '\010', 1029558463);
		int i_14_ = ((Class706_Sub4.anInt10994 * 1771907305 - 8 - 16)
			     / strings.length);
		for (int i_15_ = 0; i_15_ < strings.length; i_15_++) {
		    int i_16_ = i_14_ * i_15_ + 8;
		    class185.method3373(i_16_, 0, i_16_ + i_14_ - 8, 350);
		    Class539_Sub1.aClass171_10327.method2828
			(Class311.method5666(strings[i_15_], 202783357), i_16_,
			 (350 - anInt1386 * -583687411 - 2
			  - Class67.aClass16_720.anInt189 * 728893755
			  - (i_13_ - anInt1393 * -596800939) * (anInt1384
								* -103516429)),
			 -1, -16777216, (byte) 73);
		}
	    }
	}
	Class219.aClass171_2307.method2829("881 1",
					   (Class706_Sub4.anInt10994
					    * 1771907305) - 25,
					   330, -1, -16777216, -1225776277);
	class185.method3373(0, 0, 1771907305 * Class706_Sub4.anInt10994, 350);
	class185.method3294(0, 350 - -583687411 * anInt1386,
			    1771907305 * Class706_Sub4.anInt10994, -1,
			    -1688284072);
	Class231.aClass171_2325.method2828
	    (new StringBuilder().append("--> ").append
		 (Class311.method5666(aString1396, 202783357)).toString(),
	     10, 350 - Class322.aClass16_3420.anInt189 * 728893755 - 1, -1,
	     -16777216, (byte) 119);
	if (Class534_Sub36.aBool10800) {
	    int i_17_ = -1;
	    if (client.anInt11101 % 30 > 15)
		i_17_ = 16777215;
	    class185.method3302
		(10 + (Class322.aClass16_3420.method728
		       (new StringBuilder().append("--> ").append
			    (Class311.method5666(aString1396, 202783357)
				 .substring(0, -1360080309 * anInt1389))
			    .toString(),
			1462621378)),
		 350 - Class322.aClass16_3420.anInt189 * 728893755 - 11, 12,
		 i_17_, -1585421987);
	}
	class185.method3537();
	Class24.method854((byte) -32);
    }
    
    static void method2095() {
	if (anInt1388 * 2030085227 > 0) {
	    int i = 0;
	    for (int i_18_ = 0; i_18_ < Class200_Sub11.aStringArray9930.length;
		 i_18_++) {
		if ((Class200_Sub11.aStringArray9930[i_18_].indexOf("--> ")
		     != -1)
		    && ++i == 2030085227 * anInt1388) {
		    aString1396
			= (Class200_Sub11.aStringArray9930[i_18_].substring
			   (Class200_Sub11.aStringArray9930[i_18_].indexOf('>')
			    + 2));
		    break;
		}
	    }
	} else
	    aString1396 = "";
    }
    
    static void method2096() {
	anInt1386
	    = -218904694 + (Class322.aClass16_3420.anInt189 * -858559641
			    + -2123874781 * Class322.aClass16_3420.anInt190);
	anInt1384
	    = (Class67.aClass16_720.anInt190 * -309101603
	       + 376293017 * Class67.aClass16_720.anInt189 + -1626528650);
	Class200_Sub11.aStringArray9930 = new String[500];
	for (int i = 0; i < Class200_Sub11.aStringArray9930.length; i++)
	    Class200_Sub11.aStringArray9930[i] = "";
	Class73.method1567(Class58.aClass58_631.method1245((Class539
							    .aClass672_7171),
							   (byte) -100),
			   -1568231348);
    }
    
    static void method2097(Class185 class185) {
	if (Class228.method4188(-777574817) && Class302.method5570((byte) 17))
	    Class672.method11091(0, 0, Class706_Sub4.anInt10994 * 1771907305,
				 350, 928118192);
	class185.method3373(0, 0, 1771907305 * Class706_Sub4.anInt10994, 350);
	class185.method3298(0, 0, Class706_Sub4.anInt10994 * 1771907305, 350,
			    anInt1390 * 431834035 << 24 | 0x332277, 1);
	int i = 350 / (-103516429 * anInt1384);
	if (-1716872169 * anInt1385 > 0) {
	    int i_19_ = 346 - anInt1384 * -103516429 - 4;
	    int i_20_ = i_19_ * i / (i + -1716872169 * anInt1385 - 1);
	    int i_21_ = 4;
	    if (anInt1385 * -1716872169 > 1)
		i_21_
		    += ((-1716872169 * anInt1385 - 1 - anInt1393 * -596800939)
			* (i_19_ - i_20_) / (anInt1385 * -1716872169 - 1));
	    class185.method3298(Class706_Sub4.anInt10994 * 1771907305 - 16,
				i_21_, 12, i_20_,
				anInt1390 * 431834035 << 24 | 0x332277, 2);
	    for (int i_22_ = -596800939 * anInt1393;
		 (i_22_ < i + -596800939 * anInt1393
		  && i_22_ < -1716872169 * anInt1385);
		 i_22_++) {
		String[] strings
		    = Class387.method6504((Class200_Sub11.aStringArray9930
					   [i_22_]),
					  '\010', -1042551076);
		int i_23_ = ((Class706_Sub4.anInt10994 * 1771907305 - 8 - 16)
			     / strings.length);
		for (int i_24_ = 0; i_24_ < strings.length; i_24_++) {
		    int i_25_ = i_23_ * i_24_ + 8;
		    class185.method3373(i_25_, 0, i_25_ + i_23_ - 8, 350);
		    Class539_Sub1.aClass171_10327.method2828
			(Class311.method5666(strings[i_24_], 202783357), i_25_,
			 (350 - anInt1386 * -583687411 - 2
			  - Class67.aClass16_720.anInt189 * 728893755
			  - (i_22_ - anInt1393 * -596800939) * (anInt1384
								* -103516429)),
			 -1, -16777216, (byte) 8);
		}
	    }
	}
	Class219.aClass171_2307.method2829("881 1",
					   (Class706_Sub4.anInt10994
					    * 1771907305) - 25,
					   330, -1, -16777216, 1474682554);
	class185.method3373(0, 0, 1771907305 * Class706_Sub4.anInt10994, 350);
	class185.method3294(0, 350 - -583687411 * anInt1386,
			    1771907305 * Class706_Sub4.anInt10994, -1,
			    312836807);
	Class231.aClass171_2325.method2828
	    (new StringBuilder().append("--> ").append
		 (Class311.method5666(aString1396, 202783357)).toString(),
	     10, 350 - Class322.aClass16_3420.anInt189 * 728893755 - 1, -1,
	     -16777216, (byte) 114);
	if (Class534_Sub36.aBool10800) {
	    int i_26_ = -1;
	    if (client.anInt11101 % 30 > 15)
		i_26_ = 16777215;
	    class185.method3302
		(10 + (Class322.aClass16_3420.method728
		       (new StringBuilder().append("--> ").append
			    (Class311.method5666(aString1396, 202783357)
				 .substring(0, -1360080309 * anInt1389))
			    .toString(),
			-1881158630)),
		 350 - Class322.aClass16_3420.anInt189 * 728893755 - 11, 12,
		 i_26_, 19193179);
	}
	class185.method3537();
	Class24.method854((byte) -52);
    }
    
    static void method2098(Class185 class185) {
	if (Class228.method4188(710704570) && Class302.method5570((byte) 101))
	    Class672.method11091(0, 0, Class706_Sub4.anInt10994 * 1771907305,
				 350, -439203664);
	class185.method3373(0, 0, 1771907305 * Class706_Sub4.anInt10994, 350);
	class185.method3298(0, 0, Class706_Sub4.anInt10994 * 1771907305, 350,
			    anInt1390 * 431834035 << 24 | 0x332277, 1);
	int i = 350 / (-103516429 * anInt1384);
	if (-1716872169 * anInt1385 > 0) {
	    int i_27_ = 346 - anInt1384 * -103516429 - 4;
	    int i_28_ = i_27_ * i / (i + -1716872169 * anInt1385 - 1);
	    int i_29_ = 4;
	    if (anInt1385 * -1716872169 > 1)
		i_29_
		    += ((-1716872169 * anInt1385 - 1 - anInt1393 * -596800939)
			* (i_27_ - i_28_) / (anInt1385 * -1716872169 - 1));
	    class185.method3298(Class706_Sub4.anInt10994 * 1771907305 - 16,
				i_29_, 12, i_28_,
				anInt1390 * 431834035 << 24 | 0x332277, 2);
	    for (int i_30_ = -596800939 * anInt1393;
		 (i_30_ < i + -596800939 * anInt1393
		  && i_30_ < -1716872169 * anInt1385);
		 i_30_++) {
		String[] strings
		    = Class387.method6504((Class200_Sub11.aStringArray9930
					   [i_30_]),
					  '\010', -1582939663);
		int i_31_ = ((Class706_Sub4.anInt10994 * 1771907305 - 8 - 16)
			     / strings.length);
		for (int i_32_ = 0; i_32_ < strings.length; i_32_++) {
		    int i_33_ = i_31_ * i_32_ + 8;
		    class185.method3373(i_33_, 0, i_33_ + i_31_ - 8, 350);
		    Class539_Sub1.aClass171_10327.method2828
			(Class311.method5666(strings[i_32_], 202783357), i_33_,
			 (350 - anInt1386 * -583687411 - 2
			  - Class67.aClass16_720.anInt189 * 728893755
			  - (i_30_ - anInt1393 * -596800939) * (anInt1384
								* -103516429)),
			 -1, -16777216, (byte) 14);
		}
	    }
	}
	Class219.aClass171_2307.method2829("881 1",
					   (Class706_Sub4.anInt10994
					    * 1771907305) - 25,
					   330, -1, -16777216, -8169927);
	class185.method3373(0, 0, 1771907305 * Class706_Sub4.anInt10994, 350);
	class185.method3294(0, 350 - -583687411 * anInt1386,
			    1771907305 * Class706_Sub4.anInt10994, -1,
			    644034731);
	Class231.aClass171_2325.method2828
	    (new StringBuilder().append("--> ").append
		 (Class311.method5666(aString1396, 202783357)).toString(),
	     10, 350 - Class322.aClass16_3420.anInt189 * 728893755 - 1, -1,
	     -16777216, (byte) 72);
	if (Class534_Sub36.aBool10800) {
	    int i_34_ = -1;
	    if (client.anInt11101 % 30 > 15)
		i_34_ = 16777215;
	    class185.method3302
		(10 + (Class322.aClass16_3420.method728
		       (new StringBuilder().append("--> ").append
			    (Class311.method5666(aString1396, 202783357)
				 .substring(0, -1360080309 * anInt1389))
			    .toString(),
			-1486154610)),
		 350 - Class322.aClass16_3420.anInt189 * 728893755 - 11, 12,
		 i_34_, -730358808);
	}
	class185.method3537();
	Class24.method854((byte) 48);
    }
    
    static void method2099(Class185 class185) {
	if (Class228.method4188(166356444) && Class302.method5570((byte) 49))
	    Class672.method11091(0, 0, Class706_Sub4.anInt10994 * 1771907305,
				 350, -89657336);
	class185.method3373(0, 0, 1771907305 * Class706_Sub4.anInt10994, 350);
	class185.method3298(0, 0, Class706_Sub4.anInt10994 * 1771907305, 350,
			    anInt1390 * 431834035 << 24 | 0x332277, 1);
	int i = 350 / (-103516429 * anInt1384);
	if (-1716872169 * anInt1385 > 0) {
	    int i_35_ = 346 - anInt1384 * -103516429 - 4;
	    int i_36_ = i_35_ * i / (i + -1716872169 * anInt1385 - 1);
	    int i_37_ = 4;
	    if (anInt1385 * -1716872169 > 1)
		i_37_
		    += ((-1716872169 * anInt1385 - 1 - anInt1393 * -596800939)
			* (i_35_ - i_36_) / (anInt1385 * -1716872169 - 1));
	    class185.method3298(Class706_Sub4.anInt10994 * 1771907305 - 16,
				i_37_, 12, i_36_,
				anInt1390 * 431834035 << 24 | 0x332277, 2);
	    for (int i_38_ = -596800939 * anInt1393;
		 (i_38_ < i + -596800939 * anInt1393
		  && i_38_ < -1716872169 * anInt1385);
		 i_38_++) {
		String[] strings
		    = Class387.method6504((Class200_Sub11.aStringArray9930
					   [i_38_]),
					  '\010', 756115226);
		int i_39_ = ((Class706_Sub4.anInt10994 * 1771907305 - 8 - 16)
			     / strings.length);
		for (int i_40_ = 0; i_40_ < strings.length; i_40_++) {
		    int i_41_ = i_39_ * i_40_ + 8;
		    class185.method3373(i_41_, 0, i_41_ + i_39_ - 8, 350);
		    Class539_Sub1.aClass171_10327.method2828
			(Class311.method5666(strings[i_40_], 202783357), i_41_,
			 (350 - anInt1386 * -583687411 - 2
			  - Class67.aClass16_720.anInt189 * 728893755
			  - (i_38_ - anInt1393 * -596800939) * (anInt1384
								* -103516429)),
			 -1, -16777216, (byte) 16);
		}
	    }
	}
	Class219.aClass171_2307.method2829("881 1",
					   (Class706_Sub4.anInt10994
					    * 1771907305) - 25,
					   330, -1, -16777216, -2053920228);
	class185.method3373(0, 0, 1771907305 * Class706_Sub4.anInt10994, 350);
	class185.method3294(0, 350 - -583687411 * anInt1386,
			    1771907305 * Class706_Sub4.anInt10994, -1,
			    208425429);
	Class231.aClass171_2325.method2828
	    (new StringBuilder().append("--> ").append
		 (Class311.method5666(aString1396, 202783357)).toString(),
	     10, 350 - Class322.aClass16_3420.anInt189 * 728893755 - 1, -1,
	     -16777216, (byte) 26);
	if (Class534_Sub36.aBool10800) {
	    int i_42_ = -1;
	    if (client.anInt11101 % 30 > 15)
		i_42_ = 16777215;
	    class185.method3302
		(10 + (Class322.aClass16_3420.method728
		       (new StringBuilder().append("--> ").append
			    (Class311.method5666(aString1396, 202783357)
				 .substring(0, -1360080309 * anInt1389))
			    .toString(),
			-780013485)),
		 350 - Class322.aClass16_3420.anInt189 * 728893755 - 11, 12,
		 i_42_, 301331733);
	}
	class185.method3537();
	Class24.method854((byte) -27);
    }
    
    static String method2100(String string) {
	String string_43_ = null;
	int i = string.indexOf("--> ");
	if (i >= 0) {
	    string_43_ = string.substring(0, 4 + i);
	    string = string.substring(4 + i);
	}
	int i_44_ = -1;
	if (string.startsWith("directlogin "))
	    i_44_ = string.indexOf(" ", "directlogin ".length());
	if (i_44_ >= 0) {
	    int i_45_ = string.length();
	    string
		= new StringBuilder().append(string.substring(0, i_44_)).append
		      (" ").toString();
	    for (int i_46_ = i_44_ + 1; i_46_ < i_45_; i_46_++)
		string = new StringBuilder().append(string).append("*")
			     .toString();
	}
	if (string_43_ != null)
	    return new StringBuilder().append(string_43_).append(string)
		       .toString();
	return string;
    }
    
    static void method2101() {
	/* empty */
    }
    
    public static void method2102(String string, boolean bool,
				  boolean bool_47_) {
	do {
	    try {
		if (string.equalsIgnoreCase("commands")
		    || string.equalsIgnoreCase("help")) {
		    Class73.method1567("commands - This command", -911720990);
		    Class73.method1567("cls - Clear console", -950032421);
		    Class73.method1567
			("displayfps - Toggle FPS and other information",
			 -685043353);
		    Class73.method1567
			("renderer - Print graphics renderer information",
			 -1813988807);
		    Class73.method1567("heap - Print java memory information",
				       -1699979379);
		    Class73.method1567
			("getcamerapos - Print location and direction of camera for use in bug reports",
			 -1227856551);
		} else if (string.equalsIgnoreCase("cls")) {
		    anInt1385 = 0;
		    anInt1393 = 0;
		} else if (string.equalsIgnoreCase("displayfps")) {
		    client.aBool11262 = !client.aBool11262;
		    if (client.aBool11262)
			Class73.method1567("FPS on", -1314864021);
		    else
			Class73.method1567("FPS off", -1563255106);
		} else if (string.equals("renderer")) {
		    Class176 class176 = Class254.aClass185_2683.method3232();
		    Class73.method1567(new StringBuilder().append
					   ("Toolkit ID: ").append
					   (Class44_Sub6
						.aClass534_Sub35_10989
						.aClass690_Sub7_10733
						.method16935(-1807368365))
					   .toString(),
				       -1753893724);
		    Class73.method1567(new StringBuilder().append
					   ("Vendor: ").append
					   (class176.anInt1844 * 1866206313)
					   .toString(),
				       -1455633848);
		    Class73.method1567(new StringBuilder().append("Name: ")
					   .append
					   (class176.aString1845).toString(),
				       -1567729474);
		    Class73.method1567(new StringBuilder().append
					   ("Version: ").append
					   (class176.anInt1846 * 1458635069)
					   .toString(),
				       -1376138566);
		    Class73.method1567(new StringBuilder().append
					   ("Device: ").append
					   (class176.aString1842).toString(),
				       -1336765823);
		    Class73.method1567(new StringBuilder().append
					   ("Driver Version: ").append
					   (class176.aLong1848
					    * -1920893184504226295L)
					   .toString(),
				       -1146867174);
		    String string_48_ = Class254.aClass185_2683.method3250();
		    if (string_48_.length() > 0)
			Class73.method1567(string_48_, -1812278014);
		} else if (string.equals("heap"))
		    Class73.method1567(new StringBuilder().append("Heap: ")
					   .append
					   (721369631 * Class498.anInt5589)
					   .append
					   ("MB").toString(),
				       -874775660);
		else {
		    if (!string.equalsIgnoreCase("getcamerapos"))
			break;
		    Class597 class597
			= client.aClass512_11100.method8416((byte) 117);
		    if (Class10.anInt75 * -891094135 == 3) {
			Class438 class438 = Class599.aClass298_Sub1_7871
						.method5385((byte) 123);
			Class438 class438_49_ = Class599
						    .aClass298_Sub1_7871
						    .method5456(1264364204);
			Class73.method1567
			    (new StringBuilder().append("Pos: ").append
				 (new Class597
				      ((Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.aByte10854),
				       (int) class438.aFloat4864 >> 9,
				       (int) class438.aFloat4865 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class247.method4595
				   (((int) class438.aFloat4864
				     - (-424199969 * class597.anInt7859 << 9)),
				    ((int) class438.aFloat4865
				     - (class597.anInt7861 * -1166289421
					<< 9)),
				    (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854),
				    56385645)) + (int) class438.aFloat4863)
				 .toString(),
			     -1252206494);
			Class73.method1567
			    (new StringBuilder().append("Look: ").append
				 (new Class597
				      ((Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.aByte10854),
				       (int) class438_49_.aFloat4864 >> 9,
				       (int) class438_49_.aFloat4865 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class247.method4595
				   (((int) class438_49_.aFloat4864
				     - (-424199969 * class597.anInt7859 << 9)),
				    ((int) class438.aFloat4865
				     - (class597.anInt7861 * -1166289421
					<< 9)),
				    (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854),
				    -530956443)) + (int) class438.aFloat4863)
				 .toString(),
			     -719683121);
		    } else {
			Class73.method1567
			    (new StringBuilder().append("Pos: ").append
				 (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				  .aByte10854)
				 .append
				 (",").append
				 (((Class200_Sub13.anInt9937 * -116109187 >> 9)
				   + class597.anInt7859 * -424199969) >> 6)
				 .append
				 (",").append
				 (((Class636.anInt8305 * -1098179003 >> 9)
				   + class597.anInt7861 * -1166289421) >> 6)
				 .append
				 (",").append
				 (((Class200_Sub13.anInt9937 * -116109187 >> 9)
				   + -424199969 * class597.anInt7859) & 0x3f)
				 .append
				 (",").append
				 (((Class636.anInt8305 * -1098179003 >> 9)
				   + -1166289421 * class597.anInt7861) & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class247.method4595
				   (Class200_Sub13.anInt9937 * -116109187,
				    Class636.anInt8305 * -1098179003,
				    (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854),
				    -1683253047))
				  - Class677.anInt8654 * 1529694271)
				 .toString(),
			     -1263801476);
			Class73.method1567
			    (new StringBuilder().append("Look: ").append
				 (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				  .aByte10854)
				 .append
				 (",").append
				 ((Class652.anInt8484 * 2006804215
				   + -424199969 * class597.anInt7859) >> 6)
				 .append
				 (",").append
				 ((1803758839 * Class609.anInt8007
				   + class597.anInt7861 * -1166289421) >> 6)
				 .append
				 (",").append
				 ((Class652.anInt8484 * 2006804215
				   + -424199969 * class597.anInt7859) & 0x3f)
				 .append
				 (",").append
				 ((Class609.anInt8007 * 1803758839
				   + class597.anInt7861 * -1166289421) & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class247.method4595
				   (Class652.anInt8484 * 2006804215,
				    Class609.anInt8007 * 1803758839,
				    (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854),
				    68968424))
				  - Class341.anInt3554 * -1339841327)
				 .toString(),
			     -1051131499);
		    }
		}
	    } catch (Exception exception) {
		Class73.method1567
		    (Class58.aClass58_469.method1245(Class539.aClass672_7171,
						     (byte) -11),
		     -1912782380);
	    }
	    return;
	} while (false);
	if (Class665.aClass665_8561 != client.aClass665_11211
	    || client.anInt11194 * 365872613 >= 2) {
	    try {
		if (string.equalsIgnoreCase("wm1")) {
		    Class159.method2611(1, -1, -1, false, -1806299379);
		    if (Class63.method1280(1140312448) == 1)
			Class73.method1567("Success", -2036582867);
		    else
			Class73.method1567("Failure", -1083968364);
		    return;
		}
		if (string.equalsIgnoreCase("wm2")) {
		    Class159.method2611(2, -1, -1, false, -1850437445);
		    if (Class63.method1280(1360877704) == 2)
			Class73.method1567("Success", -1340261552);
		    else
			Class73.method1567("Failure", -702277414);
		    return;
		}
		if (Class713.aBool8884 && string.equalsIgnoreCase("wm3")) {
		    Class159.method2611(3, 1024, 768, false, 1702067612);
		    if (Class63.method1280(1175841675) == 3)
			Class73.method1567("Success", -1450427397);
		    else
			Class73.method1567("Failure", -2147407266);
		    return;
		}
		if (string.startsWith("setlobby ")) {
		    if (15 != -1850530127 * client.anInt11039)
			Class73.method1567("Failure", -1857614071);
		    else {
			int i = -1;
			Object object = null;
			string = string.substring(9);
			int i_50_ = string.indexOf(' ');
			if (-1 == i_50_)
			    Class73.method1567("Failure", -1010190400);
			else {
			    try {
				i = Integer.parseInt(string.substring(0,
								      i_50_));
			    } catch (NumberFormatException numberformatexception) {
				/* empty */
			    }
			    if (i == -1)
				Class73.method1567("Failure", -899460180);
			    else {
				String string_51_
				    = new StringBuilder().append
					  (string.substring(i_50_ + 1).trim())
					  .append
					  (".runescape.com").toString();
				Class690_Sub21.method17074(string_51_, i,
							   -630176159);
				Class73.method1567("Success", -935380585);
				return;
			    }
			    return;
			}
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("tk0")) {
		    Class527.method8778(0, false, 1619830126);
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub7_10733.method16935(-1807368365)
			== 0) {
			Class73.method1567("Success", -1322901062);
			Class44_Sub6.aClass534_Sub35_10989.method16438
			    ((Class44_Sub6.aClass534_Sub35_10989
			      .aClass690_Sub7_10764),
			     0, 2039079109);
			Class672.method11096((byte) 1);
			client.aBool11048 = false;
		    } else
			Class73.method1567("Failure", -2059638740);
		    return;
		}
		if (string.equalsIgnoreCase("tk1")) {
		    Class527.method8778(1, false, -1469422394);
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub7_10733.method16935(-1807368365)
			== 1) {
			Class73.method1567("Success", -1747148912);
			Class44_Sub6.aClass534_Sub35_10989.method16438
			    ((Class44_Sub6.aClass534_Sub35_10989
			      .aClass690_Sub7_10764),
			     1, 1218179186);
			Class672.method11096((byte) 1);
			client.aBool11048 = false;
		    } else
			Class73.method1567("Failure", -1446782297);
		    return;
		}
		if (string.equalsIgnoreCase("tk3")) {
		    Class527.method8778(3, false, -1784495770);
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub7_10733.method16935(-1807368365)
			== 3) {
			Class73.method1567("Success", -832354666);
			Class44_Sub6.aClass534_Sub35_10989.method16438
			    ((Class44_Sub6.aClass534_Sub35_10989
			      .aClass690_Sub7_10764),
			     3, -766288388);
			Class672.method11096((byte) 1);
			client.aBool11048 = false;
		    } else
			Class73.method1567("Failure", -1142648148);
		    return;
		}
		if (string.equalsIgnoreCase("tk5")) {
		    Class527.method8778(5, false, 1814395954);
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub7_10733.method16935(-1807368365)
			== 5) {
			Class73.method1567("Success", -1857787641);
			Class44_Sub6.aClass534_Sub35_10989.method16438
			    ((Class44_Sub6.aClass534_Sub35_10989
			      .aClass690_Sub7_10764),
			     5, -1363423400);
			Class672.method11096((byte) 1);
			client.aBool11048 = false;
		    } else
			Class73.method1567("Failure", -1211531951);
		    return;
		}
		if (string.equalsIgnoreCase("clientdrop")) {
		    if (16 == client.anInt11039 * -1850530127)
			Class515.method8589(-1663178506);
		    else if (-1850530127 * client.anInt11039 == 3)
			client.aClass100_11264.aBool1198 = true;
		    return;
		}
		if (string.equalsIgnoreCase("breakcon")) {
		    Class100[] class100s = client.aClass100Array11096;
		    for (int i = 0; i < class100s.length; i++) {
			Class100 class100 = class100s[i];
			if (class100.method1867(-979493099) != null)
			    class100.method1867(-531709605)
				.method8973((byte) 25);
		    }
		    Class6.aClass450_56.method7342((byte) 55);
		    return;
		}
		if (string.startsWith("getclientvarpbit")) {
		    int i = Integer.parseInt(string.substring(17));
		    Class73.method1567(new StringBuilder().append
					   ("varpbit=").append
					   (Class78.aClass103_825.method119
					    (Class78.aClass103_825
						 .method107(i, 1504047109),
					     -1868492773))
					   .toString(),
				       -919259815);
		    return;
		}
		if (string.startsWith("getclientvarp")) {
		    int i = Integer.parseInt(string.substring(14));
		    Class73.method1567(new StringBuilder().append("varp=")
					   .append
					   (Class78.aClass103_825.method120
					    ((Class78.aClass103_825.method108
					      (Class453.aClass453_4946, i,
					       1699345683)),
					     (byte) -30))
					   .toString(),
				       -1023272970);
		    return;
		}
		if (string.startsWith("directlogin")) {
		    String[] strings
			= Class387.method6504(string.substring(12), ' ',
					      -1452872553);
		    if (strings.length == 2 || strings.length == 3) {
			if (Class202.method3865((byte) 0))
			    Class534_Sub11_Sub10.method18230(-1798408108);
			Class200_Sub6.method15576(strings[0], strings[1],
						  (strings.length > 2
						   ? strings[2] : ""),
						  true, 1074672187);
		    }
		    return;
		}
		if (string.startsWith("snlogin ")) {
		    String[] strings = Class387.method6504(string.substring(8),
							   ' ', -392039390);
		    int i = Integer.parseInt(strings[0]);
		    String string_52_ = strings.length > 1 ? strings[1] : "";
		    Class89.method1713(i, string_52_, true, -694654803);
		    return;
		}
		if (string.startsWith("setoutput ")) {
		    File file = new File(string.substring(10));
		    if (file.exists()) {
			file = new File(new StringBuilder().append
					    (string.substring(10)).append
					    (".").append
					    (Class250.method4604((byte) -84))
					    .append
					    (".log").toString());
			if (file.exists()) {
			    Class73.method1567("file already exists!",
					       -1256096318);
			    return;
			}
		    }
		    if (Class504.aFileOutputStream5633 != null) {
			Class504.aFileOutputStream5633.close();
			Class504.aFileOutputStream5633 = null;
		    }
		    try {
			Class504.aFileOutputStream5633
			    = new FileOutputStream(file);
		    } catch (FileNotFoundException filenotfoundexception) {
			Class73.method1567(new StringBuilder().append
					       ("Could not create ").append
					       (file.getName()).toString(),
					   -1133340985);
		    } catch (SecurityException securityexception) {
			Class73.method1567(new StringBuilder().append
					       ("Cannot write to ").append
					       (file.getName()).toString(),
					   -722187142);
		    }
		    return;
		}
		if (string.equals("closeoutput")) {
		    if (null != Class504.aFileOutputStream5633)
			Class504.aFileOutputStream5633.close();
		    Class504.aFileOutputStream5633 = null;
		    return;
		}
		if (string.startsWith("runscript ")) {
		    File file = new File(string.substring(10));
		    if (!file.exists()) {
			Class73.method1567("No such file", -1099452522);
			return;
		    }
		    byte[] is = Class690_Sub24.method17099(file, -1965975997);
		    if (null == is) {
			Class73.method1567("Failed to read file", -1584598598);
			return;
		    }
		    String[] strings
			= Class387.method6504((Class656.method10893
					       (Class563.method9512(is,
								    (byte) 52),
						'\r', "", -1029784129)),
					      '\n', -1367100916);
		    Class634.method10532(strings, (byte) -104);
		}
		if (16 == -1850530127 * client.anInt11039
		    || client.anInt11039 * -1850530127 == 9) {
		    Class100 class100 = Class201.method3864(2095398292);
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4234,
					      class100.aClass13_1183,
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16506(string.length() + 3, 303339243);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16506(bool ? 1 : 0, 1622750226);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16506(bool_47_ ? 1 : 0, 431174867);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16713(string, 1067404269);
		    class100.method1863(class534_sub19, (byte) 34);
		}
	    } catch (Exception exception) {
		Class73.method1567
		    (Class58.aClass58_469.method1245(Class539.aClass672_7171,
						     (byte) -91),
		     -781795298);
		return;
	    }
	}
	if (16 != -1850530127 * client.anInt11039
	    && -1850530127 * client.anInt11039 != 9)
	    Class73.method1567
		(new StringBuilder().append
		     (Class58.aClass58_463.method1245(Class539.aClass672_7171,
						      (byte) -84))
		     .append
		     (string).toString(),
		 -1753359988);
    }
    
    public static void method2103(String string, boolean bool,
				  boolean bool_53_) {
	do {
	    try {
		if (string.equalsIgnoreCase("commands")
		    || string.equalsIgnoreCase("help")) {
		    Class73.method1567("commands - This command", -996627137);
		    Class73.method1567("cls - Clear console", -1944949519);
		    Class73.method1567
			("displayfps - Toggle FPS and other information",
			 -1162792995);
		    Class73.method1567
			("renderer - Print graphics renderer information",
			 -846232915);
		    Class73.method1567("heap - Print java memory information",
				       -1329256869);
		    Class73.method1567
			("getcamerapos - Print location and direction of camera for use in bug reports",
			 -1693615132);
		} else if (string.equalsIgnoreCase("cls")) {
		    anInt1385 = 0;
		    anInt1393 = 0;
		} else if (string.equalsIgnoreCase("displayfps")) {
		    client.aBool11262 = !client.aBool11262;
		    if (client.aBool11262)
			Class73.method1567("FPS on", -1188269695);
		    else
			Class73.method1567("FPS off", -2100560726);
		} else if (string.equals("renderer")) {
		    Class176 class176 = Class254.aClass185_2683.method3232();
		    Class73.method1567(new StringBuilder().append
					   ("Toolkit ID: ").append
					   (Class44_Sub6
						.aClass534_Sub35_10989
						.aClass690_Sub7_10733
						.method16935(-1807368365))
					   .toString(),
				       -819289118);
		    Class73.method1567(new StringBuilder().append
					   ("Vendor: ").append
					   (class176.anInt1844 * 1866206313)
					   .toString(),
				       -1772747116);
		    Class73.method1567(new StringBuilder().append("Name: ")
					   .append
					   (class176.aString1845).toString(),
				       -1776962153);
		    Class73.method1567(new StringBuilder().append
					   ("Version: ").append
					   (class176.anInt1846 * 1458635069)
					   .toString(),
				       -1385895273);
		    Class73.method1567(new StringBuilder().append
					   ("Device: ").append
					   (class176.aString1842).toString(),
				       -1719074279);
		    Class73.method1567(new StringBuilder().append
					   ("Driver Version: ").append
					   (class176.aLong1848
					    * -1920893184504226295L)
					   .toString(),
				       -1485162471);
		    String string_54_ = Class254.aClass185_2683.method3250();
		    if (string_54_.length() > 0)
			Class73.method1567(string_54_, -1113770663);
		} else if (string.equals("heap"))
		    Class73.method1567(new StringBuilder().append("Heap: ")
					   .append
					   (721369631 * Class498.anInt5589)
					   .append
					   ("MB").toString(),
				       -1097185609);
		else {
		    if (!string.equalsIgnoreCase("getcamerapos"))
			break;
		    Class597 class597
			= client.aClass512_11100.method8416((byte) 41);
		    if (Class10.anInt75 * -891094135 == 3) {
			Class438 class438 = Class599.aClass298_Sub1_7871
						.method5385((byte) 122);
			Class438 class438_55_ = Class599
						    .aClass298_Sub1_7871
						    .method5456(939688064);
			Class73.method1567
			    (new StringBuilder().append("Pos: ").append
				 (new Class597
				      ((Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.aByte10854),
				       (int) class438.aFloat4864 >> 9,
				       (int) class438.aFloat4865 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class247.method4595
				   (((int) class438.aFloat4864
				     - (-424199969 * class597.anInt7859 << 9)),
				    ((int) class438.aFloat4865
				     - (class597.anInt7861 * -1166289421
					<< 9)),
				    (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854),
				    -624401218)) + (int) class438.aFloat4863)
				 .toString(),
			     -1120693208);
			Class73.method1567
			    (new StringBuilder().append("Look: ").append
				 (new Class597
				      ((Class322
					.aClass654_Sub1_Sub5_Sub1_Sub2_3419
					.aByte10854),
				       (int) class438_55_.aFloat4864 >> 9,
				       (int) class438_55_.aFloat4865 >> 9)
				      .toString())
				 .append
				 (" Height: ").append
				 ((Class247.method4595
				   (((int) class438_55_.aFloat4864
				     - (-424199969 * class597.anInt7859 << 9)),
				    ((int) class438.aFloat4865
				     - (class597.anInt7861 * -1166289421
					<< 9)),
				    (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854),
				    -333414012)) + (int) class438.aFloat4863)
				 .toString(),
			     -1147873919);
		    } else {
			Class73.method1567
			    (new StringBuilder().append("Pos: ").append
				 (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				  .aByte10854)
				 .append
				 (",").append
				 (((Class200_Sub13.anInt9937 * -116109187 >> 9)
				   + class597.anInt7859 * -424199969) >> 6)
				 .append
				 (",").append
				 (((Class636.anInt8305 * -1098179003 >> 9)
				   + class597.anInt7861 * -1166289421) >> 6)
				 .append
				 (",").append
				 (((Class200_Sub13.anInt9937 * -116109187 >> 9)
				   + -424199969 * class597.anInt7859) & 0x3f)
				 .append
				 (",").append
				 (((Class636.anInt8305 * -1098179003 >> 9)
				   + -1166289421 * class597.anInt7861) & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class247.method4595
				   (Class200_Sub13.anInt9937 * -116109187,
				    Class636.anInt8305 * -1098179003,
				    (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854),
				    -1021310590))
				  - Class677.anInt8654 * 1529694271)
				 .toString(),
			     -2106422784);
			Class73.method1567
			    (new StringBuilder().append("Look: ").append
				 (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				  .aByte10854)
				 .append
				 (",").append
				 ((Class652.anInt8484 * 2006804215
				   + -424199969 * class597.anInt7859) >> 6)
				 .append
				 (",").append
				 ((1803758839 * Class609.anInt8007
				   + class597.anInt7861 * -1166289421) >> 6)
				 .append
				 (",").append
				 ((Class652.anInt8484 * 2006804215
				   + -424199969 * class597.anInt7859) & 0x3f)
				 .append
				 (",").append
				 ((Class609.anInt8007 * 1803758839
				   + class597.anInt7861 * -1166289421) & 0x3f)
				 .append
				 (" Height: ").append
				 ((Class247.method4595
				   (Class652.anInt8484 * 2006804215,
				    Class609.anInt8007 * 1803758839,
				    (Class322
				     .aClass654_Sub1_Sub5_Sub1_Sub2_3419
				     .aByte10854),
				    -1044794120))
				  - Class341.anInt3554 * -1339841327)
				 .toString(),
			     -1702333274);
		    }
		}
	    } catch (Exception exception) {
		Class73.method1567
		    (Class58.aClass58_469.method1245(Class539.aClass672_7171,
						     (byte) -33),
		     -1998227180);
	    }
	    return;
	} while (false);
	if (Class665.aClass665_8561 != client.aClass665_11211
	    || client.anInt11194 * 365872613 >= 2) {
	    try {
		if (string.equalsIgnoreCase("wm1")) {
		    Class159.method2611(1, -1, -1, false, -1951492888);
		    if (Class63.method1280(613329667) == 1)
			Class73.method1567("Success", -1748485889);
		    else
			Class73.method1567("Failure", -1699426058);
		    return;
		}
		if (string.equalsIgnoreCase("wm2")) {
		    Class159.method2611(2, -1, -1, false, 1230180323);
		    if (Class63.method1280(1725894702) == 2)
			Class73.method1567("Success", -1977971166);
		    else
			Class73.method1567("Failure", -1972871624);
		    return;
		}
		if (Class713.aBool8884 && string.equalsIgnoreCase("wm3")) {
		    Class159.method2611(3, 1024, 768, false, -75507970);
		    if (Class63.method1280(1525237575) == 3)
			Class73.method1567("Success", -2132674230);
		    else
			Class73.method1567("Failure", -998799317);
		    return;
		}
		if (string.startsWith("setlobby ")) {
		    if (15 != -1850530127 * client.anInt11039)
			Class73.method1567("Failure", -758669447);
		    else {
			int i = -1;
			Object object = null;
			string = string.substring(9);
			int i_56_ = string.indexOf(' ');
			if (-1 == i_56_)
			    Class73.method1567("Failure", -1441315496);
			else {
			    try {
				i = Integer.parseInt(string.substring(0,
								      i_56_));
			    } catch (NumberFormatException numberformatexception) {
				/* empty */
			    }
			    if (i == -1)
				Class73.method1567("Failure", -1594055427);
			    else {
				String string_57_
				    = new StringBuilder().append
					  (string.substring(i_56_ + 1).trim())
					  .append
					  (".runescape.com").toString();
				Class690_Sub21.method17074(string_57_, i,
							   48832385);
				Class73.method1567("Success", -1342361052);
				return;
			    }
			    return;
			}
			return;
		    }
		    return;
		}
		if (string.equalsIgnoreCase("tk0")) {
		    Class527.method8778(0, false, 2076408571);
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub7_10733.method16935(-1807368365)
			== 0) {
			Class73.method1567("Success", -986104387);
			Class44_Sub6.aClass534_Sub35_10989.method16438
			    ((Class44_Sub6.aClass534_Sub35_10989
			      .aClass690_Sub7_10764),
			     0, -667967664);
			Class672.method11096((byte) 1);
			client.aBool11048 = false;
		    } else
			Class73.method1567("Failure", -789627232);
		    return;
		}
		if (string.equalsIgnoreCase("tk1")) {
		    Class527.method8778(1, false, -1295202370);
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub7_10733.method16935(-1807368365)
			== 1) {
			Class73.method1567("Success", -1968925428);
			Class44_Sub6.aClass534_Sub35_10989.method16438
			    ((Class44_Sub6.aClass534_Sub35_10989
			      .aClass690_Sub7_10764),
			     1, 1300735663);
			Class672.method11096((byte) 1);
			client.aBool11048 = false;
		    } else
			Class73.method1567("Failure", -1234800494);
		    return;
		}
		if (string.equalsIgnoreCase("tk3")) {
		    Class527.method8778(3, false, 180825913);
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub7_10733.method16935(-1807368365)
			== 3) {
			Class73.method1567("Success", -1495940666);
			Class44_Sub6.aClass534_Sub35_10989.method16438
			    ((Class44_Sub6.aClass534_Sub35_10989
			      .aClass690_Sub7_10764),
			     3, -1728016037);
			Class672.method11096((byte) 1);
			client.aBool11048 = false;
		    } else
			Class73.method1567("Failure", -1505253237);
		    return;
		}
		if (string.equalsIgnoreCase("tk5")) {
		    Class527.method8778(5, false, -386475427);
		    if (Class44_Sub6.aClass534_Sub35_10989
			    .aClass690_Sub7_10733.method16935(-1807368365)
			== 5) {
			Class73.method1567("Success", -697927403);
			Class44_Sub6.aClass534_Sub35_10989.method16438
			    ((Class44_Sub6.aClass534_Sub35_10989
			      .aClass690_Sub7_10764),
			     5, 42826720);
			Class672.method11096((byte) 1);
			client.aBool11048 = false;
		    } else
			Class73.method1567("Failure", -736192816);
		    return;
		}
		if (string.equalsIgnoreCase("clientdrop")) {
		    if (16 == client.anInt11039 * -1850530127)
			Class515.method8589(-1663178506);
		    else if (-1850530127 * client.anInt11039 == 3)
			client.aClass100_11264.aBool1198 = true;
		    return;
		}
		if (string.equalsIgnoreCase("breakcon")) {
		    Class100[] class100s = client.aClass100Array11096;
		    for (int i = 0; i < class100s.length; i++) {
			Class100 class100 = class100s[i];
			if (class100.method1867(1905513823) != null)
			    class100.method1867(1511140599)
				.method8973((byte) -25);
		    }
		    Class6.aClass450_56.method7342((byte) 6);
		    return;
		}
		if (string.startsWith("getclientvarpbit")) {
		    int i = Integer.parseInt(string.substring(17));
		    Class73.method1567(new StringBuilder().append
					   ("varpbit=").append
					   (Class78.aClass103_825.method119
					    (Class78.aClass103_825
						 .method107(i, 1504047109),
					     -1972217155))
					   .toString(),
				       -991136726);
		    return;
		}
		if (string.startsWith("getclientvarp")) {
		    int i = Integer.parseInt(string.substring(14));
		    Class73.method1567(new StringBuilder().append("varp=")
					   .append
					   (Class78.aClass103_825.method120
					    ((Class78.aClass103_825.method108
					      (Class453.aClass453_4946, i,
					       1825316753)),
					     (byte) -63))
					   .toString(),
				       -1984074283);
		    return;
		}
		if (string.startsWith("directlogin")) {
		    String[] strings
			= Class387.method6504(string.substring(12), ' ',
					      -1552945512);
		    if (strings.length == 2 || strings.length == 3) {
			if (Class202.method3865((byte) 0))
			    Class534_Sub11_Sub10.method18230(469714934);
			Class200_Sub6.method15576(strings[0], strings[1],
						  (strings.length > 2
						   ? strings[2] : ""),
						  true, 510108548);
		    }
		    return;
		}
		if (string.startsWith("snlogin ")) {
		    String[] strings = Class387.method6504(string.substring(8),
							   ' ', -1687402824);
		    int i = Integer.parseInt(strings[0]);
		    String string_58_ = strings.length > 1 ? strings[1] : "";
		    Class89.method1713(i, string_58_, true, -694654803);
		    return;
		}
		if (string.startsWith("setoutput ")) {
		    File file = new File(string.substring(10));
		    if (file.exists()) {
			file = new File(new StringBuilder().append
					    (string.substring(10)).append
					    (".").append
					    (Class250.method4604((byte) -104))
					    .append
					    (".log").toString());
			if (file.exists()) {
			    Class73.method1567("file already exists!",
					       -1183136562);
			    return;
			}
		    }
		    if (Class504.aFileOutputStream5633 != null) {
			Class504.aFileOutputStream5633.close();
			Class504.aFileOutputStream5633 = null;
		    }
		    try {
			Class504.aFileOutputStream5633
			    = new FileOutputStream(file);
		    } catch (FileNotFoundException filenotfoundexception) {
			Class73.method1567(new StringBuilder().append
					       ("Could not create ").append
					       (file.getName()).toString(),
					   -1807532022);
		    } catch (SecurityException securityexception) {
			Class73.method1567(new StringBuilder().append
					       ("Cannot write to ").append
					       (file.getName()).toString(),
					   -1594336654);
		    }
		    return;
		}
		if (string.equals("closeoutput")) {
		    if (null != Class504.aFileOutputStream5633)
			Class504.aFileOutputStream5633.close();
		    Class504.aFileOutputStream5633 = null;
		    return;
		}
		if (string.startsWith("runscript ")) {
		    File file = new File(string.substring(10));
		    if (!file.exists()) {
			Class73.method1567("No such file", -1479835656);
			return;
		    }
		    byte[] is = Class690_Sub24.method17099(file, -2040856608);
		    if (null == is) {
			Class73.method1567("Failed to read file", -1388235285);
			return;
		    }
		    String[] strings
			= Class387.method6504((Class656.method10893
					       (Class563.method9512(is,
								    (byte) 51),
						'\r', "", -188607948)),
					      '\n', -738013527);
		    Class634.method10532(strings, (byte) -70);
		}
		if (16 == -1850530127 * client.anInt11039
		    || client.anInt11039 * -1850530127 == 9) {
		    Class100 class100 = Class201.method3864(2095398292);
		    Class534_Sub19 class534_sub19
			= Class346.method6128(Class404.aClass404_4234,
					      class100.aClass13_1183,
					      1341391005);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16506(string.length() + 3, 1445975535);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16506(bool ? 1 : 0, 1396814795);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16506(bool_53_ ? 1 : 0, 2105289576);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16713(string, -96094543);
		    class100.method1863(class534_sub19, (byte) 124);
		}
	    } catch (Exception exception) {
		Class73.method1567
		    (Class58.aClass58_469.method1245(Class539.aClass672_7171,
						     (byte) -36),
		     -1913960545);
		return;
	    }
	}
	if (16 != -1850530127 * client.anInt11039
	    && -1850530127 * client.anInt11039 != 9)
	    Class73.method1567
		(new StringBuilder().append
		     (Class58.aClass58_463.method1245(Class539.aClass672_7171,
						      (byte) -101))
		     .append
		     (string).toString(),
		 -2021019513);
    }
    
    static void method2104(int i) {
	if (4 == i)
	    throw new Error();
	if (i == 19)
	    throw new OutOfMemoryError();
	try {
	    if (i == 27)
		Class247.method4592(1979721229);
	    else if (i == 14)
		Class73.method1567(new StringBuilder().append("").append
				       (1720947399 * Class498.anInt5554)
				       .toString(),
				   -1169646706);
	    else if (16 == i) {
		Class552 class552 = (client.aClass512_11100.method8424
				     ((byte) 85).aClass552_7427);
		class552.aBool7324 = !class552.aBool7324;
	    } else if (10 == i)
		client.aBool11262 = true;
	    else if (3 == i)
		client.aBool11262 = false;
	    else if (13 == i)
		client.aClass709_11212.method14283(-1107967299);
	    else if (7 == i) {
		Class171_Sub4.method15601((byte) 0);
		for (int i_59_ = 0; i_59_ < 10; i_59_++)
		    System.gc();
		Runtime runtime = Runtime.getRuntime();
		int i_60_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		Class73.method1567(new StringBuilder().append("").append
				       (i_60_).toString(),
				   -734728426);
	    } else if (i == 2) {
		Class171_Sub4.method15601((byte) 0);
		for (int i_61_ = 0; i_61_ < 10; i_61_++)
		    System.gc();
		Runtime runtime = Runtime.getRuntime();
		int i_62_
		    = (int) ((runtime.totalMemory() - runtime.freeMemory())
			     / 1024L);
		Class73.method1567(new StringBuilder().append("").append
				       (i_62_).toString(),
				   -2141929604);
		Class151.method2544((byte) 76);
		Class171_Sub4.method15601((byte) 0);
		for (int i_63_ = 0; i_63_ < 10; i_63_++)
		    System.gc();
		i_62_ = (int) ((runtime.totalMemory() - runtime.freeMemory())
			       / 1024L);
		Class73.method1567(new StringBuilder().append("").append
				       (i_62_).toString(),
				   -1045383528);
	    } else if (i == 20)
		Class73.method1567((Class632.aClass538_8269
					.method402((short) -622)
				    ? "Success" : "Failure"),
				   -1777904161);
	    else if (9 == i)
		Class685.aClass23_8698.method818((byte) -38);
	    else if (i == 22)
		Class6.aClass450_56.method7341(1971866325);
	    else if (i == 29)
		Class6.aClass450_56.method7357(11412935);
	    else if (1 == i)
		Class464.aCanvas5111.setLocation(50, 50);
	    else if (i == 15)
		Class464.aCanvas5111.setLocation((Class498.anInt5562
						  * -721302779),
						 (Class498.anInt5563
						  * -350211099));
	    else if (25 == i)
		Class55.method1213(-942762905);
	    else if (i == 26) {
		client.aClass512_11100.aLong5722
		    = Class250.method4604((byte) -72) * -7615436911730204861L;
		client.aClass512_11100.aBool5700 = true;
		Class55.method1213(449950204);
	    } else if (6 == i) {
		Class438 class438
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807
		       ().aClass438_4885);
		Class73.method1567(new StringBuilder().append
				       ((int) class438.aFloat4864 >> 9).append
				       (" ").append
				       ((int) class438.aFloat4865 >> 9)
				       .toString(),
				   -1706576991);
	    } else if (i == 11) {
		Class438 class438
		    = (Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419.method10807
		       ().aClass438_4885);
		Class73.method1567
		    (new StringBuilder().append("").append
			 (client.aClass512_11100.method8424((byte) 113)
			      .aClass151Array7432
			      [(Class322.aClass654_Sub1_Sub5_Sub1_Sub2_3419
				.aByte10854)]
			      .method2491
			  ((int) class438.aFloat4864 >> 9,
			   (int) class438.aFloat4865 >> 9, 2021925375))
			 .toString(),
		     -806909634);
	    } else if (i == 21) {
		Class73.method1567(new StringBuilder().append
				       (Class247.aClass203_2552
					    .method3879(1299465361))
				       .append
				       (" ").append
				       (Class247.aClass203_2552
					    .method3878(-1579444917))
				       .toString(),
				   -1148937887);
		Class73.method1567(new StringBuilder().append
				       (Class247.aClass203_2504
					    .method3879(595169465))
				       .append
				       (" ").append
				       (Class247.aClass203_2504
					    .method3878(-195834629))
				       .toString(),
				   -1578796340);
	    } else if (i == 17)
		Class11.method611(false, -760773427);
	    else if (8 == i) {
		client.aBool11051 = !client.aBool11051;
		Class254.aClass185_2683.method3371(client.aBool11051);
		Class227.method4183((byte) 16);
	    } else if (i == 24) {
		client.anInt11060 = 0;
		client.aClass512_11100.method8441(1716427467);
	    } else if (28 == i) {
		client.anInt11060 = -1810851633;
		client.aClass512_11100.method8441(1013768428);
	    } else if (23 == i) {
		client.anInt11060 = 673264030;
		client.aClass512_11100.method8441(1246789969);
	    }
	} catch (Exception exception) {
	    Class73.method1567
		(Class58.aClass58_469.method1245(Class539.aClass672_7171,
						 (byte) -46),
		 -1871450005);
	}
    }
    
    static void method2105() {
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub39_10782
		.method17209((short) 29724)
	    == 1)
	    Class159.aClass509_1754.method8388(new Class511((Class499
							     .aClass499_5600),
							    null),
					       1903390103);
	else {
	    client.aClass512_11100.method8441(608738147);
	    Class561.method9444((byte) -29);
	}
    }
    
    static void method2106() {
	if (Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub39_10782
		.method17209((short) -4326)
	    == 1)
	    Class159.aClass509_1754.method8388(new Class511((Class499
							     .aClass499_5600),
							    null),
					       1749427139);
	else {
	    client.aClass512_11100.method8441(1686218948);
	    Class561.method9444((byte) -79);
	}
    }
    
    static final void method2107(Class669 class669, int i) {
	int i_64_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_64_, 962115486);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_64_ >> 16];
	Class596.method9916(class247, class243, class669, (byte) 127);
    }
    
    static final void method2108(Class247 class247, Class243 class243,
				 Class669 class669, byte i) {
	class669.anInt8600 -= 926998689;
	class247.anInt2535
	    = (class669.anIntArray8595[class669.anInt8600 * 2088438307]
	       * -1503866221);
	class247.anInt2534
	    = (class669.anIntArray8595[1 + class669.anInt8600 * 2088438307]
	       * -223089737);
	class247.anInt2528
	    = (2058666005
	       * class669.anIntArray8595[class669.anInt8600 * 2088438307 + 2]);
	Class454.method7416(class247, -714981518);
    }
    
    static final void method2109(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class669.aClass352_8602.aByte3633;
    }
}
