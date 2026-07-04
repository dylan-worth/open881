/* Class403 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Desktop;
import java.net.URI;

public class Class403
{
    public static Class403 aClass403_4139;
    public static Class403 aClass403_4140 = new Class403(3);
    public static Class403 aClass403_4141;
    public static Class403 aClass403_4142;
    public static Class403 aClass403_4143;
    public static Class403 aClass403_4144;
    public static Class403 aClass403_4145;
    public static Class403 aClass403_4146;
    public static Class403 aClass403_4147;
    public static Class403 aClass403_4148;
    public static Class403 aClass403_4149;
    static Class403 aClass403_4150;
    static Class403 aClass403_4151;
    int anInt4152;
    
    public void method6596(Object[] objects, byte i) {
	try {
	    method6604(objects, -1763485341);
	} catch (Throwable throwable) {
	    /* empty */
	}
    }
    
    public String method6597(int i) {
	return new StringBuilder().append("_").append
		   (anInt4152 * 463409257).toString();
    }
    
    public Object method6598(Object[] objects) throws Throwable {
	return Class31.method890(Class305.anApplet3271, method6597(1288207515),
				 objects, -441928345);
    }
    
    public Object method6599() throws Throwable {
	return Class31.method887(Class305.anApplet3271, method6597(1074110379),
				 747231850);
    }
    
    public Object method6600(byte i) throws Throwable {
	return Class31.method887(Class305.anApplet3271, method6597(60978838),
				 -318758566);
    }
    
    public void method6601(int i) {
	try {
	    method6600((byte) 0);
	} catch (Throwable throwable) {
	    /* empty */
	}
    }
    
    static {
	aClass403_4139 = new Class403(9);
	aClass403_4141 = new Class403(1);
	aClass403_4142 = new Class403(5);
	aClass403_4143 = new Class403(13);
	aClass403_4144 = new Class403(2);
	aClass403_4145 = new Class403(4);
	aClass403_4148 = new Class403(7);
	aClass403_4147 = new Class403(8);
	aClass403_4149 = new Class403(6);
	aClass403_4146 = new Class403(12);
	aClass403_4150 = new Class403(11);
	aClass403_4151 = new Class403(10);
    }
    
    Class403(int i) {
	anInt4152 = 602898393 * i;
    }
    
    public Object method6602(Object[] objects) throws Throwable {
	return Class31.method890(Class305.anApplet3271,
				 method6597(-1783830908), objects, -441928345);
    }
    
    public String method6603() {
	return new StringBuilder().append("_").append
		   (anInt4152 * 463409257).toString();
    }
    
    public Object method6604(Object[] objects, int i) throws Throwable {
	return Class31.method890(Class305.anApplet3271,
				 method6597(-1871496771), objects, -441928345);
    }
    
    public Object method6605(Object[] objects) throws Throwable {
	return Class31.method890(Class305.anApplet3271, method6597(-107500493),
				 objects, -441928345);
    }
    
    public Object method6606() throws Throwable {
	return Class31.method887(Class305.anApplet3271, method6597(370636326),
				 -935994305);
    }
    
    public Object method6607() throws Throwable {
	return Class31.method887(Class305.anApplet3271, method6597(797609808),
				 -178210943);
    }
    
    public Object method6608() throws Throwable {
	return Class31.method887(Class305.anApplet3271, method6597(693893855),
				 453566525);
    }
    
    public void method6609(Object[] objects) {
	try {
	    method6604(objects, -1543757382);
	} catch (Throwable throwable) {
	    /* empty */
	}
    }
    
    public void method6610() {
	try {
	    method6600((byte) 0);
	} catch (Throwable throwable) {
	    /* empty */
	}
    }
    
    public static void method6611(String string, boolean bool,
				  String string_0_, boolean bool_1_, int i) {
	if (bool) {
	    do {
		if (!bool_1_ && Desktop.isDesktopSupported()
		    && Desktop.getDesktop()
			   .isSupported(Desktop.Action.BROWSE)) {
		    try {
			Desktop.getDesktop().browse(new URI(string));
		    } catch (Exception exception) {
			break;
		    }
		    return;
		}
	    } while (false);
	    if (Class519.aString7051.startsWith("win") && !bool_1_)
		Class452.method7390(string, 0, (byte) 55);
	    else if (Class519.aString7051.startsWith("mac"))
		Class215.method4106(string, 1, string_0_, (byte) 56);
	    else
		Class452.method7390(string, 2, (byte) 83);
	} else
	    Class452.method7390(string, 3, (byte) 57);
    }
    
    static void method6612(Class669 class669, int i) {
	Class273 class273
	    = ((Class273)
	       Class223.aClass53_Sub2_2316.method91((class669.anIntArray8595
						     [((class669.anInt8600
							-= 308999563)
						       * 2088438307)]),
						    -1488604756));
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (class273.anIntArrayArray3023 == null ? 0
	       : class273.anIntArrayArray3023.length);
    }
    
    static final void method6613(Class669 class669, short i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class534_Sub20.method16195(class247, class243, true, 0, class669,
				   -24586159);
    }
    
    static final void method6614(Class669 class669, int i) {
	int i_2_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (null == Class44_Sub11.aClass243Array11006[i_2_])
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= 0;
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= (Class44_Sub11.aClass243Array11006[i_2_]
		   .aClass247Array2412).length;
    }
    
    public static int method6615(CharSequence charsequence, int i) {
	int i_3_ = charsequence.length();
	int i_4_ = 0;
	for (int i_5_ = 0; i_5_ < i_3_; i_5_++)
	    i_4_ = ((i_4_ << 5) - i_4_
		    + Class542.method8950(charsequence.charAt(i_5_),
					  1292667227));
	return i_4_;
    }
    
    static final void method6616(Class534_Sub4 class534_sub4, boolean bool,
				 int i) {
	if (class534_sub4.aBool10407) {
	    if (class534_sub4.anInt10395 * 311151295 < 0
		|| (Class690_Sub29.method17139
		    (client.aClass512_11100.method8428(-1486655428),
		     class534_sub4.anInt10395 * 311151295,
		     665019215 * class534_sub4.anInt10401, (byte) 7))) {
		if (!bool)
		    Class567.method9567(-511427777 * class534_sub4.anInt10402,
					class534_sub4.anInt10405 * -1831835741,
					class534_sub4.anInt10397 * -1522052283,
					class534_sub4.anInt10400 * -1246362377,
					311151295 * class534_sub4.anInt10395,
					class534_sub4.anInt10396 * 352976243,
					665019215 * class534_sub4.anInt10401,
					-1, 0, (byte) 1);
		else
		    Class281_Sub1.method15657
			(-511427777 * class534_sub4.anInt10402,
			 class534_sub4.anInt10405 * -1831835741,
			 class534_sub4.anInt10397 * -1522052283,
			 class534_sub4.anInt10400 * -1246362377, null,
			 -636837924);
		class534_sub4.method8892((byte) 1);
	    }
	} else if (class534_sub4.aBool10406
		   && class534_sub4.anInt10397 * -1522052283 >= 1
		   && class534_sub4.anInt10400 * -1246362377 >= 1
		   && (class534_sub4.anInt10397 * -1522052283
		       <= client.aClass512_11100.method8417(1014180433) - 2)
		   && (class534_sub4.anInt10400 * -1246362377
		       <= client.aClass512_11100.method8418(-1533611049) - 2)
		   && (class534_sub4.anInt10398 * -1375582077 < 0
		       || (Class690_Sub29.method17139
			   (client.aClass512_11100.method8428(-1486655428),
			    class534_sub4.anInt10398 * -1375582077,
			    -1945323711 * class534_sub4.anInt10404,
			    (byte) -108)))) {
	    if (!bool)
		Class567.method9567(class534_sub4.anInt10402 * -511427777,
				    class534_sub4.anInt10405 * -1831835741,
				    class534_sub4.anInt10397 * -1522052283,
				    class534_sub4.anInt10400 * -1246362377,
				    class534_sub4.anInt10398 * -1375582077,
				    class534_sub4.anInt10403 * 220446523,
				    -1945323711 * class534_sub4.anInt10404, -1,
				    0, (byte) 1);
	    else
		Class281_Sub1.method15657
		    (-511427777 * class534_sub4.anInt10402,
		     -1831835741 * class534_sub4.anInt10405,
		     -1522052283 * class534_sub4.anInt10397,
		     class534_sub4.anInt10400 * -1246362377,
		     class534_sub4.aClass596_10399, 1121512633);
	    class534_sub4.aBool10406 = false;
	    if (!bool
		&& (class534_sub4.anInt10395 * 311151295
		    == -1375582077 * class534_sub4.anInt10398)
		&& 311151295 * class534_sub4.anInt10395 == -1)
		class534_sub4.method8892((byte) 1);
	    else if (!bool
		     && (-1375582077 * class534_sub4.anInt10398
			 == 311151295 * class534_sub4.anInt10395)
		     && (class534_sub4.anInt10403 * 220446523
			 == class534_sub4.anInt10396 * 352976243)
		     && (class534_sub4.anInt10404 * -1945323711
			 == 665019215 * class534_sub4.anInt10401))
		class534_sub4.method8892((byte) 1);
	}
    }
    
    static final void method6617(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class679.anInt8666 * -1006492633;
    }
    
    static final void method6618(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_6_ = class669.anIntArray8595[2088438307 * class669.anInt8600];
	int i_7_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class51.method1179(i_6_, i_7_, false, false, -1142971150);
    }
    
    static final void method6619(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = class669.aClass352_8602.aByte3631;
    }
}
