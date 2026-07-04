/* Class406 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Map;

public class Class406 implements Interface2
{
    int[] anIntArray4289;
    Map aMap4290;
    Class203 aClass203_4291 = new Class203(20);
    Class203 aClass203_4292 = new Class203(20);
    Class472 aClass472_4293;
    Class203 aClass203_4294;
    Class472 aClass472_4295;
    Class185 aClass185_4296 = null;
    static Class472 aClass472_4297;
    static int anInt4298;
    
    public int method6644(byte i) {
	return method6648(false, (byte) 11);
    }
    
    public void method6645(Interface52 interface52, int i) {
	aMap4290 = new HashMap(anIntArray4289.length);
	for (int i_0_ = 0; i_0_ < anIntArray4289.length; i_0_++) {
	    int i_1_ = anIntArray4289[i_0_];
	    Class16 class16
		= Class20.method804(aClass472_4293, i_1_, this, -103210469);
	    byte[] is = aClass472_4295.method7738(i_1_, (byte) -17);
	    Object object
		= interface52.method371(is, class16, true, -1270946121);
	    aMap4290.put(Integer.valueOf(i_0_), new Class7(object, class16));
	}
    }
    
    public void method6646(int i) {
	aMap4290 = null;
    }
    
    public void method6647() {
	aClass203_4292.method3884((byte) -123);
	aClass203_4291.method3884((byte) -108);
	if (aClass203_4294 != null)
	    aClass203_4294.method3884((byte) -46);
    }
    
    public int method6648(boolean bool, byte i) {
	if (anIntArray4289 == null)
	    return 0;
	if (!bool && aMap4290 != null)
	    return 2 * anIntArray4289.length;
	int i_2_ = 0;
	for (int i_3_ = 0; i_3_ < anIntArray4289.length; i_3_++) {
	    int i_4_ = anIntArray4289[i_3_];
	    if (aClass472_4295.method7670(i_4_, (byte) -62))
		i_2_++;
	    if (aClass472_4293.method7670(i_4_, (byte) -10))
		i_2_++;
	}
	return i_2_;
    }
    
    public int method6649(byte i) {
	if (null == anIntArray4289)
	    return 0;
	return 2 * anIntArray4289.length;
    }
    
    public Object method6650(Interface52 interface52, int i, boolean bool,
			     boolean bool_5_, byte i_6_) {
	if (i == -1)
	    return null;
	if (anIntArray4289 != null) {
	    for (int i_7_ = 0; i_7_ < anIntArray4289.length; i_7_++) {
		if (i == anIntArray4289[i_7_])
		    return (((Class7) aMap4290.get(Integer.valueOf(i_7_)))
			    .anObject58);
	    }
	}
	Object object
	    = aClass203_4291.method3871((long) (i << 1 | (bool_5_ ? 1 : 0)));
	if (null != object)
	    return object;
	byte[] is = aClass472_4295.method7738(i, (byte) -63);
	if (null == is)
	    return null;
	Class16 class16 = method6651(interface52, i, bool, false, 1673391104);
	if (null == class16)
	    return null;
	object = interface52.method371(is, class16, bool_5_, -1270946121);
	aClass203_4291.method3893(object, (long) (i << 1 | (bool_5_ ? 1 : 0)));
	return object;
    }
    
    public Class163[] method14(Class185 class185, int i) {
	if (null == aClass203_4294)
	    return null;
	if (null != class185) {
	    if (aClass185_4296 != class185)
		aClass203_4294.method3877(1941278351);
	    aClass185_4296 = class185;
	} else
	    class185 = aClass185_4296;
	if (class185 != null) {
	    Class163[] class163s
		= (Class163[]) aClass203_4294.method3871((long) i);
	    if (class163s == null) {
		Class169[] class169s
		    = Class178.method2939(aClass472_4295, i, 0);
		if (null != class169s && class169s.length > 0) {
		    class163s = new Class163[class169s.length];
		    for (int i_8_ = 0; i_8_ < class169s.length; i_8_++)
			class163s[i_8_]
			    = class185.method3279(class169s[i_8_], true);
		    aClass203_4294.method3893(class163s, (long) i);
		}
	    }
	    return class163s;
	}
	return null;
    }
    
    Class16 method6651(Interface52 interface52, int i, boolean bool,
		       boolean bool_9_, int i_10_) {
	if (-1 == i)
	    return null;
	if (null != anIntArray4289) {
	    for (int i_11_ = 0; i_11_ < anIntArray4289.length; i_11_++) {
		if (i == anIntArray4289[i_11_])
		    return ((Class16)
			    (((Class7) aMap4290.get(Integer.valueOf(i_11_)))
			     .anObject59));
	    }
	}
	if (bool_9_)
	    aClass472_4295.method7670(i, (byte) -26);
	Class16 class16 = (Class16) aClass203_4292.method3871((long) i);
	if (null != class16)
	    return class16;
	class16 = Class20.method804(aClass472_4293, i, this, -103210469);
	if (null == class16)
	    return null;
	if (bool)
	    aClass203_4292.method3893(class16, (long) i);
	return class16;
    }
    
    public void method6652(byte i) {
	aClass203_4292.method3877(918319031);
	aClass203_4291.method3877(-1138255719);
	if (null != aClass203_4294)
	    aClass203_4294.method3877(1193560156);
    }
    
    public int method6653() {
	return method6648(false, (byte) 30);
    }
    
    public void method6654(byte i) {
	aClass203_4292.method3884((byte) -122);
	aClass203_4291.method3884((byte) -5);
	if (aClass203_4294 != null)
	    aClass203_4294.method3884((byte) 6);
    }
    
    public Class163[] method19(Class185 class185, int i, int i_12_) {
	if (null == aClass203_4294)
	    return null;
	if (null != class185) {
	    if (aClass185_4296 != class185)
		aClass203_4294.method3877(-1076760580);
	    aClass185_4296 = class185;
	} else
	    class185 = aClass185_4296;
	if (class185 != null) {
	    Class163[] class163s
		= (Class163[]) aClass203_4294.method3871((long) i);
	    if (class163s == null) {
		Class169[] class169s
		    = Class178.method2939(aClass472_4295, i, 0);
		if (null != class169s && class169s.length > 0) {
		    class163s = new Class163[class169s.length];
		    for (int i_13_ = 0; i_13_ < class169s.length; i_13_++)
			class163s[i_13_]
			    = class185.method3279(class169s[i_13_], true);
		    aClass203_4294.method3893(class163s, (long) i);
		}
	    }
	    return class163s;
	}
	return null;
    }
    
    public int method15(int i, int i_14_) {
	Class163[] class163s = method19(aClass185_4296, i, 1532128259);
	if (null != class163s)
	    return class163s[0].method22();
	return 0;
    }
    
    public int method6655() {
	if (null == anIntArray4289)
	    return 0;
	return 2 * anIntArray4289.length;
    }
    
    public void method6656(Interface52 interface52) {
	aMap4290 = new HashMap(anIntArray4289.length);
	for (int i = 0; i < anIntArray4289.length; i++) {
	    int i_15_ = anIntArray4289[i];
	    Class16 class16
		= Class20.method804(aClass472_4293, i_15_, this, -103210469);
	    byte[] is = aClass472_4295.method7738(i_15_, (byte) -8);
	    Object object
		= interface52.method371(is, class16, true, -1270946121);
	    aMap4290.put(Integer.valueOf(i), new Class7(object, class16));
	}
    }
    
    public void method6657() {
	aMap4290 = null;
    }
    
    public void method6658() {
	aMap4290 = null;
    }
    
    public Class16 method6659(Interface52 interface52, int i) {
	return method6651(interface52, i, true, true, 1427072963);
    }
    
    public int method6660() {
	return method6648(false, (byte) 53);
    }
    
    public int method16(int i) {
	Class163[] class163s = method19(aClass185_4296, i, 1532128259);
	if (null != class163s)
	    return class163s[0].method22();
	return 0;
    }
    
    public void method6661() {
	aMap4290 = null;
    }
    
    public int method6662(boolean bool) {
	if (anIntArray4289 == null)
	    return 0;
	if (!bool && aMap4290 != null)
	    return 2 * anIntArray4289.length;
	int i = 0;
	for (int i_16_ = 0; i_16_ < anIntArray4289.length; i_16_++) {
	    int i_17_ = anIntArray4289[i_16_];
	    if (aClass472_4295.method7670(i_17_, (byte) -27))
		i++;
	    if (aClass472_4293.method7670(i_17_, (byte) -75))
		i++;
	}
	return i;
    }
    
    public void method6663(int i) {
	aClass203_4292.method3876(i, (byte) 0);
	aClass203_4291.method3876(i, (byte) 0);
	if (null != aClass203_4294)
	    aClass203_4294.method3876(i, (byte) 0);
    }
    
    public int method6664() {
	if (null == anIntArray4289)
	    return 0;
	return 2 * anIntArray4289.length;
    }
    
    public Object method6665(Interface52 interface52, int i, boolean bool,
			     boolean bool_18_) {
	if (i == -1)
	    return null;
	if (anIntArray4289 != null) {
	    for (int i_19_ = 0; i_19_ < anIntArray4289.length; i_19_++) {
		if (i == anIntArray4289[i_19_])
		    return (((Class7) aMap4290.get(Integer.valueOf(i_19_)))
			    .anObject58);
	    }
	}
	Object object
	    = aClass203_4291.method3871((long) (i << 1 | (bool_18_ ? 1 : 0)));
	if (null != object)
	    return object;
	byte[] is = aClass472_4295.method7738(i, (byte) -45);
	if (null == is)
	    return null;
	Class16 class16 = method6651(interface52, i, bool, false, 1835106002);
	if (null == class16)
	    return null;
	object = interface52.method371(is, class16, bool_18_, -1270946121);
	aClass203_4291.method3893(object,
				  (long) (i << 1 | (bool_18_ ? 1 : 0)));
	return object;
    }
    
    public Class16 method6666(Interface52 interface52, int i, byte i_20_) {
	return method6651(interface52, i, true, true, -735490778);
    }
    
    Class16 method6667(Interface52 interface52, int i, boolean bool,
		       boolean bool_21_) {
	if (-1 == i)
	    return null;
	if (null != anIntArray4289) {
	    for (int i_22_ = 0; i_22_ < anIntArray4289.length; i_22_++) {
		if (i == anIntArray4289[i_22_])
		    return ((Class16)
			    (((Class7) aMap4290.get(Integer.valueOf(i_22_)))
			     .anObject59));
	    }
	}
	if (bool_21_)
	    aClass472_4295.method7670(i, (byte) -120);
	Class16 class16 = (Class16) aClass203_4292.method3871((long) i);
	if (null != class16)
	    return class16;
	class16 = Class20.method804(aClass472_4293, i, this, -103210469);
	if (null == class16)
	    return null;
	if (bool)
	    aClass203_4292.method3893(class16, (long) i);
	return class16;
    }
    
    Class16 method6668(Interface52 interface52, int i, boolean bool,
		       boolean bool_23_) {
	if (-1 == i)
	    return null;
	if (null != anIntArray4289) {
	    for (int i_24_ = 0; i_24_ < anIntArray4289.length; i_24_++) {
		if (i == anIntArray4289[i_24_])
		    return ((Class16)
			    (((Class7) aMap4290.get(Integer.valueOf(i_24_)))
			     .anObject59));
	    }
	}
	if (bool_23_)
	    aClass472_4295.method7670(i, (byte) -81);
	Class16 class16 = (Class16) aClass203_4292.method3871((long) i);
	if (null != class16)
	    return class16;
	class16 = Class20.method804(aClass472_4293, i, this, -103210469);
	if (null == class16)
	    return null;
	if (bool)
	    aClass203_4292.method3893(class16, (long) i);
	return class16;
    }
    
    public void method6669() {
	aClass203_4292.method3877(1989118263);
	aClass203_4291.method3877(24909333);
	if (null != aClass203_4294)
	    aClass203_4294.method3877(942681909);
    }
    
    public void method6670(int i, int i_25_) {
	aClass203_4292.method3876(i, (byte) 0);
	aClass203_4291.method3876(i, (byte) 0);
	if (null != aClass203_4294)
	    aClass203_4294.method3876(i, (byte) 0);
    }
    
    public void method6671(int i) {
	aClass203_4292.method3876(i, (byte) 0);
	aClass203_4291.method3876(i, (byte) 0);
	if (null != aClass203_4294)
	    aClass203_4294.method3876(i, (byte) 0);
    }
    
    public Class406(Class185 class185, Class472 class472,
		    Class472 class472_26_, int[] is) {
	aMap4290 = null;
	aClass185_4296 = class185;
	aClass472_4295 = class472;
	aClass472_4293 = class472_26_;
	anIntArray4289 = is;
	aClass203_4294 = new Class203(20);
    }
    
    public void method6672(Interface52 interface52) {
	aMap4290 = new HashMap(anIntArray4289.length);
	for (int i = 0; i < anIntArray4289.length; i++) {
	    int i_27_ = anIntArray4289[i];
	    Class16 class16
		= Class20.method804(aClass472_4293, i_27_, this, -103210469);
	    byte[] is = aClass472_4295.method7738(i_27_, (byte) -46);
	    Object object
		= interface52.method371(is, class16, true, -1270946121);
	    aMap4290.put(Integer.valueOf(i), new Class7(object, class16));
	}
    }
    
    public void method6673(int i) {
	aClass203_4292.method3876(i, (byte) 0);
	aClass203_4291.method3876(i, (byte) 0);
	if (null != aClass203_4294)
	    aClass203_4294.method3876(i, (byte) 0);
    }
    
    public void method6674(int i) {
	aClass203_4292.method3876(i, (byte) 0);
	aClass203_4291.method3876(i, (byte) 0);
	if (null != aClass203_4294)
	    aClass203_4294.method3876(i, (byte) 0);
    }
    
    public void method6675() {
	aClass203_4292.method3877(738564225);
	aClass203_4291.method3877(-308416640);
	if (null != aClass203_4294)
	    aClass203_4294.method3877(-2041756443);
    }
    
    public int method6676() {
	return method6648(false, (byte) 13);
    }
    
    public Class163[] method17(Class185 class185, int i) {
	if (null == aClass203_4294)
	    return null;
	if (null != class185) {
	    if (aClass185_4296 != class185)
		aClass203_4294.method3877(-179606196);
	    aClass185_4296 = class185;
	} else
	    class185 = aClass185_4296;
	if (class185 != null) {
	    Class163[] class163s
		= (Class163[]) aClass203_4294.method3871((long) i);
	    if (class163s == null) {
		Class169[] class169s
		    = Class178.method2939(aClass472_4295, i, 0);
		if (null != class169s && class169s.length > 0) {
		    class163s = new Class163[class169s.length];
		    for (int i_28_ = 0; i_28_ < class169s.length; i_28_++)
			class163s[i_28_]
			    = class185.method3279(class169s[i_28_], true);
		    aClass203_4294.method3893(class163s, (long) i);
		}
	    }
	    return class163s;
	}
	return null;
    }
    
    public Class163[] method18(Class185 class185, int i) {
	if (null == aClass203_4294)
	    return null;
	if (null != class185) {
	    if (aClass185_4296 != class185)
		aClass203_4294.method3877(-734226491);
	    aClass185_4296 = class185;
	} else
	    class185 = aClass185_4296;
	if (class185 != null) {
	    Class163[] class163s
		= (Class163[]) aClass203_4294.method3871((long) i);
	    if (class163s == null) {
		Class169[] class169s
		    = Class178.method2939(aClass472_4295, i, 0);
		if (null != class169s && class169s.length > 0) {
		    class163s = new Class163[class169s.length];
		    for (int i_29_ = 0; i_29_ < class169s.length; i_29_++)
			class163s[i_29_]
			    = class185.method3279(class169s[i_29_], true);
		    aClass203_4294.method3893(class163s, (long) i);
		}
	    }
	    return class163s;
	}
	return null;
    }
    
    public void method6677(int i) {
	aClass203_4292.method3876(i, (byte) 0);
	aClass203_4291.method3876(i, (byte) 0);
	if (null != aClass203_4294)
	    aClass203_4294.method3876(i, (byte) 0);
    }
    
    static final void method6678(Class669 class669, int i) {
	int i_30_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_30_, 1989625054);
	int i_31_ = -1;
	int i_32_ = -1;
	Class246 class246
	    = class247.method4525(Class254.aClass185_2683, 447549967);
	if (null != class246) {
	    i_31_ = class246.anInt2420 * -760407609;
	    i_32_ = class246.anInt2419 * -976807825;
	}
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_31_;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_32_;
    }
    
    static final void method6679(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = client.aBool11281 ? 1 : 0;
    }
    
    static final void method6680(Class669 class669, int i) {
	String string
	    = (String) (class669.anObjectArray8593
			[(class669.anInt8594 -= 1460193483) * 1485266147]);
	Class80.method1629(string, (byte) 4);
    }
    
    static void method6681(int i, int i_33_, Class247 class247,
			   Class246 class246, int i_34_, int i_35_,
			   byte i_36_) {
	Class99[] class99s = client.aClass99Array11053;
	for (int i_37_ = 0; i_37_ < class99s.length; i_37_++) {
	    Class99 class99 = class99s[i_37_];
	    if (class99 != null && 0 != class99.anInt1176 * 652406965
		&& client.anInt11101 % 20 < 10) {
		if (1 == class99.anInt1176 * 652406965) {
		    Class534_Sub6 class534_sub6
			= ((Class534_Sub6)
			   (client.aClass9_11331.method579
			    ((long) (class99.anInt1169 * -879249997))));
		    if (class534_sub6 != null) {
			Class654_Sub1_Sub5_Sub1_Sub1 class654_sub1_sub5_sub1_sub1
			    = ((Class654_Sub1_Sub5_Sub1_Sub1)
			       class534_sub6.anObject10417);
			Class438 class438
			    = (class654_sub1_sub5_sub1_sub1.method10807()
			       .aClass438_4885);
			int i_38_ = (int) class438.aFloat4864 / 128 - i / 128;
			int i_39_
			    = (int) class438.aFloat4865 / 128 - i_33_ / 128;
			Class15.method724(class247, class246, i_34_, i_35_,
					  i_38_, i_39_,
					  class99.anInt1177 * -1562758755,
					  360000L);
		    }
		}
		if (class99.anInt1176 * 652406965 == 2) {
		    int i_40_ = 487170425 * class99.anInt1171 / 128 - i / 128;
		    int i_41_
			= class99.anInt1172 * 631467137 / 128 - i_33_ / 128;
		    long l = (long) (-41335265 * class99.anInt1175 << 7);
		    l *= l;
		    Class15.method724(class247, class246, i_34_, i_35_, i_40_,
				      i_41_, -1562758755 * class99.anInt1177,
				      l);
		}
		if (652406965 * class99.anInt1176 == 10
		    && class99.anInt1169 * -879249997 >= 0
		    && (-879249997 * class99.anInt1169
			< (client
			   .aClass654_Sub1_Sub5_Sub1_Sub2Array11279).length)) {
		    Class654_Sub1_Sub5_Sub1_Sub2 class654_sub1_sub5_sub1_sub2
			= (client.aClass654_Sub1_Sub5_Sub1_Sub2Array11279
			   [-879249997 * class99.anInt1169]);
		    if (null != class654_sub1_sub5_sub1_sub2) {
			Class438 class438
			    = (class654_sub1_sub5_sub1_sub2.method10807()
			       .aClass438_4885);
			int i_42_ = (int) class438.aFloat4864 / 128 - i / 128;
			int i_43_
			    = (int) class438.aFloat4865 / 128 - i_33_ / 128;
			Class15.method724(class247, class246, i_34_, i_35_,
					  i_42_, i_43_,
					  class99.anInt1177 * -1562758755,
					  360000L);
		    }
		}
	    }
	}
    }
    
    public static void method6682(Class150 class150, int i) {
	Class534_Sub18_Sub6 class534_sub18_sub6
	    = Class447.method7308(1,
				  (long) (class150.anInt1694 * -1270946121));
	class534_sub18_sub6.method18182(-1052637456);
    }
}
