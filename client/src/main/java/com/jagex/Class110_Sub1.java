/* Class110_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.HashMap;
import java.util.Map;

public abstract class Class110_Sub1 extends Class110 implements Interface54
{
    protected Class453 aClass453_8978;
    
    public Class429 method14492(Class534_Sub40 class534_sub40,
				Class483 class483, int i) {
	int i_0_ = class534_sub40.method16529((byte) 1);
	Class429 class429 = new Class429(i_0_);
	Class var_class = class483.aClass5278;
	if (var_class == java.lang.Integer.class)
	    class429.anObject4819
		= Integer.valueOf(class534_sub40.method16533(-258848859));
	else if (java.lang.Long.class == var_class)
	    class429.anObject4819
		= Long.valueOf(class534_sub40.method16537(1359621443));
	else if (var_class == java.lang.String.class)
	    class429.anObject4819 = class534_sub40.method16523(-1378880707);
	else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
	    try {
		Interface8 interface8 = (Interface8) var_class.newInstance();
		interface8.method72(class534_sub40, -763622223);
		class429.anObject4819 = interface8;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	Class150 class150 = (Class150) method91(i_0_, 770990239);
	if (!class150.method2477(-1790567068)
	    || class150.aClass493_1696.method8102(455152033) != class483)
	    return null;
	return class429;
    }
    
    Class110_Sub1(Class675 class675, Class453 class453, Class672 class672,
		  int i) {
	super(class675, class672, i);
	aClass453_8978 = class453;
    }
    
    public int method90(byte i) {
	return anInt1343 * -1783044979;
    }
    
    public Object method373(int i, int i_1_) {
	Class150 class150 = (Class150) method91(i, -315652170);
	if (null == class150 || !class150.method2477(-1596252394))
	    return null;
	return class150.method2478(-791235511);
    }
    
    public int method14493(Class429 class429, byte i) {
	int i_2_ = 2;
	if (class429.anObject4819 instanceof Integer)
	    i_2_ += 4;
	else if (class429.anObject4819 instanceof Long)
	    i_2_ += 8;
	else if (class429.anObject4819 instanceof String)
	    i_2_ += Class422.method6786((String) class429.anObject4819,
					-1927332206);
	else if (class429.anObject4819 instanceof Interface8)
	    i_2_ += ((Interface8) class429.anObject4819).method56(1441561083);
	else
	    throw new IllegalStateException();
	return i_2_;
    }
    
    public void method14494(Class534_Sub40 class534_sub40, Class429 class429,
			    byte i) {
	class534_sub40.method16507(-608978823 * class429.anInt4820,
				   2076293103);
	if (class429.anObject4819 instanceof Integer)
	    class534_sub40.method16510(((Integer) class429.anObject4819)
					   .intValue(),
				       -1691675030);
	else if (class429.anObject4819 instanceof Long)
	    class534_sub40
		.method16505(((Long) class429.anObject4819).longValue());
	else if (class429.anObject4819 instanceof String)
	    class534_sub40.method16517((String) class429.anObject4819,
				       (byte) 4);
	else if (class429.anObject4819 instanceof Interface8)
	    ((Interface8) class429.anObject4819).method69(class534_sub40,
							  -1986392619);
	else
	    throw new IllegalStateException();
    }
    
    public Class429 method14495(Class534_Sub40 class534_sub40, byte i) {
	int i_3_ = class534_sub40.method16529((byte) 1);
	Class150 class150 = (Class150) method91(i_3_, 420780353);
	if (!class150.method2477(-1346299644))
	    throw new IllegalStateException("");
	Class429 class429 = new Class429(i_3_);
	Class var_class
	    = class150.aClass493_1696.method8102(1066539228).aClass5278;
	if (java.lang.Integer.class == var_class)
	    class429.anObject4819
		= Integer.valueOf(class534_sub40.method16533(-258848859));
	else if (var_class == java.lang.Long.class)
	    class429.anObject4819
		= Long.valueOf(class534_sub40.method16537(1359621443));
	else if (var_class == java.lang.String.class)
	    class429.anObject4819 = class534_sub40.method16523(-1745047191);
	else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
	    try {
		Interface8 interface8 = (Interface8) var_class.newInstance();
		interface8.method72(class534_sub40, -2095194665);
		class429.anObject4819 = interface8;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	return class429;
    }
    
    public abstract Interface13 method91(int i, int i_4_);
    
    public abstract Interface13 method87(int i);
    
    public int method14496(Class429 class429) {
	int i = 2;
	if (class429.anObject4819 instanceof Integer)
	    i += 4;
	else if (class429.anObject4819 instanceof Long)
	    i += 8;
	else if (class429.anObject4819 instanceof String)
	    i += Class422.method6786((String) class429.anObject4819,
				     -793472486);
	else if (class429.anObject4819 instanceof Interface8)
	    i += ((Interface8) class429.anObject4819).method56(1441561083);
	else
	    throw new IllegalStateException();
	return i;
    }
    
    public abstract Interface13 method89(int i);
    
    public int method85() {
	return anInt1343 * -1783044979;
    }
    
    public int method88() {
	return anInt1343 * -1783044979;
    }
    
    public static Map method14497(Class110_Sub1[] class110_sub1s) {
	if (class110_sub1s == null || 0 == class110_sub1s.length)
	    return null;
	HashMap hashmap = new HashMap();
	Class110_Sub1[] class110_sub1s_5_ = class110_sub1s;
	for (int i = 0; i < class110_sub1s_5_.length; i++) {
	    Class110_Sub1 class110_sub1 = class110_sub1s_5_[i];
	    hashmap.put(class110_sub1.aClass453_8978, class110_sub1);
	}
	return hashmap;
    }
    
    public abstract Interface13 method86(int i);
    
    public static Map method14498(Class110_Sub1[] class110_sub1s) {
	if (class110_sub1s == null || 0 == class110_sub1s.length)
	    return null;
	HashMap hashmap = new HashMap();
	Class110_Sub1[] class110_sub1s_6_ = class110_sub1s;
	for (int i = 0; i < class110_sub1s_6_.length; i++) {
	    Class110_Sub1 class110_sub1 = class110_sub1s_6_[i];
	    hashmap.put(class110_sub1.aClass453_8978, class110_sub1);
	}
	return hashmap;
    }
    
    public Object method374(int i) {
	Class150 class150 = (Class150) method91(i, -94317276);
	if (null == class150 || !class150.method2477(-1651395478))
	    return null;
	return class150.method2478(4811207);
    }
    
    public Object method375(int i) {
	Class150 class150 = (Class150) method91(i, -1845271480);
	if (null == class150 || !class150.method2477(-1142648896))
	    return null;
	return class150.method2478(38695274);
    }
    
    public static Map method14499(Class110_Sub1[] class110_sub1s) {
	if (class110_sub1s == null || 0 == class110_sub1s.length)
	    return null;
	HashMap hashmap = new HashMap();
	Class110_Sub1[] class110_sub1s_7_ = class110_sub1s;
	for (int i = 0; i < class110_sub1s_7_.length; i++) {
	    Class110_Sub1 class110_sub1 = class110_sub1s_7_[i];
	    hashmap.put(class110_sub1.aClass453_8978, class110_sub1);
	}
	return hashmap;
    }
    
    public Class429 method14500(Class534_Sub40 class534_sub40) {
	int i = class534_sub40.method16529((byte) 1);
	Class150 class150 = (Class150) method91(i, -569883507);
	if (!class150.method2477(-2028840386))
	    throw new IllegalStateException("");
	Class429 class429 = new Class429(i);
	Class var_class
	    = class150.aClass493_1696.method8102(841923844).aClass5278;
	if (java.lang.Integer.class == var_class)
	    class429.anObject4819
		= Integer.valueOf(class534_sub40.method16533(-258848859));
	else if (var_class == java.lang.Long.class)
	    class429.anObject4819
		= Long.valueOf(class534_sub40.method16537(1359621443));
	else if (var_class == java.lang.String.class)
	    class429.anObject4819 = class534_sub40.method16523(-1567081463);
	else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
	    try {
		Interface8 interface8 = (Interface8) var_class.newInstance();
		interface8.method72(class534_sub40, -1807845462);
		class429.anObject4819 = interface8;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	return class429;
    }
    
    public Class429 method14501(Class534_Sub40 class534_sub40) {
	int i = class534_sub40.method16529((byte) 1);
	Class150 class150 = (Class150) method91(i, 677474112);
	if (!class150.method2477(-1362040155))
	    throw new IllegalStateException("");
	Class429 class429 = new Class429(i);
	Class var_class
	    = class150.aClass493_1696.method8102(1781152585).aClass5278;
	if (java.lang.Integer.class == var_class)
	    class429.anObject4819
		= Integer.valueOf(class534_sub40.method16533(-258848859));
	else if (var_class == java.lang.Long.class)
	    class429.anObject4819
		= Long.valueOf(class534_sub40.method16537(1359621443));
	else if (var_class == java.lang.String.class)
	    class429.anObject4819 = class534_sub40.method16523(-2041158128);
	else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
	    try {
		Interface8 interface8 = (Interface8) var_class.newInstance();
		interface8.method72(class534_sub40, -680302671);
		class429.anObject4819 = interface8;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	return class429;
    }
    
    public Class429 method14502(Class534_Sub40 class534_sub40,
				Class483 class483) {
	int i = class534_sub40.method16529((byte) 1);
	Class429 class429 = new Class429(i);
	Class var_class = class483.aClass5278;
	if (var_class == java.lang.Integer.class)
	    class429.anObject4819
		= Integer.valueOf(class534_sub40.method16533(-258848859));
	else if (java.lang.Long.class == var_class)
	    class429.anObject4819
		= Long.valueOf(class534_sub40.method16537(1359621443));
	else if (var_class == java.lang.String.class)
	    class429.anObject4819 = class534_sub40.method16523(-2043081351);
	else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
	    try {
		Interface8 interface8 = (Interface8) var_class.newInstance();
		interface8.method72(class534_sub40, 18812566);
		class429.anObject4819 = interface8;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	Class150 class150 = (Class150) method91(i, -99008277);
	if (!class150.method2477(-1225725712)
	    || class150.aClass493_1696.method8102(1214507043) != class483)
	    return null;
	return class429;
    }
    
    public Class429 method14503(Class534_Sub40 class534_sub40,
				Class483 class483) {
	int i = class534_sub40.method16529((byte) 1);
	Class429 class429 = new Class429(i);
	Class var_class = class483.aClass5278;
	if (var_class == java.lang.Integer.class)
	    class429.anObject4819
		= Integer.valueOf(class534_sub40.method16533(-258848859));
	else if (java.lang.Long.class == var_class)
	    class429.anObject4819
		= Long.valueOf(class534_sub40.method16537(1359621443));
	else if (var_class == java.lang.String.class)
	    class429.anObject4819 = class534_sub40.method16523(-2114431571);
	else if (com.jagex.Interface8.class.isAssignableFrom(var_class)) {
	    try {
		Interface8 interface8 = (Interface8) var_class.newInstance();
		interface8.method72(class534_sub40, -255077884);
		class429.anObject4819 = interface8;
	    } catch (InstantiationException instantiationexception) {
		/* empty */
	    } catch (IllegalAccessException illegalaccessexception) {
		/* empty */
	    }
	} else
	    throw new IllegalStateException();
	Class150 class150 = (Class150) method91(i, -1001626464);
	if (!class150.method2477(-1046000767)
	    || class150.aClass493_1696.method8102(1512027742) != class483)
	    return null;
	return class429;
    }
    
    public static int method14504(int i) {
	return Class523.aTwitchTV7088.GetViewerCount();
    }
    
    static final void method14505(Class669 class669, int i) {
	class669.anInt8600 -= 617999126;
	int i_8_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_9_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = i_8_ ^ 1 << i_9_;
    }
    
    static final int method14506(int i, int i_10_, int i_11_) {
	int i_12_ = (Class555.method9219(i - 1, i_10_ - 1, 2138617169)
		     + Class555.method9219(1 + i, i_10_ - 1, -945214755)
		     + Class555.method9219(i - 1, i_10_ + 1, 589671125)
		     + Class555.method9219(1 + i, i_10_ + 1, 731383605));
	int i_13_ = (Class555.method9219(i - 1, i_10_, 1698100109)
		     + Class555.method9219(i + 1, i_10_, -1147702841)
		     + Class555.method9219(i, i_10_ - 1, 1044525201)
		     + Class555.method9219(i, 1 + i_10_, -1718129135));
	int i_14_ = Class555.method9219(i, i_10_, 1183957612);
	return i_12_ / 16 + i_13_ / 8 + i_14_ / 4;
    }
    
    static final void method14507(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class303.method5576(class247, class243, class669, (short) 1029);
    }
}
