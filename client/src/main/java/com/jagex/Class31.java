/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class31
{
    public static Object method887(Applet applet, String string, int i)
	throws Throwable {
	return JSObject.getWindow(applet).call(string, null);
    }
    
    public static void method888(Applet applet, String string, byte i)
	throws Throwable {
	JSObject.getWindow(applet).eval(string);
    }
    
    public static Object method889(Applet applet, String string)
	throws Throwable {
	return JSObject.getWindow(applet).call(string, null);
    }
    
    public static Object method890(Applet applet, String string,
				   Object[] objects, int i) throws Throwable {
	return JSObject.getWindow(applet).call(string, objects);
    }
    
    public static Object method891
	(Applet applet, String string, Object[] objects) throws Throwable {
	return JSObject.getWindow(applet).call(string, objects);
    }
    
    public static void method892(Applet applet, String string)
	throws Throwable {
	JSObject.getWindow(applet).eval(string);
    }
    
    public static Object method893(Applet applet, String string)
	throws Throwable {
	return JSObject.getWindow(applet).call(string, null);
    }
    
    public static void method894(Applet applet, String string)
	throws Throwable {
	JSObject.getWindow(applet).eval(string);
    }
    
    public static Object method895
	(Applet applet, String string, Object[] objects) throws Throwable {
	return JSObject.getWindow(applet).call(string, objects);
    }
    
    Class31() throws Throwable {
	throw new Error();
    }
    
    public static Object method896
	(Applet applet, String string, Object[] objects) throws Throwable {
	return JSObject.getWindow(applet).call(string, objects);
    }
}
