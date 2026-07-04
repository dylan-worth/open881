/* Class503 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;

public class Class503
{
    public static String aString5625;
    public static String aString5626;
    public static String aString5627;
    static String aString5628;
    static int anInt5629;
    
    Class503() throws Throwable {
	throw new Error();
    }
    
    static {
	String string = "Unknown";
	try {
	    string = System.getProperty("java.vendor").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("java.version").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.name").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	aString5626 = string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	aString5627 = string.toLowerCase();
	string = "Unknown";
	try {
	    string = System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	aString5628 = string.toLowerCase();
	aString5625 = String.format("%s (%s) [%s]",
				    new Object[] { aString5626, aString5627,
						   aString5628 });
	string = "~/";
	try {
	    string = System.getProperty("user.home").toLowerCase();
	} catch (Exception exception) {
	    /* empty */
	}
	new File(string);
    }
    
    static final void method8307(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class78.aClass103_825.method491(i_0_, (byte) 0);
    }
    
    static final void method8308(Class669 class669, byte i) {
	class669.anInt8594 -= -1374580330;
	Class563.method9508((String) (class669.anObjectArray8593
				      [1485266147 * class669.anInt8594]),
			    (String) (class669.anObjectArray8593
				      [1 + 1485266147 * class669.anInt8594]),
			    "",
			    ((class669.anIntArray8595
			      [(class669.anInt8600 -= 308999563) * 2088438307])
			     == 1),
			    false, 2127375928);
    }
    
    static final void method8309(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class99.anInt1178 * -1438703763;
    }
}
