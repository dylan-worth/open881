/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Canvas;

public class Class97
{
    public static int anInt1160;
    
    public static Class185 method1824
	(Canvas canvas, Class177 class177, Interface25 interface25,
	 Interface45 interface45, Interface48 interface48,
	 Interface46 interface46, int i, int i_0_) {
	return new Class185_Sub2(canvas, class177, interface25, interface45,
				 interface48, interface46, i, i_0_);
    }
    
    public static Class185 method1825
	(Canvas canvas, Class177 class177, Interface25 interface25,
	 Interface45 interface45, Interface48 interface48,
	 Interface46 interface46, int i, int i_1_) {
	return new Class185_Sub2(canvas, class177, interface25, interface45,
				 interface48, interface46, i, i_1_);
    }
    
    Class97() throws Throwable {
	throw new Error();
    }
    
    public static Class185 method1826
	(Canvas canvas, Class177 class177, Interface25 interface25,
	 Interface45 interface45, Interface48 interface48,
	 Interface46 interface46, int i, int i_2_) {
	return new Class185_Sub2(canvas, class177, interface25, interface45,
				 interface48, interface46, i, i_2_);
    }
    
    static final int method1827(int i, int i_3_, int i_4_, int i_5_,
				byte i_6_) {
	int i_7_ = 65536 - Class427.anIntArray4805[8192 * i_4_ / i_5_] >> 1;
	return (i_3_ * i_7_ >> 16) + (i * (65536 - i_7_) >> 16);
    }
    
    static void method1828(Class243 class243, Class247 class247, int i) {
	if (null != class247) {
	    if (-1 != class247.anInt2580 * 1365669833) {
		Class247 class247_8_
		    = (class243.aClass247Array2412
		       [class247.anInt2472 * -742015869 & 0xffff]);
		if (class247_8_ != null) {
		    if (class247_8_.aClass247Array2620
			== class247_8_.aClass247Array2621) {
			class247_8_.aClass247Array2621
			    = (new Class247
			       [class247_8_.aClass247Array2620.length]);
			class247_8_.aClass247Array2621[0] = class247;
			Class688.method13989(class247_8_.aClass247Array2620, 0,
					     class247_8_.aClass247Array2621, 1,
					     class247.anInt2580 * 1365669833);
			Class688.method13989
			    (class247_8_.aClass247Array2620,
			     1365669833 * class247.anInt2580 + 1,
			     class247_8_.aClass247Array2621,
			     1 + 1365669833 * class247.anInt2580,
			     (class247_8_.aClass247Array2620.length
			      - class247.anInt2580 * 1365669833 - 1));
		    } else {
			int i_9_ = 0;
			Class247[] class247s;
			for (class247s = class247_8_.aClass247Array2621;
			     (i_9_ < class247s.length
			      && class247s[i_9_] != class247);
			     i_9_++) {
			    /* empty */
			}
			if (i_9_ < class247s.length) {
			    Class688.method13989(class247s, 0, class247s, 1,
						 i_9_);
			    class247s[0] = class247;
			}
		    }
		}
	    } else {
		Class247[] class247s = class243.method4475((byte) 33);
		int i_10_;
		for (i_10_ = 0;
		     i_10_ < class247s.length && class247s[i_10_] != class247;
		     i_10_++) {
		    /* empty */
		}
		if (i_10_ < class247s.length) {
		    Class688.method13989(class247s, 0, class247s, 1, i_10_);
		    class247s[0] = class247;
		}
	    }
	}
    }
    
    static final void method1829(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (Class546.method8989(string, class669, -219410121) != null)
	    string = string.substring(0, string.length() - 1);
	class247.anObjectArray2617
	    = Class99.method1859(string, class669, -1467715363);
	class247.aBool2561 = true;
    }
    
    static final void method1830(Class669 class669, byte i) {
	int i_11_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (((Class15)
		Class531.aClass44_Sub7_7135.method91(i_11_, -785300882))
	       .anInt131) * 1925627131;
    }
    
    static final void method1831(Class669 class669, int i) {
	class669.anInt8594 -= 85613153;
	String string
	    = ((String)
	       class669.anObjectArray8593[1485266147 * class669.anInt8594]);
	String string_12_ = (String) (class669.anObjectArray8593
				      [class669.anInt8594 * 1485266147 + 1]);
	String string_13_ = (String) (class669.anObjectArray8593
				      [2 + 1485266147 * class669.anInt8594]);
	boolean bool = ((class669.anIntArray8595
			 [(class669.anInt8600 -= 308999563) * 2088438307])
			== 1);
	Class200_Sub6.method15576(string, string_12_, string_13_, bool,
				  1710902726);
    }
    
    public static int[] method1832(byte i) {
	return new int[] { -1643399711 * Class67.anInt715,
			   -849564261 * Class67.anInt716,
			   Class67.anInt717 * 973015101 };
    }
}
