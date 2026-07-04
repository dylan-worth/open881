/* Class665 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class Class665 implements Interface76
{
    static Class202 aClass202_8557;
    public static Class665 aClass665_8558;
    public static Class665 aClass665_8559;
    static Class665 aClass665_8560;
    public static Class665 aClass665_8561
	= new Class665("", 0, new Class664[] { Class664.aClass664_8554 });
    public static Class665 aClass665_8562;
    static Class665 aClass665_8563;
    static Class665 aClass665_8564;
    static Class665 aClass665_8565;
    public static Class665 aClass665_8566;
    static Class665 aClass665_8567;
    static Class665 aClass665_8568;
    int anInt8569;
    public static Class665 aClass665_8570;
    Set aSet8571;
    public static Class665 aClass665_8572;
    static boolean aBool8573;
    
    public static Class665[] method11000() {
	return new Class665[] { aClass665_8570, aClass665_8562, aClass665_8559,
				aClass665_8568, aClass665_8572, aClass665_8565,
				aClass665_8566, aClass665_8563, aClass665_8561,
				aClass665_8567, aClass665_8564, aClass665_8558,
				aClass665_8560 };
    }
    
    public boolean method11001(Class664 class664, int i) {
	return aSet8571.contains(class664);
    }
    
    Class665(String string, int i, Class664[] class664s) {
	aSet8571 = new HashSet();
	anInt8569 = i * -733164599;
	Class664[] class664s_0_ = class664s;
	for (int i_1_ = 0; i_1_ < class664s_0_.length; i_1_++) {
	    Class664 class664 = class664s_0_[i_1_];
	    aSet8571.add(class664);
	}
    }
    
    public int method93() {
	return anInt8569 * 1443970681;
    }
    
    static final void method11002(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class455.method7419(class247, class243, class669, -2040253944);
    }
    
    static {
	aClass665_8558
	    = new Class665("", 1, new Class664[] { Class664.aClass664_8555,
						   Class664.aClass664_8554 });
	aClass665_8572
	    = new Class665("", 2, new Class664[] { Class664.aClass664_8555,
						   Class664.aClass664_8556 });
	aClass665_8570
	    = new Class665("", 3, new Class664[] { Class664.aClass664_8555 });
	aClass665_8559 = new Class665("", 4);
	aClass665_8562
	    = new Class665("", 5, new Class664[] { Class664.aClass664_8555,
						   Class664.aClass664_8554 });
	aClass665_8563
	    = new Class665("", 6, new Class664[] { Class664.aClass664_8554 });
	aClass665_8564
	    = new Class665("", 8, new Class664[] { Class664.aClass664_8555,
						   Class664.aClass664_8554 });
	aClass665_8565
	    = new Class665("", 9, new Class664[] { Class664.aClass664_8555,
						   Class664.aClass664_8556 });
	aClass665_8566
	    = new Class665("", 10, new Class664[] { Class664.aClass664_8555 });
	aClass665_8560
	    = new Class665("", 11, new Class664[] { Class664.aClass664_8555 });
	aClass665_8568
	    = new Class665("", 12, new Class664[] { Class664.aClass664_8555,
						    Class664.aClass664_8554 });
	aClass665_8567
	    = new Class665("", 13, new Class664[] { Class664.aClass664_8555 });
	method11004(552729117);
    }
    
    public int method22() {
	return anInt8569 * 1443970681;
    }
    
    static void method11003(Class247 class247, int i, int i_2_, int i_3_) {
	if (client.aBool11218) {
	    Class90 class90
		= ((Class90)
		   (-1 != 410979031 * Class392_Sub1.anInt10224
		    ? (Class534_Sub11_Sub13.aClass44_Sub22_11730.method91
		       (Class392_Sub1.anInt10224 * 410979031, 777633901))
		    : null));
	    if (client.method17392(class247).method16267(-861519045)
		&& (460977285 * Class200_Sub14.anInt9950 & 0x20) != 0
		&& (null == class90
		    || (class247.method4547((Class392_Sub1.anInt10224
					     * 410979031),
					    263946597 * class90.anInt888,
					    564153926)
			!= 263946597 * class90.anInt888)))
		Class112.method2016
		    (client.aString11221,
		     new StringBuilder().append(client.aString11222).append
			 (" ").append
			 (Class29.aString263).append
			 (" ").append
			 (class247.aString2551).toString(),
		     Class460.anInt5069 * -731032933, 58,
		     403396513 * class247.anInt2606, 0L,
		     class247.anInt2580 * 1365669833,
		     -1278450723 * class247.anInt2454, true, false,
		     (long) (class247.anInt2580 * 1365669833 << 0
			     | class247.anInt2454 * -1278450723),
		     false, (short) 26938);
	}
	for (int i_4_ = 9; i_4_ >= 5; i_4_--) {
	    String string = Class387.method6505(class247, i_4_, -1199326728);
	    if (string != null)
		Class112.method2016
		    (string, class247.aString2551,
		     Class534_Sub18_Sub11.method18353(class247, i_4_,
						      (byte) -88),
		     1007, 403396513 * class247.anInt2606, (long) (i_4_ + 1),
		     1365669833 * class247.anInt2580,
		     -1278450723 * class247.anInt2454, true, false,
		     (long) (1365669833 * class247.anInt2580 << 0
			     | -1278450723 * class247.anInt2454),
		     false, (short) 19822);
	}
	String string = Class598.method9939(class247, 518788342);
	if (string != null)
	    Class112.method2016(string, class247.aString2551,
				class247.anInt2555 * 1751127275, 25,
				class247.anInt2606 * 403396513, 0L,
				1365669833 * class247.anInt2580,
				-1278450723 * class247.anInt2454, true, false,
				(long) (1365669833 * class247.anInt2580 << 0
					| class247.anInt2454 * -1278450723),
				false, (short) 31041);
	for (int i_5_ = 4; i_5_ >= 0; i_5_--) {
	    String string_6_
		= Class387.method6505(class247, i_5_, -1199326728);
	    if (string_6_ != null)
		Class112.method2016
		    (string_6_, class247.aString2551,
		     Class534_Sub18_Sub11.method18353(class247, i_5_,
						      (byte) -41),
		     57, class247.anInt2606 * 403396513, (long) (1 + i_5_),
		     1365669833 * class247.anInt2580,
		     -1278450723 * class247.anInt2454, true, false,
		     (long) (1365669833 * class247.anInt2580 << 0
			     | -1278450723 * class247.anInt2454),
		     false, (short) 17853);
	}
	if (client.method17392(class247).method16272((short) 255)) {
	    if (class247.aString2483 != null)
		Class112.method2016(class247.aString2483, "", -1, 30,
				    403396513 * class247.anInt2606, 0L,
				    1365669833 * class247.anInt2580,
				    class247.anInt2454 * -1278450723, true,
				    false,
				    (long) ((1365669833 * class247.anInt2580
					     << 0)
					    | (class247.anInt2454
					       * -1278450723)),
				    false, (short) 6389);
	    else
		Class112.method2016
		    (Class58.aClass58_477.method1245(Class539.aClass672_7171,
						     (byte) -98),
		     "", -1, 30, 403396513 * class247.anInt2606, 0L,
		     1365669833 * class247.anInt2580,
		     class247.anInt2454 * -1278450723, true, false,
		     (long) (class247.anInt2580 * 1365669833 << 0
			     | -1278450723 * class247.anInt2454),
		     false, (short) 27418);
	}
    }
    
    public static Class665[] method11004(int i) {
	return new Class665[] { aClass665_8570, aClass665_8562, aClass665_8559,
				aClass665_8568, aClass665_8572, aClass665_8565,
				aClass665_8566, aClass665_8563, aClass665_8561,
				aClass665_8567, aClass665_8564, aClass665_8558,
				aClass665_8560 };
    }
    
    public static Class665[] method11005() {
	return new Class665[] { aClass665_8570, aClass665_8562, aClass665_8559,
				aClass665_8568, aClass665_8572, aClass665_8565,
				aClass665_8566, aClass665_8563, aClass665_8561,
				aClass665_8567, aClass665_8564, aClass665_8558,
				aClass665_8560 };
    }
    
    public boolean method11006(Class664 class664) {
	return aSet8571.contains(class664);
    }
    
    static boolean method11007(String string, int i) {
	if (null == string)
	    return false;
	try {
	    new URL(string);
	} catch (MalformedURLException malformedurlexception) {
	    return false;
	}
	return true;
    }
    
    Class665(String string, int i) {
	aSet8571 = new HashSet();
	anInt8569 = -733164599 * i;
    }
    
    static final void method11008(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_7_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_8_
	    = class669.anIntArray8595[1 + class669.anInt8600 * 2088438307];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (Class618.aClass458_8101.method7433(i_7_, -1203343574)
	       .aCharArray11892[i_8_]);
    }
    
    public int method53() {
	return anInt8569 * 1443970681;
    }
    
    static final void method11009(Class669 class669, int i) {
	int i_9_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class534_Sub18_Sub9 class534_sub18_sub9
	    = Class232.method4339(-1418861345);
	if (class534_sub18_sub9 != null) {
	    boolean bool
		= class534_sub18_sub9.method18264(i_9_ >> 14 & 0x3fff,
						  i_9_ & 0x3fff,
						  Class679.anIntArray8659,
						  -1630345302);
	    if (bool) {
		class669.anIntArray8595
		    [(class669.anInt8600 += 308999563) * 2088438307 - 1]
		    = Class679.anIntArray8659[1];
		class669.anIntArray8595
		    [(class669.anInt8600 += 308999563) * 2088438307 - 1]
		    = Class679.anIntArray8659[2];
	    } else {
		class669.anIntArray8595
		    [(class669.anInt8600 += 308999563) * 2088438307 - 1]
		    = -1;
		class669.anIntArray8595
		    [(class669.anInt8600 += 308999563) * 2088438307 - 1]
		    = -1;
	    }
	} else {
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
	}
    }
}
