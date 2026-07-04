/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public abstract class Class12 implements Interface6
{
    String[] aStringArray82;
    int anInt83;
    Class472 aClass472_84;
    Interface14 anInterface14_85;
    Class611 aClass611_86;
    Class10 aClass10_87;
    boolean aBool88;
    Class203 aClass203_89 = new Class203(50);
    Class672 aClass672_90;
    String[] aStringArray91;
    public static int anInt92;
    
    void method616(int i) {
	synchronized (aClass203_89) {
	    aClass203_89.method3876(i, (byte) 0);
	}
	synchronized (aClass611_86) {
	    aClass611_86.method10080(i);
	}
    }
    
    Class163 method617(Class185 class185, int i, int i_0_, int i_1_, int i_2_,
		       int i_3_, Class631 class631, int i_4_) {
	aClass10_87.anInt70 = 1219695045 * class185.anInt2001;
	aClass10_87.anInt69 = i * 1254922251;
	aClass10_87.anInt72 = 192735439 * i_0_;
	aClass10_87.anInt71 = i_1_ * -1566186789;
	aClass10_87.anInt73 = i_2_ * 823886211;
	aClass10_87.anInt68 = i_3_ * 1790782807;
	aClass10_87.aBool74 = class631 != null;
	return (Class163) aClass611_86.method10077(aClass10_87);
    }
    
    Class163 method618(Class185 class185, Class185 class185_5_, int i,
		       int i_6_, int i_7_, int i_8_, boolean bool,
		       boolean bool_9_, int i_10_, Class171 class171,
		       Class631 class631, Class632 class632,
		       Interface14 interface14, int i_11_) {
	if (!bool_9_) {
	    Class163 class163 = method617(class185_5_, i, i_6_, i_7_, i_8_,
					  i_10_, class631, -931778722);
	    if (class163 != null)
		return class163;
	}
	Class15 class15 = (Class15) interface14.method91(i, -291614281);
	if (i_6_ > 1 && class15.anIntArray105 != null) {
	    int i_12_ = -1;
	    for (int i_13_ = 0; i_13_ < 10; i_13_++) {
		if (i_6_ >= class15.anIntArray148[i_13_]
		    && 0 != class15.anIntArray148[i_13_])
		    i_12_ = class15.anIntArray105[i_13_];
	    }
	    if (-1 != i_12_)
		class15 = (Class15) interface14.method91(i_12_, 573178480);
	}
	int[] is = class15.method676(class185, class185_5_, i_6_, i_7_, i_8_,
				     bool, i_10_, class171, class631, class632,
				     -2111747094);
	if (null == is)
	    return null;
	Class163 class163;
	if (bool_9_)
	    class163 = class185.method3317(is, 0, 36, 36, 32, (byte) 47);
	else
	    class163 = class185_5_.method3317(is, 0, 36, 36, 32, (byte) -11);
	if (!bool_9_) {
	    Class10 class10 = new Class10();
	    class10.anInt70 = 1219695045 * class185_5_.anInt2001;
	    class10.anInt69 = i * 1254922251;
	    class10.anInt72 = i_6_ * 192735439;
	    class10.anInt71 = i_7_ * -1566186789;
	    class10.anInt73 = i_8_ * 823886211;
	    class10.anInt68 = i_10_ * 1790782807;
	    class10.aBool74 = null != class631;
	    aClass611_86.method10078(class163, class10);
	}
	return class163;
    }
    
    void method619(boolean bool, byte i) {
	if (aBool88 != bool) {
	    aBool88 = bool;
	    method621(1447389737);
	}
    }
    
    void method620(int i, int i_14_) {
	anInt83 = i * -1905823133;
	synchronized (aClass203_89) {
	    aClass203_89.method3877(-371840287);
	}
    }
    
    void method621(int i) {
	synchronized (aClass203_89) {
	    aClass203_89.method3877(449800151);
	}
	synchronized (aClass611_86) {
	    aClass611_86.method10081();
	}
    }
    
    void method622(int i, byte i_15_) {
	synchronized (aClass203_89) {
	    aClass203_89.method3876(i, (byte) 0);
	}
	synchronized (aClass611_86) {
	    aClass611_86.method10080(i);
	}
    }
    
    void method623(int i) {
	synchronized (aClass611_86) {
	    aClass611_86.method10081();
	}
    }
    
    void method624(byte i) {
	synchronized (aClass203_89) {
	    aClass203_89.method3884((byte) -38);
	}
	synchronized (aClass611_86) {
	    aClass611_86.method10076();
	}
    }
    
    Class163 method625(Class185 class185, int i, int i_16_, int i_17_,
		       int i_18_, int i_19_, Class631 class631) {
	aClass10_87.anInt70 = 1219695045 * class185.anInt2001;
	aClass10_87.anInt69 = i * 1254922251;
	aClass10_87.anInt72 = 192735439 * i_16_;
	aClass10_87.anInt71 = i_17_ * -1566186789;
	aClass10_87.anInt73 = i_18_ * 823886211;
	aClass10_87.anInt68 = i_19_ * 1790782807;
	aClass10_87.aBool74 = class631 != null;
	return (Class163) aClass611_86.method10077(aClass10_87);
    }
    
    Class12(Class675 class675, Class672 class672, boolean bool,
	    Class472 class472, Interface14 interface14) {
	aClass611_86 = new Class611(250);
	aClass10_87 = new Class10();
	aClass672_90 = class672;
	aBool88 = bool;
	aClass472_84 = class472;
	anInterface14_85 = interface14;
	if (class675 == Class675.aClass675_8634)
	    aStringArray82
		= new String[] { null, null,
				 Class58.aClass58_473.method1245(aClass672_90,
								 (byte) -117),
				 null, null,
				 Class58.aClass58_589.method1245(aClass672_90,
								 (byte) -68) };
	else
	    aStringArray82
		= new String[] { null, null,
				 Class58.aClass58_473.method1245(aClass672_90,
								 (byte) -57),
				 null, null, null };
	aStringArray91
	    = new String[] { null, null, null, null,
			     Class58.aClass58_591.method1245(aClass672_90,
							     (byte) -37) };
    }
    
    Class163 method626(Class185 class185, Class185 class185_20_, int i,
		       int i_21_, int i_22_, int i_23_, boolean bool,
		       boolean bool_24_, int i_25_, Class171 class171,
		       Class631 class631, Class632 class632,
		       Interface14 interface14) {
	if (!bool_24_) {
	    Class163 class163 = method617(class185_20_, i, i_21_, i_22_, i_23_,
					  i_25_, class631, -242378176);
	    if (class163 != null)
		return class163;
	}
	Class15 class15 = (Class15) interface14.method91(i, -1271962314);
	if (i_21_ > 1 && class15.anIntArray105 != null) {
	    int i_26_ = -1;
	    for (int i_27_ = 0; i_27_ < 10; i_27_++) {
		if (i_21_ >= class15.anIntArray148[i_27_]
		    && 0 != class15.anIntArray148[i_27_])
		    i_26_ = class15.anIntArray105[i_27_];
	    }
	    if (-1 != i_26_)
		class15 = (Class15) interface14.method91(i_26_, -588637651);
	}
	int[] is = class15.method676(class185, class185_20_, i_21_, i_22_,
				     i_23_, bool, i_25_, class171, class631,
				     class632, -406035342);
	if (null == is)
	    return null;
	Class163 class163;
	if (bool_24_)
	    class163 = class185.method3317(is, 0, 36, 36, 32, (byte) 59);
	else
	    class163 = class185_20_.method3317(is, 0, 36, 36, 32, (byte) 95);
	if (!bool_24_) {
	    Class10 class10 = new Class10();
	    class10.anInt70 = 1219695045 * class185_20_.anInt2001;
	    class10.anInt69 = i * 1254922251;
	    class10.anInt72 = i_21_ * 192735439;
	    class10.anInt71 = i_22_ * -1566186789;
	    class10.anInt73 = i_23_ * 823886211;
	    class10.anInt68 = i_25_ * 1790782807;
	    class10.aBool74 = null != class631;
	    aClass611_86.method10078(class163, class10);
	}
	return class163;
    }
    
    void method627(int i) {
	anInt83 = i * -1905823133;
	synchronized (aClass203_89) {
	    aClass203_89.method3877(134969781);
	}
    }
    
    void method628() {
	synchronized (aClass203_89) {
	    aClass203_89.method3877(-1097947471);
	}
	synchronized (aClass611_86) {
	    aClass611_86.method10081();
	}
    }
    
    void method629() {
	synchronized (aClass611_86) {
	    aClass611_86.method10081();
	}
    }
    
    void method630() {
	synchronized (aClass611_86) {
	    aClass611_86.method10081();
	}
    }
    
    void method631(int i) {
	synchronized (aClass203_89) {
	    aClass203_89.method3876(i, (byte) 0);
	}
	synchronized (aClass611_86) {
	    aClass611_86.method10080(i);
	}
    }
    
    void method632(int i) {
	synchronized (aClass203_89) {
	    aClass203_89.method3876(i, (byte) 0);
	}
	synchronized (aClass611_86) {
	    aClass611_86.method10080(i);
	}
    }
    
    void method633(int i) {
	synchronized (aClass203_89) {
	    aClass203_89.method3876(i, (byte) 0);
	}
	synchronized (aClass611_86) {
	    aClass611_86.method10080(i);
	}
    }
    
    Class163 method634(Class185 class185, int i, int i_28_, int i_29_,
		       int i_30_, int i_31_, Class631 class631) {
	aClass10_87.anInt70 = 1219695045 * class185.anInt2001;
	aClass10_87.anInt69 = i * 1254922251;
	aClass10_87.anInt72 = 192735439 * i_28_;
	aClass10_87.anInt71 = i_29_ * -1566186789;
	aClass10_87.anInt73 = i_30_ * 823886211;
	aClass10_87.anInt68 = i_31_ * 1790782807;
	aClass10_87.aBool74 = class631 != null;
	return (Class163) aClass611_86.method10077(aClass10_87);
    }
    
    void method635() {
	synchronized (aClass203_89) {
	    aClass203_89.method3884((byte) 1);
	}
	synchronized (aClass611_86) {
	    aClass611_86.method10076();
	}
    }
    
    void method636() {
	synchronized (aClass203_89) {
	    aClass203_89.method3884((byte) -22);
	}
	synchronized (aClass611_86) {
	    aClass611_86.method10076();
	}
    }
    
    static int method637(Class606_Sub1 class606_sub1,
			 Class606_Sub1 class606_sub1_32_, int i, boolean bool,
			 int i_33_, boolean bool_34_, byte i_35_) {
	int i_36_ = Class270.method5035(class606_sub1, class606_sub1_32_, i,
					bool, -1090299384);
	if (0 != i_36_) {
	    if (bool)
		return -i_36_;
	    return i_36_;
	}
	if (-1 == i_33_)
	    return 0;
	int i_37_ = Class270.method5035(class606_sub1, class606_sub1_32_,
					i_33_, bool_34_, 450625382);
	if (bool_34_)
	    return -i_37_;
	return i_37_;
    }
}
