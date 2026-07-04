/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.File;

public class Class89
{
    boolean aBool885;
    Class94[] aClass94Array886;
    
    Class89(boolean bool, Class94[] class94s) {
	aBool885 = bool;
	aClass94Array886 = class94s;
    }
    
    public static void method1713(int i, String string, boolean bool,
				  int i_0_) {
	if (Class535.method8895((byte) 3)) {
	    if (Class65.anInt662 * 1832109523 != i)
		Class65.aLong663 = 8972729624098644529L;
	    Class65.anInt662 = i * 1651628635;
	    Class65.aString696 = string;
	    Class65.aBool697 = bool;
	    Class673.method11110(12, -1163019357);
	}
    }
    
    public static Class704 method1714(int i) {
	if (Class44_Sub20.aClass704_11014 == null)
	    return Class704.aClass704_8828;
	return Class44_Sub20.aClass704_11014;
    }
    
    static final void method1715(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class43.method1075(class247, class243, class669, (byte) 12);
    }
    
    static void method1716(File file, int i) {
	Class504.aFile5631 = file;
	if (!Class504.aFile5631.exists())
	    throw new RuntimeException("");
	Class504.aBool5630 = true;
    }
    
    static final void method1717(Class669 class669, byte i) {
	Class232.method4337(true, -1584023538);
	Class177.method2934((short) 1617);
	client.aClass512_11100.method8441(1576083573);
	Class672.method11096((byte) 1);
	client.aBool11048 = false;
    }
}
