/* Class678 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class678
{
    static Map aMap8655 = new HashMap();
    
    public static Interface76 method11144(Class var_class, int i) {
	synchronized (aMap8655) {
	    Map map = (Map) aMap8655.get(var_class);
	    if (map == null) {
		map = new HashMap();
		Interface76[] interface76s
		    = (Interface76[]) var_class.getEnumConstants();
		for (int i_0_ = 0; i_0_ < interface76s.length; i_0_++) {
		    Interface76 interface76 = interface76s[i_0_];
		    map.put(Integer.valueOf(interface76.method93()),
			    interface76);
		}
		aMap8655.put(var_class, map);
	    }
	    Interface76 interface76
		= (Interface76) map.get(Integer.valueOf(i));
	    return interface76;
	}
    }
    
    public static void method11145(Iterable iterable,
				   Class534_Sub40 class534_sub40) {
	int i = Class311.method5668(iterable, (byte) -47);
	class534_sub40.method16542(i, -512461177);
	if (i != 0) {
	    for (int i_1_ = 0; i_1_ < i; i_1_++)
		class534_sub40.aByteArray10810
		    [i_1_ + class534_sub40.anInt10811 * 31645619]
		    = (byte) 0;
	    Iterator iterator = iterable.iterator();
	    while (iterator.hasNext()) {
		Interface76 interface76 = (Interface76) iterator.next();
		int i_2_ = interface76.method93();
		int i_3_ = i_2_ / 8;
		class534_sub40.aByteArray10810
		    [class534_sub40.anInt10811 * 31645619 + i_3_]
		    |= 1 << (i_2_ & 0x7);
	    }
	    class534_sub40.anInt10811 += -1387468933 * i;
	}
    }
    
    Class678() throws Throwable {
	throw new Error();
    }
    
    public static Interface76 method11146(Class var_class, int i) {
	synchronized (aMap8655) {
	    Map map = (Map) aMap8655.get(var_class);
	    if (map == null) {
		map = new HashMap();
		Interface76[] interface76s
		    = (Interface76[]) var_class.getEnumConstants();
		for (int i_4_ = 0; i_4_ < interface76s.length; i_4_++) {
		    Interface76 interface76 = interface76s[i_4_];
		    map.put(Integer.valueOf(interface76.method93()),
			    interface76);
		}
		aMap8655.put(var_class, map);
	    }
	    Interface76 interface76
		= (Interface76) map.get(Integer.valueOf(i));
	    return interface76;
	}
    }
    
    public static Interface76 method11147(Class var_class, int i) {
	synchronized (aMap8655) {
	    Map map = (Map) aMap8655.get(var_class);
	    if (map == null) {
		map = new HashMap();
		Interface76[] interface76s
		    = (Interface76[]) var_class.getEnumConstants();
		for (int i_5_ = 0; i_5_ < interface76s.length; i_5_++) {
		    Interface76 interface76 = interface76s[i_5_];
		    map.put(Integer.valueOf(interface76.method93()),
			    interface76);
		}
		aMap8655.put(var_class, map);
	    }
	    Interface76 interface76
		= (Interface76) map.get(Integer.valueOf(i));
	    return interface76;
	}
    }
    
    public static Interface76 method11148(Class var_class, int i) {
	synchronized (aMap8655) {
	    Map map = (Map) aMap8655.get(var_class);
	    if (map == null) {
		map = new HashMap();
		Interface76[] interface76s
		    = (Interface76[]) var_class.getEnumConstants();
		for (int i_6_ = 0; i_6_ < interface76s.length; i_6_++) {
		    Interface76 interface76 = interface76s[i_6_];
		    map.put(Integer.valueOf(interface76.method93()),
			    interface76);
		}
		aMap8655.put(var_class, map);
	    }
	    Interface76 interface76
		= (Interface76) map.get(Integer.valueOf(i));
	    return interface76;
	}
    }
    
    public static void method11149(Iterable iterable,
				   Class534_Sub40 class534_sub40) {
	int i = Class311.method5668(iterable, (byte) -80);
	class534_sub40.method16542(i, -512461177);
	if (i != 0) {
	    for (int i_7_ = 0; i_7_ < i; i_7_++)
		class534_sub40.aByteArray10810
		    [i_7_ + class534_sub40.anInt10811 * 31645619]
		    = (byte) 0;
	    Iterator iterator = iterable.iterator();
	    while (iterator.hasNext()) {
		Interface76 interface76 = (Interface76) iterator.next();
		int i_8_ = interface76.method93();
		int i_9_ = i_8_ / 8;
		class534_sub40.aByteArray10810
		    [class534_sub40.anInt10811 * 31645619 + i_9_]
		    |= 1 << (i_8_ & 0x7);
	    }
	    class534_sub40.anInt10811 += -1387468933 * i;
	}
    }
    
    static int method11150(Iterable iterable) {
	int i = -1;
	Iterator iterator = iterable.iterator();
	while (iterator.hasNext()) {
	    Interface76 interface76 = (Interface76) iterator.next();
	    if (interface76.method93() > i)
		i = interface76.method93();
	}
	return (8 + i) / 8;
    }
    
    static int method11151(Iterable iterable) {
	int i = -1;
	Iterator iterator = iterable.iterator();
	while (iterator.hasNext()) {
	    Interface76 interface76 = (Interface76) iterator.next();
	    if (interface76.method93() > i)
		i = interface76.method93();
	}
	return (8 + i) / 8;
    }
    
    static final void method11152(int i, int i_10_, int i_11_, int i_12_,
				  int i_13_, int i_14_, int i_15_, int i_16_) {
	int i_17_ = i_15_ - 334;
	if (i_17_ < 0)
	    i_17_ = 0;
	else if (i_17_ > 100)
	    i_17_ = 100;
	int i_18_ = (i_17_ * (client.aShort11314 - client.aShort11313) / 100
		     + client.aShort11313);
	i_14_ = i_18_ * i_14_ >> 8;
	int i_19_ = 16384 - i_12_ & 0x3fff;
	int i_20_ = 16384 - i_13_ & 0x3fff;
	int i_21_ = 0;
	int i_22_ = 0;
	int i_23_ = i_14_;
	if (i_19_ != 0) {
	    i_22_ = -i_23_ * Class427.anIntArray4806[i_19_] >> 14;
	    i_23_ = i_23_ * Class427.anIntArray4805[i_19_] >> 14;
	}
	if (i_20_ != 0) {
	    i_21_ = i_23_ * Class427.anIntArray4806[i_20_] >> 14;
	    i_23_ = Class427.anIntArray4805[i_20_] * i_23_ >> 14;
	}
	Class200_Sub13.anInt9937 = (i - i_21_) * -2079086379;
	Class677.anInt8654 = (i_10_ - i_22_) * 996845503;
	Class636.anInt8305 = -866237299 * (i_11_ - i_23_);
	Class566.anInt7589 = i_12_ * -1539495063;
	Class641.anInt8341 = i_13_ * 486346273;
	Class2.anInt22 = 0;
    }
}
