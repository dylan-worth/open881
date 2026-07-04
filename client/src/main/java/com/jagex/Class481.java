/* Class481 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;
import java.lang.reflect.Method;

public class Class481
{
    public static final int anInt5264 = 8;
    public static final int anInt5265 = 5;
    public static final int anInt5266 = 0;
    public static final int anInt5267 = 1;
    public static final int anInt5268 = 2;
    public static final int anInt5269 = 3;
    
    Class481() throws Throwable {
	throw new Error();
    }
    
    static final void method7925(Class669 class669, int i) {
	Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
	    = ((Class654_Sub1_Sub5_Sub1_Sub1)
	       class669.aClass654_Sub1_Sub5_Sub1_8604);
	String string = class654_sub1_sub5_sub1_sub1.aString12201;
	Class307 class307 = class654_sub1_sub5_sub1_sub1.aClass307_12204;
	if (null != class307.anIntArray3284) {
	    class307 = class307.method5615(Class78.aClass103_825,
					   Class78.aClass103_825, -1466068515);
	    if (null == class307)
		string = "";
	    else
		string = class307.aString3337;
	}
	if (string == null)
	    string = "";
	class669.anObjectArray8593
	    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
	    = string;
    }
    
    static String method7926(String string, int i) {
	if (Class503.aString5626.startsWith("win"))
	    return new StringBuilder().append(string).append(".dll")
		       .toString();
	if (Class503.aString5626.startsWith("linux"))
	    return new StringBuilder().append("lib").append(string).append
		       (".so").toString();
	if (Class503.aString5626.startsWith("mac"))
	    return new StringBuilder().append("lib").append(string).append
		       (".dylib").toString();
	return null;
    }
    
    public static void method7927(Canvas canvas, int i) {
	try {
	    Class var_class = Class.forName("java.awt.Canvas");
	    Method method = var_class.getMethod("setIgnoreRepaint",
						new Class[] { Boolean.TYPE });
	    method.invoke(canvas, new Object[] { Boolean.TRUE });
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public static Class185 method7928
	(Canvas canvas, Class177 class177, Interface25 interface25,
	 Interface45 interface45, Interface48 interface48,
	 Interface46 interface46, int i, int i_0_, int i_1_) {
	return new Class185_Sub2(canvas, class177, interface25, interface45,
				 interface48, interface46, i, i_0_);
    }
}
