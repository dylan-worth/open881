/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Class315 implements Runnable
{
    Thread aThread3377;
    volatile boolean aBool3378;
    Class311[] aClass311Array3379;
    
    Class311 method5695(int i) {
	if (aClass311Array3379 == null || i < 0
	    || i >= aClass311Array3379.length)
	    return null;
	return aClass311Array3379[i];
    }
    
    Class311 method5696(int i) {
	if (aClass311Array3379 == null || i < 0
	    || i >= aClass311Array3379.length)
	    return null;
	return aClass311Array3379[i];
    }
    
    boolean method5697(byte i) {
	if (aBool3378)
	    return true;
	if (null == aThread3377) {
	    aThread3377 = new Thread(this);
	    aThread3377.start();
	}
	return aBool3378;
    }
    
    public void run() {
	try {
	    int i = Class582.method9836(client.aClass665_11211,
					Class668.aClass668_8583,
					(-1664252895
					 * Class331.aClass23_3498.anInt227),
					(short) 1077);
	    BufferedReader bufferedreader
		= (new BufferedReader
		   (new InputStreamReader
		    (new DataInputStream
		     (new URL
			  (new StringBuilder().append("http://").append
			       (Class331.aClass23_3498.aString223).append
			       (":").append
			       (i).append
			       ("/news.ws?game=").append
			       (client.aClass675_11016.anInt8642 * -1082924039)
			       .toString())
			  .openStream()))));
	    String string = bufferedreader.readLine();
	    ArrayList arraylist = new ArrayList();
	    for (/**/; null != string; string = bufferedreader.readLine())
		arraylist.add(string);
	    String[] strings = new String[arraylist.size()];
	    arraylist.toArray(strings);
	    if (strings.length % 3 != 0)
		return;
	    aClass311Array3379 = new Class311[strings.length / 3];
	    for (int i_0_ = 0; i_0_ < strings.length; i_0_ += 3)
		aClass311Array3379[i_0_ / 3]
		    = new Class311(strings[i_0_], strings[1 + i_0_],
				   strings[i_0_ + 2]);
	} catch (IOException ioexception) {
	    /* empty */
	}
	aBool3378 = true;
    }
    
    Class311 method5698(int i, int i_1_) {
	if (aClass311Array3379 == null || i < 0
	    || i >= aClass311Array3379.length)
	    return null;
	return aClass311Array3379[i];
    }
    
    public void method5699() {
	try {
	    int i = Class582.method9836(client.aClass665_11211,
					Class668.aClass668_8583,
					(-1664252895
					 * Class331.aClass23_3498.anInt227),
					(short) 1077);
	    BufferedReader bufferedreader
		= (new BufferedReader
		   (new InputStreamReader
		    (new DataInputStream
		     (new URL
			  (new StringBuilder().append("http://").append
			       (Class331.aClass23_3498.aString223).append
			       (":").append
			       (i).append
			       ("/news.ws?game=").append
			       (client.aClass675_11016.anInt8642 * -1082924039)
			       .toString())
			  .openStream()))));
	    String string = bufferedreader.readLine();
	    ArrayList arraylist = new ArrayList();
	    for (/**/; null != string; string = bufferedreader.readLine())
		arraylist.add(string);
	    String[] strings = new String[arraylist.size()];
	    arraylist.toArray(strings);
	    if (strings.length % 3 != 0)
		return;
	    aClass311Array3379 = new Class311[strings.length / 3];
	    for (int i_2_ = 0; i_2_ < strings.length; i_2_ += 3)
		aClass311Array3379[i_2_ / 3]
		    = new Class311(strings[i_2_], strings[1 + i_2_],
				   strings[i_2_ + 2]);
	} catch (IOException ioexception) {
	    /* empty */
	}
	aBool3378 = true;
    }
    
    Class311 method5700(int i) {
	if (aClass311Array3379 == null || i < 0
	    || i >= aClass311Array3379.length)
	    return null;
	return aClass311Array3379[i];
    }
    
    Class311 method5701(int i) {
	if (aClass311Array3379 == null || i < 0
	    || i >= aClass311Array3379.length)
	    return null;
	return aClass311Array3379[i];
    }
    
    Class315() {
	/* empty */
    }
    
    boolean method5702() {
	if (aBool3378)
	    return true;
	if (null == aThread3377) {
	    aThread3377 = new Thread(this);
	    aThread3377.start();
	}
	return aBool3378;
    }
    
    boolean method5703() {
	if (aBool3378)
	    return true;
	if (null == aThread3377) {
	    aThread3377 = new Thread(this);
	    aThread3377.start();
	}
	return aBool3378;
    }
    
    public void method5704() {
	try {
	    int i = Class582.method9836(client.aClass665_11211,
					Class668.aClass668_8583,
					(-1664252895
					 * Class331.aClass23_3498.anInt227),
					(short) 1077);
	    BufferedReader bufferedreader
		= (new BufferedReader
		   (new InputStreamReader
		    (new DataInputStream
		     (new URL
			  (new StringBuilder().append("http://").append
			       (Class331.aClass23_3498.aString223).append
			       (":").append
			       (i).append
			       ("/news.ws?game=").append
			       (client.aClass675_11016.anInt8642 * -1082924039)
			       .toString())
			  .openStream()))));
	    String string = bufferedreader.readLine();
	    ArrayList arraylist = new ArrayList();
	    for (/**/; null != string; string = bufferedreader.readLine())
		arraylist.add(string);
	    String[] strings = new String[arraylist.size()];
	    arraylist.toArray(strings);
	    if (strings.length % 3 != 0)
		return;
	    aClass311Array3379 = new Class311[strings.length / 3];
	    for (int i_3_ = 0; i_3_ < strings.length; i_3_ += 3)
		aClass311Array3379[i_3_ / 3]
		    = new Class311(strings[i_3_], strings[1 + i_3_],
				   strings[i_3_ + 2]);
	} catch (IOException ioexception) {
	    /* empty */
	}
	aBool3378 = true;
    }
    
    public static short method5705(int i, int i_4_) {
	int i_5_ = i >> 10 & 0x3f;
	int i_6_ = i >> 3 & 0x70;
	int i_7_ = i & 0x7f;
	i_6_ = i_7_ <= 64 ? i_6_ * i_7_ >> 7 : i_6_ * (127 - i_7_) >> 7;
	int i_8_ = i_6_ + i_7_;
	int i_9_;
	if (0 != i_8_)
	    i_9_ = (i_6_ << 8) / i_8_;
	else
	    i_9_ = i_6_ << 1;
	int i_10_ = i_8_;
	return (short) (i_5_ << 10 | i_9_ >> 4 << 7 | i_10_);
    }
    
    static Class200 method5706(Class534_Sub40 class534_sub40, byte i) {
	int i_11_ = class534_sub40.method16527(69496588);
	Class88 class88 = Class225.method4174(i_11_, -2114474609);
	Class200 class200 = null;
	switch (-1763082495 * class88.anInt860) {
	case 26:
	    class200 = new Class200_Sub4(class534_sub40);
	    break;
	case 6:
	    class200 = new Class200_Sub9(class534_sub40);
	    break;
	case 9:
	    class200 = new Class200_Sub3(class534_sub40);
	    break;
	case 1:
	    class200 = new Class200_Sub21(class534_sub40);
	    break;
	case 23:
	    class200 = new Class200_Sub20(class534_sub40);
	    break;
	case 12:
	    class200 = new Class200_Sub10(class534_sub40);
	    break;
	default:
	    break;
	case 2:
	    class200 = new Class200_Sub12_Sub2(class534_sub40);
	    break;
	case 17:
	    class200 = new Class200_Sub18(class534_sub40);
	    break;
	case 27:
	    class200 = new Class200_Sub6(class534_sub40);
	    break;
	case 20:
	    class200 = new Class200_Sub15(class534_sub40);
	    break;
	case 21:
	    class200 = new Class200_Sub14(class534_sub40);
	    break;
	case 18:
	    class200 = new Class200_Sub19(class534_sub40);
	    break;
	case 24:
	    class200 = new Class200_Sub8(class534_sub40);
	    break;
	case 14:
	    class200 = new Class200_Sub11(class534_sub40);
	    break;
	case 7:
	    class200 = new Class200_Sub1(class534_sub40);
	    break;
	case 4:
	    class200 = new Class200_Sub23(class534_sub40, 1, 1);
	    break;
	case 10:
	    class200 = new Class200_Sub7(class534_sub40);
	    break;
	case 8:
	    class200 = new Class200_Sub16(class534_sub40);
	    break;
	case 11:
	    class200 = new Class200_Sub13(class534_sub40, true);
	    break;
	case 5:
	    class200 = new Class200_Sub23(class534_sub40, 0, 0);
	    break;
	case 29:
	    class200 = new Class200_Sub13(class534_sub40, false);
	    break;
	case 16:
	    class200 = new Class200_Sub23(class534_sub40, 1, 0);
	    break;
	case 22:
	    class200 = new Class200_Sub2(class534_sub40);
	    break;
	case 3:
	    class200 = new Class200_Sub23(class534_sub40, 0, 1);
	    break;
	case 28:
	    class200 = new Class200_Sub22(class534_sub40);
	    break;
	case 13:
	    class200 = new Class200_Sub12_Sub1(class534_sub40);
	    break;
	case 15:
	    class200 = new Class200_Sub5(class534_sub40);
	    break;
	case 30:
	    class200 = new Class200_Sub17(class534_sub40);
	}
	return class200;
    }
}
