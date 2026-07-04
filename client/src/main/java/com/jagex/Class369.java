/* Class369 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class369
{
    Map aMap3866 = new HashMap();
    Class367 aClass367_3867;
    public static Class472 aClass472_3868;
    static Class546 aClass546_3869;
    
    public Class388 method6368(int i, int i_0_, float f,
			       Interface42 interface42, byte i_1_) {
	if (method6370(i, -1789464162) != null)
	    return null;
	Class388 class388 = null;
	if (-1 != i_0_)
	    class388 = method6370(i_0_, -1742001628);
	Object object = aClass367_3867.method6337(class388, -1175516199);
	Class388 class388_2_
	    = new Class388(i, f, object, this, interface42, class388);
	aMap3866.put(Integer.valueOf(i), class388_2_);
	return class388_2_;
    }
    
    public void method6369() {
	Iterator iterator = aMap3866.values().iterator();
	while (iterator.hasNext()) {
	    Class388 class388 = (Class388) iterator.next();
	    class388.method6522((byte) -68);
	}
    }
    
    public Class369(Class367 class367) {
	aClass367_3867 = class367;
    }
    
    public Class388 method6370(int i, int i_3_) {
	return (Class388) aMap3866.get(Integer.valueOf(i));
    }
    
    public void method6371() {
	Iterator iterator = aMap3866.values().iterator();
	while (iterator.hasNext()) {
	    Class388 class388 = (Class388) iterator.next();
	    class388.method6522((byte) -85);
	}
    }
    
    public void method6372(byte i) {
	Iterator iterator = aMap3866.values().iterator();
	while (iterator.hasNext()) {
	    Class388 class388 = (Class388) iterator.next();
	    class388.method6522((byte) -89);
	}
    }
    
    public void method6373() {
	Iterator iterator = aMap3866.values().iterator();
	while (iterator.hasNext()) {
	    Class388 class388 = (Class388) iterator.next();
	    class388.method6522((byte) -32);
	}
    }
    
    public Class388 method6374(int i, int i_4_, float f,
			       Interface42 interface42) {
	if (method6370(i, -1792574429) != null)
	    return null;
	Class388 class388 = null;
	if (-1 != i_4_)
	    class388 = method6370(i_4_, -1908598363);
	Object object = aClass367_3867.method6337(class388, -469974098);
	Class388 class388_5_
	    = new Class388(i, f, object, this, interface42, class388);
	aMap3866.put(Integer.valueOf(i), class388_5_);
	return class388_5_;
    }
    
    public Class388 method6375(int i) {
	return (Class388) aMap3866.get(Integer.valueOf(i));
    }
    
    static final void method6376(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub40_10789
		  .method17215((byte) 41) == 1 ? 1 : 0;
    }
    
    static void method6377(Class185 class185, int i, int i_6_, int i_7_,
			   int i_8_, int i_9_, int i_10_, int i_11_,
			   int i_12_) {
	Class556 class556 = client.aClass512_11100.method8424((byte) 4);
	Interface62 interface62
	    = (Interface62) class556.method9258(i, i_6_, i_7_, (byte) -126);
	if (null != interface62) {
	    Class602 class602
		= ((Class602)
		   client.aClass512_11100.method8428(-1486655428)
		       .method91(interface62.method56(536818921), -627224852));
	    int i_13_ = interface62.method410(-601795518) & 0x3;
	    int i_14_ = interface62.method409(-1370243551);
	    if (class602.anInt7890 * 350336715 != -1)
		Class233.method4341(class185, class602, i_13_, i_8_, i_9_,
				    -564285963);
	    else {
		int i_15_ = i_10_;
		if (-2134171963 * class602.anInt7907 > 0)
		    i_15_ = i_11_;
		if (i_14_ == 847393323 * Class595.aClass595_7851.anInt7852
		    || (i_14_
			== 847393323 * Class595.aClass595_7829.anInt7852)) {
		    if (0 == i_13_)
			class185.method3302(i_8_, i_9_, 4, i_15_, -536128816);
		    else if (i_13_ == 1)
			class185.method3294(i_8_, i_9_, 4, i_15_, -1449346802);
		    else if (i_13_ == 2)
			class185.method3302(i_8_ + 3, i_9_, 4, i_15_,
					    1539520036);
		    else if (i_13_ == 3)
			class185.method3294(i_8_, 3 + i_9_, 4, i_15_,
					    -31706310);
		}
		if (i_14_ == Class595.aClass595_7832.anInt7852 * 847393323) {
		    if (i_13_ == 0)
			class185.method3292(i_8_, i_9_, 1, 1, i_15_,
					    -1869875990);
		    else if (1 == i_13_)
			class185.method3292(i_8_ + 3, i_9_, 1, 1, i_15_,
					    -1759410292);
		    else if (2 == i_13_)
			class185.method3292(i_8_ + 3, i_9_ + 3, 1, 1, i_15_,
					    -2007202839);
		    else if (3 == i_13_)
			class185.method3292(i_8_, i_9_ + 3, 1, 1, i_15_,
					    -1605395032);
		}
		if (i_14_ == 847393323 * Class595.aClass595_7829.anInt7852) {
		    if (i_13_ == 0)
			class185.method3294(i_8_, i_9_, 4, i_15_, 213704115);
		    else if (i_13_ == 1)
			class185.method3302(3 + i_8_, i_9_, 4, i_15_,
					    1440981367);
		    else if (i_13_ == 2)
			class185.method3294(i_8_, 3 + i_9_, 4, i_15_,
					    -998066876);
		    else if (3 == i_13_)
			class185.method3302(i_8_, i_9_, 4, i_15_, -798314068);
		}
	    }
	}
	interface62
	    = (Interface62) class556.method9262(i, i_6_, i_7_,
						client.anInterface64_11333,
						(byte) -69);
	if (null != interface62) {
	    Class602 class602
		= ((Class602)
		   (client.aClass512_11100.method8428(-1486655428).method91
		    (interface62.method56(-1131474014), 735664665)));
	    int i_16_ = interface62.method410(-2068299500) & 0x3;
	    int i_17_ = interface62.method409(-1654369315);
	    if (-1 != 350336715 * class602.anInt7890)
		Class233.method4341(class185, class602, i_16_, i_8_, i_9_,
				    -2074617850);
	    else if (i_17_ == 847393323 * Class595.aClass595_7833.anInt7852) {
		int i_18_ = -1118482;
		if (-2134171963 * class602.anInt7907 > 0)
		    i_18_ = -1179648;
		if (0 == i_16_ || 2 == i_16_)
		    class185.method3567(i_8_, i_9_ + 3, 3 + i_8_, i_9_, i_18_,
					1486360026);
		else
		    class185.method3567(i_8_, i_9_, 3 + i_8_, i_9_ + 3, i_18_,
					360611239);
	    }
	}
	interface62
	    = (Interface62) class556.method9264(i, i_6_, i_7_, (byte) 35);
	if (null != interface62) {
	    Class602 class602
		= ((Class602)
		   (client.aClass512_11100.method8428(-1486655428).method91
		    (interface62.method56(-1061613519), -1906050672)));
	    int i_19_ = interface62.method410(-714339831) & 0x3;
	    if (-1 != class602.anInt7890 * 350336715)
		Class233.method4341(class185, class602, i_19_, i_8_, i_9_,
				    -1204322471);
	}
    }
    
    public static Class523 method6378(Class472 class472, String string,
				      boolean bool, byte i) {
	int i_20_ = class472.method7683(string, (byte) 1);
	if (-1 == i_20_)
	    return new Class523(0);
	byte[] is = class472.method7743(i_20_, 1, -2067987666);
	if (is == null)
	    return new Class523(0);
	Class534_Sub40 class534_sub40 = new Class534_Sub40(is);
	int i_21_ = class534_sub40.method16529((byte) 1);
	Class523 class523 = new Class523(i_21_);
	int i_22_ = 0;
	while (i_22_ < class523.anInt7086 * -942354647) {
	    int i_23_ = class534_sub40.method16533(-258848859);
	    int i_24_ = class534_sub40.method16529((byte) 1);
	    int i_25_ = class534_sub40.method16527(-1817067964);
	    if (bool || i_25_ != 1) {
		class523.anIntArray7085[i_22_] = i_23_;
		class523.anIntArray7084[i_22_] = i_24_;
		i_22_++;
	    } else
		class523.anInt7086 -= -1704772327;
	}
	return class523;
    }
    
    static final void method6379(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class323_Sub2.method15693(class247, class243, class669, 16711935);
    }
    
    static final void method6380(Class669 class669, int i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class200_Sub4.anInt9897 * 1757658941;
    }
}
