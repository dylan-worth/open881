/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Calendar;

public final class Class203
{
    int anInt2193;
    Class9 aClass9_2194;
    Class696 aClass696_2195 = new Class696();
    int anInt2196;
    Interface24 anInterface24_2197;
    
    public int method3869() {
	return 1475721211 * anInt2196;
    }
    
    public void method3870(Interface24 interface24, byte i) {
	anInterface24_2197 = interface24;
    }
    
    public Class203(int i, int i_0_) {
	anInt2196 = 226016051 * i;
	anInt2193 = i * 1390883121;
	int i_1_;
	for (i_1_ = 1; i_1_ + i_1_ < i && i_1_ < i_0_; i_1_ += i_1_) {
	    /* empty */
	}
	aClass9_2194 = new Class9(i_1_);
    }
    
    public Object method3871(long l) {
	Class534_Sub18_Sub10 class534_sub18_sub10
	    = (Class534_Sub18_Sub10) aClass9_2194.method579(l);
	if (class534_sub18_sub10 == null)
	    return null;
	Object object = class534_sub18_sub10.method18280(2130083370);
	if (null == object) {
	    class534_sub18_sub10.method8892((byte) 1);
	    class534_sub18_sub10.method16180(-421776830);
	    anInt2193 += -1132131515 * class534_sub18_sub10.anInt11774;
	    return null;
	}
	if (class534_sub18_sub10.method18281((short) 16383)) {
	    Class534_Sub18_Sub10_Sub1 class534_sub18_sub10_sub1
		= new Class534_Sub18_Sub10_Sub1(object,
						(class534_sub18_sub10
						 .anInt11774) * -367028651);
	    aClass9_2194.method581(class534_sub18_sub10_sub1,
				   (8258869577519436579L
				    * class534_sub18_sub10.aLong7158));
	    aClass696_2195.method14076(class534_sub18_sub10_sub1, (byte) 114);
	    class534_sub18_sub10_sub1.aLong10509 = 0L;
	    class534_sub18_sub10.method8892((byte) 1);
	    class534_sub18_sub10.method16180(-421776830);
	} else {
	    aClass696_2195.method14076(class534_sub18_sub10, (byte) 86);
	    class534_sub18_sub10.aLong10509 = 0L;
	}
	return object;
    }
    
    public void method3872(long l) {
	Class534_Sub18_Sub10 class534_sub18_sub10
	    = (Class534_Sub18_Sub10) aClass9_2194.method579(l);
	method3873(class534_sub18_sub10, 1149224714);
    }
    
    void method3873(Class534_Sub18_Sub10 class534_sub18_sub10, int i) {
	if (class534_sub18_sub10 != null) {
	    class534_sub18_sub10.method8892((byte) 1);
	    class534_sub18_sub10.method16180(-421776830);
	    anInt2193 += class534_sub18_sub10.anInt11774 * -1132131515;
	}
    }
    
    public int method3874() {
	int i = 0;
	for (Class534_Sub18_Sub10 class534_sub18_sub10
		 = ((Class534_Sub18_Sub10)
		    aClass696_2195.method14078(1221951837));
	     class534_sub18_sub10 != null;
	     class534_sub18_sub10 = ((Class534_Sub18_Sub10)
				     aClass696_2195.method14080((byte) 1))) {
	    if (!class534_sub18_sub10.method18281((short) 16383))
		i++;
	}
	return i;
    }
    
    public void method3875() {
	for (Class534_Sub18_Sub10 class534_sub18_sub10
		 = ((Class534_Sub18_Sub10)
		    aClass696_2195.method14078(1221951837));
	     null != class534_sub18_sub10;
	     class534_sub18_sub10 = ((Class534_Sub18_Sub10)
				     aClass696_2195.method14080((byte) 105))) {
	    if (class534_sub18_sub10.method18281((short) 16383)) {
		class534_sub18_sub10.method8892((byte) 1);
		class534_sub18_sub10.method16180(-421776830);
		anInt2193 += -1132131515 * class534_sub18_sub10.anInt11774;
	    }
	}
    }
    
    public void method3876(int i, byte i_2_) {
	for (Class534_Sub18_Sub10 class534_sub18_sub10
		 = ((Class534_Sub18_Sub10)
		    aClass696_2195.method14078(1221951837));
	     class534_sub18_sub10 != null;
	     class534_sub18_sub10 = ((Class534_Sub18_Sub10)
				     aClass696_2195.method14080((byte) 20))) {
	    if (class534_sub18_sub10.method18281((short) 16383)) {
		if (class534_sub18_sub10.method18280(1844335153) == null) {
		    class534_sub18_sub10.method8892((byte) 1);
		    class534_sub18_sub10.method16180(-421776830);
		    anInt2193 += -1132131515 * class534_sub18_sub10.anInt11774;
		}
	    } else if (((class534_sub18_sub10.aLong10509 += 84410810002887935L)
			* -753566336061658369L)
		       > (long) i) {
		Class534_Sub18_Sub10_Sub2 class534_sub18_sub10_sub2
		    = (new Class534_Sub18_Sub10_Sub2
		       (class534_sub18_sub10.method18280(2145368059),
			-367028651 * class534_sub18_sub10.anInt11774));
		aClass9_2194.method581(class534_sub18_sub10_sub2,
				       (8258869577519436579L
					* class534_sub18_sub10.aLong7158));
		Class51.method1180(class534_sub18_sub10_sub2,
				   class534_sub18_sub10, (byte) -96);
		class534_sub18_sub10.method8892((byte) 1);
		class534_sub18_sub10.method16180(-421776830);
	    }
	}
    }
    
    public void method3877(int i) {
	aClass696_2195.method14075(958896847);
	aClass9_2194.method578((byte) 14);
	anInt2193 = anInt2196 * 1203520011;
    }
    
    public int method3878(int i) {
	return 1475721211 * anInt2196;
    }
    
    public int method3879(int i) {
	return -1219459119 * anInt2193;
    }
    
    public int method3880(int i) {
	int i_3_ = 0;
	for (Class534_Sub18_Sub10 class534_sub18_sub10
		 = ((Class534_Sub18_Sub10)
		    aClass696_2195.method14078(1221951837));
	     class534_sub18_sub10 != null;
	     class534_sub18_sub10 = ((Class534_Sub18_Sub10)
				     aClass696_2195.method14080((byte) 71))) {
	    if (!class534_sub18_sub10.method18281((short) 16383))
		i_3_++;
	}
	return i_3_;
    }
    
    public void method3881(Object object, long l, int i, int i_4_) {
	if (i > anInt2196 * 1475721211)
	    throw new IllegalStateException();
	method3872(l);
	anInt2193 -= i * 1390883121;
	while (-1219459119 * anInt2193 < 0) {
	    Class534_Sub18_Sub10 class534_sub18_sub10
		= ((Class534_Sub18_Sub10)
		   aClass696_2195.method14077((byte) -39));
	    if (null == class534_sub18_sub10)
		throw new RuntimeException("");
	    if (class534_sub18_sub10.method18281((short) 16383)) {
		/* empty */
	    }
	    method3873(class534_sub18_sub10, 1149224714);
	    if (anInterface24_2197 != null)
		anInterface24_2197.method146(class534_sub18_sub10
						 .method18280(2074416244),
					     658601020);
	}
	Class534_Sub18_Sub10_Sub1 class534_sub18_sub10_sub1
	    = new Class534_Sub18_Sub10_Sub1(object, i);
	aClass9_2194.method581(class534_sub18_sub10_sub1, l);
	aClass696_2195.method14076(class534_sub18_sub10_sub1, (byte) 123);
	class534_sub18_sub10_sub1.aLong10509 = 0L;
    }
    
    public void method3882(Interface24 interface24) {
	anInterface24_2197 = interface24;
    }
    
    public Object method3883(byte i) {
	Class534_Sub18_Sub10 class534_sub18_sub10
	    = (Class534_Sub18_Sub10) aClass9_2194.method584((byte) -49);
	while (null != class534_sub18_sub10) {
	    Object object = class534_sub18_sub10.method18280(1726535338);
	    if (null == object) {
		Class534_Sub18_Sub10 class534_sub18_sub10_5_
		    = class534_sub18_sub10;
		class534_sub18_sub10 = ((Class534_Sub18_Sub10)
					aClass9_2194.method584((byte) -98));
		class534_sub18_sub10_5_.method8892((byte) 1);
		class534_sub18_sub10_5_.method16180(-421776830);
		anInt2193 += class534_sub18_sub10_5_.anInt11774 * -1132131515;
	    } else
		return object;
	}
	return null;
    }
    
    public void method3884(byte i) {
	for (Class534_Sub18_Sub10 class534_sub18_sub10
		 = ((Class534_Sub18_Sub10)
		    aClass696_2195.method14078(1221951837));
	     null != class534_sub18_sub10;
	     class534_sub18_sub10 = ((Class534_Sub18_Sub10)
				     aClass696_2195.method14080((byte) 9))) {
	    if (class534_sub18_sub10.method18281((short) 16383)) {
		class534_sub18_sub10.method8892((byte) 1);
		class534_sub18_sub10.method16180(-421776830);
		anInt2193 += -1132131515 * class534_sub18_sub10.anInt11774;
	    }
	}
    }
    
    public Object method3885(long l) {
	Class534_Sub18_Sub10 class534_sub18_sub10
	    = (Class534_Sub18_Sub10) aClass9_2194.method579(l);
	if (class534_sub18_sub10 == null)
	    return null;
	Object object = class534_sub18_sub10.method18280(2004350765);
	if (null == object) {
	    class534_sub18_sub10.method8892((byte) 1);
	    class534_sub18_sub10.method16180(-421776830);
	    anInt2193 += -1132131515 * class534_sub18_sub10.anInt11774;
	    return null;
	}
	if (class534_sub18_sub10.method18281((short) 16383)) {
	    Class534_Sub18_Sub10_Sub1 class534_sub18_sub10_sub1
		= new Class534_Sub18_Sub10_Sub1(object,
						(class534_sub18_sub10
						 .anInt11774) * -367028651);
	    aClass9_2194.method581(class534_sub18_sub10_sub1,
				   (8258869577519436579L
				    * class534_sub18_sub10.aLong7158));
	    aClass696_2195.method14076(class534_sub18_sub10_sub1, (byte) 40);
	    class534_sub18_sub10_sub1.aLong10509 = 0L;
	    class534_sub18_sub10.method8892((byte) 1);
	    class534_sub18_sub10.method16180(-421776830);
	} else {
	    aClass696_2195.method14076(class534_sub18_sub10, (byte) 7);
	    class534_sub18_sub10.aLong10509 = 0L;
	}
	return object;
    }
    
    void method3886(Class534_Sub18_Sub10 class534_sub18_sub10) {
	if (class534_sub18_sub10 != null) {
	    class534_sub18_sub10.method8892((byte) 1);
	    class534_sub18_sub10.method16180(-421776830);
	    anInt2193 += class534_sub18_sub10.anInt11774 * -1132131515;
	}
    }
    
    void method3887(Class534_Sub18_Sub10 class534_sub18_sub10) {
	if (class534_sub18_sub10 != null) {
	    class534_sub18_sub10.method8892((byte) 1);
	    class534_sub18_sub10.method16180(-421776830);
	    anInt2193 += class534_sub18_sub10.anInt11774 * -1132131515;
	}
    }
    
    public Class203(int i) {
	this(i, i);
    }
    
    public void method3888(Object object, long l) {
	method3881(object, l, 1, -1281733856);
    }
    
    public void method3889(Object object, long l, int i) {
	if (i > anInt2196 * 1475721211)
	    throw new IllegalStateException();
	method3872(l);
	anInt2193 -= i * 1390883121;
	while (-1219459119 * anInt2193 < 0) {
	    Class534_Sub18_Sub10 class534_sub18_sub10
		= ((Class534_Sub18_Sub10)
		   aClass696_2195.method14077((byte) -48));
	    if (null == class534_sub18_sub10)
		throw new RuntimeException("");
	    if (class534_sub18_sub10.method18281((short) 16383)) {
		/* empty */
	    }
	    method3873(class534_sub18_sub10, 1149224714);
	    if (anInterface24_2197 != null)
		anInterface24_2197.method146(class534_sub18_sub10
						 .method18280(1729555816),
					     -709812056);
	}
	Class534_Sub18_Sub10_Sub1 class534_sub18_sub10_sub1
	    = new Class534_Sub18_Sub10_Sub1(object, i);
	aClass9_2194.method581(class534_sub18_sub10_sub1, l);
	aClass696_2195.method14076(class534_sub18_sub10_sub1, (byte) 45);
	class534_sub18_sub10_sub1.aLong10509 = 0L;
    }
    
    public void method3890(int i) {
	for (Class534_Sub18_Sub10 class534_sub18_sub10
		 = ((Class534_Sub18_Sub10)
		    aClass696_2195.method14078(1221951837));
	     class534_sub18_sub10 != null;
	     class534_sub18_sub10 = ((Class534_Sub18_Sub10)
				     aClass696_2195.method14080((byte) 121))) {
	    if (class534_sub18_sub10.method18281((short) 16383)) {
		if (class534_sub18_sub10.method18280(1830123243) == null) {
		    class534_sub18_sub10.method8892((byte) 1);
		    class534_sub18_sub10.method16180(-421776830);
		    anInt2193 += -1132131515 * class534_sub18_sub10.anInt11774;
		}
	    } else if (((class534_sub18_sub10.aLong10509 += 84410810002887935L)
			* -753566336061658369L)
		       > (long) i) {
		Class534_Sub18_Sub10_Sub2 class534_sub18_sub10_sub2
		    = (new Class534_Sub18_Sub10_Sub2
		       (class534_sub18_sub10.method18280(1838956574),
			-367028651 * class534_sub18_sub10.anInt11774));
		aClass9_2194.method581(class534_sub18_sub10_sub2,
				       (8258869577519436579L
					* class534_sub18_sub10.aLong7158));
		Class51.method1180(class534_sub18_sub10_sub2,
				   class534_sub18_sub10, (byte) -95);
		class534_sub18_sub10.method8892((byte) 1);
		class534_sub18_sub10.method16180(-421776830);
	    }
	}
    }
    
    public void method3891(int i) {
	for (Class534_Sub18_Sub10 class534_sub18_sub10
		 = ((Class534_Sub18_Sub10)
		    aClass696_2195.method14078(1221951837));
	     class534_sub18_sub10 != null;
	     class534_sub18_sub10 = ((Class534_Sub18_Sub10)
				     aClass696_2195.method14080((byte) 104))) {
	    if (class534_sub18_sub10.method18281((short) 16383)) {
		if (class534_sub18_sub10.method18280(1950712474) == null) {
		    class534_sub18_sub10.method8892((byte) 1);
		    class534_sub18_sub10.method16180(-421776830);
		    anInt2193 += -1132131515 * class534_sub18_sub10.anInt11774;
		}
	    } else if (((class534_sub18_sub10.aLong10509 += 84410810002887935L)
			* -753566336061658369L)
		       > (long) i) {
		Class534_Sub18_Sub10_Sub2 class534_sub18_sub10_sub2
		    = (new Class534_Sub18_Sub10_Sub2
		       (class534_sub18_sub10.method18280(2025872078),
			-367028651 * class534_sub18_sub10.anInt11774));
		aClass9_2194.method581(class534_sub18_sub10_sub2,
				       (8258869577519436579L
					* class534_sub18_sub10.aLong7158));
		Class51.method1180(class534_sub18_sub10_sub2,
				   class534_sub18_sub10, (byte) -102);
		class534_sub18_sub10.method8892((byte) 1);
		class534_sub18_sub10.method16180(-421776830);
	    }
	}
    }
    
    public Object method3892(int i) {
	Class534_Sub18_Sub10 class534_sub18_sub10
	    = (Class534_Sub18_Sub10) aClass9_2194.method583(-1779226377);
	while (null != class534_sub18_sub10) {
	    Object object = class534_sub18_sub10.method18280(1746412010);
	    if (object == null) {
		Class534_Sub18_Sub10 class534_sub18_sub10_6_
		    = class534_sub18_sub10;
		class534_sub18_sub10 = ((Class534_Sub18_Sub10)
					aClass9_2194.method584((byte) -101));
		class534_sub18_sub10_6_.method8892((byte) 1);
		class534_sub18_sub10_6_.method16180(-421776830);
		anInt2193 += class534_sub18_sub10_6_.anInt11774 * -1132131515;
	    } else
		return object;
	}
	return null;
    }
    
    public void method3893(Object object, long l) {
	method3881(object, l, 1, 830125355);
    }
    
    public void method3894() {
	for (Class534_Sub18_Sub10 class534_sub18_sub10
		 = ((Class534_Sub18_Sub10)
		    aClass696_2195.method14078(1221951837));
	     null != class534_sub18_sub10;
	     class534_sub18_sub10 = ((Class534_Sub18_Sub10)
				     aClass696_2195.method14080((byte) 2))) {
	    if (class534_sub18_sub10.method18281((short) 16383)) {
		class534_sub18_sub10.method8892((byte) 1);
		class534_sub18_sub10.method16180(-421776830);
		anInt2193 += -1132131515 * class534_sub18_sub10.anInt11774;
	    }
	}
    }
    
    void method3895(Class534_Sub18_Sub10 class534_sub18_sub10) {
	if (class534_sub18_sub10 != null) {
	    class534_sub18_sub10.method8892((byte) 1);
	    class534_sub18_sub10.method16180(-421776830);
	    anInt2193 += class534_sub18_sub10.anInt11774 * -1132131515;
	}
    }
    
    public void method3896() {
	for (Class534_Sub18_Sub10 class534_sub18_sub10
		 = ((Class534_Sub18_Sub10)
		    aClass696_2195.method14078(1221951837));
	     null != class534_sub18_sub10;
	     class534_sub18_sub10 = ((Class534_Sub18_Sub10)
				     aClass696_2195.method14080((byte) 46))) {
	    if (class534_sub18_sub10.method18281((short) 16383)) {
		class534_sub18_sub10.method8892((byte) 1);
		class534_sub18_sub10.method16180(-421776830);
		anInt2193 += -1132131515 * class534_sub18_sub10.anInt11774;
	    }
	}
    }
    
    public void method3897() {
	for (Class534_Sub18_Sub10 class534_sub18_sub10
		 = ((Class534_Sub18_Sub10)
		    aClass696_2195.method14078(1221951837));
	     null != class534_sub18_sub10;
	     class534_sub18_sub10 = ((Class534_Sub18_Sub10)
				     aClass696_2195.method14080((byte) 84))) {
	    if (class534_sub18_sub10.method18281((short) 16383)) {
		class534_sub18_sub10.method8892((byte) 1);
		class534_sub18_sub10.method16180(-421776830);
		anInt2193 += -1132131515 * class534_sub18_sub10.anInt11774;
	    }
	}
    }
    
    public Object method3898() {
	Class534_Sub18_Sub10 class534_sub18_sub10
	    = (Class534_Sub18_Sub10) aClass9_2194.method583(-1882708126);
	while (null != class534_sub18_sub10) {
	    Object object = class534_sub18_sub10.method18280(1490713615);
	    if (object == null) {
		Class534_Sub18_Sub10 class534_sub18_sub10_7_
		    = class534_sub18_sub10;
		class534_sub18_sub10 = ((Class534_Sub18_Sub10)
					aClass9_2194.method584((byte) -51));
		class534_sub18_sub10_7_.method8892((byte) 1);
		class534_sub18_sub10_7_.method16180(-421776830);
		anInt2193 += class534_sub18_sub10_7_.anInt11774 * -1132131515;
	    } else
		return object;
	}
	return null;
    }
    
    public Object method3899() {
	Class534_Sub18_Sub10 class534_sub18_sub10
	    = (Class534_Sub18_Sub10) aClass9_2194.method584((byte) -6);
	while (null != class534_sub18_sub10) {
	    Object object = class534_sub18_sub10.method18280(1513836706);
	    if (null == object) {
		Class534_Sub18_Sub10 class534_sub18_sub10_8_
		    = class534_sub18_sub10;
		class534_sub18_sub10 = ((Class534_Sub18_Sub10)
					aClass9_2194.method584((byte) -16));
		class534_sub18_sub10_8_.method8892((byte) 1);
		class534_sub18_sub10_8_.method16180(-421776830);
		anInt2193 += class534_sub18_sub10_8_.anInt11774 * -1132131515;
	    } else
		return object;
	}
	return null;
    }
    
    public Object method3900() {
	Class534_Sub18_Sub10 class534_sub18_sub10
	    = (Class534_Sub18_Sub10) aClass9_2194.method584((byte) -46);
	while (null != class534_sub18_sub10) {
	    Object object = class534_sub18_sub10.method18280(1918010214);
	    if (null == object) {
		Class534_Sub18_Sub10 class534_sub18_sub10_9_
		    = class534_sub18_sub10;
		class534_sub18_sub10 = ((Class534_Sub18_Sub10)
					aClass9_2194.method584((byte) -52));
		class534_sub18_sub10_9_.method8892((byte) 1);
		class534_sub18_sub10_9_.method16180(-421776830);
		anInt2193 += class534_sub18_sub10_9_.anInt11774 * -1132131515;
	    } else
		return object;
	}
	return null;
    }
    
    static Class284[] method3901(byte i) {
	return (new Class284[]
		{ Class284.aClass284_3071, Class284.aClass284_3072,
		  Class284.aClass284_3070 });
    }
    
    static final void method3902(Class669 class669, byte i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	Class243 class243 = class666.aClass243_8575;
	Class204.method3907(class247, class243, class669, -16777216);
    }
    
    static final void method3903(Class669 class669, int i) {
	int i_10_ = (class669.anIntArray8595
		     [(class669.anInt8600 -= 308999563) * 2088438307]);
	if (i_10_ == -1)
	    Class44_Sub6.aClass534_Sub35_10989.method16438
		(Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10759,
		 Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10758
		     .method17035((byte) 2),
		 -1483456189);
	else
	    Class44_Sub6.aClass534_Sub35_10989.method16438
		(Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub17_10759,
		 i_10_, -763197710);
	Class453_Sub5.method16008((byte) -54);
    }
    
    static final void method3904(Class669 class669, byte i) {
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = Class44_Sub6.aClass534_Sub35_10989.aClass690_Sub25_10750
		  .method17101(2139168715) ? 1 : 0;
    }
    
    public static String method3905(long l, int i, boolean bool, int i_11_) {
	Calendar calendar;
	if (bool) {
	    Class386.method6495(l);
	    calendar = Class84.aCalendar837;
	} else {
	    Class699.method14128(l);
	    calendar = Class84.aCalendar838;
	}
	int i_12_ = calendar.get(5);
	int i_13_ = calendar.get(2);
	int i_14_ = calendar.get(1);
	int i_15_ = calendar.get(11);
	int i_16_ = calendar.get(12);
	if (i == 3)
	    return Class459.method7442(l, i, bool, (byte) -98);
	return new StringBuilder().append(Integer.toString(i_12_ / 10)).append
		   (i_12_ % 10).append
		   ("-").append
		   (Class84.aStringArrayArray839[i][i_13_]).append
		   ("-").append
		   (i_14_).append
		   (" ").append
		   (i_15_ / 10).append
		   (i_15_ % 10).append
		   (":").append
		   (i_16_ / 10).append
		   (i_16_ % 10).toString();
    }
}
