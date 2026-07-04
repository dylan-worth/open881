/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class253 implements Interface76
{
    int anInt2659;
    public static Class253 aClass253_2660;
    public static Class253 aClass253_2661;
    public static Class253 aClass253_2662 = new Class253(0, 0);
    public static Class253 aClass253_2663;
    public static Class253 aClass253_2664;
    public static Class253 aClass253_2665;
    public int anInt2666;
    
    Class253(int i, int i_0_) {
	anInt2666 = 332033079 * i;
	anInt2659 = i_0_ * -1887543477;
    }
    
    public int method93() {
	return anInt2659 * 1832759907;
    }
    
    static {
	aClass253_2660 = new Class253(1, 1);
	aClass253_2661 = new Class253(4, 2);
	aClass253_2665 = new Class253(5, 3);
	aClass253_2663 = new Class253(3, 4);
	aClass253_2664 = new Class253(2, 5);
    }
    
    public int method22() {
	return anInt2659 * 1832759907;
    }
    
    public static Class183 method4631(Class185 class185, int i, int i_1_,
				      int i_2_, int i_3_, int i_4_, int i_5_) {
	long l = (long) i_4_;
	Class183 class183 = (Class183) Class99.aClass203_1168.method3871(l);
	int i_6_ = 2055;
	if (class183 == null) {
	    Class187 class187
		= Class187.method3709(Class130.aClass472_1524, i_4_, 0);
	    if (null == class187)
		return null;
	    if (class187.anInt2082 < 13)
		class187.method3723(2);
	    class183 = class185.method3329(class187, i_6_,
					   2007436411 * Class551.anInt7308, 64,
					   768);
	    Class99.aClass203_1168.method3893(class183, l);
	}
	class183 = class183.method3011((byte) 6, i_6_, true);
	if (0 != i)
	    class183.method3015(i);
	if (i_1_ != 0)
	    class183.method3017(i_1_);
	if (0 != i_2_)
	    class183.method3018(i_2_);
	if (i_3_ != 0)
	    class183.method3098(0, i_3_, 0);
	return class183;
    }
    
    public int method53() {
	return anInt2659 * 1832759907;
    }
    
    static final void method4632(Class247 class247, Class243 class243,
				 Class669 class669, int i) {
	class247.anInt2557
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * 767846787;
    }
    
    static final void method4633(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	if (string.startsWith(Class108.method1965(0, -41860340))
	    || string.startsWith(Class108.method1965(1, -714869912)))
	    string = string.substring(7);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class226.method4177(string, (byte) -26);
    }
    
    public static int method4634(int i) {
	return Class523.aTwitchTV7088.GetStreamState();
    }
    
    public static String method4635(CharSequence charsequence, int i) {
	int i_7_ = charsequence.length();
	StringBuilder stringbuilder = new StringBuilder(i_7_);
	for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
	    char c = charsequence.charAt(i_8_);
	    if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'
		|| c >= '0' && c <= '9' || '.' == c || c == '-' || '*' == c
		|| '_' == c)
		stringbuilder.append(c);
	    else if (c == ' ')
		stringbuilder.append('+');
	    else {
		int i_9_ = Class542.method8950(c, -1248243370);
		stringbuilder.append('%');
		int i_10_ = i_9_ >> 4 & 0xf;
		if (i_10_ >= 10)
		    stringbuilder.append((char) (i_10_ + 55));
		else
		    stringbuilder.append((char) (i_10_ + 48));
		i_10_ = i_9_ & 0xf;
		if (i_10_ >= 10)
		    stringbuilder.append((char) (i_10_ + 55));
		else
		    stringbuilder.append((char) (48 + i_10_));
	    }
	}
	return stringbuilder.toString();
    }
    
    static final void method4636(Class669 class669, int i) {
	int i_11_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (Class44_Sub11.aClass243Array11006[i_11_] == null)
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	else {
	    String string = (Class44_Sub11.aClass243Array11006[i_11_]
			     .aClass247Array2412[0].aString2592);
	    if (null == string)
		class669.anObjectArray8593
		    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		    = "";
	    else
		class669.anObjectArray8593
		    [(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		    = string.substring(0, string.indexOf(':'));
	}
    }
    
    static final void method4637(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 1843164247 * class247.anInt2531;
    }
}
