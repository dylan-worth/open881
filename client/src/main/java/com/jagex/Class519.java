/* Class519 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.applet.Applet;
import java.awt.Desktop;
import java.net.URI;
import java.net.URL;

public class Class519
{
    static String aString7051;
    static final int anInt7052 = 2;
    static final int anInt7053 = 0;
    public static final int anInt7054 = 1;
    static Applet anApplet7055 = null;
    static final int anInt7056 = 3;
    static Class534_Sub18_Sub9 aClass534_Sub18_Sub9_7057;
    
    public static boolean method8638(String string, int i, String string_0_) {
	if (0 == i) {
	    boolean bool;
	    try {
		if (!aString7051.startsWith("win"))
		    throw new Exception();
		if (!string.startsWith("http://")
		    && !string.startsWith("https://"))
		    throw new Exception();
		String string_1_
		    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
		for (int i_2_ = 0; i_2_ < string.length(); i_2_++) {
		    if (string_1_.indexOf(string.charAt(i_2_)) == -1)
			throw new Exception();
		}
		Runtime.getRuntime().exec(new StringBuilder().append
					      ("cmd /c start \"j\" \"").append
					      (string).append
					      ("\"").toString());
		bool = true;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (i == 1) {
	    boolean bool;
	    try {
		Object object
		    = Class31.method890(anApplet7055, string_0_,
					(new Object[]
					 { new URL(anApplet7055.getCodeBase(),
						   string).toString() }),
					-441928345);
		bool = object != null;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (2 == i) {
	    boolean bool;
	    try {
		anApplet7055.getAppletContext().showDocument
		    (new URL(anApplet7055.getCodeBase(), string), "_blank");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	if (i == 3) {
	    try {
		Class31.method887(anApplet7055, "loggedout", -956092380);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    boolean bool;
	    try {
		anApplet7055.getAppletContext().showDocument
		    (new URL(anApplet7055.getCodeBase(), string), "_top");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	throw new IllegalArgumentException();
    }
    
    static {
	aString7051 = null;
    }
    
    public static void method8639(Applet applet, String string) {
	anApplet7055 = applet;
	aString7051 = string;
    }
    
    public static void method8640(Applet applet, String string) {
	anApplet7055 = applet;
	aString7051 = string;
    }
    
    public static void method8641(String string, boolean bool,
				  boolean bool_3_) {
	Class403.method6611(string, bool, "openjs", bool_3_, -908420807);
    }
    
    public static void method8642(String string, boolean bool,
				  String string_4_, boolean bool_5_) {
	if (bool) {
	    do {
		if (!bool_5_ && Desktop.isDesktopSupported()
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
	    if (aString7051.startsWith("win") && !bool_5_)
		Class452.method7390(string, 0, (byte) 109);
	    else if (aString7051.startsWith("mac"))
		Class215.method4106(string, 1, string_4_, (byte) 122);
	    else
		Class452.method7390(string, 2, (byte) 75);
	} else
	    Class452.method7390(string, 3, (byte) 70);
    }
    
    public static void method8643(String string, boolean bool,
				  String string_6_, boolean bool_7_) {
	if (bool) {
	    do {
		if (!bool_7_ && Desktop.isDesktopSupported()
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
	    if (aString7051.startsWith("win") && !bool_7_)
		Class452.method7390(string, 0, (byte) 45);
	    else if (aString7051.startsWith("mac"))
		Class215.method4106(string, 1, string_6_, (byte) 65);
	    else
		Class452.method7390(string, 2, (byte) 122);
	} else
	    Class452.method7390(string, 3, (byte) 116);
    }
    
    Class519() throws Throwable {
	throw new Error();
    }
    
    public static boolean method8644(String string, int i, String string_8_) {
	if (0 == i) {
	    boolean bool;
	    try {
		if (!aString7051.startsWith("win"))
		    throw new Exception();
		if (!string.startsWith("http://")
		    && !string.startsWith("https://"))
		    throw new Exception();
		String string_9_
		    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
		for (int i_10_ = 0; i_10_ < string.length(); i_10_++) {
		    if (string_9_.indexOf(string.charAt(i_10_)) == -1)
			throw new Exception();
		}
		Runtime.getRuntime().exec(new StringBuilder().append
					      ("cmd /c start \"j\" \"").append
					      (string).append
					      ("\"").toString());
		bool = true;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (i == 1) {
	    boolean bool;
	    try {
		Object object
		    = Class31.method890(anApplet7055, string_8_,
					(new Object[]
					 { new URL(anApplet7055.getCodeBase(),
						   string).toString() }),
					-441928345);
		bool = object != null;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (2 == i) {
	    boolean bool;
	    try {
		anApplet7055.getAppletContext().showDocument
		    (new URL(anApplet7055.getCodeBase(), string), "_blank");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	if (i == 3) {
	    try {
		Class31.method887(anApplet7055, "loggedout", -1801732966);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    boolean bool;
	    try {
		anApplet7055.getAppletContext().showDocument
		    (new URL(anApplet7055.getCodeBase(), string), "_top");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	throw new IllegalArgumentException();
    }
    
    public static boolean method8645(String string, int i, String string_11_) {
	if (0 == i) {
	    boolean bool;
	    try {
		if (!aString7051.startsWith("win"))
		    throw new Exception();
		if (!string.startsWith("http://")
		    && !string.startsWith("https://"))
		    throw new Exception();
		String string_12_
		    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
		for (int i_13_ = 0; i_13_ < string.length(); i_13_++) {
		    if (string_12_.indexOf(string.charAt(i_13_)) == -1)
			throw new Exception();
		}
		Runtime.getRuntime().exec(new StringBuilder().append
					      ("cmd /c start \"j\" \"").append
					      (string).append
					      ("\"").toString());
		bool = true;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (i == 1) {
	    boolean bool;
	    try {
		Object object
		    = Class31.method890(anApplet7055, string_11_,
					(new Object[]
					 { new URL(anApplet7055.getCodeBase(),
						   string).toString() }),
					-441928345);
		bool = object != null;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (2 == i) {
	    boolean bool;
	    try {
		anApplet7055.getAppletContext().showDocument
		    (new URL(anApplet7055.getCodeBase(), string), "_blank");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	if (i == 3) {
	    try {
		Class31.method887(anApplet7055, "loggedout", -645490772);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    boolean bool;
	    try {
		anApplet7055.getAppletContext().showDocument
		    (new URL(anApplet7055.getCodeBase(), string), "_top");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	throw new IllegalArgumentException();
    }
    
    public static boolean method8646(String string, int i, String string_14_) {
	if (0 == i) {
	    boolean bool;
	    try {
		if (!aString7051.startsWith("win"))
		    throw new Exception();
		if (!string.startsWith("http://")
		    && !string.startsWith("https://"))
		    throw new Exception();
		String string_15_
		    = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
		for (int i_16_ = 0; i_16_ < string.length(); i_16_++) {
		    if (string_15_.indexOf(string.charAt(i_16_)) == -1)
			throw new Exception();
		}
		Runtime.getRuntime().exec(new StringBuilder().append
					      ("cmd /c start \"j\" \"").append
					      (string).append
					      ("\"").toString());
		bool = true;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (i == 1) {
	    boolean bool;
	    try {
		Object object
		    = Class31.method890(anApplet7055, string_14_,
					(new Object[]
					 { new URL(anApplet7055.getCodeBase(),
						   string).toString() }),
					-441928345);
		bool = object != null;
	    } catch (Throwable throwable) {
		return false;
	    }
	    return bool;
	}
	if (2 == i) {
	    boolean bool;
	    try {
		anApplet7055.getAppletContext().showDocument
		    (new URL(anApplet7055.getCodeBase(), string), "_blank");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	if (i == 3) {
	    try {
		Class31.method887(anApplet7055, "loggedout", -1884285412);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    boolean bool;
	    try {
		anApplet7055.getAppletContext().showDocument
		    (new URL(anApplet7055.getCodeBase(), string), "_top");
		bool = true;
	    } catch (Exception exception) {
		return false;
	    }
	    return bool;
	}
	throw new IllegalArgumentException();
    }
    
    static final void method8647(Class247 class247, Class669 class669, int i) {
	int i_17_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	int i_18_ = ((class669.anIntArray8595
		      [(class669.anInt8600 -= 308999563) * 2088438307])
		     - 1);
	int i_19_ = i_18_;
	if (class247.anInt2496 * -1866862435 != 6
	    && class247.anInt2496 * -1866862435 != 2)
	    throw new RuntimeException("");
	Class307 class307
	    = ((Class307)
	       Class578.aClass44_Sub3_7743
		   .method91(939166901 * class247.anInt2497, -1923621642));
	if (class247.aClass301_2635 == null)
	    class247.aClass301_2635
		= new Class301(class307,
			       6 == -1866862435 * class247.anInt2496);
	class247.aClass301_2635.aLong3238
	    = Class215.method4107(-148424092) * 8855449811293583851L;
	if (class307.aByteArray3321 != null) {
	    if (i_18_ < 0 || i_18_ >= class307.aByteArray3321.length)
		throw new RuntimeException("");
	    i_19_ = class307.aByteArray3321[i_18_];
	}
	if (class307.aShortArray3290 == null || i_19_ < 0
	    || i_19_ >= class307.aShortArray3290.length)
	    throw new RuntimeException("");
	class247.aClass301_2635.aShortArray3237[i_19_] = (short) i_17_;
	Class454.method7416(class247, -2028646155);
    }
    
    static final void method8648(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class554_Sub1.aBool10685 ? 1 : 0;
    }
    
    public static void method8649(Class243 class243, Class247 class247,
				  int i) {
	Class247 class247_20_
	    = Class578.method9799(class243, class247, -1495101509);
	int i_21_;
	int i_22_;
	if (class247_20_ == null) {
	    i_21_ = Class706_Sub4.anInt10994 * 1771907305;
	    i_22_ = Class18.anInt205 * -1091172141;
	} else {
	    i_21_ = -881188269 * class247_20_.anInt2468;
	    i_22_ = class247_20_.anInt2469 * -1279656873;
	}
	Class165.method2743(class247, i_21_, i_22_, false, -216211910);
	Class530.method8849(class247, i_21_, i_22_, -1230071345);
    }
    
    static final void method8650(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 1720947399 * Class498.anInt5554;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 1720947399 * Class498.anInt5554;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 1;
    }
    
    static final void method8651(Class669 class669, int i) {
	CharSequence charsequence
	    = ((CharSequence)
	       (class669.anObjectArray8593
		[(class669.anInt8594 -= 1460193483) * 1485266147]));
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = Class253.method4635(charsequence, -81341079);
    }
    
    static void method8652(int i) {
	Class65.aString696 = "";
	Class65.aString665 = "";
	Class65.aString694 = "";
	Class65.aBool697 = true;
    }
}
