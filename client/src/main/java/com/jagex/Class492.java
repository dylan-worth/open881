/* Class492 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class Class492
{
    public int anInt5335;
    public int anInt5336;
    byte aByte5337;
    public int anInt5338;
    public int anInt5339;
    public int anInt5340;
    public static Class44_Sub10 aClass44_Sub10_5341;
    public static int anInt5342;
    public static Class434 aClass434_5343;
    
    public int method8084() {
	return aByte5337 & 0x7;
    }
    
    static Class8 method8085(Class534_Sub40 class534_sub40,
			     Class110_Sub1 class110_sub1) {
	Class8 class8 = new Class8(class110_sub1);
	for (;;) {
	    int i = class534_sub40.method16527(-2086320373);
	    if (255 == i)
		break;
	    Class483 class483
		= (Class483) Class376.method6419(com.jagex.Class483.class, i,
						 -486700618);
	    for (;;) {
		int i_0_ = class534_sub40.method16527(-2058464614);
		if (255 == i_0_)
		    break;
		class534_sub40.anInt10811 -= -1387468933;
		Class429 class429
		    = class110_sub1.method14492(class534_sub40, class483,
						-1395128479);
		if (null != class429)
		    class8.method29(class429.anInt4820 * -608978823,
				    class429.anObject4819, (short) -18622);
	    }
	}
	return class8;
    }
    
    public int method8086(byte i) {
	return aByte5337 & 0x7;
    }
    
    public int method8087(int i) {
	return (aByte5337 & 0x8) == 8 ? 1 : 0;
    }
    
    static Class8 method8088(Class534_Sub40 class534_sub40,
			     Class110_Sub1 class110_sub1) {
	Class8 class8 = new Class8(class110_sub1);
	for (;;) {
	    int i = class534_sub40.method16527(-1756859890);
	    if (255 == i)
		break;
	    Class483 class483
		= (Class483) Class376.method6419(com.jagex.Class483.class, i,
						 -1227432277);
	    for (;;) {
		int i_1_ = class534_sub40.method16527(1934737461);
		if (255 == i_1_)
		    break;
		class534_sub40.anInt10811 -= -1387468933;
		Class429 class429
		    = class110_sub1.method14492(class534_sub40, class483,
						-1670466871);
		if (null != class429)
		    class8.method29(class429.anInt4820 * -608978823,
				    class429.anObject4819, (short) -5109);
	    }
	}
	return class8;
    }
    
    public Class492(Class534_Sub40 class534_sub40,
		    Class110_Sub1 class110_sub1) {
	aByte5337 = class534_sub40.method16586((byte) 1);
	anInt5335 = class534_sub40.method16529((byte) 1) * -1605307113;
	anInt5336 = class534_sub40.method16533(-258848859) * 2028508617;
	anInt5338 = class534_sub40.method16533(-258848859) * 417966351;
	anInt5339 = class534_sub40.method16533(-258848859) * 1701248651;
	anInt5340 = class534_sub40.method16533(-258848859) * 1870042833;
	if (class110_sub1 != null)
	    Class302.method5565(class534_sub40, class110_sub1, (byte) 1);
    }
    
    static Class8 method8089(Class534_Sub40 class534_sub40,
			     Class110_Sub1 class110_sub1) {
	Class8 class8 = new Class8(class110_sub1);
	for (;;) {
	    int i = class534_sub40.method16527(1074804494);
	    if (255 == i)
		break;
	    Class483 class483
		= (Class483) Class376.method6419(com.jagex.Class483.class, i,
						 -1594913589);
	    for (;;) {
		int i_2_ = class534_sub40.method16527(25759699);
		if (255 == i_2_)
		    break;
		class534_sub40.anInt10811 -= -1387468933;
		Class429 class429
		    = class110_sub1.method14492(class534_sub40, class483,
						-1950878677);
		if (null != class429)
		    class8.method29(class429.anInt4820 * -608978823,
				    class429.anObject4819, (short) -27148);
	    }
	}
	return class8;
    }
    
    public Class492() {
	/* empty */
    }
    
    public int method8090() {
	return (aByte5337 & 0x8) == 8 ? 1 : 0;
    }
    
    public int method8091() {
	return (aByte5337 & 0x8) == 8 ? 1 : 0;
    }
    
    public static int method8092(String string, String string_3_, int i) {
	if (!Class574.aBool7696)
	    return 12;
	if (Class201.method3864(2095398292) != client.aClass100_11264)
	    return 42;
	return Class523.aTwitchTV7088.Login(string, string_3_);
    }
    
    static final void method8093(Class669 class669, int i) {
	Class666 class666 = (class669.aBool8615 ? class669.aClass666_8592
			     : class669.aClass666_8599);
	Class247 class247 = class666.aClass247_8574;
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = -806242263 * class247.anInt2503;
    }
    
    static final void method8094(Class669 class669, byte i) {
	int i_4_ = (class669.anIntArray8595
		    [(class669.anInt8600 -= 308999563) * 2088438307]);
	Class247 class247 = Class112.method2017(i_4_, 1354969499);
	class669.anIntArray8595[((class669.anInt8600 += 308999563) * 2088438307
				 - 1)]
	    = 1843164247 * class247.anInt2531;
    }
    
    static final void method8095(Class669 class669, byte i) {
	class669.anInt8600 -= 617999126;
	int i_5_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	boolean bool
	    = (class669.anIntArray8595[1 + class669.anInt8600 * 2088438307]
	       == 1);
	Class90.method1723(i_5_, bool, 446041589);
    }
    
    static final void method8096(Class669 class669, byte i) {
	if (null != Class521.anIterator7064
	    && Class521.anIterator7064.hasNext())
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= ((Integer) Class521.anIterator7064.next()).intValue();
	else
	    class669.anIntArray8595
		[(class669.anInt8600 += 308999563) * 2088438307 - 1]
		= -1;
    }
    
    static final void method8097(Class669 class669, int i) {
	Class534_Sub36 class534_sub36
	    = ((Class534_Sub36)
	       (class669.anObjectArray8593
		[(class669.anInt8594 -= 1460193483) * 1485266147]));
	if (Class599.aClass298_Sub1_7871.method5388((byte) 3)
	    != Class305.aClass305_3266)
	    throw new RuntimeException();
	Class347_Sub2 class347_sub2
	    = ((Class347_Sub2)
	       Class599.aClass298_Sub1_7871.method5380((byte) -100));
	class347_sub2.method15787(class534_sub36, -1062631237);
	client.aBool11147 = true;
    }
    
    static final void method8098(Class669 class669, int i) {
	class669.anInt8600 -= 1235998252;
	int i_6_ = class669.anIntArray8595[class669.anInt8600 * 2088438307];
	int i_7_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 1];
	int i_8_
	    = class669.anIntArray8595[2088438307 * class669.anInt8600 + 2];
	int i_9_
	    = class669.anIntArray8595[class669.anInt8600 * 2088438307 + 3];
	Class597 class597 = client.aClass512_11100.method8416((byte) 74);
	Class179.method2975(((i_6_ >> 14 & 0x3fff)
			     - -424199969 * class597.anInt7859),
			    (i_6_ & 0x3fff) - -1166289421 * class597.anInt7861,
			    i_7_ << 2, i_8_, i_9_, false, 1226440169);
	client.aBool11147 = true;
    }
}
