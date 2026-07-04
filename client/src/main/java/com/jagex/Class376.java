/* Class376 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Map;

public class Class376
{
    public static Class376 aClass376_3909 = new Class376();
    public static Class376 aClass376_3910 = new Class376();
    public static Class43 aClass43_3911;
    
    Class376() {
	/* empty */
    }
    
    static final void method6415(Class669 class669, int i) {
	int i_0_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_0_, 1805766517);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_0_ >> 16];
	Class325.method5817(class247, class243, class669, -1319673912);
    }
    
    static final void method6416(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub12_10753
		  .method16985(16711680) == 1 ? 1 : 0;
    }
    
    static final void method6417(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) (Class531.aLong7136 * -4861593676329809233L / 60000L);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (int) ((-4861593676329809233L * Class531.aLong7136
		      - Class250.method4604((byte) -84)
		      - 656147693700925901L * Class212.aLong2274)
		     / 60000L);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class233.aBool2359 ? 1 : 0;
    }
    
    public static String method6418(byte[] is, int i, int i_1_, int i_2_) {
	char[] cs = new char[i_1_];
	int i_3_ = 0;
	for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
	    int i_5_ = is[i_4_ + i] & 0xff;
	    if (i_5_ != 0) {
		if (i_5_ >= 128 && i_5_ < 160) {
		    int i_6_ = Class685.aCharArray8697[i_5_ - 128];
		    if (i_6_ == 0)
			i_6_ = 63;
		    i_5_ = i_6_;
		}
		cs[i_3_++] = (char) i_5_;
	    }
	}
	return new String(cs, 0, i_3_);
    }
    
    public static Interface76 method6419(Class var_class, int i, int i_7_) {
	synchronized (Class678.aMap8655) {
	    Map map = (Map) Class678.aMap8655.get(var_class);
	    if (map == null) {
		map = new HashMap();
		Interface76[] interface76s
		    = (Interface76[]) var_class.getEnumConstants();
		for (int i_8_ = 0; i_8_ < interface76s.length; i_8_++) {
		    Interface76 interface76 = interface76s[i_8_];
		    map.put(Integer.valueOf(interface76.method93()),
			    interface76);
		}
		Class678.aMap8655.put(var_class, map);
	    }
	    Interface76 interface76
		= (Interface76) map.get(Integer.valueOf(i));
	    return interface76;
	}
    }
    
    public static void method6420(boolean bool, int i) {
	Class554_Sub1.aBool10694 = bool;
    }
}
