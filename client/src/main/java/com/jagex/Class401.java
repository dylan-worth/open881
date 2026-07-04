/* Class401 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class401
{
    static Class401 aClass401_4134 = new Class401();
    static Class401 aClass401_4135 = new Class401();
    static Class401 aClass401_4136 = new Class401();
    
    public int method6586(int i, int i_0_, int i_1_) {
	int i_2_ = (1771907305 * Class706_Sub4.anInt10994 > i_0_
		    ? Class706_Sub4.anInt10994 * 1771907305 : i_0_);
	if (this == aClass401_4134)
	    return 0;
	if (aClass401_4136 == this)
	    return i_2_ - i;
	if (aClass401_4135 == this)
	    return (i_2_ - i) / 2;
	return 0;
    }
    
    public int method6587(int i, int i_3_) {
	int i_4_ = (1771907305 * Class706_Sub4.anInt10994 > i_3_
		    ? Class706_Sub4.anInt10994 * 1771907305 : i_3_);
	if (this == aClass401_4134)
	    return 0;
	if (aClass401_4136 == this)
	    return i_4_ - i;
	if (aClass401_4135 == this)
	    return (i_4_ - i) / 2;
	return 0;
    }
    
    public static Class401[] method6588() {
	return (new Class401[]
		{ aClass401_4134, aClass401_4135, aClass401_4136 });
    }
    
    public int method6589(int i, int i_5_) {
	int i_6_ = (1771907305 * Class706_Sub4.anInt10994 > i_5_
		    ? Class706_Sub4.anInt10994 * 1771907305 : i_5_);
	if (this == aClass401_4134)
	    return 0;
	if (aClass401_4136 == this)
	    return i_6_ - i;
	if (aClass401_4135 == this)
	    return (i_6_ - i) / 2;
	return 0;
    }
    
    public int method6590(int i, int i_7_) {
	int i_8_ = (1771907305 * Class706_Sub4.anInt10994 > i_7_
		    ? Class706_Sub4.anInt10994 * 1771907305 : i_7_);
	if (this == aClass401_4134)
	    return 0;
	if (aClass401_4136 == this)
	    return i_8_ - i;
	if (aClass401_4135 == this)
	    return (i_8_ - i) / 2;
	return 0;
    }
    
    Class401() {
	/* empty */
    }
    
    static final void method6591(Class669 class669, int i) {
	int i_9_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_9_, 1215186787);
	Class243 class243 = Class44_Sub11.aClass243Array11006[i_9_ >> 16];
	Class523.method8723(class247, class243, class669, -858902298);
    }
    
    static final void method6592(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_10_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_11_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_10_ - i_11_;
    }
}
