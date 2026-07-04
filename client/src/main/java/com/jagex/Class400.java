/* Class400 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Frame;

public class Class400 implements Interface47
{
    public int anInt4122;
    public Class391 aClass391_4123;
    public boolean aBool4124;
    public int anInt4125;
    public int anInt4126;
    public int anInt4127;
    public Class401 aClass401_4128;
    public int anInt4129;
    public int anInt4130;
    public int anInt4131;
    public int anInt4132;
    static Class712 aClass712_4133;
    
    public Class397 method350() {
	return Class397.aClass397_4108;
    }
    
    public Class397 method348(int i) {
	return Class397.aClass397_4108;
    }
    
    public Class397 method351() {
	return Class397.aClass397_4108;
    }
    
    Class400(int i, Class401 class401, Class391 class391, int i_0_, int i_1_,
	     int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool) {
	anInt4131 = 1598778093 * i;
	aClass401_4128 = class401;
	aClass391_4123 = class391;
	anInt4129 = 1081540345 * i_0_;
	anInt4125 = 1152343343 * i_1_;
	anInt4122 = -1962620777 * i_2_;
	anInt4132 = i_3_ * -669841951;
	anInt4126 = i_4_ * -2043822201;
	anInt4127 = i_5_ * -698633307;
	anInt4130 = 1569225733 * i_6_;
	aBool4124 = bool;
    }
    
    public Class397 method349() {
	return Class397.aClass397_4108;
    }
    
    public static Class400 method6582(Class534_Sub40 class534_sub40) {
	int i = class534_sub40.method16527(-661856102);
	Class401 class401 = (Class72.method1560(1856453755)
			     [class534_sub40.method16527(-216161518)]);
	Class391 class391 = (Class705.method14234(1341121992)
			     [class534_sub40.method16527(-1999694400)]);
	int i_7_ = class534_sub40.method16530((byte) -11);
	int i_8_ = class534_sub40.method16530((byte) -69);
	int i_9_ = class534_sub40.method16529((byte) 1);
	int i_10_ = class534_sub40.method16529((byte) 1);
	int i_11_ = class534_sub40.method16533(-258848859);
	int i_12_ = class534_sub40.method16533(-258848859);
	int i_13_ = class534_sub40.method16533(-258848859);
	boolean bool = class534_sub40.method16527(-888001331) == 1;
	return new Class400(i, class401, class391, i_7_, i_8_, i_9_, i_10_,
			    i_11_, i_12_, i_13_, bool);
    }
    
    public static Class243 method6583(int i, byte i_14_) {
	return Class44_Sub11.aClass243Array11006[i >> 16];
    }
    
    public static Frame method6584(Class14 class14, int i, int i_15_,
				   int i_16_, int i_17_, int i_18_) {
	if (0 == i_16_) {
	    Class6[] class6s = Class644.method10680(class14, 168135326);
	    if (class6s == null)
		return null;
	    boolean bool = false;
	    for (int i_19_ = 0; i_19_ < class6s.length; i_19_++) {
		if (class6s[i_19_].anInt52 * -1991181227 == i
		    && -778390023 * class6s[i_19_].anInt53 == i_15_
		    && (0 == i_17_
			|| i_17_ == class6s[i_19_].anInt55 * 1793071357)
		    && (!bool || 198554383 * class6s[i_19_].anInt54 > i_16_)) {
		    i_16_ = 198554383 * class6s[i_19_].anInt54;
		    bool = true;
		}
	    }
	    if (!bool)
		return null;
	}
	Frame frame = new Frame("Jagex Full Screen");
	frame.setResizable(false);
	class14.method653(frame, i, i_15_, i_16_, i_17_, (byte) -79);
	return frame;
    }
    
    static final void method6585(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class170.method2825(class247, class243, class669, (byte) -3);
    }
}
