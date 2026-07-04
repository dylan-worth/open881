/* Class620 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class620
{
    static Class620 aClass620_8111 = new Class620();
    int[] anIntArray8112;
    public static Class632 aClass632_8113;
    
    final void method10262() {
	for (int i = 1; i < anIntArray8112.length; i++) {
	    if (anIntArray8112[i - 1] < 0)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("Negative XP at pos:")
						       .append
						       (i - 1).toString());
	    if (anIntArray8112[i] < anIntArray8112[i - 1])
		throw new IllegalArgumentException
			  (new StringBuilder().append
			       ("XP goes backwards at pos:").append
			       (i).toString());
	}
    }
    
    Class620(int[] is) {
	if (is == null)
	    throw new NullPointerException();
	anIntArray8112 = is;
	method10263(-325218877);
    }
    
    final void method10263(int i) {
	for (int i_0_ = 1; i_0_ < anIntArray8112.length; i_0_++) {
	    if (anIntArray8112[i_0_ - 1] < 0)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("Negative XP at pos:")
						       .append
						       (i_0_ - 1).toString());
	    if (anIntArray8112[i_0_] < anIntArray8112[i_0_ - 1])
		throw new IllegalArgumentException
			  (new StringBuilder().append
			       ("XP goes backwards at pos:").append
			       (i_0_).toString());
	}
    }
    
    int method10264(int i) {
	int i_1_ = 0;
	for (int i_2_ = 0;
	     i_2_ < anIntArray8112.length && i >= anIntArray8112[i_2_]; i_2_++)
	    i_1_ = i_2_ + 1;
	return i_1_;
    }
    
    Class620() {
	anIntArray8112 = new int[120];
	int i = 0;
	for (int i_3_ = 0; i_3_ < 120; i_3_++) {
	    int i_4_ = 1 + i_3_;
	    int i_5_ = (int) ((double) i_4_
			      + 300.0 * Math.pow(2.0, (double) i_4_ / 7.0));
	    i += i_5_;
	    anIntArray8112[i_3_] = i / 4;
	}
	method10263(-2055765440);
    }
    
    int method10265(int i, int i_6_) {
	if (i < 1)
	    return 0;
	if (i > anIntArray8112.length)
	    i = anIntArray8112.length;
	return anIntArray8112[i - 1];
    }
    
    final void method10266() {
	for (int i = 1; i < anIntArray8112.length; i++) {
	    if (anIntArray8112[i - 1] < 0)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("Negative XP at pos:")
						       .append
						       (i - 1).toString());
	    if (anIntArray8112[i] < anIntArray8112[i - 1])
		throw new IllegalArgumentException
			  (new StringBuilder().append
			       ("XP goes backwards at pos:").append
			       (i).toString());
	}
    }
    
    final void method10267() {
	for (int i = 1; i < anIntArray8112.length; i++) {
	    if (anIntArray8112[i - 1] < 0)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("Negative XP at pos:")
						       .append
						       (i - 1).toString());
	    if (anIntArray8112[i] < anIntArray8112[i - 1])
		throw new IllegalArgumentException
			  (new StringBuilder().append
			       ("XP goes backwards at pos:").append
			       (i).toString());
	}
    }
    
    final void method10268() {
	for (int i = 1; i < anIntArray8112.length; i++) {
	    if (anIntArray8112[i - 1] < 0)
		throw new IllegalArgumentException(new StringBuilder().append
						       ("Negative XP at pos:")
						       .append
						       (i - 1).toString());
	    if (anIntArray8112[i] < anIntArray8112[i - 1])
		throw new IllegalArgumentException
			  (new StringBuilder().append
			       ("XP goes backwards at pos:").append
			       (i).toString());
	}
    }
    
    int method10269(int i) {
	int i_7_ = 0;
	for (int i_8_ = 0;
	     i_8_ < anIntArray8112.length && i >= anIntArray8112[i_8_]; i_8_++)
	    i_7_ = i_8_ + 1;
	return i_7_;
    }
    
    int method10270(int i, int i_9_) {
	int i_10_ = 0;
	for (int i_11_ = 0;
	     i_11_ < anIntArray8112.length && i >= anIntArray8112[i_11_];
	     i_11_++)
	    i_10_ = i_11_ + 1;
	return i_10_;
    }
    
    int method10271(int i) {
	if (i < 1)
	    return 0;
	if (i > anIntArray8112.length)
	    i = anIntArray8112.length;
	return anIntArray8112[i - 1];
    }
    
    int method10272(int i) {
	if (i < 1)
	    return 0;
	if (i > anIntArray8112.length)
	    i = anIntArray8112.length;
	return anIntArray8112[i - 1];
    }
    
    int method10273(int i) {
	if (i < 1)
	    return 0;
	if (i > anIntArray8112.length)
	    i = anIntArray8112.length;
	return anIntArray8112[i - 1];
    }
    
    public static void method10274(int i, int i_12_, float f,
				   Interface42 interface42, int i_13_) {
	if (null != Class639.aClass367_8316)
	    Class639.aClass367_8316.method6342((byte) 91)
		.method6368(i, i_12_, f, interface42, (byte) -49);
    }
    
    static void method10275(Class185 class185, int i) {
	if ((324852453 * Class72.anInt765 >= 2 || client.aBool11218)
	    && client.aClass247_11044 == null) {
	    String string;
	    if (client.aBool11218 && Class72.anInt765 * 324852453 < 2)
		string
		    = new StringBuilder().append(client.aString11221).append
			  (Class58.aClass58_461.method1245((Class539
							    .aClass672_7171),
							   (byte) -75))
			  .append
			  (client.aString11222).append
			  (" ").append
			  (Class29.aString263).toString();
	    else if (Class418.method6761(-1281875956)
		     && Class72.anInt765 * 324852453 > 2)
		string = Class21.method813(Class251.aClass534_Sub18_Sub7_2653,
					   (byte) -69);
	    else {
		Class534_Sub18_Sub7 class534_sub18_sub7
		    = Class251.aClass534_Sub18_Sub7_2653;
		if (null == class534_sub18_sub7)
		    return;
		string = Class21.method813(class534_sub18_sub7, (byte) -26);
		int[] is
		    = Class10.method607(class534_sub18_sub7, (short) 4000);
		if (is != null)
		    string = new StringBuilder().append(string).append
				 (Class44_Sub21.method17371(is, -286723380))
				 .toString();
	    }
	    if (324852453 * Class72.anInt765 > 2)
		string
		    = new StringBuilder().append(string).append
			  (Class154.method2575(16777215, -1899398644)).append
			  (" / ").append
			  (324852453 * Class72.anInt765 - 2).append
			  (Class58.aClass58_560
			       .method1245(Class539.aClass672_7171, (byte) -6))
			  .toString();
	    if (null != Class72.aClass247_774) {
		Class171 class171
		    = Class72.aClass247_774.method4555(Class351.aClass406_3620,
						       (client
							.anInterface52_11081),
						       (byte) -32);
		if (class171 == null)
		    class171 = Class231.aClass171_2325;
		class171.method2836
		    (string, 1568741337 * Class72.anInt759,
		     -1017020493 * Class72.anInt776,
		     Class72.aClass247_774.anInt2468 * -881188269,
		     Class72.aClass247_774.anInt2469 * -1279656873,
		     290091559 * Class72.aClass247_774.anInt2482,
		     2071487835 * Class72.aClass247_774.anInt2587,
		     -1049814117 * Class72.aClass247_774.anInt2535,
		     183230983 * Class72.aClass247_774.anInt2534,
		     client.aRandom11178, Class709.anInt8857,
		     client.anIntArray11287, Class658.aClass163Array8541, null,
		     (byte) 29);
		Class316.method5724(client.anIntArray11287[0],
				    client.anIntArray11287[1],
				    client.anIntArray11287[2],
				    client.anIntArray11287[3], (byte) 1);
	    }
	}
    }
}
