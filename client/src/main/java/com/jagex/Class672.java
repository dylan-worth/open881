/* Class672 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.util.Locale;

public class Class672 implements Interface76
{
    public static Class672 aClass672_8620;
    public static Class672 aClass672_8621
	= new Class672("EN", "en", "English", Class665.aClass665_8561, 0,
		       "GB");
    static Class672 aClass672_8622;
    String aString8623;
    Locale aLocale8624;
    public static Class672 aClass672_8625;
    public static Class672 aClass672_8626;
    String aString8627;
    public static final int anInt8628 = 7;
    public static Class672 aClass672_8629
	= new Class672("DE", "de", "German", Class665.aClass665_8561, 1, "DE");
    public int anInt8630;
    public static Class672 aClass672_8631
	= new Class672("FR", "fr", "French", Class665.aClass665_8561, 2, "FR");
    static Class672[] aClass672Array8632;
    
    public int method93() {
	return -473969159 * anInt8630;
    }
    
    public int method53() {
	return -473969159 * anInt8630;
    }
    
    static Class163 method11076(byte[] is, int i) {
	if (is == null)
	    throw new RuntimeException("");
	Class163 class163;
	for (;;) {
	    try {
		Image image = Toolkit.getDefaultToolkit().createImage(is);
		java.awt.Container container
		    = Class171.method2880((short) -23221);
		MediaTracker mediatracker = new MediaTracker(container);
		mediatracker.addImage(image, 0);
		mediatracker.waitForAll();
		int i_0_ = image.getWidth(container);
		int i_1_ = image.getHeight(container);
		if (mediatracker.isErrorAny() || i_0_ < 0 || i_1_ < 0)
		    throw new RuntimeException("");
		int[] is_2_ = new int[i_1_ * i_0_];
		PixelGrabber pixelgrabber
		    = new PixelGrabber(image, 0, 0, i_0_, i_1_, is_2_, 0,
				       i_0_);
		pixelgrabber.grabPixels();
		class163
		    = Class254.aClass185_2683.method3317(is_2_, 0, i_0_, i_0_,
							 i_1_, (byte) -43);
		break;
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
	return class163;
    }
    
    static {
	aClass672_8620 = new Class672("PT", "pt", "Portuguese",
				      Class665.aClass665_8561, 3, "BR");
	aClass672_8622 = new Class672("NL", "nl", "Dutch",
				      Class665.aClass665_8570, 4, "NL");
	aClass672_8625 = new Class672("ES", "es", "Spanish",
				      Class665.aClass665_8570, 5, "ES");
	aClass672_8626
	    = new Class672("ES_MX", "es-mx", "Spanish (Latin American)",
			   Class665.aClass665_8561, 6, "MX");
	Class672[] class672s = method11079((byte) -72);
	aClass672Array8632 = new Class672[class672s.length];
	Class672[] class672s_3_ = class672s;
	for (int i = 0; i < class672s_3_.length; i++) {
	    Class672 class672 = class672s_3_[i];
	    if (aClass672Array8632[-473969159 * class672.anInt8630] != null)
		throw new IllegalStateException();
	    aClass672Array8632[class672.anInt8630 * -473969159] = class672;
	}
    }
    
    public Locale method11077(byte i) {
	return aLocale8624;
    }
    
    public static Class672 method11078(int i, byte i_4_) {
	if (i < 0 || i >= aClass672Array8632.length)
	    return null;
	return aClass672Array8632[i];
    }
    
    public String toString() {
	return method11082((byte) 0).toLowerCase(Locale.ENGLISH);
    }
    
    public static Class672[] method11079(byte i) {
	return new Class672[] { aClass672_8629, aClass672_8626, aClass672_8631,
				aClass672_8621, aClass672_8625, aClass672_8622,
				aClass672_8620 };
    }
    
    public int method22() {
	return -473969159 * anInt8630;
    }
    
    public String method11080() {
	return method11082((byte) 0).toLowerCase(Locale.ENGLISH);
    }
    
    static final void method11081(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub22_10745
		  .method17078(2112098914);
    }
    
    String method11082(byte i) {
	return aString8623;
    }
    
    public static Class672[] method11083() {
	return new Class672[] { aClass672_8629, aClass672_8626, aClass672_8631,
				aClass672_8621, aClass672_8625, aClass672_8622,
				aClass672_8620 };
    }
    
    Class672(String string, String string_5_, String string_6_,
	     Class665 class665, int i, String string_7_) {
	aString8627 = string;
	aString8623 = string_5_;
	anInt8630 = 1793156169 * i;
	if (string_7_ != null)
	    aLocale8624 = new Locale(string_5_.substring(0, 2), string_7_);
	else
	    aLocale8624 = new Locale(string_5_.substring(0, 2));
    }
    
    String method11084() {
	return aString8623;
    }
    
    String method11085() {
	return aString8623;
    }
    
    public Locale method11086() {
	return aLocale8624;
    }
    
    public static Class672 method11087(int i) {
	if (i < 0 || i >= aClass672Array8632.length)
	    return null;
	return aClass672Array8632[i];
    }
    
    public static Class672 method11088(int i) {
	if (i < 0 || i >= aClass672Array8632.length)
	    return null;
	return aClass672Array8632[i];
    }
    
    public static Class672 method11089(int i) {
	if (i < 0 || i >= aClass672Array8632.length)
	    return null;
	return aClass672Array8632[i];
    }
    
    public String method11090() {
	return method11082((byte) 0).toLowerCase(Locale.ENGLISH);
    }
    
    public static void method11091(int i, int i_8_, int i_9_, int i_10_,
				   int i_11_) {
	Class574.aLinkedList7701.addLast(new Class588(i, i_8_, i_9_ - i,
						      i_10_ - i_8_));
    }
    
    static void method11092(Class669 class669, int i) {
	class669.anInt8600 -= 926998689;
	if (Class682.aBool8673) {
	    Class329.method5832((class669.anIntArray8595
				 [2088438307 * class669.anInt8600]) != 0,
				837606408);
	    Class252.method4626((class669.anIntArray8595
				 [class669.anInt8600 * 2088438307 + 1]) != 0,
				-1302750409);
	    Class172.method2900(0 != (class669.anIntArray8595
				      [2 + class669.anInt8600 * 2088438307]),
				(short) 508);
	}
    }
    
    static final void method11093(Class669 class669, int i) {
	class669.anInt8594 -= -1374580330;
	String string
	    = ((String)
	       class669.anObjectArray8593[1485266147 * class669.anInt8594]);
	String string_12_ = (String) (class669.anObjectArray8593
				      [1 + class669.anInt8594 * 1485266147]);
	Class48.method1141(string, string_12_, 372619593);
    }
    
    public Locale method11094() {
	return aLocale8624;
    }
    
    static final void method11095(int i, int[] is, int i_13_) {
	if (Class180.method2978(i, is, 2112348245)) {
	    Class247[] class247s
		= Class44_Sub11.aClass243Array11006[i].aClass247Array2412;
	    for (int i_14_ = 0; i_14_ < class247s.length; i_14_++) {
		Class247 class247 = class247s[i_14_];
		if (class247 != null && null != class247.aClass711_2442)
		    class247.aClass711_2442.method14374(-1792083817);
	    }
	}
    }
    
    public static void method11096(byte i) {
	Class24 class24 = null;
	try {
	    class24
		= Class606.method10050("", client.aClass675_11016.aString8640,
				       true, 2115239633);
	    Class534_Sub40 class534_sub40
		= Class44_Sub6.aClass534_Sub35_10989.method16436(1898725416);
	    class24.method844(class534_sub40.aByteArray10810, 0,
			      31645619 * class534_sub40.anInt10811, 454464553);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (null != class24)
		class24.method832(1258946418);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    static final void method11097(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_15_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_16_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	Class90 class90 = (Class90) Class534_Sub11_Sub13
					.aClass44_Sub22_11730
					.method91(i_16_, -743857701);
	if (class90.method1718(-1810608157))
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= ((Class15)
		   Class531.aClass44_Sub7_7135.method91(i_15_, -446662187))
		      .method687(i_16_, class90.aString889, -357175264);
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= (((Class15)
		    Class531.aClass44_Sub7_7135.method91(i_15_, -1927376217))
		       .method683
		   (i_16_, class90.anInt888 * 263946597, (byte) 62));
    }
}
