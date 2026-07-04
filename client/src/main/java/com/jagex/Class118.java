/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.applet.Applet;
import java.awt.datatransfer.Clipboard;

public class Class118
{
    short aShort1413;
    short aShort1414;
    byte aByte1415;
    short aShort1416;
    byte aByte1417;
    int anInt1418;
    boolean aBool1419;
    int anInt1420;
    public static Clipboard aClipboard1421;
    
    Class118(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
	     int i_6_, int i_7_, boolean bool, int i_8_) {
	anInt1418 = 1689146905 * i;
	aShort1414 = (short) i_3_;
	aShort1413 = (short) i_4_;
	aShort1416 = (short) i_5_;
	aByte1415 = (byte) i_6_;
	aByte1417 = (byte) i_7_;
	aBool1419 = bool;
	anInt1420 = i_8_ * 1672896963;
    }
    
    public static void method2128(boolean bool, int i) {
	if (4 != client.anInt11155 * -1468443459
	    && 1 != client.anInt11155 * -1468443459) {
	    if (!bool) {
		if (Class700.aClass200Array8807 != null) {
		    Class200[] class200s = Class700.aClass200Array8807;
		    for (int i_9_ = 0; i_9_ < class200s.length; i_9_++) {
			Class200 class200 = class200s[i_9_];
			class200.method3843((byte) -100);
		    }
		}
		if (Class201.anInt2186 * -1908237265 != -1)
		    Class171_Sub4.aClass232_9944.method4244((Class201.anInt2186
							     * -1908237265),
							    255, (byte) 14);
	    }
	    client.anInt11155 = -575071660;
	    Class712.aClass534_Sub40_8883 = null;
	    client.aBool11109 = false;
	    if (1689023681 * Class201.anInt2185 > 0)
		Class680.method13862(Class583.aClass583_7790,
				     1689023681 * Class201.anInt2185, -1,
				     (byte) 74);
	    Class155_Sub1.method15473(-160146077);
	    Class534_Sub19 class534_sub19
		= Class346.method6128(Class404.aClass404_4245,
				      client.aClass100_11264.aClass13_1183,
				      1341391005);
	    class534_sub19.aClass534_Sub40_Sub1_10513.method16506(bool ? 1 : 0,
								  845149173);
	    client.aClass100_11264.method1863(class534_sub19, (byte) 50);
	}
    }
    
    static void method2129(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class224.method4167((byte) 0);
    }
    
    static final void method2130(Class669 class669, int i) {
	if ((class669.anIntArray8595
	     [(class669.anInt8600 -= 308999563) * 2088438307])
	    == 0)
	    class669.anInt8613
		+= (class669.anIntArray8591[662605117 * class669.anInt8613]
		    * -793595371);
    }
    
    static final void method2131(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2600
	    = Class99.method1859(string, class669, -353123254);
	class247.aBool2561 = true;
    }
    
    static final void method2132(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2630
	    = Class99.method1859(string, class669, -98987997);
	class247.aBool2561 = true;
    }
    
    public static int method2133(int i, int i_10_) {
	if (-363511917 * Class554_Sub1.anInt10683 == i)
	    return Class554_Sub1.aBool10675 ? 1 : 0;
	if (i == 1272099037 * Class554_Sub1.anInt10666)
	    return Class554_Sub1.aBool10667 ? 1 : 0;
	if (i == Class554_Sub1.anInt10692 * -1565977311)
	    return Class554_Sub1.aBool10676 ? 1 : 0;
	return -1;
    }
    
    public static void method2134(Applet applet, String string, int i) {
	Class519.anApplet7055 = applet;
	Class519.aString7051 = string;
    }
}
