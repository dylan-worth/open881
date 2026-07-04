/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class291 implements Interface33
{
    Interface32[] anInterface32Array3111;
    static Class203 aClass203_3112;
    Class82 aClass82_3113;
    static byte[] aByteArray3114
	= { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6,
	    14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17,
	    94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41,
	    25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3,
	    67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112,
	    33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70,
	    -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24,
	    89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31,
	    97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97,
	    101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56,
	    -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51,
	    -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24,
	    53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42,
	    -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22,
	    26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110,
	    -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41,
	    -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85,
	    -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109,
	    -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87,
	    109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56,
	    -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82,
	    -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27,
	    -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2,
	    98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123,
	    -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86,
	    69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17,
	    -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116,
	    -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50,
	    99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2,
	    -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49,
	    127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };
    int anInt3115;
    int anInt3116;
    Class185 aClass185_3117;
    boolean aBool3118;
    
    public static Class163 method5286(Class472 class472, int i) {
	Class163 class163 = (Class163) aClass203_3112.method3871((long) i);
	if (null == class163) {
	    if (Class223.aBool2315)
		class163
		    = Class254.aClass185_2683
			  .method3279(Class178.method2945(class472, i), true);
	    else
		class163
		    = Class672.method11076(class472.method7738(i, (byte) -26),
					   -42472799);
	    aClass203_3112.method3893(class163, (long) i);
	}
	return class163;
    }
    
    public void method210(byte i) {
	if (aClass185_3117 != Class254.aClass185_2683) {
	    aClass185_3117 = Class254.aClass185_2683;
	    aBool3118 = true;
	}
	aClass185_3117.method3340(3, 0);
	Interface32[] interface32s = anInterface32Array3111;
	for (int i_0_ = 0; i_0_ < interface32s.length; i_0_++) {
	    Interface32 interface32 = interface32s[i_0_];
	    if (null != interface32)
		interface32.method201((short) -27953);
	}
    }
    
    public void method216(boolean bool, short i) {
	bool = true;
	Interface32[] interface32s = anInterface32Array3111;
	for (int i_1_ = 0; i_1_ < interface32s.length; i_1_++) {
	    Interface32 interface32 = interface32s[i_1_];
	    if (interface32 != null)
		interface32.method205(bool || aBool3118, (byte) -100);
	}
	aBool3118 = false;
    }
    
    public int method217(byte i) {
	int i_2_ = 0;
	Interface32[] interface32s = anInterface32Array3111;
	for (int i_3_ = 0; i_3_ < interface32s.length; i_3_++) {
	    Interface32 interface32 = interface32s[i_3_];
	    if (null == interface32 || interface32.method199(-451070652))
		i_2_++;
	}
	return 100 * i_2_ / anInterface32Array3111.length;
    }
    
    public boolean method220(long l) {
	return (Class250.method4604((byte) -90)
		>= l + (long) (anInt3115 * -1168889163));
    }
    
    public void method215() {
	/* empty */
    }
    
    public int method24(int i) {
	return 996006613 * anInt3116;
    }
    
    public static Class163 method5287(Class472 class472, int i) {
	Class163 class163 = (Class163) aClass203_3112.method3871((long) i);
	if (null == class163) {
	    if (Class223.aBool2315)
		class163
		    = Class254.aClass185_2683
			  .method3279(Class178.method2945(class472, i), true);
	    else
		class163
		    = Class672.method11076(class472.method7738(i, (byte) -25),
					   -1610633137);
	    aClass203_3112.method3893(class163, (long) i);
	}
	return class163;
    }
    
    public void method214(boolean bool) {
	bool = true;
	Interface32[] interface32s = anInterface32Array3111;
	for (int i = 0; i < interface32s.length; i++) {
	    Interface32 interface32 = interface32s[i];
	    if (interface32 != null)
		interface32.method205(bool || aBool3118, (byte) -21);
	}
	aBool3118 = false;
    }
    
    public void method44() {
	/* empty */
    }
    
    Class291(Class82 class82, int i, int i_4_, Class313 class313) {
	aClass82_3113 = class82;
	anInt3115 = i * 762901405;
	anInt3116 = 362974845 * i_4_;
	anInterface32Array3111
	    = new Interface32[aClass82_3113.anInterface47Array835.length];
	for (int i_5_ = 0; i_5_ < anInterface32Array3111.length; i_5_++)
	    anInterface32Array3111[i_5_]
		= class313.method5683((aClass82_3113.anInterface47Array835
				       [i_5_]),
				      -1415559685);
    }
    
    static boolean method5288() {
	boolean bool;
	try {
	    Class80 class80 = new Class80();
	    byte[] is = class80.method1624(aByteArray3114, -269784831);
	    Class672.method11076(is, -1436499213);
	    bool = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool;
    }
    
    static {
	aClass203_3112 = new Class203(128, 4);
    }
    
    public void method209() {
	if (aClass185_3117 != Class254.aClass185_2683) {
	    aClass185_3117 = Class254.aClass185_2683;
	    aBool3118 = true;
	}
	aClass185_3117.method3340(3, 0);
	Interface32[] interface32s = anInterface32Array3111;
	for (int i = 0; i < interface32s.length; i++) {
	    Interface32 interface32 = interface32s[i];
	    if (null != interface32)
		interface32.method201((short) -32743);
	}
    }
    
    static boolean method5289() {
	boolean bool;
	try {
	    Class80 class80 = new Class80();
	    byte[] is = class80.method1624(aByteArray3114, 936830974);
	    Class672.method11076(is, -1016666776);
	    bool = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool;
    }
    
    public boolean method219(long l) {
	return (Class250.method4604((byte) -63)
		>= l + (long) (anInt3115 * -1168889163));
    }
    
    public void method218(byte i) {
	/* empty */
    }
    
    public boolean method221(long l) {
	return (Class250.method4604((byte) -69)
		>= l + (long) (anInt3115 * -1168889163));
    }
    
    public boolean method213(long l) {
	return (Class250.method4604((byte) -2)
		>= l + (long) (anInt3115 * -1168889163));
    }
    
    public int method223() {
	return 996006613 * anInt3116;
    }
    
    public int method224() {
	return 996006613 * anInt3116;
    }
    
    public int method225() {
	return 996006613 * anInt3116;
    }
    
    static boolean method5290() {
	boolean bool;
	try {
	    Class80 class80 = new Class80();
	    byte[] is = class80.method1624(aByteArray3114, -248263329);
	    Class672.method11076(is, -908691724);
	    bool = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool;
    }
    
    static void method5291() {
	aClass203_3112.method3877(-1069171261);
    }
    
    static void method5292() {
	aClass203_3112.method3877(475638599);
    }
    
    public int method211() {
	int i = 0;
	Interface32[] interface32s = anInterface32Array3111;
	for (int i_6_ = 0; i_6_ < interface32s.length; i_6_++) {
	    Interface32 interface32 = interface32s[i_6_];
	    if (null == interface32 || interface32.method199(-388423889))
		i++;
	}
	return 100 * i / anInterface32Array3111.length;
    }
    
    public void method159() {
	/* empty */
    }
    
    public int method222() {
	return 996006613 * anInt3116;
    }
    
    static void method5293() {
	aClass203_3112.method3877(1868267636);
    }
    
    static boolean method5294() {
	boolean bool;
	try {
	    Class80 class80 = new Class80();
	    byte[] is = class80.method1624(aByteArray3114, -1556879600);
	    Class672.method11076(is, -389304801);
	    bool = true;
	} catch (Exception exception) {
	    return false;
	}
	return bool;
    }
    
    public void method212() {
	/* empty */
    }
    
    static Class163 method5295(byte[] is) {
	if (is == null)
	    throw new RuntimeException("");
	Class163 class163;
	for (;;) {
	    try {
		Image image = Toolkit.getDefaultToolkit().createImage(is);
		java.awt.Container container
		    = Class171.method2880((short) -4496);
		MediaTracker mediatracker = new MediaTracker(container);
		mediatracker.addImage(image, 0);
		mediatracker.waitForAll();
		int i = image.getWidth(container);
		int i_7_ = image.getHeight(container);
		if (mediatracker.isErrorAny() || i < 0 || i_7_ < 0)
		    throw new RuntimeException("");
		int[] is_8_ = new int[i_7_ * i];
		PixelGrabber pixelgrabber
		    = new PixelGrabber(image, 0, 0, i, i_7_, is_8_, 0, i);
		pixelgrabber.grabPixels();
		class163 = Class254.aClass185_2683.method3317(is_8_, 0, i, i,
							      i_7_, (byte) -2);
		break;
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
	return class163;
    }
    
    static Class163 method5296(byte[] is) {
	if (is == null)
	    throw new RuntimeException("");
	Class163 class163;
	for (;;) {
	    try {
		Image image = Toolkit.getDefaultToolkit().createImage(is);
		java.awt.Container container
		    = Class171.method2880((short) 13300);
		MediaTracker mediatracker = new MediaTracker(container);
		mediatracker.addImage(image, 0);
		mediatracker.waitForAll();
		int i = image.getWidth(container);
		int i_9_ = image.getHeight(container);
		if (mediatracker.isErrorAny() || i < 0 || i_9_ < 0)
		    throw new RuntimeException("");
		int[] is_10_ = new int[i_9_ * i];
		PixelGrabber pixelgrabber
		    = new PixelGrabber(image, 0, 0, i, i_9_, is_10_, 0, i);
		pixelgrabber.grabPixels();
		class163
		    = Class254.aClass185_2683.method3317(is_10_, 0, i, i, i_9_,
							 (byte) -106);
		break;
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	}
	return class163;
    }
    
    static boolean method5297(Class185 class185, Class534_Sub29 class534_sub29,
			      Class272 class272, int i, int i_11_, int i_12_) {
	if (Class554_Sub1.aBool7380 && !client.aBool11157
	    && !Class554_Sub1.method9193((1412374331
					  * class534_sub29.anInt10655),
					 (-958626707
					  * class534_sub29.anInt10653)))
	    return false;
	if (null != class272.anIntArray2981) {
	    class272 = class272.method5052(Class554_Sub1.anInterface18_7352,
					   Class554_Sub1.anInterface20_7351,
					   -328495295);
	    if (class272 == null)
		return false;
	}
	int i_13_ = 2147483647;
	int i_14_ = -2147483648;
	int i_15_ = 2147483647;
	int i_16_ = -2147483648;
	if (class272.anIntArray2992 != null) {
	    i_13_ = (((class534_sub29.anInt10655 * 1412374331
		       + 1863424643 * class272.anInt2993
		       - Class554_Sub1.anInt7406)
		      * (Class554_Sub1.anInt7412 - Class554_Sub1.anInt7410)
		      / (Class554_Sub1.anInt7381 - Class554_Sub1.anInt7406))
		     + Class554_Sub1.anInt7410);
	    i_14_ = (((1412374331 * class534_sub29.anInt10655
		       + class272.anInt3005 * -321707117
		       - Class554_Sub1.anInt7406)
		      * (Class554_Sub1.anInt7412 - Class554_Sub1.anInt7410)
		      / (Class554_Sub1.anInt7381 - Class554_Sub1.anInt7406))
		     + Class554_Sub1.anInt7410);
	    i_16_
		= (Class554_Sub1.anInt7378
		   - ((Class554_Sub1.anInt7378 - Class554_Sub1.anInt7411)
		      * (-958626707 * class534_sub29.anInt10653
			 + class272.anInt2989 * 148212907
			 - Class554_Sub1.anInt7408)
		      / (Class554_Sub1.anInt7407 - Class554_Sub1.anInt7408)));
	    i_15_
		= (Class554_Sub1.anInt7378
		   - ((Class554_Sub1.anInt7378 - Class554_Sub1.anInt7411)
		      * (-967887583 * class272.anInt2996
			 + -958626707 * class534_sub29.anInt10653
			 - Class554_Sub1.anInt7408)
		      / (Class554_Sub1.anInt7407 - Class554_Sub1.anInt7408)));
	}
	Class163 class163 = null;
	int i_17_ = 0;
	int i_18_ = 0;
	int i_19_ = 0;
	int i_20_ = 0;
	if (-1 != 1747122653 * class272.anInt2967) {
	    if (class534_sub29.aBool10656
		&& -1 != 1755773887 * class272.anInt2968)
		class163 = class272.method5047(class185, true, -598375958);
	    else
		class163 = class272.method5047(class185, false, 1564466913);
	    if (class163 != null) {
		switch (class272.aClass284_3003.anInt3069 * -1448550931) {
		case 1:
		    i_17_ = (class534_sub29.anInt10654 * 2139882933
			     - (class163.method22() + 1 >> 1));
		    i_18_ = (class534_sub29.anInt10654 * 2139882933
			     + (class163.method22() + 1 >> 1));
		    break;
		case 0:
		    i_17_ = (class534_sub29.anInt10654 * 2139882933
			     - class163.method22());
		    i_18_ = class534_sub29.anInt10654 * 2139882933;
		    break;
		case 2:
		    i_17_ = 2139882933 * class534_sub29.anInt10654;
		    i_18_ = (2139882933 * class534_sub29.anInt10654
			     + class163.method22());
		    break;
		}
		switch (class272.aClass280_3004.anInt3057 * -1863758235) {
		case 1:
		    i_19_ = class534_sub29.anInt10651 * 917865515;
		    i_20_ = (917865515 * class534_sub29.anInt10651
			     + class163.method2692());
		    break;
		case 0:
		    i_19_ = (class534_sub29.anInt10651 * 917865515
			     - class163.method2692());
		    i_20_ = 917865515 * class534_sub29.anInt10651;
		    break;
		case 2:
		    i_19_ = (917865515 * class534_sub29.anInt10651
			     - (class163.method2692() + 1 >> 1));
		    i_20_ = (917865515 * class534_sub29.anInt10651
			     + (class163.method2692() + 1 >> 1));
		    break;
		}
		if (i_17_ < i_13_)
		    i_13_ = i_17_;
		if (i_18_ > i_14_)
		    i_14_ = i_18_;
		if (i_19_ < i_15_)
		    i_15_ = i_19_;
		if (i_20_ > i_16_)
		    i_16_ = i_20_;
	    }
	}
	Class163 class163_21_ = null;
	if (class272.anInt2988 * 1339524825 != -1)
	    class163_21_ = class272.method5049(class185, -2136356529);
	int i_22_ = 0;
	int i_23_ = 0;
	int i_24_ = 0;
	int i_25_ = 0;
	int i_26_ = 0;
	int i_27_ = 0;
	int i_28_ = 0;
	int i_29_ = 0;
	if (class272.aString2969 != null) {
	    Class267.method4872(class272.anInt2985 * 638004337, (byte) 15);
	    if (Class582.aClass171_7771 != null) {
		i_29_ = Class236.aClass16_2373.method737(class272.aString2969,
							 (1771907305
							  * (Class706_Sub4
							     .anInt10994)),
							 0, null, 2112849964);
		i_24_ = Class236.aClass16_2373.method747(class272.aString2969,
							 ((Class706_Sub4
							   .anInt10994)
							  * 1771907305),
							 null, 1865529836);
		i_22_ = (class534_sub29.anInt10654 * 2139882933 - i_24_ / 2
			 + ((Class554_Sub1.anInt7412 - Class554_Sub1.anInt7410)
			    * (class272.anInt3001 * -614049423)
			    / (Class554_Sub1.anInt7381
			       - Class554_Sub1.anInt7406)));
		i_23_
		    = (class534_sub29.anInt10651 * 917865515
		       - (364305451 * class272.anInt2972
			  * (Class554_Sub1.anInt7378 - Class554_Sub1.anInt7411)
			  / (Class554_Sub1.anInt7407
			     - Class554_Sub1.anInt7408)));
		if (null == class163)
		    i_23_ -= i_29_ / 2;
		else
		    i_23_ -= (class163.method2692() >> 1) + i_29_;
		i_25_ = i + i_22_;
		if (i_25_ < i_13_)
		    i_13_ = i_25_;
		i_26_ = i + (i_22_ + i_24_);
		if (i_26_ > i_14_)
		    i_14_ = i_26_;
		i_27_ = i_23_ + i_11_;
		if (i_27_ < i_15_)
		    i_15_ = i_27_;
		i_28_ = i_23_ + i_29_ + i_11_;
		if (i_28_ > i_16_)
		    i_16_ = i_28_;
	    }
	}
	if (i_14_ < Class554_Sub1.anInt7410 || i_13_ > Class554_Sub1.anInt7412
	    || i_16_ < Class554_Sub1.anInt7411
	    || i_15_ > Class554_Sub1.anInt7378)
	    return true;
	Class554_Sub1.method9135(class185, class534_sub29, class272);
	if (class163 != null) {
	    int i_30_ = 0;
	    int i_31_ = 0;
	    int i_32_ = 0;
	    int i_33_ = 0;
	    int i_34_ = 0;
	    int i_35_ = 0;
	    switch (class272.aClass284_3003.anInt3069 * -1448550931) {
	    case 2:
		i_31_ = -(class163.method2647() + 1) / 2;
		break;
	    case 0:
		i_30_ = class163.method2647();
		i_31_ = (class163.method2647() + 1) / 2;
		i_32_ = class163.method22();
		break;
	    case 1:
		i_30_ = class163.method2647() / 2;
		i_32_ = class163.method22() >> 1;
		break;
	    }
	    switch (class272.aClass280_3004.anInt3057 * -1863758235) {
	    case 1:
		i_34_ = -(class163.method2647() + 1) / 2;
		break;
	    case 0:
		i_33_ = class163.method2647();
		i_34_ = (class163.method2647() + 1) / 2;
		i_35_ = class163.method2692();
		break;
	    case 2:
		i_33_ = class163.method2647() / 2;
		i_35_ = class163.method2692() >> 1;
		break;
	    }
	    Class25 class25
		= (Class25) (Class554_Sub1.aHashMap10682.get
			     (Integer.valueOf(1592054281
					      * class534_sub29.anInt10652)));
	    if (null == class25)
		class25 = (Class25) (Class554_Sub1.aHashMap10681.get
				     (Integer.valueOf(-15128681
						      * class272.anInt2977)));
	    if (null != class25 && class272.anInt2988 * 1339524825 == -1) {
		int i_36_;
		if (-959968621 * class25.anInt231
		    > 2135626771 * Class554_Sub1.anInt10691 / 2)
		    i_36_ = ((-876019987 * Class554_Sub1.anInt10691
			      - class25.anInt231 * 21137517)
			     / (2135626771 * Class554_Sub1.anInt10691));
		else
		    i_36_ = (class25.anInt231 * 21137517
			     / (2135626771 * Class554_Sub1.anInt10691));
		int i_37_ = i_36_ << 24 | 0xffff00;
		if (class185 instanceof Class185_Sub1) {
		    class185.method3292((class534_sub29.anInt10654 * 2139882933
					 - i_30_ - 7),
					(917865515 * class534_sub29.anInt10651
					 - i_33_ - 7),
					class163.method2647() + 14,
					class163.method2647() + 14, i_37_,
					-1674431818);
		    class185.method3292((2139882933 * class534_sub29.anInt10654
					 - i_30_ - 5),
					(class534_sub29.anInt10651 * 917865515
					 - i_33_ - 5),
					class163.method2647() + 10,
					class163.method2647() + 10, i_37_,
					-2144814720);
		    class185.method3292((2139882933 * class534_sub29.anInt10654
					 - i_30_ - 3),
					(class534_sub29.anInt10651 * 917865515
					 - i_33_ - 3),
					class163.method2647() + 6,
					class163.method2647() + 6, i_37_,
					-1807337945);
		    class185.method3292((2139882933 * class534_sub29.anInt10654
					 - i_30_ - 1),
					(class534_sub29.anInt10651 * 917865515
					 - i_33_ - 1),
					class163.method2647() + 2,
					class163.method2647() + 2, i_37_,
					-1967828470);
		    class185.method3292((class534_sub29.anInt10654 * 2139882933
					 - i_30_),
					(917865515 * class534_sub29.anInt10651
					 - i_33_),
					class163.method2647(),
					class163.method2647(), i_37_,
					-1538572225);
		} else {
		    class185.method3293((class534_sub29.anInt10654 * 2139882933
					 - i_31_),
					(917865515 * class534_sub29.anInt10651
					 - i_34_),
					class163.method2647() / 2 + 7, i_37_,
					(byte) -4);
		    class185.method3293((class534_sub29.anInt10654 * 2139882933
					 - i_31_),
					(0 != (class534_sub29.anInt10651
					       * 917865515) - i_34_ - i_34_
					 ? 1 : 0),
					class163.method2647() / 2 + 5, i_37_,
					(byte) 71);
		    class185.method3293((class534_sub29.anInt10654 * 2139882933
					 - i_31_),
					(0 != (class534_sub29.anInt10651
					       * 917865515) - i_34_ - i_34_
					 ? 1 : 0),
					class163.method2647() / 2 + 3, i_37_,
					(byte) -113);
		    class185.method3293((2139882933 * class534_sub29.anInt10654
					 - i_31_),
					(0 != (class534_sub29.anInt10651
					       * 917865515) - i_34_ - i_34_
					 ? 1 : 0),
					class163.method2647() / 2 + 1, i_37_,
					(byte) 27);
		    class185.method3293((class534_sub29.anInt10654 * 2139882933
					 - i_31_),
					0 != ((917865515
					       * class534_sub29.anInt10651)
					      - i_34_ - i_34_) ? 1 : 0,
					class163.method2647() / 2, i_37_,
					(byte) -52);
		}
	    }
	    class163.method2656(2139882933 * class534_sub29.anInt10654 - i_32_,
				917865515 * class534_sub29.anInt10651 - i_35_);
	    int i_38_ = 0;
	    int i_39_ = 0;
	    if (null != class25 && null != class163_21_) {
		switch (class272.aClass284_3003.anInt3069 * -1448550931) {
		case 0:
		    break;
		case 1:
		    i_38_ = class163_21_.method22() >> 1;
		    break;
		case 2:
		    i_38_ = class163_21_.method22();
		    break;
		}
		switch (-1863758235 * class272.aClass280_3004.anInt3057) {
		case 1:
		    break;
		case 0:
		    i_39_ = (class163_21_.method2692()
			     + class163.method2692()) / 2;
		    break;
		case 2:
		    i_39_ = (class163_21_.method2692() / 2
			     + class163.method2692()) / 2;
		    break;
		}
		int i_40_;
		if (class25.anInt231 * -959968621
		    > 2135626771 * Class554_Sub1.anInt10691 / 2)
		    i_40_ = ((-876019987 * Class554_Sub1.anInt10691
			      - 21137517 * class25.anInt231)
			     / (Class554_Sub1.anInt10691 * 2135626771));
		else
		    i_40_ = (class25.anInt231 * 21137517
			     / (Class554_Sub1.anInt10691 * 2135626771));
		int i_41_ = i_40_ << 24 | 0xffff00;
		class163_21_.method2657((2139882933 * class534_sub29.anInt10654
					 - i_38_),
					(class534_sub29.anInt10651 * 917865515
					 - i_39_),
					0, i_41_, 1);
	    }
	}
	if (null != class272.aString2969 && Class582.aClass171_7771 != null)
	    Class39.method982(class185, class534_sub29, class272, i_22_, i_23_,
			      i_29_, i_24_, -2130081148);
	if (1747122653 * class272.anInt2967 != -1
	    || class272.aString2969 != null) {
	    Class534_Sub20 class534_sub20 = new Class534_Sub20(class534_sub29);
	    class534_sub20.anInt10520 = -773567207 * i_17_;
	    class534_sub20.anInt10522 = i_18_ * -1946346005;
	    class534_sub20.anInt10519 = i_19_ * -1190860309;
	    class534_sub20.anInt10518 = -1010377381 * i_20_;
	    class534_sub20.anInt10521 = 869904827 * i_25_;
	    class534_sub20.anInt10517 = -536426739 * i_26_;
	    class534_sub20.anInt10523 = i_27_ * -2069055837;
	    class534_sub20.anInt10524 = i_28_ * -1973105707;
	    Class615.aClass700_8055.method14131(class534_sub20, (short) 789);
	}
	return false;
    }
    
    static final void method5298(Class669 class669, int i) {
	int i_42_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (i_42_ != Class44_Sub6.aClass534_Sub35_10989
			 .aClass690_Sub30_10739.method17143(-1569503751)) {
	    Class44_Sub6.aClass534_Sub35_10989.method16438
		(Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub30_10739,
		 i_42_, -2001267135);
	    Class672.method11096((byte) 1);
	    client.aBool11048 = false;
	    client.aClass512_11100.method8441(-283890427);
	}
    }
}
