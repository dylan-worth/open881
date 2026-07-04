/* Class478 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.awt.Container;
import java.awt.Insets;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class Class478
{
    Comparator aComparator5192 = new Class471(this);
    Map aMap5193;
    AbstractQueue_Sub1 anAbstractQueue_Sub1_5194;
    AbstractQueue_Sub1 anAbstractQueue_Sub1_5195;
    long aLong5196;
    Class461 aClass461_5197;
    int anInt5198;
    
    public Object method7783(Object object) {
	synchronized (this) {
	    if (-1L != aLong5196 * 780914785329792443L)
		method7789(-1377410656);
	    Class469 class469 = (Class469) aMap5193.get(object);
	    if (null == class469) {
		Object object_0_ = null;
		return object_0_;
	    }
	    method7787(class469, false, 1463954408);
	    Object object_1_ = class469.anObject5147;
	    return object_1_;
	}
    }
    
    Class478(long l, int i, Class461 class461) {
	aLong5196 = l * -3128581684624738445L;
	anInt5198 = i * 864869239;
	aClass461_5197 = class461;
	if (anInt5198 * 1139699271 == -1) {
	    aMap5193 = new HashMap(64);
	    anAbstractQueue_Sub1_5194
		= new AbstractQueue_Sub1(64, aComparator5192);
	    anAbstractQueue_Sub1_5195 = null;
	} else {
	    if (aClass461_5197 == null)
		throw new IllegalArgumentException("");
	    aMap5193 = new HashMap(anInt5198 * 1139699271);
	    anAbstractQueue_Sub1_5194
		= new AbstractQueue_Sub1(1139699271 * anInt5198,
					 aComparator5192);
	    anAbstractQueue_Sub1_5195
		= new AbstractQueue_Sub1(1139699271 * anInt5198);
	}
    }
    
    boolean method7784(int i) {
	return anInt5198 * 1139699271 != -1;
    }
    
    void method7785() {
	if (780914785329792443L * aLong5196 == -1L)
	    throw new IllegalStateException("");
	long l = System.currentTimeMillis() - aLong5196 * 780914785329792443L;
	while (!anAbstractQueue_Sub1_5194.isEmpty()) {
	    Class469 class469 = (Class469) anAbstractQueue_Sub1_5194.peek();
	    if (class469.aLong5149 * -4949530321911881879L < l) {
		aMap5193.remove(class469.anObject5148);
		anAbstractQueue_Sub1_5194.remove(class469);
		if (method7784(993274098))
		    anAbstractQueue_Sub1_5195.remove(class469);
	    } else
		break;
	}
    }
    
    void method7786(Class469 class469, boolean bool) {
	if (!bool) {
	    anAbstractQueue_Sub1_5194.remove(class469);
	    if (method7784(993274098)
		&& !anAbstractQueue_Sub1_5195.remove(class469))
		throw new IllegalStateException("");
	}
	class469.aLong5149 = System.currentTimeMillis() * 4711446986571620569L;
	if (method7784(993274098)) {
	    switch (aClass461_5197.anInt5072 * 1303515907) {
	    case 1:
		class469.aLong5150
		    = -2502041163440165909L * class469.aLong5149;
		break;
	    case 0:
		class469.aLong5150 += -4683728638372128205L;
		break;
	    }
	    anAbstractQueue_Sub1_5195.add(class469);
	}
	anAbstractQueue_Sub1_5194.add(class469);
    }
    
    void method7787(Class469 class469, boolean bool, int i) {
	if (!bool) {
	    anAbstractQueue_Sub1_5194.remove(class469);
	    if (method7784(993274098)
		&& !anAbstractQueue_Sub1_5195.remove(class469))
		throw new IllegalStateException("");
	}
	class469.aLong5149 = System.currentTimeMillis() * 4711446986571620569L;
	if (method7784(993274098)) {
	    switch (aClass461_5197.anInt5072 * 1303515907) {
	    case 1:
		class469.aLong5150
		    = -2502041163440165909L * class469.aLong5149;
		break;
	    case 0:
		class469.aLong5150 += -4683728638372128205L;
		break;
	    }
	    anAbstractQueue_Sub1_5195.add(class469);
	}
	anAbstractQueue_Sub1_5194.add(class469);
    }
    
    void method7788() {
	if (780914785329792443L * aLong5196 == -1L)
	    throw new IllegalStateException("");
	long l = System.currentTimeMillis() - aLong5196 * 780914785329792443L;
	while (!anAbstractQueue_Sub1_5194.isEmpty()) {
	    Class469 class469 = (Class469) anAbstractQueue_Sub1_5194.peek();
	    if (class469.aLong5149 * -4949530321911881879L < l) {
		aMap5193.remove(class469.anObject5148);
		anAbstractQueue_Sub1_5194.remove(class469);
		if (method7784(993274098))
		    anAbstractQueue_Sub1_5195.remove(class469);
	    } else
		break;
	}
    }
    
    void method7789(int i) {
	if (780914785329792443L * aLong5196 == -1L)
	    throw new IllegalStateException("");
	long l = System.currentTimeMillis() - aLong5196 * 780914785329792443L;
	while (!anAbstractQueue_Sub1_5194.isEmpty()) {
	    Class469 class469 = (Class469) anAbstractQueue_Sub1_5194.peek();
	    if (class469.aLong5149 * -4949530321911881879L < l) {
		aMap5193.remove(class469.anObject5148);
		anAbstractQueue_Sub1_5194.remove(class469);
		if (method7784(993274098))
		    anAbstractQueue_Sub1_5195.remove(class469);
	    } else
		break;
	}
    }
    
    public Object method7790(Object object) {
	synchronized (this) {
	    if (-1L != aLong5196 * 780914785329792443L)
		method7789(-1677807079);
	    Class469 class469 = (Class469) aMap5193.get(object);
	    if (null == class469) {
		Object object_2_ = null;
		return object_2_;
	    }
	    method7787(class469, false, 1463954408);
	    Object object_3_ = class469.anObject5147;
	    return object_3_;
	}
    }
    
    public Object method7791(Object object, Object object_4_, int i) {
	synchronized (this) {
	    if (aLong5196 * 780914785329792443L != -1L)
		method7789(-1000519363);
	    Class469 class469 = (Class469) aMap5193.get(object);
	    if (class469 != null) {
		Object object_5_ = class469.anObject5147;
		class469.anObject5147 = object_4_;
		method7787(class469, false, 1463954408);
		Object object_6_ = object_5_;
		return object_6_;
	    }
	    if (method7784(993274098)
		&& aMap5193.size() == anInt5198 * 1139699271) {
		Class469 class469_7_
		    = (Class469) anAbstractQueue_Sub1_5195.remove();
		aMap5193.remove(class469_7_.anObject5148);
		anAbstractQueue_Sub1_5194.remove(class469_7_);
	    }
	    Class469 class469_8_ = new Class469(object_4_, object);
	    aMap5193.put(object, class469_8_);
	    method7787(class469_8_, true, 1463954408);
	    Object object_9_ = null;
	    return object_9_;
	}
    }
    
    boolean method7792() {
	return anInt5198 * 1139699271 != -1;
    }
    
    public Object method7793(Object object, int i) {
	synchronized (this) {
	    if (-1L != aLong5196 * 780914785329792443L)
		method7789(-1223501941);
	    Class469 class469 = (Class469) aMap5193.get(object);
	    if (null == class469) {
		Object object_10_ = null;
		return object_10_;
	    }
	    method7787(class469, false, 1463954408);
	    Object object_11_ = class469.anObject5147;
	    return object_11_;
	}
    }
    
    void method7794() {
	if (780914785329792443L * aLong5196 == -1L)
	    throw new IllegalStateException("");
	long l = System.currentTimeMillis() - aLong5196 * 780914785329792443L;
	while (!anAbstractQueue_Sub1_5194.isEmpty()) {
	    Class469 class469 = (Class469) anAbstractQueue_Sub1_5194.peek();
	    if (class469.aLong5149 * -4949530321911881879L < l) {
		aMap5193.remove(class469.anObject5148);
		anAbstractQueue_Sub1_5194.remove(class469);
		if (method7784(993274098))
		    anAbstractQueue_Sub1_5195.remove(class469);
	    } else
		break;
	}
    }
    
    void method7795() {
	if (780914785329792443L * aLong5196 == -1L)
	    throw new IllegalStateException("");
	long l = System.currentTimeMillis() - aLong5196 * 780914785329792443L;
	while (!anAbstractQueue_Sub1_5194.isEmpty()) {
	    Class469 class469 = (Class469) anAbstractQueue_Sub1_5194.peek();
	    if (class469.aLong5149 * -4949530321911881879L < l) {
		aMap5193.remove(class469.anObject5148);
		anAbstractQueue_Sub1_5194.remove(class469);
		if (method7784(993274098))
		    anAbstractQueue_Sub1_5195.remove(class469);
	    } else
		break;
	}
    }
    
    public Class478(int i, Class461 class461) {
	this(-1L, i, class461);
    }
    
    public Object method7796(Object object, Object object_12_) {
	synchronized (this) {
	    if (aLong5196 * 780914785329792443L != -1L)
		method7789(-415707274);
	    Class469 class469 = (Class469) aMap5193.get(object);
	    if (class469 != null) {
		Object object_13_ = class469.anObject5147;
		class469.anObject5147 = object_12_;
		method7787(class469, false, 1463954408);
		Object object_14_ = object_13_;
		return object_14_;
	    }
	    if (method7784(993274098)
		&& aMap5193.size() == anInt5198 * 1139699271) {
		Class469 class469_15_
		    = (Class469) anAbstractQueue_Sub1_5195.remove();
		aMap5193.remove(class469_15_.anObject5148);
		anAbstractQueue_Sub1_5194.remove(class469_15_);
	    }
	    Class469 class469_16_ = new Class469(object_12_, object);
	    aMap5193.put(object, class469_16_);
	    method7787(class469_16_, true, 1463954408);
	    Object object_17_ = null;
	    return object_17_;
	}
    }
    
    void method7797() {
	if (780914785329792443L * aLong5196 == -1L)
	    throw new IllegalStateException("");
	long l = System.currentTimeMillis() - aLong5196 * 780914785329792443L;
	while (!anAbstractQueue_Sub1_5194.isEmpty()) {
	    Class469 class469 = (Class469) anAbstractQueue_Sub1_5194.peek();
	    if (class469.aLong5149 * -4949530321911881879L < l) {
		aMap5193.remove(class469.anObject5148);
		anAbstractQueue_Sub1_5194.remove(class469);
		if (method7784(993274098))
		    anAbstractQueue_Sub1_5195.remove(class469);
	    } else
		break;
	}
    }
    
    void method7798() {
	if (780914785329792443L * aLong5196 == -1L)
	    throw new IllegalStateException("");
	long l = System.currentTimeMillis() - aLong5196 * 780914785329792443L;
	while (!anAbstractQueue_Sub1_5194.isEmpty()) {
	    Class469 class469 = (Class469) anAbstractQueue_Sub1_5194.peek();
	    if (class469.aLong5149 * -4949530321911881879L < l) {
		aMap5193.remove(class469.anObject5148);
		anAbstractQueue_Sub1_5194.remove(class469);
		if (method7784(993274098))
		    anAbstractQueue_Sub1_5195.remove(class469);
	    } else
		break;
	}
    }
    
    public static int method7799(byte i) {
	if (!Class228.method4188(-1736530199))
	    return 0;
	return Class574.anInt7709 * 1378653945;
    }
    
    static void method7800(int i) {
	if (Class592.aClass62_7815 != null) {
	    try {
		int i_18_;
		if (Class40.anInt310 * 2039255983 == 0)
		    i_18_ = 250;
		else
		    i_18_ = 2000;
		Class40.anInt312 += 999247095;
		if (-1232128825 * Class40.anInt312 > i_18_)
		    Class690.method14032(270189415);
		if (Class592.aClass62_7815 == Class62.aClass62_649) {
		    client.aClass100_11094.method1880
			(Class106.method1945(Class5.aClass23_49
						 .method817(434457512),
					     40000, (byte) 97),
			 Class5.aClass23_49.aString223, -1850530127);
		    client.aClass100_11094.method1874(1452139388);
		    Class534_Sub19 class534_sub19
			= Class56.method1225(1502735826);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16506
			(Class413.aClass413_4652.anInt4648 * -100453045,
			 1709134748);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16507(0, 2027279375);
		    int i_19_
			= 31645619 * (class534_sub19.aClass534_Sub40_Sub1_10513
				      .anInt10811);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16507(881, 679330934);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16507(1, 1190520288);
		    Class40.anIntArray309
			= Class175_Sub2_Sub1.method17935(class534_sub19,
							 -1838936122);
		    int i_20_
			= 31645619 * (class534_sub19.aClass534_Sub40_Sub1_10513
				      .anInt10811);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16713(client.aString11197, -2070414795);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16507
			(1844562269 * client.anInt11020, 590862154);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16510
			(-1608886643 * client.anInt11024, -2033595566);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16510
			(1306630125 * client.anInt11276, -1258356230);
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16713(Class29.aString267, 505714112);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16506
			(Class539.aClass672_7171.method93(), 399716269);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16506
			(-1082924039 * client.aClass675_11016.anInt8642,
			 394171371);
		    Class646.method10690((class534_sub19
					  .aClass534_Sub40_Sub1_10513),
					 (byte) 79);
		    String string = client.aString11029;
		    class534_sub19.aClass534_Sub40_Sub1_10513
			.method16506(string == null ? 0 : 1, 1309052031);
		    if (string != null)
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16713(string, 923027065);
		    Class200_Sub23.aClass534_Sub28_10040.method16312
			(class534_sub19.aClass534_Sub40_Sub1_10513,
			 (byte) -61);
		    class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			+= -1122347939;
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16756
			(Class40.anIntArray309, i_20_,
			 31645619 * (class534_sub19.aClass534_Sub40_Sub1_10513
				     .anInt10811),
			 (byte) 16);
		    class534_sub19.aClass534_Sub40_Sub1_10513.method16733
			((class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			  * 31645619) - i_19_,
			 102687603);
		    client.aClass100_11094.method1863(class534_sub19,
						      (byte) 93);
		    client.aClass100_11094.method1868(1805858475);
		    Class592.aClass62_7815 = Class62.aClass62_648;
		}
		if (Class592.aClass62_7815 == Class62.aClass62_648) {
		    if (client.aClass100_11094.method1867(1569062437) == null)
			Class690.method14032(270189415);
		    else if (client.aClass100_11094.method1867(1107503726)
				 .method8977(1, (byte) 1)) {
			client.aClass100_11094.method1867(-1292588425)
			    .method8969
			    ((client.aClass100_11094.aClass534_Sub40_Sub1_1179
			      .aByteArray10810),
			     0, 1, (byte) 50);
			Class40.aClass695_308
			    = (Class695) (Class448.method7319
					  (Class271.method5040(-1185117485),
					   (client.aClass100_11094
					    .aClass534_Sub40_Sub1_1179
					    .aByteArray10810[0]) & 0xff,
					   2088438307));
			if (Class40.aClass695_308 == Class695.aClass695_8779) {
			    client.aClass100_11094.aClass13_1183
				= new IsaacCipher(Class40.anIntArray309);
			    int[] is = new int[4];
			    for (int i_21_ = 0; i_21_ < 4; i_21_++)
				is[i_21_] = 50 + Class40.anIntArray309[i_21_];
			    client.aClass100_11094.aClass13_1190
				= new IsaacCipher(is);
			    new IsaacCipher(is);
			    client.aClass100_11094
				.aClass534_Sub40_Sub1_1179.method18316
				(client.aClass100_11094.aClass13_1190,
				 163694688);
			    Class673.method11110(18, -771223243);
			    client.aClass100_11094.method1874(1596856197);
			    client.aClass100_11094
				.aClass534_Sub40_Sub1_1179.anInt10811
				= 0;
			    client.aClass100_11094.aClass409_1199 = null;
			    client.aClass100_11094.aClass409_1196 = null;
			    client.aClass100_11094.aClass409_1195 = null;
			    client.aClass100_11094.anInt1189 = 0;
			    Class78.aClass103_825.aClass612_1294
				.method10098(278691950);
			    Class690_Sub21.method17075((short) -16937);
			} else
			    client.aClass100_11094.method1866((byte) -12);
			client.aClass100_11094.aClass409_1186 = null;
			Class592.aClass62_7815 = null;
		    }
		}
	    } catch (IOException ioexception) {
		Class690.method14032(270189415);
	    }
	}
    }
    
    static void method7801(int i, int i_22_, int i_23_, int i_24_,
			   boolean bool, int i_25_) {
	if (Class713.aBool8884 && null != Class29.aFrame266
	    && (i_22_ != 3 || 1964065355 * Class306.anInt3273 != i_23_
		|| i_24_ != Class238.anInt2380 * -844799891)) {
	    Class115.method2110(client.aClass14_5591, Class29.aFrame266,
				(byte) 127);
	    Class29.aFrame266 = null;
	}
	if (Class713.aBool8884 && i_22_ == 3 && Class29.aFrame266 == null) {
	    Class29.aFrame266
		= Class400.method6584(client.aClass14_5591, i_23_, i_24_, 0, 0,
				      1307676119);
	    if (Class29.aFrame266 != null) {
		Class306.anInt3273 = 938997603 * i_23_;
		Class238.anInt2380 = i_24_ * 1608362341;
		Class672.method11096((byte) 1);
	    }
	}
	if (i_22_ == 3 && (!Class713.aBool8884 || null == Class29.aFrame266))
	    method7801(i,
		       Class44_Sub6.aClass534_Sub35_10989
			   .aClass690_Sub8_10775.method16947(1610160687),
		       -1, -1, true, 2076615585);
	else {
	    Container container = Class171.method2880((short) -148);
	    if (null != Class29.aFrame266) {
		Class391.anInt4076 = 1199809921 * i_23_;
		client.anInt5561 = i_24_ * 226957979;
	    } else if (Class452.aFrame4943 != null) {
		Insets insets = Class452.aFrame4943.getInsets();
		Class391.anInt4076
		    = (Class452.aFrame4943.getSize().width
		       - (insets.left + insets.right)) * 1199809921;
		client.anInt5561
		    = (Class452.aFrame4943.getSize().height
		       - (insets.top + insets.bottom)) * 226957979;
	    } else {
		Class391.anInt4076 = container.getSize().width * 1199809921;
		client.anInt5561 = container.getSize().height * 226957979;
	    }
	    if (Class391.anInt4076 * -166028671 <= 0)
		Class391.anInt4076 = 1199809921;
	    if (8272787 * client.anInt5561 <= 0)
		client.anInt5561 = 226957979;
	    if (1 != i_22_)
		Class108.method1971(-579656263);
	    else {
		Class706_Sub4.anInt10994 = 1860177489 * client.anInt11047;
		client.anInt5562
		    = -138655283 * ((Class391.anInt4076 * -166028671
				     - client.anInt11047 * -321474631)
				    / 2);
		Class18.anInt205 = -1350390103 * client.anInt11192;
		client.anInt5563 = 0;
	    }
	    if (client.aClass665_11211 != Class665.aClass665_8561
		&& Class706_Sub4.anInt10994 * 1771907305 < 1024
		&& Class18.anInt205 * -1091172141 >= 768) {
		/* empty */
	    }
	    if (!bool) {
		Class464.aCanvas5111.setSize((Class706_Sub4.anInt10994
					      * 1771907305),
					     -1091172141 * Class18.anInt205);
		Class254.aClass185_2683.method3259(Class464.aCanvas5111,
						   (Class706_Sub4.anInt10994
						    * 1771907305),
						   (-1091172141
						    * Class18.anInt205),
						   1936641963);
		if (container == Class452.aFrame4943) {
		    Insets insets = Class452.aFrame4943.getInsets();
		    Class464.aCanvas5111.setLocation
			(-721302779 * client.anInt5562 + insets.left,
			 insets.top + client.anInt5563 * -350211099);
		} else
		    Class464.aCanvas5111.setLocation((-721302779
						      * client.anInt5562),
						     (-350211099
						      * client.anInt5563));
	    } else
		Class576.method9762((byte) 28);
	    if (i_22_ >= 2)
		client.aBool11183 = true;
	    else
		client.aBool11183 = false;
	    Class534_Sub28.method16317(-61675715);
	    if (-1 != -993629849 * client.anInt11185)
		Class260.method4813(true, (short) -7589);
	    if (Class201.method3864(2095398292).method1867(-206513985) != null
		&& (Class44_Sub22.method17372(-1850530127 * client.anInt11039,
					      302856139)
		    || Class192.method3789(client.anInt11039 * -1850530127,
					   -1608792818)))
		Class66.method1361(Class201.method3864(2095398292),
				   -376751668);
	    for (int i_26_ = 0; i_26_ < 108; i_26_++)
		client.aBoolArray11180[i_26_] = true;
	    client.aBool5565 = true;
	}
    }
    
    static final void method7802(Class669 class669, short i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 0;
    }
    
    static final void method7803(Class669 class669, short i) {
	class669.anInt8600 -= 617999126;
	int i_27_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	boolean bool = 1 == (class669.anIntArray8595
			     [2088438307 * class669.anInt8600 + 1]);
	if (Class554_Sub1.aClass9_10687 != null) {
	    Class534 class534
		= Class554_Sub1.aClass9_10687.method579((long) i_27_);
	    if (null != class534 && !bool)
		class534.method8892((byte) 1);
	    else if (class534 == null && bool) {
		class534 = new Class534();
		Class554_Sub1.aClass9_10687.method581(class534, (long) i_27_);
	    }
	}
    }
}
