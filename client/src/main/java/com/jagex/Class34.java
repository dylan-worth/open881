/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.io.EOFException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class34
{
    static final int anInt276 = 1;
    static final int anInt277 = 10;
    LinkedHashMap aLinkedHashMap278 = new LinkedHashMap();
    static short aShort279;
    
    boolean method905(long l) {
	return aLinkedHashMap278.containsKey(Long.valueOf(l));
    }
    
    void method906(int i) {
	Class24 class24 = null;
	do {
	    try {
		try {
		    class24 = Class606.method10050("3",
						   (client.aClass675_11016
						    .aString8640),
						   true, 2076091567);
		    Class534_Sub40 class534_sub40 = new Class534_Sub40(5000);
		    method907(class534_sub40, 2122181419);
		    class24.method844(class534_sub40.aByteArray10810, 0,
				      31645619 * class534_sub40.anInt10811,
				      454464553);
		} catch (Exception exception) {
		    try {
			if (class24 != null)
			    class24.method832(404104618);
		    } catch (Exception exception_0_) {
			exception = exception_0_;
		    }
		    break;
		}
		try {
		    if (class24 != null)
			class24.method832(1969946983);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Exception object) {
		try {
		    if (class24 != null)
			class24.method832(221855332);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    void method907(Class534_Sub40 class534_sub40, int i) {
	class534_sub40.method16506(1, 1103669983);
	class534_sub40.method16506(aLinkedHashMap278.size(), 739080260);
	Iterator iterator = aLinkedHashMap278.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    class534_sub40.method16505(((Long) entry.getKey()).longValue());
	    class534_sub40.method16510(((Integer) entry.getValue()).intValue(),
				       -1623874168);
	}
    }
    
    void method908(long l, int i, byte i_1_) {
	if (aLinkedHashMap278.size() >= 10
	    && !aLinkedHashMap278.containsKey(Long.valueOf(l))) {
	    Iterator iterator = aLinkedHashMap278.entrySet().iterator();
	    iterator.next();
	    iterator.remove();
	}
	aLinkedHashMap278.put(Long.valueOf(l), Integer.valueOf(i));
	method906(-46150120);
    }
    
    Class34() {
	this(null);
    }
    
    int method909(long l) {
	return ((Integer) aLinkedHashMap278.get(Long.valueOf(l))).intValue();
    }
    
    Class34(Class534_Sub40 class534_sub40) {
	if (null != class534_sub40 && class534_sub40.aByteArray10810 != null) {
	    int i = class534_sub40.method16527(1518206404);
	    if (i > 0 && i <= 1) {
		int i_2_ = class534_sub40.method16527(-1870732966);
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
		    long l = class534_sub40.method16537(1359621443);
		    int i_4_ = class534_sub40.method16533(-258848859);
		    aLinkedHashMap278.put(Long.valueOf(l),
					  Integer.valueOf(i_4_));
		}
	    }
	}
    }
    
    void method910(Class534_Sub40 class534_sub40) {
	class534_sub40.method16506(1, 1628012784);
	class534_sub40.method16506(aLinkedHashMap278.size(), 1844334175);
	Iterator iterator = aLinkedHashMap278.entrySet().iterator();
	while (iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    class534_sub40.method16505(((Long) entry.getKey()).longValue());
	    class534_sub40.method16510(((Integer) entry.getValue()).intValue(),
				       -344962471);
	}
    }
    
    void method911(long l, int i) {
	if (aLinkedHashMap278.size() >= 10
	    && !aLinkedHashMap278.containsKey(Long.valueOf(l))) {
	    Iterator iterator = aLinkedHashMap278.entrySet().iterator();
	    iterator.next();
	    iterator.remove();
	}
	aLinkedHashMap278.put(Long.valueOf(l), Integer.valueOf(i));
	method906(-839139166);
    }
    
    public static Class34 method912() {
	Class24 class24 = null;
	try {
	    Class34 class34;
	    try {
		class24
		    = Class606.method10050("3",
					   client.aClass675_11016.aString8640,
					   false, 2094913500);
		byte[] is = new byte[(int) class24.method831(269866196)];
		int i;
		for (int i_5_ = 0; i_5_ < is.length; i_5_ += i) {
		    i = class24.method843(is, i_5_, is.length - i_5_,
					  2138565804);
		    if (-1 == i)
			throw new EOFException();
		}
		class34 = new Class34(new Class534_Sub40(is));
	    } catch (Exception exception) {
		Class34 class34_6_ = new Class34();
		try {
		    if (null != class24)
			class24.method832(220660664);
		} catch (Exception exception_7_) {
		    /* empty */
		}
		return class34_6_;
	    }
	    try {
		if (null != class24)
		    class24.method832(58518916);
	    } catch (Exception exception) {
		/* empty */
	    }
	    return class34;
	} catch (Exception object) {
	    try {
		if (null != class24)
		    class24.method832(37682043);
	    } catch (Exception exception) {
		/* empty */
	    }
	    throw object;
	}
    }
    
    void method913(long l, int i) {
	if (aLinkedHashMap278.size() >= 10
	    && !aLinkedHashMap278.containsKey(Long.valueOf(l))) {
	    Iterator iterator = aLinkedHashMap278.entrySet().iterator();
	    iterator.next();
	    iterator.remove();
	}
	aLinkedHashMap278.put(Long.valueOf(l), Integer.valueOf(i));
	method906(-970439637);
    }
    
    int method914(long l) {
	return ((Integer) aLinkedHashMap278.get(Long.valueOf(l))).intValue();
    }
    
    int method915(long l) {
	return ((Integer) aLinkedHashMap278.get(Long.valueOf(l))).intValue();
    }
    
    int method916(long l) {
	return ((Integer) aLinkedHashMap278.get(Long.valueOf(l))).intValue();
    }
    
    public static Class34 method917() {
	Class24 class24 = null;
	try {
	    Class34 class34;
	    try {
		class24
		    = Class606.method10050("3",
					   client.aClass675_11016.aString8640,
					   false, 2119268769);
		byte[] is = new byte[(int) class24.method831(-1113464615)];
		int i;
		for (int i_8_ = 0; i_8_ < is.length; i_8_ += i) {
		    i = class24.method843(is, i_8_, is.length - i_8_,
					  1781248372);
		    if (-1 == i)
			throw new EOFException();
		}
		class34 = new Class34(new Class534_Sub40(is));
	    } catch (Exception exception) {
		Class34 class34_9_ = new Class34();
		try {
		    if (null != class24)
			class24.method832(505738656);
		} catch (Exception exception_10_) {
		    /* empty */
		}
		return class34_9_;
	    }
	    try {
		if (null != class24)
		    class24.method832(507609595);
	    } catch (Exception exception) {
		/* empty */
	    }
	    return class34;
	} catch (Exception object) {
	    try {
		if (null != class24)
		    class24.method832(1219805177);
	    } catch (Exception exception) {
		/* empty */
	    }
	    throw object;
	}
    }
    
    boolean method918(long l) {
	return aLinkedHashMap278.containsKey(Long.valueOf(l));
    }
    
    public static Class34 method919() {
	Class24 class24 = null;
	try {
	    Class34 class34;
	    try {
		class24
		    = Class606.method10050("3",
					   client.aClass675_11016.aString8640,
					   false, 2093850443);
		byte[] is = new byte[(int) class24.method831(-550120220)];
		int i;
		for (int i_11_ = 0; i_11_ < is.length; i_11_ += i) {
		    i = class24.method843(is, i_11_, is.length - i_11_,
					  1563473895);
		    if (-1 == i)
			throw new EOFException();
		}
		class34 = new Class34(new Class534_Sub40(is));
	    } catch (Exception exception) {
		Class34 class34_12_ = new Class34();
		try {
		    if (null != class24)
			class24.method832(1919944840);
		} catch (Exception exception_13_) {
		    /* empty */
		}
		return class34_12_;
	    }
	    try {
		if (null != class24)
		    class24.method832(532868253);
	    } catch (Exception exception) {
		/* empty */
	    }
	    return class34;
	} catch (Exception object) {
	    try {
		if (null != class24)
		    class24.method832(2075208995);
	    } catch (Exception exception) {
		/* empty */
	    }
	    throw object;
	}
    }
    
    void method920() {
	Class24 class24 = null;
	do {
	    try {
		try {
		    class24 = Class606.method10050("3",
						   (client.aClass675_11016
						    .aString8640),
						   true, 2119469653);
		    Class534_Sub40 class534_sub40 = new Class534_Sub40(5000);
		    method907(class534_sub40, 1016227506);
		    class24.method844(class534_sub40.aByteArray10810, 0,
				      31645619 * class534_sub40.anInt10811,
				      454464553);
		} catch (Exception exception) {
		    try {
			if (class24 != null)
			    class24.method832(1207219655);
		    } catch (Exception exception_14_) {
			exception = exception_14_;
		    }
		    break;
		}
		try {
		    if (class24 != null)
			class24.method832(598318533);
		} catch (Exception exception) {
		    /* empty */
		}
	    } catch (Exception object) {
		try {
		    if (class24 != null)
			class24.method832(1637618489);
		} catch (Exception exception) {
		    /* empty */
		}
		throw object;
	    }
	} while (false);
    }
    
    public static int method921(int i, int i_15_, int i_16_, boolean bool,
				byte i_17_) {
	if (i != 0 && (i < 50 || i > 100))
	    i = 0;
	if (i_15_ != 0 && (i_15_ < 50 || i_15_ > 100))
	    i_15_ = 0;
	boolean bool_18_ = Class503.aString5626.startsWith("mac");
	int[] is = (Class523.aTwitchTV7088.GetRecommendedSettings
		    (1771907305 * Class706_Sub4.anInt10994,
		     -1091172141 * Class18.anInt205, i, 2000, i_16_,
		     Class574.aFloat7682, bool_18_));
	if (0 != is[0])
	    return is[0];
	int i_19_ = is[1];
	int i_20_ = is[2];
	int i_21_ = is[3];
	int i_22_ = i_21_;
	Class574.aLong7707 = 0L;
	Class419.aLong4704
	    = -562919201211844877L * (long) (1000.0F / (float) i_16_);
	Class387.anInt4050 = 415163569 * i_19_;
	Class503.anInt5629 = i_20_ * -1557462787;
	if (i_15_ != 0)
	    i_21_ = i_21_ * i_15_ / 100;
	Class73.method1567(new StringBuilder().append("Stream - Input: ")
			       .append
			       (1771907305 * Class706_Sub4.anInt10994).append
			       ("x").append
			       (-1091172141 * Class18.anInt205).append
			       (" (").append
			       (i_22_).append
			       ("kbps)").append
			       (" => ").append
			       ("Output: ").append
			       (i_19_).append
			       ("x").append
			       (i_20_).append
			       (" [").append
			       (0 == i ? "auto" : new StringBuilder().append
						      (i).append
						      ("%").toString())
			       .append
			       ("] (").append
			       (i_21_).append
			       ("kbps [").append
			       (i_15_ == 0 ? "auto"
				: new StringBuilder().append(i_15_).append
				      ("%").toString())
			       .append
			       ("])").toString(),
			   -985549331);
	return Class523.aTwitchTV7088.StartStreaming(i_19_, i_20_, i_16_,
						     i_21_, i_15_ != 0,
						     Class574.aFloat7682,
						     (Class574.anInt7675
						      * 1223369625),
						     bool);
    }
    
    static final void method922(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	if (null == class247.aString2551)
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
	else
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= class247.aString2551;
    }
    
    static final void method923(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_23_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_24_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	Class15 class15
	    = ((Class15)
	       Class531.aClass44_Sub7_7135.method91(i_23_, -327323061));
	if (i_24_ >= 1 && i_24_ <= 5
	    && class15.aStringArray134[i_24_ - 1] != null)
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= class15.aStringArray134[i_24_ - 1];
	else
	    class669.anObjectArray8593
		[(class669.anInt8594 += 1460193483) * 1485266147 - 1]
		= "";
    }
    
    static final void method924(Class669 class669, int i) {
	int i_25_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class534_Sub18_Sub9 class534_sub18_sub9
	    = Class232.method4339(139690941);
	if (class534_sub18_sub9 != null) {
	    boolean bool
		= class534_sub18_sub9.method18260(i_25_ >> 28 & 0x3,
						  i_25_ >> 14 & 0x3fff,
						  i_25_ & 0x3fff,
						  Class679.anIntArray8659,
						  386098031);
	    if (bool)
		Class170.method2824(Class679.anIntArray8659[1],
				    Class679.anIntArray8659[2], 1724435883);
	}
    }
    
    static final int method925(int i, int i_26_) {
	i -= 2;
	if (i < 4)
	    return i;
	return 3;
    }
    
    static final void method926(Class669 class669, int i) {
	int i_27_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = (((Class15)
		Class531.aClass44_Sub7_7135.method91(i_27_, -2098861224))
	       .anInt174) * 1113844363 == 1 ? 1 : 0;
    }
    
    static final void method927(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_28_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_29_
	    = class669.anIntArray8595[1 + 2088438307 * class669.anInt8600];
	int i_30_ = client.aClass492ArrayArray11027[i_29_][i_28_]
			.method8086((byte) 80);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_30_ == 5 ? 1 : 0;
    }
}
