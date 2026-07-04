/* Class656 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;
import java.util.Iterator;

public abstract class Class656
{
    long aLong8519;
    int anInt8520;
    Class700 aClass700_8521 = new Class700();
    long aLong8522;
    int anInt8523;
    public static Class177 aClass177_8524;
    
    void method10858() {
	aClass700_8521.method14152(-1538759720);
	aLong8519 = -4186390681563283225L;
	aLong8522 = -1284943277404071613L;
	anInt8520 = -1093590437;
	anInt8523 = 1059153073;
    }
    
    void method10859(int i) {
	if (method10866((byte) -19)) {
	    Class534_Sub19 class534_sub19 = null;
	    int i_0_ = 0;
	    int i_1_ = 0;
	    int i_2_ = 0;
	    Iterator iterator = aClass700_8521.iterator();
	    while (iterator.hasNext()) {
		Class534_Sub42 class534_sub42
		    = (Class534_Sub42) iterator.next();
		if (class534_sub19 != null
		    && (31645619 * (class534_sub19.aClass534_Sub40_Sub1_10513
				    .anInt10811) - i_0_
			>= 252 - (6 + method10882(-1533199852))))
		    break;
		class534_sub42.method8892((byte) 1);
		int i_3_ = class534_sub42.method16800(-636728808);
		if (i_3_ < -1)
		    i_3_ = -1;
		else if (i_3_ > 65534)
		    i_3_ = 65534;
		int i_4_ = class534_sub42.method16799((byte) 77);
		if (i_4_ < -1)
		    i_4_ = -1;
		else if (i_4_ > 65534)
		    i_4_ = 65534;
		if (i_4_ == -908279251 * anInt8520
		    && i_3_ == anInt8523 * 1690672047)
		    class534_sub42.method16803((byte) -105);
		else {
		    if (null == class534_sub19) {
			class534_sub19 = method10887(934246847);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16506(0, 407704674);
			i_0_ = (class534_sub19.aClass534_Sub40_Sub1_10513
				.anInt10811) * 31645619;
			class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			    += 1520029430;
			i_1_ = 0;
			i_2_ = 0;
		    }
		    int i_5_;
		    int i_6_;
		    int i_7_;
		    if (-1L != 1164426520149525653L * aLong8522) {
			i_5_ = i_4_ - -908279251 * anInt8520;
			i_6_ = i_3_ - 1690672047 * anInt8523;
			i_7_ = (int) ((class534_sub42.method16802(-2031472107)
				       - aLong8522 * 1164426520149525653L)
				      / 20L);
			i_1_ += (class534_sub42.method16802(-1524635075)
				 - 1164426520149525653L * aLong8522) % 20L;
		    } else {
			i_5_ = i_4_;
			i_6_ = i_3_;
			i_7_ = 2147483647;
		    }
		    anInt8520 = i_4_ * 1093590437;
		    anInt8523 = i_3_ * -1059153073;
		    if (i_7_ < 8 && i_5_ >= -32 && i_5_ <= 31 && i_6_ >= -32
			&& i_6_ <= 31) {
			i_5_ += 32;
			i_6_ += 32;
			class534_sub19.aClass534_Sub40_Sub1_10513.method16507
			    (i_6_ + ((i_5_ << 6) + (i_7_ << 12)), 687025891);
		    } else if (i_7_ < 32 && i_5_ >= -128 && i_5_ <= 127
			       && i_6_ >= -128 && i_6_ <= 127) {
			i_5_ += 128;
			i_6_ += 128;
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16506(128 + i_7_, 967770361);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16507((i_5_ << 8) + i_6_, 1882987558);
		    } else if (i_7_ < 32) {
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16506(192 + i_7_, 788614841);
			if (-1 == i_4_ || i_3_ == -1)
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16510(-2147483648, -1842727041);
			else
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16510(i_4_ | i_3_ << 16, -1935316607);
		    } else {
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16507(57344 + (i_7_ & 0x1fff), 718533166);
			if (-1 == i_4_ || -1 == i_3_)
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16510(-2147483648, -1013656106);
			else
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16510(i_4_ | i_3_ << 16, -1702862804);
		    }
		    i_2_++;
		    method10864(class534_sub19.aClass534_Sub40_Sub1_10513,
				class534_sub42, (byte) 51);
		    aLong8522 = (class534_sub42.method16802(-423424736)
				 * 1284943277404071613L);
		    class534_sub42.method16803((byte) -62);
		}
	    }
	    if (class534_sub19 != null) {
		class534_sub19.aClass534_Sub40_Sub1_10513.method16528
		    ((class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		      * 31645619) - i_0_,
		     2069487810);
		int i_8_
		    = (31645619
		       * class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811);
		class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		    = -1387468933 * i_0_;
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(i_1_ / i_2_, 1551053080);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(i_1_ % i_2_, 916339727);
		class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		    = i_8_ * -1387468933;
		client.aClass100_11264.method1863(class534_sub19, (byte) 20);
	    }
	}
	method10883((byte) -24);
    }
    
    void method10860(int i) {
	aClass700_8521.method14152(-1687319105);
	aLong8519 = -4186390681563283225L;
	aLong8522 = -1284943277404071613L;
	anInt8520 = -1093590437;
	anInt8523 = 1059153073;
    }
    
    abstract void method10861();
    
    int method10862(Class534_Sub42 class534_sub42, int i, byte i_9_) {
	long l;
	if (-7567887986269541079L * aLong8519 == -1L)
	    l = (long) i;
	else {
	    l = (class534_sub42.method16802(-69203617)
		 - -7567887986269541079L * aLong8519);
	    if (l > (long) i)
		l = (long) i;
	}
	aLong8519
	    = class534_sub42.method16802(329593758) * 4186390681563283225L;
	return (int) l;
    }
    
    void method10863() {
	if (method10866((byte) -48)) {
	    Class534_Sub19 class534_sub19 = null;
	    int i = 0;
	    int i_10_ = 0;
	    int i_11_ = 0;
	    Iterator iterator = aClass700_8521.iterator();
	    while (iterator.hasNext()) {
		Class534_Sub42 class534_sub42
		    = (Class534_Sub42) iterator.next();
		if (class534_sub19 != null
		    && (31645619 * (class534_sub19.aClass534_Sub40_Sub1_10513
				    .anInt10811) - i
			>= 252 - (6 + method10882(-1487206588))))
		    break;
		class534_sub42.method8892((byte) 1);
		int i_12_ = class534_sub42.method16800(-515790795);
		if (i_12_ < -1)
		    i_12_ = -1;
		else if (i_12_ > 65534)
		    i_12_ = 65534;
		int i_13_ = class534_sub42.method16799((byte) 23);
		if (i_13_ < -1)
		    i_13_ = -1;
		else if (i_13_ > 65534)
		    i_13_ = 65534;
		if (i_13_ == -908279251 * anInt8520
		    && i_12_ == anInt8523 * 1690672047)
		    class534_sub42.method16803((byte) -31);
		else {
		    if (null == class534_sub19) {
			class534_sub19 = method10887(-708960807);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16506(0, 1388194668);
			i = (class534_sub19.aClass534_Sub40_Sub1_10513
			     .anInt10811) * 31645619;
			class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
			    += 1520029430;
			i_10_ = 0;
			i_11_ = 0;
		    }
		    int i_14_;
		    int i_15_;
		    int i_16_;
		    if (-1L != 1164426520149525653L * aLong8522) {
			i_14_ = i_13_ - -908279251 * anInt8520;
			i_15_ = i_12_ - 1690672047 * anInt8523;
			i_16_ = (int) ((class534_sub42.method16802(-2017298374)
					- aLong8522 * 1164426520149525653L)
				       / 20L);
			i_10_ += (class534_sub42.method16802(-1614143064)
				  - 1164426520149525653L * aLong8522) % 20L;
		    } else {
			i_14_ = i_13_;
			i_15_ = i_12_;
			i_16_ = 2147483647;
		    }
		    anInt8520 = i_13_ * 1093590437;
		    anInt8523 = i_12_ * -1059153073;
		    if (i_16_ < 8 && i_14_ >= -32 && i_14_ <= 31
			&& i_15_ >= -32 && i_15_ <= 31) {
			i_14_ += 32;
			i_15_ += 32;
			class534_sub19.aClass534_Sub40_Sub1_10513.method16507
			    (i_15_ + ((i_14_ << 6) + (i_16_ << 12)),
			     731935655);
		    } else if (i_16_ < 32 && i_14_ >= -128 && i_14_ <= 127
			       && i_15_ >= -128 && i_15_ <= 127) {
			i_14_ += 128;
			i_15_ += 128;
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16506(128 + i_16_, 1341995511);
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16507((i_14_ << 8) + i_15_, 1957970429);
		    } else if (i_16_ < 32) {
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16506(192 + i_16_, 717450719);
			if (-1 == i_13_ || i_12_ == -1)
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16510(-2147483648, -2129308500);
			else
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16510(i_13_ | i_12_ << 16, -1624434914);
		    } else {
			class534_sub19.aClass534_Sub40_Sub1_10513
			    .method16507(57344 + (i_16_ & 0x1fff), 941424223);
			if (-1 == i_13_ || -1 == i_12_)
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16510(-2147483648, -1436333777);
			else
			    class534_sub19.aClass534_Sub40_Sub1_10513
				.method16510(i_13_ | i_12_ << 16, -1524931063);
		    }
		    i_11_++;
		    method10864(class534_sub19.aClass534_Sub40_Sub1_10513,
				class534_sub42, (byte) 59);
		    aLong8522 = (class534_sub42.method16802(-1957550921)
				 * 1284943277404071613L);
		    class534_sub42.method16803((byte) -7);
		}
	    }
	    if (class534_sub19 != null) {
		class534_sub19.aClass534_Sub40_Sub1_10513.method16528
		    ((class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		      * 31645619) - i,
		     2136508598);
		int i_17_
		    = (31645619
		       * class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811);
		class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		    = -1387468933 * i;
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(i_10_ / i_11_, 2097297980);
		class534_sub19.aClass534_Sub40_Sub1_10513
		    .method16506(i_10_ % i_11_, 468989118);
		class534_sub19.aClass534_Sub40_Sub1_10513.anInt10811
		    = i_17_ * -1387468933;
		client.aClass100_11264.method1863(class534_sub19, (byte) 120);
	    }
	}
	method10883((byte) -40);
    }
    
    abstract void method10864(Class534_Sub40 class534_sub40,
			      Class534_Sub42 class534_sub42, byte i);
    
    void method10865() {
	aClass700_8521.method14152(-1551353351);
	aLong8519 = -4186390681563283225L;
	aLong8522 = -1284943277404071613L;
	anInt8520 = -1093590437;
	anInt8523 = 1059153073;
    }
    
    abstract boolean method10866(byte i);
    
    abstract int method10867();
    
    abstract void method10868();
    
    void method10869(Class534_Sub42 class534_sub42, int i) {
	aClass700_8521.method14131(class534_sub42, (short) 789);
    }
    
    abstract void method10870();
    
    abstract boolean method10871();
    
    abstract Class534_Sub19 method10872();
    
    abstract Class534_Sub19 method10873();
    
    abstract Class534_Sub19 method10874();
    
    void method10875() {
	aClass700_8521.method14152(-959414564);
	aLong8519 = -4186390681563283225L;
	aLong8522 = -1284943277404071613L;
	anInt8520 = -1093590437;
	anInt8523 = 1059153073;
    }
    
    abstract int method10876();
    
    abstract int method10877();
    
    abstract void method10878(Class534_Sub40 class534_sub40,
			      Class534_Sub42 class534_sub42);
    
    abstract void method10879(Class534_Sub40 class534_sub40,
			      Class534_Sub42 class534_sub42);
    
    int method10880(Class534_Sub42 class534_sub42, int i) {
	long l;
	if (-7567887986269541079L * aLong8519 == -1L)
	    l = (long) i;
	else {
	    l = (class534_sub42.method16802(391018747)
		 - -7567887986269541079L * aLong8519);
	    if (l > (long) i)
		l = (long) i;
	}
	aLong8519
	    = class534_sub42.method16802(-1382333181) * 4186390681563283225L;
	return (int) l;
    }
    
    Class656() {
	aLong8519 = -4186390681563283225L;
	aLong8522 = -1284943277404071613L;
	anInt8520 = -1093590437;
	anInt8523 = 1059153073;
    }
    
    int method10881(Class534_Sub42 class534_sub42, int i) {
	long l;
	if (-7567887986269541079L * aLong8519 == -1L)
	    l = (long) i;
	else {
	    l = (class534_sub42.method16802(-205298313)
		 - -7567887986269541079L * aLong8519);
	    if (l > (long) i)
		l = (long) i;
	}
	aLong8519
	    = class534_sub42.method16802(772415122) * 4186390681563283225L;
	return (int) l;
    }
    
    abstract int method10882(int i);
    
    abstract void method10883(byte i);
    
    void method10884(Class534_Sub42 class534_sub42) {
	aClass700_8521.method14131(class534_sub42, (short) 789);
    }
    
    void method10885(Class534_Sub42 class534_sub42) {
	aClass700_8521.method14131(class534_sub42, (short) 789);
    }
    
    int method10886(Class534_Sub42 class534_sub42, int i) {
	long l;
	if (-7567887986269541079L * aLong8519 == -1L)
	    l = (long) i;
	else {
	    l = (class534_sub42.method16802(-1782146896)
		 - -7567887986269541079L * aLong8519);
	    if (l > (long) i)
		l = (long) i;
	}
	aLong8519
	    = class534_sub42.method16802(-81871200) * 4186390681563283225L;
	return (int) l;
    }
    
    abstract Class534_Sub19 method10887(int i);
    
    void method10888() {
	aClass700_8521.method14152(-1462782630);
	aLong8519 = -4186390681563283225L;
	aLong8522 = -1284943277404071613L;
	anInt8520 = -1093590437;
	anInt8523 = 1059153073;
    }
    
    int method10889(Class534_Sub42 class534_sub42, int i) {
	long l;
	if (-7567887986269541079L * aLong8519 == -1L)
	    l = (long) i;
	else {
	    l = (class534_sub42.method16802(1231977366)
		 - -7567887986269541079L * aLong8519);
	    if (l > (long) i)
		l = (long) i;
	}
	aLong8519
	    = class534_sub42.method16802(781681326) * 4186390681563283225L;
	return (int) l;
    }
    
    int method10890(Class534_Sub42 class534_sub42, int i) {
	long l;
	if (-7567887986269541079L * aLong8519 == -1L)
	    l = (long) i;
	else {
	    l = (class534_sub42.method16802(-1095908484)
		 - -7567887986269541079L * aLong8519);
	    if (l > (long) i)
		l = (long) i;
	}
	aLong8519
	    = class534_sub42.method16802(1582301893) * 4186390681563283225L;
	return (int) l;
    }
    
    int method10891(Class534_Sub42 class534_sub42, int i) {
	long l;
	if (-7567887986269541079L * aLong8519 == -1L)
	    l = (long) i;
	else {
	    l = (class534_sub42.method16802(1251311561)
		 - -7567887986269541079L * aLong8519);
	    if (l > (long) i)
		l = (long) i;
	}
	aLong8519
	    = class534_sub42.method16802(1861605481) * 4186390681563283225L;
	return (int) l;
    }
    
    int method10892(Class534_Sub42 class534_sub42, int i) {
	long l;
	if (-7567887986269541079L * aLong8519 == -1L)
	    l = (long) i;
	else {
	    l = (class534_sub42.method16802(1093392516)
		 - -7567887986269541079L * aLong8519);
	    if (l > (long) i)
		l = (long) i;
	}
	aLong8519
	    = class534_sub42.method16802(-2135520998) * 4186390681563283225L;
	return (int) l;
    }
    
    public static String method10893(String string, char c, String string_18_,
				     int i) {
	int i_19_ = string.length();
	int i_20_ = string_18_.length();
	int i_21_ = i_19_;
	int i_22_ = i_20_ - 1;
	if (i_22_ != 0) {
	    int i_23_ = 0;
	    for (;;) {
		i_23_ = string.indexOf(c, i_23_);
		if (i_23_ < 0)
		    break;
		i_23_++;
		i_21_ += i_22_;
	    }
	}
	StringBuilder stringbuilder = new StringBuilder(i_21_);
	int i_24_ = 0;
	for (;;) {
	    int i_25_ = string.indexOf(c, i_24_);
	    if (i_25_ < 0)
		break;
	    stringbuilder.append(string.substring(i_24_, i_25_));
	    stringbuilder.append(string_18_);
	    i_24_ = i_25_ + 1;
	}
	stringbuilder.append(string.substring(i_24_));
	return stringbuilder.toString();
    }
    
    static final void method10894(Class669 class669, byte i) {
	class669.aClass395_8601 = new Class395();
	class669.aClass395_8601.anInt4103
	    = (class669.anIntArray8595
	       [(class669.anInt8600 -= 308999563) * 2088438307]) * 167533425;
	class669.aClass395_8601.aClass534_Sub18_Sub12_4104
	    = (RuntimeException_Sub4.aClass56_12127.method1218
	       (-1791556207 * class669.aClass395_8601.anInt4103, -1581069180));
	class669.aClass395_8601.anIntArray4102
	    = new int[class669.aClass395_8601.aClass534_Sub18_Sub12_4104
			  .method18354((byte) 77)];
    }
}
